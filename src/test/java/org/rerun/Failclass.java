package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Failclass implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer retryanalyzer = annotation.getRetryAnalyzer();
		if(retryanalyzer == null) {
			annotation.setRetryAnalyzer(SampleFailedClass.class);
		}
	}

}

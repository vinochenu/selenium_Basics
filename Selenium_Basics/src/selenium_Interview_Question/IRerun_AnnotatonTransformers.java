package selenium_Interview_Question;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class IRerun_AnnotatonTransformers implements IAnnotationTransformer{

	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(Rerun_IRetryAnalyzer.class);
		
	}

}

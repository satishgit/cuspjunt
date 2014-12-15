package com.mycompany.app;

import junit.framework.TestCase;

import org.junit.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.iface.Submit.Status;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;

public class SoapUIRestProjectTest extends TestCase{

   @Test
   public void test() throws Exception {		

	   System.out.println("Test Started");
      WsdlProject project = new WsdlProject("Google-Map-REST-Project-soapui-project.xml" ); 
      TestSuite testSuite = project.getTestSuiteByName("SampleTestSuite"); 
      com.eviware.soapui.model.testsuite.TestCase testCase = testSuite.getTestCaseByName( "SampleTestCase2" );
      
      System.out.println(">>>>>>>>>>>>"+testCase.getDescription());
      

      System.out.println(">>>>>>>>>>>>"+testCase.getName());
      // create empty properties and run synchronously
      TestRunner runner = testCase.run( new PropertiesMap(), false ); 
     // assertEquals( Status.FINISHED, runner.getStatus() ); 
   
   }

}
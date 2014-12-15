package com.mycompany.app;

import junit.framework.TestCase;

import org.junit.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.iface.Submit.Status;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;

public class SoapUIProjectTest extends TestCase{
//comment test
   @Test
   public void test() throws Exception {		
//      SoapUITestCaseRunner runner = new SoapUITestCaseRunner(); 
//      runner.setProjectFile("D:/SoapUI/projects/Demo/PeriodicTableExampleProject/Periodic-Table-Example-Project-soapui-project.xml");
//      runner.run();		
//     
      System.out.println("Test Started");
      WsdlProject project = new WsdlProject("Periodic-Table-Example-Project-soapui-project.xml" ); 
      TestSuite testSuite = project.getTestSuiteByName("periodictableSoap TestSuite"); 
      com.eviware.soapui.model.testsuite.TestCase testCase = testSuite.getTestCaseByName( "ElementSpecificRequests TestCase" );
      
      System.out.println(">>>>>>>>>>>>"+testCase.getDescription());
      

      System.out.println(">>>>>>>>>>>>"+testCase.getName());
      // create empty properties and run synchronously
      TestRunner runner = testCase.run( new PropertiesMap(), false ); 
     // assertEquals( Status.FINISHED, runner.getStatus() ); 
   
   }

}
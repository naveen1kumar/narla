package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Login;
//import com.ScreenFunctions.signin;

public class Tc_01_ValidateLogin extends GenericFunctions {

	@Test

	public void Tc_01_ValidateLoginCredentials() throws InterruptedException {
		// Step1:-Launch Appplication
		GenericFunctions gnf = new GenericFunctions();

		gnf.launchApplication("firefox");
		// gnf.launchApplication("chrome");

		// Step2:Enter User Credentials


		Login sgn=PageFactory.initElements(driver, Login.class);
		
		//sgn.sign_in_application();
		sgn.Login();
		sgn.verifying_login();
		//sgn.gmailid();
		//sgn.personalinformation();
		//sgn.droupdown();
	sgn.enter_Credentials();
	Login.statesRecive();
	
		Thread.sleep(5000);
		

		


	}

}

package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;


//this test case for click forgot password link and enter mobile number to get OTP
public class TC011_ForgetPassWord extends ProjectSpecification{
	
	@BeforeTest
	public void setup() {
		
		excelfile="TC011_ForgetPassWord";
		
	}
	@Test(dataProvider="getData")
	
public void forgetPasswordTest(String phone,String excepted) throws InterruptedException, IOException {
		
		new HomePage(driver)
		.clickForgotPassword()
		.enterMobile(phone)
		.clickSendOTP()
		.verifyOTPMesaage(excepted)
		.capture("TC011_ForgotPassword");
	}	


}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {
	
	// element are located by using @Findby annotation
	@FindBy(xpath="//div[text()='Signup']")
	WebElement signup;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa']")
	WebElement flights;
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkin;
	
	@FindBy(xpath="//div[text()='flight status']")
	WebElement flightstatus;
	
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement managebooking;
	
	@FindBy(xpath="//div[text()='Forgot Password ?']")
	WebElement forgotpassword;
	
	//constructor initialization 
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	public SignUpPage clickSignUp() throws InterruptedException {
		click(signup);
		sleep();
		return new SignUpPage(driver);	
		
	}
	
	public LogInPage clickLogIn() {
		click(login);
		return new LogInPage(driver);
				
	}
	
	public FlightBookingPage clickFlights()  {		
		click(flights);	
		return new FlightBookingPage(driver);
    }
	
	public CheckInPage clickCheckIn() {		
		click(checkin);
		return new CheckInPage(driver);
		
	}
	
	public FlightStatusPage clickFlightStatus() throws InterruptedException {		
		click(flightstatus);
		sleep();
		return new FlightStatusPage(driver);
		
	}
	
	public ManageBookingPage clickManageBooking() throws InterruptedException {		
		click(managebooking);
		sleep();
		return new ManageBookingPage(driver);
		
	}
	public LogOutPage clickLogout()  {		
		return new LogOutPage(driver);
		
	}
	
	public ForgetPasswordPage clickForgotPassword() {		
		click(login);
		click(forgotpassword);
		return new ForgetPasswordPage(driver);
	}
	
	
	
	
}
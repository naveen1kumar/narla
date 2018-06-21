
package com.ScreenFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.GenericFunctions.GenericFunctions;

public class Login extends GenericFunctions {

	// Login link button
	@FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Sign in']")
	public static WebElement btn_Login;

	// authentication identification
	@FindBy(how = How.XPATH, using = "//h1[text()='Authentication']")
	public static WebElement athentication_page_header;

	// email address field identified.
	@FindBy(how = How.XPATH, using = "//input[@id='email_create']")
	public static WebElement email_addres;

	// Create an account button identification.
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitCreate']/span")
	public static WebElement btn_CreatAccount;

	// Title is select as Mr.
	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']")
	public static WebElement Rdo_Title_mr_on;

	// Title is select as Mrs.
		@FindBy(how = How.XPATH, using = "//input[@id='id_gender2']")
		public static WebElement Rdo_Title_mrs_on;
	// in personal information enter first name.
	@FindBy(how = How.XPATH, using = "//input[@id='customer_firstname']")
	public static WebElement Edi_personalinformation_firstname;

	// in personal information enter last name.
	@FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']")
	public static WebElement Edi_personalinformation_lastname;

	// in personal information enter password.
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	public static WebElement Edi_personalinformation_password;

	// in personal information enter date.
	@FindBy(how = How.XPATH, using = "//select[@id='days']")
	public static WebElement Edi_personalinformation_Date;

	// in personal information enter month.
	@FindBy(how = How.XPATH, using = "//select[@id='months']")
	public static WebElement Edi_personalinformation_month;

	// in personal information enter year.
	@FindBy(how = How.XPATH, using = "//select[@name='years']")
	public static WebElement Edi_personalinformation_year;

	// in personal information your address enter first name.
	@FindBy(how = How.XPATH, using = "//input[@id='firstname']")
	public static WebElement Edi_personalinformation_youraddress_firstname;

	// in personal information your address enter last name.
	@FindBy(how = How.XPATH, using = "//input[@id='lastname']")
	public static WebElement Edi_personalinformation_youraddress_Lastname;

	// in personal information your address enter company name.
	@FindBy(how = How.XPATH, using = "//input[@id='company']")
	public static WebElement Edi_personalinformation_youraddress_companyname;

	// in personal information your address enter company address .
	@FindBy(how = How.XPATH, using = "//input[@id='address1']")
	public static WebElement Edi_personalinformation_youraddress_companyaddress;

	// in personal information your address enter city name .
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	public static WebElement Edi_personalinformation_youraddress_cityname;

	// in personal information your address enter Zip code.
	@FindBy(how = How.XPATH, using = "//input[@id='postcode']")
	public static WebElement Edi_personalinformation_youraddress_Zipcode;

	// in personal information your address enter mobile number.
	@FindBy(how = How.XPATH, using = "//input[@id='phone_mobile']")
	public static WebElement Edi_personalinformation_youraddress_Mobilenumber;

	// in personal information your address enter alias address.
	@FindBy(how = How.XPATH, using = "//input[@id='alias']")
	public static WebElement Edi_personalinformation_youraddress_Aliasaddress;

	// in personal information your address register button identified.
	@FindBy(how = How.XPATH, using = "//button[@id='submitAccount']/span")
	public static WebElement btn__personalinformation_Register;

	// in personal information your address state
	@FindBy(how = How.XPATH, using = "//select[@id='id_state']")
	public static WebElement btn_personalinformation_youraddress_stae;

	// user home page is opend.
	@FindBy(how = How.XPATH, using = "//span/parent::a[@title='View my customer account']")
	public static WebElement btn_home_page;

	// user signout the user
	@FindBy(how = How.XPATH, using = "//div/a[@title='Log me out']")
	public static WebElement btn_Sign_out;
	
	// user state the user
		@FindBy(how = How.XPATH, using = "//select[@id='id_state']")
		public static WebElement Edi_state;

	/*
	 * **************************** Login Panel Section Object
	 * *********************************
	 * 
	 * Function Name:Login
	 * 
	 * Purpose:-This Function is used to login into the Automation practice
	 * Application when ever the user is required
	 * 
	 * Input Parameters:-NA
	 * 
	 * Output Parameters:-This method will return a boolean value stating wheter
	 * the application is launched or not
	 * 
	 * Author:-naveen
	 * 
	 * Creationn date:-11/06/2018
	 * 
	 * 
	 **************************************************/

	// Login function
	public void Login() {
		boolean status;

		status = hoverAndClick(btn_Login);
		if (status) {
			logEvent("pass", "signin link is click  succssfull");
		} else {
			logEvent("fail", "signin link is not click succssfull");
		}

	}

	// verifying login page function.
	public boolean verifying_login() {
		boolean status;
		try {
			status = signin_succsfull(athentication_page_header, "Authentication");
			if (status) {
				logEvent("pass", "signin page is opend successfully");
			} else {
				logEvent("falls", "signin page is not opend");
			}
		} catch (Exception e) {
			System.out.println("page not found");

		}

		return true;
	}

	/*
	 * **************************** Email Panel Section Object
	 * *********************************
	 * 
	 * Function Name:enter_Credentials
	 * 
	 * Purpose:-This Function is used to mail into the Automation practice
	 * Application when ever the user is required and given the inputs
	 * 
	 * Input Parameters:-NA
	 * 
	 * Output Parameters:-This method will return a boolean value stating wheter
	 * the application is launched or not
	 * 
	 * Author:-naveen
	 * 
	 * Creationn date:-11/06/2018
	 * 
	 * 
	 **************************************************/

	// enter credentials in fields
	public void enter_Credentials() {
		int itr = getLastIterationNumber("signindata");
		System.out.println(itr);

		for (int i = 31; i <= itr; i++) {
			try {

				String Email = getdata("signindata", "Email", i);
				settext(email_addres);
				//email_addres.clear();
				
				data_pass(email_addres, Email);
				hoverAndClick(btn_CreatAccount);
				//email_addres.sendKeys(Email);
				//btn_CreatAccount.click();
				System.out.println("gmail id is enterd into the field");
				// String userName =btn_home_page.getText();
				
				if (athentication_page_header.isDisplayed()) {
				//	public static void state(WebElement ele,String value){
					driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
							
							java.util.List<WebElement> states=driver.findElements(By.xpath("//select[@id='id_state']"));
							
							for (int j = 0; j < states.size(); j++) {
								System.out.println(states.get(j).getText());
								System.out.println(states);
								System.out.println(states.size());
								System.out.println("state valus are print here");
								
							}
							
						
						
							
						
						
					
					
					
					
					
					
					

					String Firstname = getdata("signindata", "First_name", i);
					String Lastname = getdata("signindata", "Last_name", i);
					String password = getdata("signindata", "password", i);
					String your_addres_first_name = getdata("signindata", "your_addres_first_name", i);
					String your_addres_Last_name = getdata("signindata", "your_addres_Last_name", i);
					String your_addres_company = getdata("signindata", "your_addres_company", i);
					String Addres = getdata("signindata", "Addres", i);
					String city = getdata("signindata", "city", i);
					String zip_code = getdata("signindata", "zip_code", i);
					String mobile_phone = getdata("signindata", "mobile_phone", i);
					String alias_addres = getdata("signindata", "alias_addres", i);
					String date = getdata("signindata", "date", i);
					String month = getdata("signindata", "month", i);
					String year = getdata("signindata", "Birthyear", i);
					System.out.println(year);
					String gender=getdata("signindata", "gender", i);
					
					//state(Edi_state, "ap");
					
					
					
					if (gender.equals("female")) {
						hoverAndClick(Rdo_Title_mrs_on);
						
						//Rdo_Title_mrs_on.click();
						System.out.println("user is female");
					} else {
						
						hoverAndClick(Rdo_Title_mr_on);
						//Rdo_Title_mr_on.click();
						System.out.println("user is male");

					}
					
					


					//waitForElement(Edi_personalinformation_firstname);
					data_pass(Edi_personalinformation_firstname, Firstname);
					data_pass(Edi_personalinformation_lastname, Lastname);
					data_pass(Edi_personalinformation_password, password);
					settext(Edi_personalinformation_youraddress_firstname);
					data_pass(Edi_personalinformation_youraddress_firstname, your_addres_first_name);
					settext(Edi_personalinformation_youraddress_Lastname);
					data_pass(Edi_personalinformation_youraddress_Lastname, your_addres_Last_name);
					data_pass(Edi_personalinformation_youraddress_companyname, your_addres_company);
					data_pass(Edi_personalinformation_youraddress_companyaddress, Addres);
					data_pass(Edi_personalinformation_youraddress_cityname, city);
					data_pass(Edi_personalinformation_youraddress_Zipcode, zip_code);
					data_pass(Edi_personalinformation_youraddress_Mobilenumber, mobile_phone);
					data_pass(Edi_personalinformation_youraddress_Aliasaddress, alias_addres);
					hoverAndClick(btn__personalinformation_Register);
					
					
					
					
					

					//Edi_personalinformation_firstname.sendKeys(Firstname);
					//System.out.println(Firstname);

					//Edi_personalinformation_lastname.sendKeys(Lastname);
					//System.out.println(Lastname);

					//Edi_personalinformation_password.sendKeys(password);
					//System.out.println(password);

					select_Dropdown(Edi_personalinformation_Date, date);

					select_Dropdown(Edi_personalinformation_month, month);

					select_Dropdown(Edi_personalinformation_year, year);
					

					

					//Edi_personalinformation_youraddress_firstname.sendKeys(your_addres_first_name);
					//System.out.println(your_addres_first_name);

					

					//Edi_personalinformation_youraddress_Lastname.sendKeys(your_addres_Last_name);
					//System.out.println(your_addres_Last_name);

					//Edi_personalinformation_youraddress_companyname.sendKeys(your_addres_company);
					//System.out.println(your_addres_company);

					//Edi_personalinformation_youraddress_companyaddress.sendKeys(Addres);
					//System.out.println(Addres);

					//Edi_personalinformation_youraddress_cityname.sendKeys(city);
					//System.out.println(city);

					select_Dropdown(btn_personalinformation_youraddress_stae, "5");
					
					
					//Edi_personalinformation_youraddress_Zipcode.sendKeys(zip_code);
					//System.out.println(zip_code);

					//Edi_personalinformation_youraddress_Mobilenumber.sendKeys(mobile_phone);
					//System.out.println(mobile_phone);

					//Edi_personalinformation_youraddress_Aliasaddress.sendKeys(alias_addres);
					//System.out.println(alias_addres);
					//btn__personalinformation_Register.click();
					waitForElement(btn_Sign_out);
					// String userName1 =btn_home_page.getText();
					// System.out.println("user name:"+userName1);
					hoverAndClick(btn_Sign_out);

					//btn_Sign_out.click();

				}

			} catch (Exception e) {

				System.out.println(e.getMessage());

			}

		}

	}

}

//package com.ScreenFunctions;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Factory;
//
//import com.GenericFunctions.GenericFunctions;
//
//public class signin extends GenericFunctions {
//	
//	// signin link button
//	@FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Sign in']")
//	public static WebElement btn_signin;
//
//	// authentication identification
//	@FindBy(how = How.XPATH, using = "//h1[text()='Authentication']")
//	public static WebElement athentication_page_header;
//
//	// email address field
//	@FindBy(how = How.XPATH, using = "//input[@id='email_create']")
//	public static WebElement email_addres;
//
//	// Create an account button is click
//	@FindBy(how = How.XPATH, using = "//button[@id='SubmitCreate']/span")
//	public static WebElement btn_CreatAccount;
//
//	// Title is select as Mr.
//	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']")
//	public static WebElement Rdo_Title_mr_on;
//
//	// in personal information enter first name.
//	@FindBy(how = How.XPATH, using = "//input[@id='customer_firstname']")
//	public static WebElement Edi_personalinformation_firstname;
//
//	// in personal information enter last name.
//	@FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']")
//	public static WebElement Edi_personalinformation_lastname;
//
//	// in personal information enter password.
//	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
//	public static WebElement Edi_personalinformation_password;
//
//	// in personal information your address enter first name.
//	@FindBy(how = How.XPATH, using = "//input[@id='firstname']")
//	public static WebElement Edi_personalinformation_youraddress_firstname;
//
//	// in personal information your address enter last name.
//	@FindBy(how = How.XPATH, using = "//input[@id='lastname']")
//	public static WebElement Edi_personalinformation_youraddress_Lastname;
//
//	// in personal information your address enter company name.
//	@FindBy(how = How.XPATH, using = "//input[@id='company']")
//	public static WebElement Edi_personalinformation_youraddress_companyname;
//
//	// in personal information your address enter company address .
//	@FindBy(how = How.XPATH, using = "//input[@id='address1']")
//	public static WebElement Edi_personalinformation_youraddress_companyaddress;
//
//	// in personal information your address enter city name .
//	@FindBy(how = How.XPATH, using = "//input[@id='city']")
//	public static WebElement Edi_personalinformation_youraddress_cityname;
//
//	// in personal information your address enter Zip code.
//	@FindBy(how = How.XPATH, using = "//input[@id='postcode']")
//	public static WebElement Edi_personalinformation_youraddress_Zipcode;
//
//	// in personal information your address enter mobile number.
//	@FindBy(how = How.XPATH, using = "//input[@id='phone_mobile']")
//	public static WebElement Edi_personalinformation_youraddress_Mobilenumber;
//
//	// in personal information your address enter alias address.
//	@FindBy(how = How.XPATH, using = "//input[@id='alias']")
//	public static WebElement Edi_personalinformation_youraddress_Aliasaddress;
//	
//	@FindBy(how=How.XPATH,using="//button[@id='submitAccount']/span")
//	public static WebElement btn__personalinformation_Register;
//
//	public void sign_in_application() {
//		boolean status;
//		status = hoverAndClick(btn_signin);
//	}
////Successfully login is opened 
//	public boolean verifying_login() {
//		boolean status_is;
//		status_is = signin_succsfull(athentication_page_header, "Authentication");
//		if (status_is) {
//			logEvent("pass", "signin page is opend");
//		} else {
//			logEvent("falls", "signin page is not opend");
//		}
//
//		return true;
//	}
//// 
//	/*public void gmailid() {
//		email_addres.sendKeys("abcnvnk@gmail.com");
//		btn_CreatAccount.click();
//		System.out.println("gmail id is enterd into the field");
//
//	}
//*/
//	
//	public void droupdown() {
//
//		/*
//		 * WebElement ele=driver.findElement(By.xpath("//select[@id='days']"));
//		 * Select sc=new Select(ele); sc.selectByIndex(2);
//		 */
//
//		List<WebElement> ele = driver.findElements(By.xpath("//select[@id='days']/child::option"));
//
//		for (int i = 1; i <= ele.size() - 1; i++) {
//			int val;
//			System.out.println(ele.get(i));
//		}
//
//	}
//
//	public  void enter_Credentials() throws InterruptedException {
//
//		int itr = getLastIterationNumber("signindata");
//		
//
//		for (int i = 1; i <= itr; i++) {
//			try {
//			
//				String Email=getdata("signindata","Email", i);
//				String Firstname = getdata("signindata", "First_name", i);
//				String Lastname = getdata("signindata", "Last_name", i);
//				String password = getdata("signindata", "password", i);
//				String your_addres_first_name = getdata("signindata", "your_addres_first_name", i);
//				String your_addres_Last_name = getdata("signindata", "your_addres_Last_name", i);
//				String your_addres_company = getdata("signindata", "your_addres_company", i);
//				String Addres = getdata("signindata", "Addres", i);
//				String city = getdata("signindata", "city", i);
//				String zip_code = getdata("signindata", "zip_code", i);
//				String mobile_phone = getdata("signindata", "mobile_phone", i);
//				String alias_addres =getdata("signindata", "alias_addres", i);
//				
//				
//				email_addres.sendKeys(Email);
//				btn_CreatAccount.click();
//				System.out.println("gmail id is enterd into the field");
//
//				waitForElement(Edi_personalinformation_firstname);
//
//				Edi_personalinformation_firstname.sendKeys(Firstname);
//				System.out.println(Firstname);
//
//				Edi_personalinformation_lastname.sendKeys(Lastname);
//				System.out.println(Lastname);
//				// hoverAndClick(btn_signin);
//				// hoverAndClick(btn_signout);
//				Edi_personalinformation_password.sendKeys(password);
//				System.out.println(password);
//				
//				 Edi_personalinformation_youraddress_firstname.sendKeys(your_addres_first_name);
//				 System.out.println(your_addres_first_name);
//				 
//				 Edi_personalinformation_youraddress_Lastname.sendKeys(your_addres_Last_name);
//				 System.out.println(your_addres_Last_name);
//				 
//				Edi_personalinformation_youraddress_companyname.sendKeys(your_addres_company);
//				System.out.println(your_addres_company);
//				
//				Edi_personalinformation_youraddress_companyaddress.sendKeys(Addres);
//				System.out.println(Addres);
//				
//				Edi_personalinformation_youraddress_cityname.sendKeys(city);
//				System.out.println(city);
//				
//				Edi_personalinformation_youraddress_Zipcode.sendKeys(zip_code);
//				System.out.println(zip_code);
//				
//				Edi_personalinformation_youraddress_Mobilenumber.sendKeys(mobile_phone);
//				System.out.println(mobile_phone);
//				
//				Edi_personalinformation_youraddress_Aliasaddress.sendKeys(alias_addres);
//					System.out.println(alias_addres);
//					btn__personalinformation_Register.click();
//					
//
//			} catch (Exception e) {
//
//				System.out.println(e.getMessage());
//
//			}
//
//		}
//	}
//	*/
//}

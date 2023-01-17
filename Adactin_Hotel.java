package com.MiniProject;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {
	static void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vicky\\eclipse-workspace\\SeleniumTesting\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Vickyten");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ad@ctin2022");
		WebElement confirm = driver.findElement(By.xpath("//input[@name='re_password']"));
		confirm.sendKeys("Ad@ctin2022");
		WebElement Fullname = driver.findElement(By.xpath("//input[@name='full_name']"));
		Fullname.sendKeys("Vigneshwar");
		WebElement email = driver.findElement(By.xpath("//input[@name='email_add']"));
		email.sendKeys("sharmi99ravi@gmail.com");
		Thread.sleep(10000);
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter the Captcha");
		String cap = ref.next();
		driver.findElement(By.name("captcha")).sendKeys(cap);
		driver.findElement(By.id("tnc_box")).click();

	}

	static void Step2Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vicky\\eclipse-workspace\\SeleniumTesting\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/index.php");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Vickyten");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ad@ctin2022");
		driver.findElement(By.name("login")).click();
		WebElement location = driver.findElement(By.id("location"));
		Select passlocation = new Select(location);
		passlocation.selectByIndex(2);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select Hotels = new Select(hotel);
		Hotels.selectByIndex(2);
		WebElement RoomType = driver.findElement(By.id("room_type"));
		Select roomtype = new Select(RoomType);
		roomtype.selectByIndex(3);
		WebElement Room = driver.findElement(By.id("room_nos"));
		Select room = new Select(Room);
		room.selectByIndex(1);
		WebElement CheckinDate = driver.findElement(By.id("datepick_in"));
		CheckinDate.sendKeys("25/12/2022");
		WebElement CheckoutDate = driver.findElement(By.id("datepick_out"));
		CheckoutDate.sendKeys("27/12/2022");
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select no = new Select(adults);
		room.selectByIndex(2);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		WebElement Firstname = driver.findElement(By.id("first_name"));
		Firstname.sendKeys("Sharmila");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("Ravi");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("No:27,Kamaraj Street,Vijaya Nagar,Porur,Chennai-116");
		WebElement creditnumber = driver.findElement(By.id("cc_num"));
		creditnumber.sendKeys("5246123987125978");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select Credittype = new Select(cctype);
		Credittype.selectByIndex(3);
		WebElement ccmonth = driver.findElement(By.id("cc_exp_month"));
		Select Expiremonth = new Select(ccmonth);
		Expiremonth.selectByValue("12");
		WebElement ccYear = driver.findElement(By.id("cc_exp_year"));
		Select ExpireYear = new Select(ccYear);
		ExpireYear.selectByValue("2022");
		WebElement CCV = driver.findElement(By.id("cc_cvv"));
		CCV.sendKeys("5642");
		driver.findElement(By.id("book_now")).click();
		driver.findElement(By.name("my_itinerary")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='check_all']")).click();
		driver.findElement(By.xpath("//input[@value='Cancel Selected']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("logout")).click();

	}

	public static void main(String[] args) throws InterruptedException {
		Step2Login();
	}

}

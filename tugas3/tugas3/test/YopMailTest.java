package tugas3.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import tugas3.pages.InboxPage;
import tugas3.pages.LoginPage;

// Yopmail
// input automationtest as email
// Switch Iframe
// getText
// sysout content of inbox
public class YopMailTest extends BaseTest {


	int pageNum = 3; // page keberapa ?
	String username = "automationtest";
	By mailID = By.xpath("//div[@id='e_ZwVjBQN3ZGpmZGH2ZQNjZmRkAmZ2ZD==']");
	By mailTextID = By.xpath("//div[@id='mail']");


	@Test
	public void findMailTest() {
		// TODO Auto-generated method stub
		LoginPage loginPage = new LoginPage(driver);
		InboxPage InboxPage = new InboxPage(driver);

		loginPage.login(username);
		InboxPage.mailPage(pageNum);
		InboxPage.findMail(mailID);

		String actualText =	InboxPage.findText(mailTextID);
		String expectedText = "test automation";

		Assert.assertTrue((actualText).contains(expectedText));
		System.out.println(actualText);

		//		automationyopyop
		//		alt.nl-boh0w97y@yopmail.com
		// 		sendemail@yopmail.com
		// 		alt.sm-7opp81st@yopmail.com
	}
}

package tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InboxPage extends BasePage {

	By buttonNext = By.xpath("//button[@title='Next']");

	String ifInbox = "ifinbox";
	String ifMail = "ifmail";

	String text;
	public InboxPage(WebDriver driver) {
		super(driver);

	}

	public void mailPage(int p) {

		for (int i = 1; i < p; i++) {
			try {
				click(buttonNext);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void findMail(By mailID) {

		switchIframe(ifInbox);
		waitAndClick(mailID);
		outIFrame();
	}

	public String findText(By textId) {
		switchIframe(ifMail);
		return getText(textId);
	}

}

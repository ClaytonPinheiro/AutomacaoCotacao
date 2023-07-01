package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuotePage {
	private WebDriver driver;

	public SendQuotePage(WebDriver driver) {
		this.driver = driver;
	}

	public void emailField(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	public void phoneField(String phone) {
		driver.findElement(By.id("phone")).sendKeys(phone);

	}

	public void usernameField(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	public void passwordField(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	public void confirmpasswordField(String confirmpassword) {
		driver.findElement(By.id("confirmpassword")).sendKeys(confirmpassword);

	}

	public void CommentsField(String Comments) {
		driver.findElement(By.id("Comments")).sendKeys(Comments);

	}

	public void clickNext() {
		driver.findElement(By.id("sendemail")).click();
	}

	public boolean isEmailSentSuccessfully() {
		return driver.findElement(By.id("sendquote")).getText().equals("Sending e-mail success");
	}
}

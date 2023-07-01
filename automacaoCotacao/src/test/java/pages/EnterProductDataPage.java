package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterProductDataPage {

	private WebDriver driver;

	public EnterProductDataPage(WebDriver driver) {
		this.driver = driver;

	}

	public void startdateField(String startdate) {
		driver.findElement(By.id("startdate")).sendKeys(startdate);

	}

	public void insurancesumField(String insurancesum) {
		driver.findElement(By.id("insurancesum")).sendKeys(insurancesum);

	}

	public void meritratingField(String meritrating) {
		driver.findElement(By.id("meritrating")).sendKeys(meritrating);

	}

	public void damageinsuranceField(String damageinsurance) {
		driver.findElement(By.id("damageinsurance")).sendKeys(damageinsurance);

	}
	public void optionalField(String optional) {
		if (optional.equalsIgnoreCase("euro")) {
			driver.findElement(By.xpath("//section[3]/div[@class='field idealforms-field idealforms-field-checkbox']/p/label")).click();
		} else if (optional.equalsIgnoreCase("legal")) {
			driver.findElement(By.xpath("//section[3]/div[@class='field idealforms-field idealforms-field-checkbox']/p/label[2]")).click();
		}
	}

	public void courtesycarField(String courtesycar) {
		driver.findElement(By.id("courtesycar")).sendKeys(courtesycar);

	}

	public void clickNext() {
		driver.findElement(By.id("nextselectpriceoption")).click();
	}

}

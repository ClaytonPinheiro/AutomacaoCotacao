package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterVehicleDataPage {

	private WebDriver driver;

	public EnterVehicleDataPage(WebDriver driver) {
		this.driver = driver;
	}

	public void makeField(String make) {
		driver.findElement(By.id("make")).sendKeys(make);

	}

	public void modelField(String model) {
		driver.findElement(By.id("model")).sendKeys(model);

	}

	public void cylindercapacityField(String cylindercapacity) {
		driver.findElement(By.id("cylindercapacity")).sendKeys(cylindercapacity);

	}

	public void engineperformanceField(String engineperformance) {
		driver.findElement(By.id("engineperformance")).sendKeys(engineperformance);

	}

	public void dateofmanufactureField(String dateofmanufacture) {
		driver.findElement(By.id("dateofmanufacture")).sendKeys(dateofmanufacture);

	}

	public void numberofseatsField(String numberofseats) {
		driver.findElement(By.id("numberofseats")).sendKeys(numberofseats);

	}
	public void handField(String hand) {
		if (hand.equalsIgnoreCase("yes")) {
			driver.findElement(By.xpath("//div[@class='field']/p/label")).click();
		} else if (hand.equalsIgnoreCase("no")) {
			driver.findElement(By.xpath("//div[@class='field']/p/label[4]")).click();
		}
	}

	public void numberofseatsmotorcycleField(String numberofseatsmotorcycle) {
		driver.findElement(By.id("numberofseatsmotorcycle")).sendKeys(numberofseatsmotorcycle);

	}

	public void fuelField(String fuel) {
		driver.findElement(By.id("fuel")).sendKeys(fuel);

	}

	public void payloadField(String payload) {
		driver.findElement(By.id("payload")).sendKeys(payload);

	}

	public void totalweightField(String totalweight) {
		driver.findElement(By.id("totalweight")).sendKeys(totalweight);

	}

	public void listpriceField(String listprice) {
		driver.findElement(By.id("listprice")).sendKeys(listprice);

	}

	public void licenseplatenumberField(String licenseplatenumber) {
		driver.findElement(By.id("licenseplatenumber")).sendKeys(licenseplatenumber);

	}

	public void annualmileageField(String annualmileage) {
		driver.findElement(By.id("annualmileage")).sendKeys(annualmileage);

	}

	public void clickNext() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}
}

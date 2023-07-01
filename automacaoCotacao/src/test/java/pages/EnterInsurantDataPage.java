package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterInsurantDataPage {
	private WebDriver driver;

	public EnterInsurantDataPage(WebDriver driver) {
		this.driver = driver;
	}

	public void firstnameField(String firstname) {
		driver.findElement(By.id("firstname")).sendKeys(firstname);

	}

	public void lastnameField(String lastname) {
		driver.findElement(By.id("lastname")).sendKeys(lastname);

	}

	public void birthdateField(String birthdate) {
		driver.findElement(By.id("birthdate")).sendKeys(birthdate);

	}

	public void genderField(String gender) {
		if (gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//section[2]/div[@class='field']/p/label")).click();
		} else if (gender.equalsIgnoreCase("female")) {
			driver.findElement(By.xpath("//section[2]/div[@class='field']/p/label[2]")).click();
		}
	}

	public void streetaddressField(String streetaddress) {
		driver.findElement(By.id("streetaddress")).sendKeys(streetaddress);

	}

	public void countryField(String country) {
		driver.findElement(By.id("country")).sendKeys(country);

	}

	public void zipcodeField(String zipcode) {
		driver.findElement(By.id("zipcode")).sendKeys(zipcode);

	}

	public void cityField(String city) {
		driver.findElement(By.id("city")).sendKeys(city);

	}

	public void occupationField(String occupation) {
		driver.findElement(By.id("occupation")).sendKeys(occupation);

	}

    public void hobbiesField(String hobbies) {
        int value;

        switch (hobbies) {
            case "speeding":
                value = 1;
                break;
            case "bungee jumping":
                value = 2;
                break;
            case "cliff diving":
                value = 3;
                break;
            case "skydiving":
                value = 4;
                break;
            case "other":
                value = 5;
                break;
            default:
                value = 0;
                break;
        }

		driver.findElement(By.xpath("//section[2]/div[@class='field idealforms-field idealforms-field-checkbox']/p/label[" + value + "]")).click();
    }

	public void websiteField(String website) {
		driver.findElement(By.id("website")).sendKeys(website);

	}

	public void clickNext() {
		driver.findElement(By.id("nextenterproductdata")).click();
	}
}

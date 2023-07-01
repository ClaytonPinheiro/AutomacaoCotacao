package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectPriceOptionPage {

	private WebDriver driver;

	public SelectPriceOptionPage(WebDriver driver) {
		this.driver = driver;
	}
    public void priceField(String price) {
        int value;

        switch (price) {
            case "silver":
                value = 1;
                break;
            case "gold":
                value = 2;
                break;
            case "platinum":
                value = 3;
                break;
            case "ultimate":
                value = 4;
                break;
            default:
                value = 0;
                break;
        }

		driver.findElement(By.xpath("//section[4]/section/div/table/tfoot/tr/th[2]/label[" + value + "]")).click();
    }

	public void clickNext() {
		driver.findElement(By.id("nextsendquote")).click();
	}
}

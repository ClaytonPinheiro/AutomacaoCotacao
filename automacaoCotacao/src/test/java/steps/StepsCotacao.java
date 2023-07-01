package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.EnterVehicleDataPage;
import pages.EnterInsurantDataPage;
import pages.EnterProductDataPage;
import pages.SelectPriceOptionPage;
import pages.SendQuotePage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class StepsCotacao {
	WebDriver driver;
	private EnterVehicleDataPage enterVehicleDataPage;
	private EnterInsurantDataPage enterInsurantDataPage;
	private EnterProductDataPage enterProductDataPage;
	private SelectPriceOptionPage selectPriceOptionPage;
	private SendQuotePage sendQuotePage;

	
	@After
	public void after(){
		driver.quit();
	}
	

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
		driver.get(url);
		enterVehicleDataPage = new EnterVehicleDataPage(driver);
		enterInsurantDataPage = new EnterInsurantDataPage(driver);
		enterProductDataPage = new EnterProductDataPage(driver);
		selectPriceOptionPage = new SelectPriceOptionPage(driver);
		sendQuotePage = new SendQuotePage(driver);
	}

	@Quando("eu preencher o formulário da página Enter Vehicle Data e avançar")
	public void eu_preencher_o_formulário_da_página_enter_vehicle_data_e_avançar() {
		enterVehicleDataPage.makeField("BMW");
		enterVehicleDataPage.modelField("Motorcycle");
		enterVehicleDataPage.cylindercapacityField("895");
		enterVehicleDataPage.engineperformanceField("85");
		enterVehicleDataPage.dateofmanufactureField("01/01/2003");
		enterVehicleDataPage.numberofseatsField("2");
		enterVehicleDataPage.handField("yes");
		enterVehicleDataPage.numberofseatsmotorcycleField("2");
		enterVehicleDataPage.fuelField("petrol");
		enterVehicleDataPage.payloadField("100");
		enterVehicleDataPage.totalweightField("210");
		enterVehicleDataPage.listpriceField("74000");
		enterVehicleDataPage.licenseplatenumberField("12312");
		enterVehicleDataPage.annualmileageField("5000");
		enterVehicleDataPage.clickNext();
	}

	@Quando("eu preencher o formulário da página Enter Insurant Data e avançar")
	public void eu_preencher_o_formulário_da_página_enter_insurant_data_e_avançar() {
		enterInsurantDataPage.firstnameField("Will");
		enterInsurantDataPage.lastnameField("Smith");
		enterInsurantDataPage.birthdateField("08/14/1991");
		enterInsurantDataPage.genderField("male");
		enterInsurantDataPage.streetaddressField("Av. Mallet");
		enterInsurantDataPage.countryField("Brazil");
		enterInsurantDataPage.zipcodeField("11700400");
		enterInsurantDataPage.cityField("Praia Grande");
		enterInsurantDataPage.occupationField("Employee");
		enterInsurantDataPage.hobbiesField("skydiving");
		enterInsurantDataPage.websiteField("www.teste.com.br");
		enterInsurantDataPage.clickNext();
	}

	@Quando("eu preencher o formulário da página Enter Product Data e avançar")
	public void eu_preencher_o_formulário_da_página_enter_product_data_e_avançar() {
		enterProductDataPage.startdateField("06/29/2025");
		enterProductDataPage.insurancesumField("3.000.000,0");
		enterProductDataPage.meritratingField("Bonus 9");
		enterProductDataPage.damageinsuranceField("Full Coverage");
		enterProductDataPage.optionalField("euro");
		enterProductDataPage.courtesycarField("Yes");
		enterProductDataPage.clickNext();
	}

	@Quando("eu selecionar a opção de preço e avançar")
	public void eu_selecionar_a_opção_de_preço_e_avançar() {
		selectPriceOptionPage.priceField("ultimate");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		selectPriceOptionPage.clickNext();
	}

	@Quando("eu preencher o formulário da página Send Quote e avançar")
	public void eu_preencher_o_formulário_da_página_send_quote_e_avançar() {
		sendQuotePage.emailField("will.smith@teste.com");
		sendQuotePage.phoneField("123121212");
		sendQuotePage.usernameField("Willsmith");
		sendQuotePage.passwordField("Willsmith1!");
		sendQuotePage.confirmpasswordField("Willsmith1!");
		sendQuotePage.CommentsField("Automação teste");
		sendQuotePage.clickNext();
	}

	@Então("a mensagem {string} é exibida")
	public void a_mensagem_é_exibida(String string) {
		boolean isEmailSentSuccess = sendQuotePage.isEmailSentSuccessfully();
		assert isEmailSentSuccess : "Mensagem não encontrada";

	}

}
//import ini dulu
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

List<WebElement> dropdownSelector(attribute){
	WebDriver driver = DriverFactory.getWebDriver()
	WebElement list = driver.findElement(By.xpath(attribute))
	List<WebElement> itemList = list.findElements(By.tagName('li'))
	return itemList
}
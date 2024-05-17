//import ini dulu
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

List<WebElement> tableSelector(attribute){
	WebDriver driver = DriverFactory.getWebDriver()
	WebElement Table = driver.findElement(attribute)
	List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
	return rows_table
}
//function day selector
List<WebElement> daySelector() {
	WebDriver driver = DriverFactory.getWebDriver()
	WebElement week = driver.findElement(By.className("react-datepicker__month"))
	List<WebElement> dayList = week.findElements(By.className("react-datepicker__day"))
	println(dayList.size())
	return dayList
}

package com.sledzik.utils

import org.openqa.selenium.By

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.TestObject as TestObject

public class executorExtension {
	@Keyword
	List<WebElement> getWebElementsAsList(String xpath4elements) {
		WebDriver webDriver = DriverFactory.getWebDriver()
		List<WebElement> elements = webDriver.findElements(By.xpath(xpath4elements))
		return elements
	}

	@Keyword
	String getXpathFromElement (String repoObjectLocation) {
		TestObject obj = findTestObject(repoObjectLocation)
		String xpathValue = obj.findPropertyValue('xpath')

		return xpathValue
	}
}

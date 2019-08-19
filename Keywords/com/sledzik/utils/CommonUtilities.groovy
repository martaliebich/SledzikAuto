package com.sledzik.utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import internal.GlobalVariable

public class CommonUtilities {
	@Keyword
	def checkAttributeContains (Object TestObject   , String Attribute ,String sValue ){
		//WebUI.verifyElementAttributeValue(testObject, 'text', '1', 5)

		String attributeValue = WebUI.getAttribute(TestObject, Attribute, FailureHandling.CONTINUE_ON_FAILURE)
		if ((attributeValue.contains(sValue))==true) {
			KeywordUtil.markPassed("Object Attribute: " + Attribute + " contains: " + sValue+ ", Attribute string: "+attributeValue)
		}
		else {
			KeywordUtil.markFailed("Object Attribute: " + Attribute + "not  contains: " + sValue+ ", Attribute string: "+attributeValue)
		}
	}


	@Keyword
	def checkObjectActive (Object TestObject ){
		checkAttributeContains(TestObject,'class','active')
	}


	@Keyword
	def verifyAttributeValue (Object TestObject, String sAttribute, String sExpected ){
		checkAttributeContains(TestObject,'class','active')
	}

	@Keyword
	def boolean verifySortedNaturalDate(List<WebElement> list) {

		List<Date> listofDates = new ArrayList<Date>();
		list.each {
			Date newData = Date.parse( 'dd.MM.yyyy', it.getText() )
			println newData
			listofDates.add(newData)
		}

		List<Date> natural =
				listofDates.sort(false, {left, right -> left <=> right})
		//natural.each {
		//	WebUI.comment("natural: ${it.getAttribute('outerHTML')}")
		//}
		def left, right
		try {
			for (int i = 0; i < list.size(); i++) {
				left  = listofDates.get(i)
				right = natural.get(i)
				WebUI.comment("left=${left},right=${right}")
				assert left == right
			}
		} catch (AssertionError e) {
			StringBuilder sb = new StringBuilder()
			list.each {
				sb.append("${it.getAttribute('outerHTML')}\n")
			}
			KeywordUtil.markFailed("Not ordered natural.\n${sb.toString()}\nactual <=> expected\n\'${left}\' <=> \'${right}\'")
			return false
		}
		return true
	}

	@Keyword
	def boolean verifySortedNatural(List<WebElement> list) {

		List<WebElement> natural =
				list2.sort(false, {left, right -> left.getText() <=> right.getText()})
		//natural.each {
		//	WebUI.comment("natural: ${it.getAttribute('outerHTML')}")
		//}
		def left, right
		try {
			for (int i = 0; i < list.size(); i++) {
				left  = list.get(i).getText()
				right = natural.get(i).getText()
				WebUI.comment("left=${left},right=${right}")
				assert left == right
			}
		} catch (AssertionError e) {
			StringBuilder sb = new StringBuilder()
			list.each {
				sb.append("${it.getAttribute('outerHTML')}\n")
			}
			KeywordUtil.markFailed("Not ordered natural.\n${sb.toString()}\nactual <=> expected\n\'${left}\' <=> \'${right}\'")
			return false
		}
		return true
	}


	@Keyword
	def boolean verifySortedReverse(List<WebElement> list) {
		List<WebElement> reverse =
				list.sort(false, {left, right -> right.getText() <=> left.getText()})
		//list.each {
		//	WebUI.comment("list: ${it.getAttribute('outerHTML')}")
		//}
		//reverse.each {
		//	WebUI.comment("reverse: ${it.getAttribute('outerHTML')}")
		//}
		def left, right
		try {
			for (int i = 0; i < list.size(); i++) {
				left  = list.get(i).getText()
				right = reverse.get(i).getText()
				//WebUI.comment("left=${left},right=${right}")
				assert left == right
			}
		} catch (AssertionError e) {
			StringBuilder sb = new StringBuilder()
			list.each {
				sb.append("${it.getAttribute('outerHTML')}\n")
			}
			KeywordUtil.markFailed("Not ordered reverse.\n${sb.toString()}\nactual <=> expected\n\'${left}\' <=> \'${right}\'")
			return false
		}
		return true
	}

	@Keyword
	def boolean verifySortedReverseDate(List<WebElement> list) {

		List<Date> listofDates = new ArrayList<Date>();
		list.each {
			Date newData = Date.parse( 'dd.MM.yyyy', it.getText() )
			println newData
			listofDates.add(newData)
		}

		List<WebElement> reverse =
				listofDates.sort(false, {left, right -> right <=> left})
		//list.each {
		//	WebUI.comment("list: ${it.getAttribute('outerHTML')}")
		//}
		//reverse.each {
		//	WebUI.comment("reverse: ${it.getAttribute('outerHTML')}")
		//}
		def left, right
		try {
			for (int i = 0; i < list.size(); i++) {
				left  = listofDates.get(i)
				right = reverse.get(i)
				WebUI.comment("left=${left},right=${right}")
				assert left == right
			}
		} catch (AssertionError e) {
			StringBuilder sb = new StringBuilder()
			list.each {
				sb.append("${it.getAttribute('outerHTML')}\n")
			}
			KeywordUtil.markFailed("Not ordered reverse.\n${sb.toString()}\nactual <=> expected\n\'${left}\' <=> \'${right}\'")
			return false
		}
		return true
	}




}

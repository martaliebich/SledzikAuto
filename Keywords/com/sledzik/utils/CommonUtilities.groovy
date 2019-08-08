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


import internal.GlobalVariable

public class CommonUtilities {
	@Keyword
	def CheckAttributeContains (Object TestObject   , String Attribute ,String sValue ){

		String attributeValue = WebUI.getAttribute(TestObject, Attribute, FailureHandling.CONTINUE_ON_FAILURE)
		if ((attributeValue.contains(sValue))==true) {
			KeywordUtil.markPassed("Object Attribute: " + Attribute + " contains: " + sValue+ ", Attribute string: "+attributeValue)
		}
		else {
			KeywordUtil.markFailed("Object Attribute: " + Attribute + "not  contains: " + sValue+ ", Attribute string: "+attributeValue)
		}
	}


	@Keyword
	def CheckObjectActive (Object TestObject ){
		CheckAttributeContains(TestObject,'class','active')
	}
}

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

sUserName = WebUI.getText(findTestObject('Page_sledzik/PageStronaGlowna/PagePasekGorny/button_userName'))

CucumberKW.comment('Sprawdzam czy nie istnieją elementy przypisane do user')

WebUI.verifyElementNotPresent(findTestObject('Page_sledzik/PageStronaGlowna/PageListaSpraw/div_przypisanyOther', [('userName') : sUserName]), 
    0)

WebUI.click(findTestObject('Page_sledzik/PageStronaGlowna/PageSwitch/button_ownerWszystkie'))

CucumberKW.comment('Sprawdzam czy istnieją elementy przypisane do user')

WebUI.verifyElementPresent(findTestObject('Page_sledzik/PageStronaGlowna/PageListaSpraw/div_przypisanyOther', [('userName') : sUserName]), 
    0)


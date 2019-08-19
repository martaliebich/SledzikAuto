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

WebUI.verifyElementVisible(findTestObject('Page_sledzik/PageLogin/label_listaSpraw'))

'Switch Status (Otwarte)'
WebUI.verifyElementVisible(findTestObject('Page_sledzik/PageStronaGlowna/PageSwitch/button_statusOtwarte'))

'Switch Status (Zamkniete)'
WebUI.verifyElementVisible(findTestObject('Page_sledzik/PageStronaGlowna/PageSwitch/button_statusZamknite'))

'Switch Status (Wszystkie)'
WebUI.verifyElementVisible(findTestObject('Page_sledzik/PageStronaGlowna/PageSwitch/button_statusWszystkie'))

'Switch Wlasciciel (Moje)'
WebUI.verifyElementVisible(findTestObject('Page_sledzik/PageStronaGlowna/PageSwitch/button_ownerMoje'))

'Switch Wlasciciel (Wszystkie)'
WebUI.verifyElementVisible(findTestObject('Page_sledzik/PageStronaGlowna/PageSwitch/button_ownerWszystkie'))

'Switch Status (Otwarte) - aktywny'
CustomKeywords.'com.sledzik.utils.CommonUtilities.checkAttributeContains'(findTestObject('Page_sledzik/PageStronaGlowna/PageSwitch/button_statusOtwarte'), 
    'class', 'active')

'Switch Wlasciciel (Wszystkie) - aktywny\r\n'
CustomKeywords.'com.sledzik.utils.CommonUtilities.checkAttributeContains'(findTestObject('Page_sledzik/PageStronaGlowna/PageSwitch/button_statusWszystkie'), 
    'class', 'active')

'Switch Wlasciciel (Moje) - aktywny\r\n'
CustomKeywords.'com.sledzik.utils.CommonUtilities.checkAttributeContains'(findTestObject('Page_sledzik/PageStronaGlowna/PageSwitch/button_ownerMoje'), 
    'class', 'active')


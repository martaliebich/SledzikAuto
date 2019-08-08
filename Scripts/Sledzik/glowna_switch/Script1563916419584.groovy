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

WebUI.verifyElementVisible(findTestObject('Page_sledzik/Lista/span_Lista spraw'))

WebUI.verifyElementVisible(findTestObject('Page_sledzik/Lista/switch/button_Otwarte'))

WebUI.verifyElementVisible(findTestObject('Page_sledzik/Lista/switch/button_Zamknite'))

WebUI.verifyElementVisible(findTestObject('Page_sledzik/Lista/switch/button_Wszystkie'))

WebUI.verifyElementVisible(findTestObject('Page_sledzik/Lista/switch/button_Moje'))

WebUI.verifyElementVisible(findTestObject('Page_sledzik/Lista/switch/button_Wszystkie_1'))

CustomKeywords.'com.sledzik.utils.CommonUtilities.CheckAttributeContains'(findTestObject('Page_sledzik/Lista/switch/button_Otwarte'), 
    'class', 'active')

CustomKeywords.'com.sledzik.utils.CommonUtilities.CheckAttributeContains'(findTestObject('Page_sledzik/Lista/switch/button_Wszystkie'), 
    'class', 'active')

CustomKeywords.'com.sledzik.utils.CommonUtilities.CheckAttributeContains'(findTestObject('Page_sledzik/Lista/switch/button_Moje'), 'class', 
    'active')


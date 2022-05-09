import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('QA/ABC Funder/Select Organisation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('QA/01 - Snippets/06 - System/System Users'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_CheckVentory Auditor/svg_Users_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Page_CheckVentory Auditor/li_Create'))

WebUI.setText(findTestObject('Object Repository/Page_CheckVentory Auditor/input_Email_MuiInputBase-input MuiInput-input'), 
    'test001@testing.com')

WebUI.click(findTestObject('Object Repository/Page_CheckVentory Auditor/svg_dummy_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Page_CheckVentory Auditor/div_All'))

WebUI.click(findTestObject('Object Repository/Page_CheckVentory Auditor/div'))


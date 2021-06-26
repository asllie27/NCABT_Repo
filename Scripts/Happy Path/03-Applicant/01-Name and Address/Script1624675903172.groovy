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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementClickable(findTestObject('03-Applicant/01-Name and Address/01-txt_BusinessName'), GlobalVariable.Wait)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/01-txt_BusinessName'), NA_BusinessName)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/02-txt_InsuredDBA'), NA_InsuredDBA)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/03-txt_BusinessAddress'), NA_BusinessAddress)

WebUI.scrollToPosition(0, 20)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/04-txt_ZipCode'), NA_ZipCode)

WebUI.click(findTestObject('03-Applicant/01-Name and Address/05-txt_ZipcodeOperation'))

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/05-txt_ZipcodeOperation'), NA_ZipcodeOperation)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/06-txt_BusinessPrincipal'), 'TEST Principal')

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/07-txt_Email'), 'testBT@yopmail.com')

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/08-Phone'), '1234567890')

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

WebUI.click(findTestObject('03-Applicant/01-Name and Address/09-btn_Next'))


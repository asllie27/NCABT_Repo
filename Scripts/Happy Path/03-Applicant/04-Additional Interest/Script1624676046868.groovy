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

//Additional Interest
WebUI.waitForElementClickable(findTestObject('03-Applicant/04-Additional Interest/01-btn_AddButton'), GlobalVariable.Wait)

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/01-btn_AddButton'))

WebUI.waitForElementClickable(findTestObject('03-Applicant/04-Additional Interest/02_dropDown_EntityType'), GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('03-Applicant/04-Additional Interest/02_dropDown_EntityType'), AI_EntityType, false)

WebUI.setText(findTestObject('03-Applicant/04-Additional Interest/03-txt_Name'), AI_Name)

WebUI.setText(findTestObject('03-Applicant/04-Additional Interest/04-txt_Address'), AI_Address)

WebUI.setText(findTestObject('03-Applicant/04-Additional Interest/05-txt_ZipCode'), AI_ZipCode)

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/06-datePicker_EffectiveDate'))

WebUI.delay(1)

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/08-toggle_Waiver'))

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/09-toggle_Primary'))

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/10-toggle_AutoLiab'))

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/11-toggle_GenLiab'))

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/12-btn_AddAdditionalInterest'))

WebUI.check(findTestObject('03-Applicant/04-Additional Interest/Blanket Coverage/01-checkBox_AI'))

WebUI.check(findTestObject('03-Applicant/04-Additional Interest/Blanket Coverage/02-checkBox_WoF'))

WebUI.check(findTestObject('03-Applicant/04-Additional Interest/Blanket Coverage/03-checkBox_PNC'))

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/13-btn_Next'))


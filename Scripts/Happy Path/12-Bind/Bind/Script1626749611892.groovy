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

//Bind Requirements
WebUI.delay(1)

WebUI.click(findTestObject('12-Bind/01-Bind Requirements/01-btn_Add'))

WebUI.selectOptionByLabel(findTestObject('12-Bind/01-Bind Requirements/02-dropDown_BindRequirement'), 'Signed Quote', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('12-Bind/01-Bind Requirements/03-dropDown_Status'), 'Complete', false)

WebUI.setText(findTestObject('12-Bind/01-Bind Requirements/03-txt_Comment'), 'Test')

WebUI.click(findTestObject('12-Bind/01-Bind Requirements/04-btn_Save'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('12-Bind/01-Bind Requirements/01-btn_Add'), GlobalVariable.Wait)

WebUI.waitForElementClickable(findTestObject('12-Bind/02-Quote Condition/01-btn_Add'), GlobalVariable.Wait)

//Quote Condition
WebUI.delay(1)

WebUI.click(findTestObject('12-Bind/02-Quote Condition/01-btn_Add'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('12-Bind/02-Quote Condition/02-dropDown_Condition'), 'Other', false)

WebUI.setText(findTestObject('12-Bind/02-Quote Condition/03-txt_Describe'), 'Describe Test')

WebUI.setText(findTestObject('12-Bind/02-Quote Condition/04-txt_Comments'), 'Comment Test')

WebUI.click(findTestObject('12-Bind/02-Quote Condition/05-btn_Save'))

//Documents
WebUI.delay(1)

WebUI.scrollToElement(findTestObject('12-Bind/02-Quote Condition/01-btn_Add'), GlobalVariable.Wait)

WebUI.waitForElementClickable(findTestObject('12-Bind/03-Documents/01-btn_Add'), GlobalVariable.Wait)

WebUI.click(findTestObject('12-Bind/03-Documents/01-btn_Add'))

WebUI.selectOptionByLabel(findTestObject('12-Bind/03-Documents/02-dropDown_Category'), 'Category 1', false)

WebUI.setText(findTestObject('12-Bind/03-Documents/03-txt_Description'), 'Description Test')

WebUI.delay(1)

//Upload
String filePath_Bind = 'C:\\Users\\Asllie Sablan\\Downloads\\TestUpload.txt'

System.out.println('File Path is: ' + filePath_Bind)

CustomKeywords.'uploadfile.uploadFile.uploadFileToTest'(findTestObject('12-Bind/03-Documents/btn_ChooseFile'), filePath_Bind)

WebUI.click(findTestObject('12-Bind/03-Documents/04-btn_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('12-Bind/btn_Next'))


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
import org.openqa.selenium.By as By
import org.openqa.selenium.support.ui.Select as Select
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.math.BigDecimal as BigDecimal
import java.math.RoundingMode as RoundingMode
import java.text.DecimalFormat as DecimalFormat

WebUI.waitForElementClickable(findTestObject('11-Quote Option/01-btn_DownloadExp'), GlobalVariable.Wait)

WebUI.click(findTestObject('11-Quote Option/01-btn_DownloadExp'))

WebUI.delay(600)

////Upload Start
//WebUI.waitForElementClickable(findTestObject('11-Quote Option/03-btn_Upload'), 45)
//
//String quoteNumber = WebUI.getText(findTestObject('11-Quote Option/00-lbl-SubmissionNumber'))
//
//String filePath = ('C:\\Users\\Asllie Sablan\\Downloads\\' + quoteNumber) + '.xlsb'
//
//System.out.println('File Path is: ' + filePath)
//
//CustomKeywords.'uploadfile.uploadFile.uploadFileToTest'(findTestObject('11-Quote Option/03-btn_Upload'), filePath)
//
//WebUI.waitForElementVisible(findTestObject('11-Quote Option/popUp_UploadInProgress'), GlobalVariable.Wait)
//
//WebUI.waitForElementVisible(findTestObject('11-Quote Option/02-btn_CalculatePremium'), GlobalVariable.Wait)
////Added
//WebUI.waitForElementClickable(findTestObject('11-Quote Option/02-btn_CalculatePremium'), GlobalVariable.Wait)
//
//WebUI.click(findTestObject('11-Quote Option/02-btn_CalculatePremium'))
//
//WebUI.waitForElementVisible(findTestObject('11-Quote Option/btn_Next'), GlobalVariable.Wait)
//
//WebUI.waitForElementClickable(findTestObject('11-Quote Option/btn_Next'), GlobalVariable.Wait)

WebUI.click(findTestObject('11-Quote Option/btn_Next'))
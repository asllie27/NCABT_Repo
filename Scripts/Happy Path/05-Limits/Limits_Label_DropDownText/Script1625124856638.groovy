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
import org.openqa.selenium.By as By
import org.openqa.selenium.support.ui.Select as Select
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

//Limits
WebUI.waitForElementClickable(findTestObject('05-Limits/Limit/01-dropDown_AutoLiability'), GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/01-dropDown_AutoLiability'), L_AutoLiab, false)

//START Get the Text on Dropdown
not_run: Select getAutoLiability = new Select(DriverFactory.getWebDriver().findElement(By.xpath('//select[@id=\'autoBILimitId\']')))

not_run: String autoLiabActual = getAutoLiability.getFirstSelectedOption().getText()

not_run: String autoLiabExpected = '$1,000,000'

not_run: System.out.println('The item selected is ' + autoLiabActual)

//END Get the Text on Dropdown
not_run: WebUI.verifyMatch(autoLiabExpected, autoLiabActual, false)

WebUI.selectOptionByValue(findTestObject('05-Limits/Symbol/01-dropDown_AL'), '1', false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/03-dropDown_UMPD'), L_UMPD, false)

WebUI.selectOptionByValue(findTestObject('05-Limits/Symbol/03-dropDown_UMPD'), '3', false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/04-dropDown_UnderMBI'), '$750,000', false)

WebUI.selectOptionByValue(findTestObject('05-Limits/Symbol/04-dropDown_UnderMBI'), '4', false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/05-dropDown_UnderMPD'), L_UnderPD, false)

WebUI.selectOptionByValue(findTestObject('05-Limits/Symbol/05-dropDown_UnderMPD'), '5', false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/06-dropDown_MedicalPayment'), L_MedicalPayment, false)

WebUI.selectOptionByValue(findTestObject('05-Limits/Symbol/06-dropDown_MedicalPayment'), '6', false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/07-dropDown_PIP'), '$250,000 PRIMARY W/$250 DED', false)

WebUI.selectOptionByValue(findTestObject('05-Limits/Symbol/07-dropDown_PIP'), '7', false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/08-dropDown_LiabilityDed'), L_LiabilityDeductible, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/09-dropDown_Comp_FT'), L_CompFT, false)

WebUI.waitForElementClickable(findTestObject('05-Limits/radioBtn_Fire_Theft'), GlobalVariable.Wait)

WebUI.check(findTestObject('05-Limits/radioBtn_Fire_Theft'))

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/10-dropDown_Collision'), L_Collision, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/11-dropDown_GenLiab'), L_GenLiab, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/12-dropDown_Cargo'), L_Cargo, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/13-dropDown_Ref'), L_RefBreakdown, false)

WebUI.waitForElementClickable(findTestObject('05-Limits/btn_Next'), GlobalVariable.Wait)

WebUI.click(findTestObject('05-Limits/btn_Next'))


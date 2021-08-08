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

WebUI.scrollToPosition(10, 10)

//Driver
for (int i = 1; i <= 12; i++) {
    WebUI.delay(1)

    WebUI.click(findTestObject('07-Driver/01-btn_Add'))

    WebUI.delay(1)
	
	WebUI.waitForElementClickable(findTestObject('07-Driver/01-btn_Add'), GlobalVariable.Wait)

    WebUI.setText(findTestObject('07-Driver/02-txt_FName'), 'FirstName' + i)

    WebUI.setText(findTestObject('07-Driver/03-txt_LName'), D_Lname)

    WebUI.setText(findTestObject('07-Driver/04-txt_LicenseNumber'), 'F255-921-50-094-' + i)

    WebUI.click(findTestObject('07-Driver/05-txt_DOB'))

    WebUI.setText(findTestObject('07-Driver/05-txt_DOB'), D_DOB)

    WebUI.click(findTestObject('07-Driver/06-toggle_OSD'))

    WebUI.selectOptionByLabel(findTestObject('07-Driver/07-dropDown_State'), D_State, false)

    WebUI.setText(findTestObject('07-Driver/08-txt_YDE'), '3')

    WebUI.setText(findTestObject('07-Driver/09-txt-YCDE'), D_YCDE)

    //AddIncident
    WebUI.click(findTestObject('07-Driver/10-btn_AddNewIncident'))

    WebUI.waitForElementVisible(findTestObject('07-Driver/11-dropDown_IncidentType'), GlobalVariable.Wait)

    WebUI.selectOptionByLabel(findTestObject('07-Driver/11-dropDown_IncidentType'), 'At-Fault', false)

    WebUI.click(findTestObject('07-Driver/12-txt_IncidentDate'))

    WebUI.click(findTestObject('07-Driver/12-txt_IncidentDate'))

    WebUI.setText(findTestObject('07-Driver/12-txt_IncidentDate'), '03182021')

    WebUI.click(findTestObject('07-Driver/12-txt_ConvictionDate'))

    WebUI.setText(findTestObject('07-Driver/12-txt_ConvictionDate'), '03202021')

    WebUI.click(findTestObject('07-Driver/13-btn_IncidentSave'))

    //AddIncident
    WebUI.click(findTestObject('07-Driver/10-btn_AddNewIncident'))

    WebUI.waitForElementVisible(findTestObject('07-Driver/11-dropDown_IncidentType'), GlobalVariable.Wait)

    WebUI.selectOptionByLabel(findTestObject('07-Driver/11-dropDown_IncidentType'), 'Not At-Fault', false)

    WebUI.click(findTestObject('07-Driver/12-txt_IncidentDate'))

    WebUI.click(findTestObject('07-Driver/12-txt_IncidentDate'))

    WebUI.setText(findTestObject('07-Driver/12-txt_IncidentDate'), '03202021')

    WebUI.click(findTestObject('07-Driver/12-txt_ConvictionDate'))

    WebUI.setText(findTestObject('07-Driver/12-txt_ConvictionDate'), '03272021')

    WebUI.click(findTestObject('07-Driver/13-btn_IncidentSave'))

    WebUI.click(findTestObject('07-Driver/14-btn_AddDriver'))
}

WebUI.delay(1)

WebUI.click(findTestObject('07-Driver/15-multiDropDown_DriverFilter'))

WebUI.click(findTestObject('07-Driver/16-checkBox_SelectAll'))

WebUI.click(findTestObject('07-Driver/btn_Next'))


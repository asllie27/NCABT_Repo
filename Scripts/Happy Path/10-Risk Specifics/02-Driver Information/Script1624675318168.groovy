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

//Driver Information
WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/01-dropDown_DriverHired'), 
    GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/01-dropDown_DriverHired'), 
    '15', false)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/02-dropDown_DriverTerminated'), 
    '5', false)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/03-dropDwon_MVRPulled'), 
    'Annually', false)

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/04-toggle_BusinessPrincipal'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/05-toggle_Volunteers'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/06-txt_PercentageStaff'), '50')

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/07-toggle_HireFromOthers'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/08-txt_AnnualCost_1'), '10000')

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/09-toggle_HireDriver'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/10-txt_AnnualCost_2'), '10000')

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/11-toggle_LeasingToOthers'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/12-txt_AnnualIncome_1'), '10000')

WebUI.scrollToPosition(100, 200)

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/13-toggle_LeaseDriver'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/14-txt_AnnualIncome_2'), '10000')

WebUI.scrollToPosition(400, 500)

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/15-toggle_AssumedLiability'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/16-toggle_VehicleHome'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/17-toggle_VehicleOwned'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/18-toggle_AddDelVehicle'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/19-txt_DescribeAddDelVin'), 
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.scrollToPosition(700, 800)

//Driver Hiring Criteria
WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/01-toggle_SimilarVin'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/02-toggle_5yrsExp'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/03-toggle_AgreeReport'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/04-toggle_21PrimaryDriver'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/05-toggle_LicensedAndDOT'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/06-toggle_DocumentedForDriver'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/07-toggle_IncentiveProgram'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/08-multiDropDown_BGCheck'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/09-checkBox_SelectAll'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/10-multiDropDown_DriverTraining'))

WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/12-checkBox_DT_None'), 
    GlobalVariable.Wait)

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/12-checkBox_DT_None'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/btn_Next'))


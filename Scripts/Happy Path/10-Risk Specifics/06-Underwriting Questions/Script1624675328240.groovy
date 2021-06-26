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

WebUI.waitForElementVisible(findTestObject('10-Risk Specifics/06-Underwriting Questions/01-toggle_ProvideCompensation'),
	GlobalVariable.Wait)

//Set to YES
WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/01-toggle_ProvideCompensation'))

//Set to NO
WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/01-toggle_ProvideCompensation'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/01-txt_CompensationExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

//Set to YES
WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/02-toggle_EquipmentOperated'))

//Set to NO
WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/02-toggle_EquipmentOperated'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/02-txt_EquipOperatedExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/03-toggle_RiskPlan'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/03-txt_RiskPlanExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/04-toggle_CompanyNOC'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/04-txt_NocExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.scrollToPosition(0, 9999999)

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/05-toggle_FillingBankruptcy'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/05-txt_BankruptcyExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/06-toggle_AuthSuspended'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/06-txt_SuspensionExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/07-toggle_Covid19'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/07-txt_Covid19Vehicle'), '20')

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

WebUI.check(findTestObject('10-Risk Specifics/06-Underwriting Questions/08-checkBox_Iconfirm'))

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/09-btn_Next'))


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

//GenLiab
WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/01-toggle_CarryGenLiab'), 
    GlobalVariable.Wait)

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/01-toggle_CarryGenLiab'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/02-toggle_Operations'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/03-toggle_Goods'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/04-toggle_Warehousing'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/05-toggle_StorageVehicle'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/06-toggle_LeasingSpace'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/07-toggle_FreightForwarding'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/08-toggle_StorageFuelChemicals'))

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/09-txt_GLAnnualPayroll'), RS_GLPayroll)

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/10-toggle_OperationsOtherThanTrucking'))

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/10-txt_Explain'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/11-toggle_GenLiabLoss'))

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/11-txt_Explain'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

//Cargo
WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/01-toggle_RequiredCarryCargo'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/02-toggle_RequireRefBreakdown'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/03-toggle_HazardousMaterials'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/04-toggle_RefUnits'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/05-toggle_StoredTruckOvernyt'))

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/05-txt_Explain'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/06-toggle_CargoLoss'))

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/06-txt_Explain'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/01-btn_Add'))

WebUI.waitForElementVisible(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/02-dropDown_Commodity'), 
    GlobalVariable.Wait)

WebUI.selectOptionByValue(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/02-dropDown_Commodity'), 
    'APPLIANCES', false)

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/03-txt_PercentCarry'), 
    '50')

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/04-btn_AddCommodity'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/btn_Next'))


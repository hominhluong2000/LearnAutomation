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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

'Kiểm tra coi button đó click đc chưa\r\n'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

'chọn option bằng index\r\n'
WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    2)

WebUI.check(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

'verify coi đã check element đó chưa\r\n'
WebUI.verifyElementChecked(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'), 
    5)

WebUI.uncheck(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.verifyElementNotChecked(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'), 
    5)

WebUI.check(findTestObject('Page_CURA Healthcare Service/input_None_programs'))

WebUI.verifyElementChecked(findTestObject('Page_CURA Healthcare Service/input_None_programs'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()


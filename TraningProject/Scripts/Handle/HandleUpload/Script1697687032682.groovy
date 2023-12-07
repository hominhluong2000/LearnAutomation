import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/upload-download')

WebUI.maximizeWindow()

def filePath = 'D:/sampleFile.jpeg'

WebUI.uploadFile(findTestObject('Page_DEMOQA/input_Select a file_uploadFile'), filePath)

WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/p_CfakepathKinh dia Mau 17.mp3'), 0)

WebUI.delay(3)

WebUI.closeBrowser()


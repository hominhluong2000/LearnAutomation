import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

def name = 'Anh 3 Lor'

println ('My name is ' + name)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Page_Your store. Login/input_Email_Email'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Your store. Login/input_Password_Password'), password)

WebUI.click(findTestObject('Object Repository/Page_Your store. Login/button_Log in'))


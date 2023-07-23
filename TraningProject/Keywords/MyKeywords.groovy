import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.bouncycastle.asn1.cms.PasswordRecipientInfo

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class MyKeywords {

	@Keyword
	def hi() {
		println("Hi")
	}

	@Keyword(keywordObject = 'login')
	def loginToOrangeWebsite(String username, String password) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_username'), username)
		WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Password_password'),  password)
		WebUI.click(findTestObject('Page_OrangeHRM/button_Login'))
		WebUI.delay(1)
		WebUI.closeBrowser()
	}

	@Keyword(keywordObject = 'login')
	def helloUser(String user ) {
		println("Hello " + user)
	}

	@Keyword(keywordObject = 'hello')
	def loginToNopcommerceWebsite(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Your store. Login/input_Login',[('login'):'Email']), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Your store. Login/input_Login',[('login'):'Password']),  password)
		WebUI.click(findTestObject('Object Repository/Page_Your store. Login/button_Log in'))
	}
}


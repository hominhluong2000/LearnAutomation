import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser("")

WebUI.navigateToUrl(GlobalVariable.url)

CustomKeywords.'MyKeywords.loginToNopcommerceWebsite'(GlobalVariable.userName, GlobalVariable.password)

WebUI.click(findTestObject('Page_Your store. Login/Page_Dashboard  nopCommerce administration/p_Content management'))

WebUI.click(findTestObject('Page_Your store. Login/Page_Dashboard  nopCommerce administration/p_News comments'))

WebDriver driver = DriverFactory.getWebDriver()

String ExpectedValue = 'nopCommerce new release!'

'To locate table'
WebElement Table = driver.findElement(By.xpath('(//table)[1]'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.xpath('(//table)[1]//tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

ArrayList header = new ArrayList()

'Loop will execute for all the rows of the table'
for (int row = 0; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.xpath('(//table)[1]//tr/th'))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    println((('Number of cells In Row ' + row) + ' are ') + columns_count)

    'Loop will execute till the last cell of that specific row'
    Loop: for (int column = 0; column < columns_count; column++) {
        'It will retrieve text from each cell'
        String celltext = Columns_row.get(column).getText()

        header.add(celltext)

        'Checking if Cell text is matching with the expected value'
        if (celltext == ExpectedValue) {
            'Getting the Country Name if cell text i.e Company name matches with Expected value'
            println('Text present in row number 2 is: ' + Columns_row.get(2).getText())
        }
        
        break
    }
}

println(header)
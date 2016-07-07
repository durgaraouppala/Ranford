package testngpractice;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.lang.reflect.Method;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.Iterator;
	import java.util.List;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

	public class Testngxml {
	private WebDriver myDriver = null;

	    @BeforeTest
	    public void openBrowser(){
	        System.out.println("This test automation framework is created by --- for ---");
	        //Set browser
	        //System.setProperty("webdriver.chrome.driver", "C://Temp//chromedriver.exe");
	        //System.setProperty("webdriver.ie.driver", "C://Temp//IEDriverServer.exe");

	        //Instantiate new WebDriver object with browser of choice
	        myDriver = new FirefoxDriver();
	        //myDriver = new InternetExplorerDriver();
	        //myDriver = new ChromeDriver();
	        myDriver.get("http://localhost/tests/");
	    }


	    @Test (dataProvider="provideData")
	    public void csvTest(String stepNr, String timeWaitMil, String waitForElement, String clickOnCssNameXpathLink, 
	                        String valueInTextBox, String backspaceText, String assertReturnTrueFalse, 
	                        String assertBy, String getUrl, 
	                        String deleteCookie, String snapshot, String specialSnapshot){



	        // Click on a something based on css, name xpath or link
	        if (!"-".equals(clickOnCssNameXpathLink)){
	            myDriver.findElement(By.name(clickOnCssNameXpathLink)).click();
	        }

	        // Enter value in textbox
	        if (!"-".equals(valueInTextBox)){
	            myDriver.findElement(By.name(clickOnCssNameXpathLink)).sendKeys(valueInTextBox);
	        }


	        // Delete cookies
	        if (!"-".equals(deleteCookie)){
	            myDriver.manage().deleteAllCookies();           
	        }

	        // Make snapshot of whole page
	        if (snapshot.equalsIgnoreCase("true")){
	            // take the screenshot of full page
	            File scrFile = ((TakesScreenshot)myDriver).getScreenshotAs(OutputType.FILE);
	            // prepare date to use in filename
	            Date d = new Date();
	            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
	            // Save screenshot
	            try {
	                FileUtils.copyFile(scrFile, new File("c:\\Temp\\screenshots\\full_page_" +dateFormat.format(d)+ ".png"));
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	                System.out.println("Could not make screenshot");
	            }       
	        }

	    } 


	    @DataProvider
	    public Iterator<Object []> provideData() throws InterruptedException, IOException
	    {
	        //Array with multiple csv's
	        String csvFiles[] = {"C:/Users/---/Desktop/JES2.0/testingSelenium/testNG/data.csv", "C:/Users/---/Desktop/JES2.0/testingSelenium/testNG/data2.csv"};

	        List<Object []> testCases = new ArrayList<>();

	        //loop through csv files
	        for(String csvFile:csvFiles){
	                String[] data= null;
	                //read csv file
	                BufferedReader br = new BufferedReader(new FileReader(csvFile));

	                //Skip first line in the csv file, because that only contains the column names
	                String line = br.readLine();

	                //loop through csv and split parameters by comma sign ,
	                while ((line = br.readLine()) != null) {
	                    // use comma as separator
	                    data= line.split(",");
	                    testCases.add(data);
	                }//end of while loop

	            }// end of for loop
	        return testCases.iterator();        
	    }


	    @AfterTest
	    public void closeBrowser(){
	        //close browser
	        myDriver.quit();
	    }

	}



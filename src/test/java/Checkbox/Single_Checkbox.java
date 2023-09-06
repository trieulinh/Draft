package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Single_Checkbox {
    public static void main(String[] args) throws InterruptedException {

        //open Browser
        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to Website
        driver.navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //initial List of Checkbox elements
        List<WebElement> ListCheckbox = driver.findElements(By.xpath("//div[@class='panel panel-default'][1]//input"));
        for (int i = 0; i < ListCheckbox.size(); i++) {
            boolean isEnableCheckbox = ListCheckbox.get(i).isEnabled();
            if (isEnableCheckbox == true) {
                boolean isSelectedCheckbox = ListCheckbox.get(i).isSelected();
                if (isSelectedCheckbox == false) {
                    ListCheckbox.get(i).click();
                }
            }
        }
    }
}




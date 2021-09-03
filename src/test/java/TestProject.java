
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class TestProject extends WebDriveSettings {


    @Test
    public void testProject() throws InterruptedException {

        WebElement element = driver.findElement(By.linkText("Проекты"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();

        driver.findElement(By.xpath("//span[contains(.,'Мои проекты')]")).click();
        driver.findElement(By.linkText("Создать проект")).click();
        driver.findElement(By.name("crm_project[name]")).sendKeys("HomeworkRe1");
        driver.findElement(By.xpath("//span[contains(text(),'Укажите организацию')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Alya')]")).click();

        WebElement businessUnit = driver.findElement(By.name("crm_project[businessUnit]"));
        businessUnit.findElement(By.xpath("//option[. = 'Research & Development']")).click();

        WebElement curator = driver.findElement(By.name("crm_project[curator]"));
        curator.findElement(By.xpath("//option[. = 'Юзеров Юзер']")).click();

        WebElement rp = driver.findElement(By.name("crm_project[rp]"));
        rp.findElement(By.xpath("//option[. = 'Корыстин Василий']")).click();

        WebElement administrator = driver.findElement(By.name("crm_project[administrator]"));
        administrator.findElement(By.xpath("//option[. = 'Ямутина Вера']")).click();

        WebElement selectElement = driver.findElement(By.name("crm_project[manager]"));
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText("Чернецкий Евгений");

 WebElement contact = driver.findElement(By.xpath("//select[@name=\"crm_project[contactMain]\"]"));
 Select selectContact = new Select(contact);
 selectContact.selectByVisibleText("Иванов Петр");

    driver.findElement(By.xpath("//button[contains(text(),\'Сохранить и закрыть\')]")).click();
    }
}

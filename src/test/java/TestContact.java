
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class TestContact extends WebDriveSettings {



  @Test
  public void testContact() {

    {
      WebElement element = driver.findElement(By.linkText("Контрагенты"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
      driver.findElement(By.linkText("Контактные лица")).click();
    }

    driver.findElement(By.linkText("Создать контактное лицо")).click();
    driver.findElement(By.name("crm_contact[lastName]")).sendKeys("Alexeev");
    driver.findElement(By.name("crm_contact[firstName]")).sendKeys("Alex");
    driver.findElement(By.xpath("//span[contains(text(),'Укажите организацию')]")).click();
    driver.findElement(By.xpath("//div[contains(text(),'Alya')]")).click();
    driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("Director");
    driver.findElement(By.xpath("//button[contains(text(),'Сохранить и закрыть')]")).click();
  }
}

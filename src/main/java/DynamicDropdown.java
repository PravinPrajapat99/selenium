import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement searchBar = driver.findElement(By.xpath("//div[@class='_1sFryS _2alaMB']//div/input"));
        searchBar.sendKeys("i phone");

        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@class='_1sFryS _2alaMB']//button")).click();
        List<WebElement> list= driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
        String mainhandle=driver.getWindowHandle();
        for(WebElement element:list){
            if(element.getText().equals("i phone 15 plus")){
                element.click();
                break;
            }
        }

        Thread.sleep(3000);

        List<WebElement> listMobiles =driver.findElements(By.xpath("//div[@class='DOjaWF gdgoEp']/div[@class='cPHDOP col-12-12']"));
        for (int i=3 ;i<listMobiles.size()-2;i++){
            if(listMobiles.get(i).findElement(By.xpath(".//div[@class='KzDlHZ']")).getText().equals("Apple iPhone 15 Plus (Yellow, 128 GB)")){
                listMobiles.get(i).click();
                break;
            }

        }
        Set<String> handleset=driver.getWindowHandles();
        for (String s:handleset){
            if(!s.equals(mainhandle)){
                driver.switchTo().window(s);
                break;
            }
        }
        Thread.sleep(3000);
        List<WebElement> specificationList=driver.findElements(By.xpath("//div[@class='U+9u4y']//li"));
        System.out.println(specificationList.size());
        for (WebElement element:specificationList){
            System.out.println(element.getText());
        }
        driver.close();
    }
}

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BusinessPage extends BusinessPageBase {

    @Test
    public void worldTitleTest() {
        Assert.assertEquals(app.getCurrentPageTitle(),  BusinessPageBase.Selector.BUSINESS_TITLE);
    }


    @Test
    public void googleTest() throws InterruptedException, MalformedURLException {

        String filepath = "D:/autoru/ruauto/src/main/java/sound1.wav";
        playSound(filepath);

        open("https://store.google.com/us/?hl=en-US&regionRedirect=true");
        $(By.xpath(".//*[@class='navbar-full']/div/div[7]/button")).click();
        $(By.xpath(".//*[@class='sign-in-inner inline-flex']")).click();
        $(By.id("identifierId")).val("igor.mashkov33333@gmail.com");
        $(By.id("identifierNext")).click();
        $(By.name("password")).val("uo3pjK1l!");
        $(By.id("passwordNext")).click();
        //Sound.playSound("D:/autoru/ruauto/src/main/java/sound1.wav");

        //String filepath = "/src/main/java/sound1.wav";
        //playSound(filepath);




        while(true) {
            //Открываем историю покупок
            //open("https://store.google.com/us/orderhistory?hl=en-US");
            $(By.xpath(".//*[@class='navbar-full']/div/div[7]/button")).click();
            $(By.xpath(".//*[.=' Orders ']")).click();
            Assert.assertEquals(app.driver.getCurrentUrl(), "https://store.google.com/us/orderhistory?hl=en-US");
            //System.out.println("Проверка номер  " + i);
            Thread.sleep(25000);
            //Смотрим активные подписк
            $(By.xpath(".//*[@class='navbar-full']/div/div[7]/button")).click();
            $(By.xpath(".//*[.=' Subscriptions ']")).click();
            //open("https://store.google.com/us/subscriptions?hl=en-US");
            Assert.assertEquals(app.driver.getCurrentUrl(), "https://store.google.com/us/subscriptions?hl=en-US");
            Thread.sleep(25000);
            //Sound.playSound("D:/autoru/ruauto/src/main/java/sound2.mp3");

        }




    }
}

package page;

import methods.methods;
import org.openqa.selenium.By;

public class LoginPage {

    methods methods;

    public LoginPage() {
        methods = new methods();
    }

    public void Login() {
        methods.click(By.id("user_1_"));
        methods.waitBySeconds(2);
        methods.click(By.className("login-form__link"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("[placeholder='E-Posta Adresiniz']"),"yanlısmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.cssSelector("[type='password']"),"1235534");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".register__button.register__button--blue"));
        methods.waitBySeconds(4);
        methods.getText(By.cssSelector(".input-container:nth-child(1) .error"));
        System.out.println("Lütfen geçerli bir e-posta adresi giriniz.");
        methods.waitBySeconds(1);
        methods.getText(By.cssSelector(".input-container:nth-child(2) .error"));
        System.out.println("Şifreniz harf ile rakam içermeli ve en az altı karakter olmalıdır.");
        methods.waitBySeconds(2);
        methods.click(By.name("memberPrivacyApprove"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".register__button.register__button--blue"));
        methods.waitBySeconds(2);
        methods.getText(By.cssSelector(".input-container:nth-child(3) .error"));
        System.out.println("Lütfen telefon numaranızı giriniz.");
        methods.waitBySeconds(1);

    }
}

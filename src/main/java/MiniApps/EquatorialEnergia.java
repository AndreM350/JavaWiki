package MiniApps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EquatorialEnergia {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        // Define a localização do driver do Chrome
        System.setProperty("webdriver.chrome.driver", "D:/Setup de Código/chromedriver_win32/chromedriver.exe");

        // Instancia o driver do Chrome
        WebDriver driver = new ChromeDriver();

        // Acessa o site da Equatorial Energia
        driver.get("https://pa.equatorialenergia.com.br/");

        // Localiza o campo de CPF e preenche com o valor desejado
        WebElement campoCpf = driver.findElement(By.id("identificador"));
        campoCpf.sendKeys("02076931295");

        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        Thread.sleep(1000);

        // Localiza o campo de senha e preenche com o valor desejado
        WebElement campoSenha = driver.findElement(By.id("senha-identificador"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = "24/10/1993";
        campoSenha.sendKeys(formatter.format(LocalDate.parse(data, formatter)));

        Thread.sleep(2000);

        WebElement campoPlace = driver.findElement(By.cssSelector("input[placeholder='000']"));
        campoPlace.sendKeys("020");



        // Clica no botão "Enviar"
        WebElement botaoEnviar = driver.findElement(By.id("envia-identificador"));
        botaoEnviar.click();

        // Aguarda o carregamento da página
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Clica no item do menu desejado
        WebElement itemMenu = driver.findElement(By.id("menu-item-3888"));
        itemMenu.click();

        // Obtém os dados da lista que foi carregada na página
        WebElement lista = driver.findElement(By.id("id-da-lista"));
        String dadosDaLista = lista.getText();
        System.out.println(dadosDaLista);

        // Fecha o navegador
        driver.quit();
    }
}

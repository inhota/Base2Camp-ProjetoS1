package TreinamentoSelenium;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    String fruta = "Pera";
    String empresa = "Base2";
    String cidade = "Belo Horizonte";
    String carro = "Gol";
    int soma = 4+6;

    @Test
    public void meuPrimeiroTeste(){

        Assert.assertTrue(fruta.equals("Pera"));
    }

    @Test
    public void meuSegundoTeste(){


        Assert.assertTrue(empresa.equals("Base2"));
        Assert.assertTrue(cidade.equals("Belo Horizonte"));
    }

    @Test
    public void meuTerceiroTeste(){
        Assert.assertEquals(10, soma);
        Assert.assertTrue(carro.equals("Gol"));
        Assert.assertTrue(cidade.equals("Belo Horizonte"));
    }

    @Test
    public void helloworld(){
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://google.com");

        Assert.assertEquals("Google", driver.getTitle());

        driver.quit();

    }

}

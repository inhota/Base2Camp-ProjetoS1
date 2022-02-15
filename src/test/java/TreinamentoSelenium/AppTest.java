package TreinamentoSelenium;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

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

}

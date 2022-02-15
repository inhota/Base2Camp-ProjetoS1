package TreinamentoSelenium;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void meuPrimeiroTeste(){
        String fruta = "Pera";
        Assert.assertTrue(fruta.equals("Pera"));
    }

    @Test
    public void meuSegundoTeste(){
        String empresa = "Base2";
        String cidade = "Belo Horizonte";

        Assert.assertTrue(empresa.equals("Base2"));
        Assert.assertTrue(cidade.equals("Belo Horizonte"));
    }

}

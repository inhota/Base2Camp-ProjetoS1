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

}

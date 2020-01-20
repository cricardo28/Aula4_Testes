/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DeliverIT
 */
public class FizzBuzzTest {

    public FizzBuzzTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRestoDaDivisaoPorTresRetornaFizz() {
        //inputs
        int numero = 3;

        //Execução
        FizzBuzz fizzbuzz = new FizzBuzz();
        String retorno = fizzbuzz.doFizzBuzz(numero);

        // Teste
        Assert.assertEquals("Fizz", retorno);
    }

    @Test
    public void testRestoDaDivisaoPorCincoRetornaBuzz() {
        //inputs
        int numero = 5;

        //Execução
        FizzBuzz fizzbuzz = new FizzBuzz();
        String retorno = fizzbuzz.doFizzBuzz(numero);

        // Teste
        Assert.assertEquals("Buzz", retorno);
    }

    @Test
    public void testPassandoNumeroRetornaOMesmo() {
        //inputs
        int numero = 7;

        //Execução
        FizzBuzz fizzbuzz = new FizzBuzz();
        String retorno = fizzbuzz.doFizzBuzz(numero);

        // Teste
        Assert.assertEquals("7", retorno);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForaDosLimites() {
        //inputs
        int numero = -1;

        //Execução
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.doFizzBuzz(numero);

    }
}

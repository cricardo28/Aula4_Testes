/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DeliverIT
 */
public class FizzBuzz {

    public FizzBuzz() {
    }

    public String doFizzBuzz(Integer numero) {
        if (numero < 1 || numero > 100) {
            throw new IllegalArgumentException();
        }

        if (numero % 3 == 0) {
            return "Fizz";
        }
        if (numero % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(numero);

    }

}

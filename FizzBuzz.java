package za.co.wethinkcode.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public String checkNumber (int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if ( divisibleBy3 && divisibleBy5 ) {
            return "FizzBuzz";
        }
        else if (divisibleBy3 ) {
            return "Fizz";
        }
        else if (divisibleBy5){
            return"Buzz";
        }
        return String.valueOf(number);
    }

    public String countTo(int number) {
        List<String>listFizz =new ArrayList<>();
        for (int i=1; i<= number;i ++ ) {
            listFizz.add(checkNumber(i));
        }
        return listFizz.toString();
    }
}


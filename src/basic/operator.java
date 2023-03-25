package basic;

public class operator {
    public static void main(String[] args) {
        /*
        operator: 연산을 수행하는 기호 (+, -, *, /)
        operand: operator 의 작업 대상 (constant, variable..)
         */


        /*
        types of operator
        1) arithmetic operator: +, - , *, /, %, <<, >>)
        2) comparative operator: <, >, <=, >=, ==, !=
        3) logical operator: && (AND), || (OR), ! (NOT), &, |, ^, ~
        4) substituting operator: = (ex. int age = 17;)
         */

        /*
        operator 의 priority
        arithmetic > comparative > logical > substituting
        ex) result = x + y * 3
            x > 3 && x < 5
         */

        // arithmetic conversion

        int i = 10;
        double d = 50.0;

        double result = d + (double)i;
        System.out.println(result);

        System.out.println((double)i);

        int a = 5; int b = 2;
        System.out.println(a/(double)b);

        // 증감 연산자
        int num = 10;
        num++; // num = num + 1;
        num--; // num = num - 1;

        // arithmetic operator

        int num1 = 10; int num2 = 4;

        System.out.println(num1+num2); //14
        System.out.println(num1-num2); //6
        System.out.println(num1*num2); //40
        System.out.println(num1/num2); //2
        System.out.println(num1%num2); //2

        // comparative operator
        System.out.println(10 > 9); //true
        System.out.println(5 == 3); // false

        // logical operator
        int x = 10;
        System.out.println(x > 5 || x < 7);
        System.out.println(x % 2 == 0 && x % 3 ==0);
        char ch = '5'; // '0' <= ch <= '9'
        System.out.println('0' <= ch && ch <= '9'); //ch가 '0'~'9'
    }
}

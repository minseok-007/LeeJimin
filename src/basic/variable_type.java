package basic;

public class variable_type {
    public static void main(String[] args) {
        /*
        기본형 (primitive type): 실제 값(data)을 저장

        참조형 (reference type): 어떤 값이 저장되어 있는 주소를 값으로 가진다
         */

        /*
        primitive type의 classification
        -논리형: boolean --> true / false 값을 가지며, 조건식과 논리적 계산에 활용
        -문자형: char --> 문자를 저장하고, 변수에 하나의 문자만 저장할 수 있음
        -정수형: byte, short, int, long --> 정수 저장, 주로 int 사용.
        -실수형: float, double --> 실수 저장, 주로 double 사용
         */

        boolean power = true;

        char ch = 'A'; // 문자 'A'의 유니코드 65이므로, ch 에는 65가 저장됨.

        int code = (int)ch;
        System.out.println(code);

        double data = 1.3;
        System.out.println(data);

        // type casting: 변수의 타입을 다른 타입으로 변환하기

        double d = 85.4;

        int score = (int) d;
        System.out.println(score);
        System.out.println(d);

        double total_score = 99.5;
        int student = 5;
        System.out.println(total_score/student);




    }
}

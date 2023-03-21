package basic;

public class variable {
    public static void main(String[] args) {
        // variable: 단 하나의 값을 저장할 수 있는 메모리 공간

        int age = 17;
        age = age + 1;

        //System.out.println(age);

        int x = 10;
        int y = 20;
        int temp;

        temp = x; // temp = 10
        x = y; // x = 20, y = 20
        y = temp; // x = 20, y = 10

        System.out.println("x: " + x + " y: " + y);

        /*
        1. 대소문자가 구분되며, 길이에 제한이 없음 (True랑 true 다르다!)
        2. 예약어를 사용해서는 안된다 (ex. int, package, class, static)
        3. 숫자로 시작해서는 안된다.
        4. 특수문자는 '_'와 '$'만 허용
        5. 무엇보다, 의미있는 변수 이름을 사용하길 권장
         */

    }
}

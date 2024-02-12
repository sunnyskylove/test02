package com.ohgiraffers.section02.variable;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 변수의 명명 규칙에 대해 이해할 수 있다. */
        /* 필기.
        *    변수의 명명 규칙
        *   변수의 이름을 지을때 아무렇게나 짓는 것이 아닌 정해진 규칙이 있다.
        *   실무적으로는 굉장히 중요하기 때문에 반드시 숙지해야 하고,
        *   또한, 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단추이다.
        * */

        /* 필기.
        *   변수의 명명 규칙
        *     1. 컴파일 에러를 발생시키는 규칙
        *   1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
        *   1-2. 예약어는 사용이 불가능하다. (예약어: 자바에 등록되어 있어 의미가 약속되어 있는 명령어)
        *   1-3. 변수명은 대/소문자를 구분한다 (자바는 대/소문자를 엄격하게 구분하는 언어이다.)
        *   1-4. 변수명은 숫자로 시작할 수 없다.(시작만 할 수 없고 숫자를 섞어서 사용하는 것은 가능.
        *   1-5. 특수기호는 '_', '$'만 사용 가능하다.
        *    2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙
        *   2-1. 변수명의 길이 제한은 없다. (하지만 적당히 해야겠죠?)
        *   2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 단어는 대문자로 시작한다.(합성어: 뜻이 2개이상)
        *   2-3. 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다. (타 언어 네이밍 규칙이다.)
        *   2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다. (영어로 변수명 만들기!!)
        *   2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현한다.
        *   2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다.
        *   2-7. 명사형으로 작성할 수 있도록 한다.
        *   2-8. boolean 형은 의문문으로 가급적 긍정형태로 네이밍한다.
        * */

         /* 목차. 1. 컴파일 에러를 발생시키는 규칙 */
         /* 목차. 1-1. 동일한 범위내에서 동일한 변수명을 가질 수 없다. */
        int age = 20;
//          int age = 20;       //age 동일하게 2번 중복되어 에러

        /* 목차. 1-2. 예약어는 사용이 불가능하다. */
//        int true = 1;       // 예약어는 사용할 수 없다. (true가 예약어)
//        int true = 1;

        /*목차. 1-3. 변수명은 대소문자로 구분한다. */
        int Age = 20;     // 따라서 앞에 age 있었얻도 Age로 구분해서 사용 가능!

        /* 목차. 1-4. 변수명은 숫자로 시작할 수 없다. */
//        int 1age = 20;      // 숫자로 시작하면 오류가 발생한다. 하단처럼 차라리 뒤에 붙여줘라~
        int age1 = 20;

        /* 목차. 1-5. 특수기호는 '_' 와 '$'만 사용이 가능하다. */
        int _age_ = 20;
        int $harp= 20;

        /* 목차. 2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙 */
        /* 목차. 2-1. 변수명의 길이 제한은 없다. 하지만 적당히 */
        int aldjfiwoeighoawigabsdjbgvksjbvcxbzkjvbakghb;

        /* 목차. 2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두번째 시작 단어는 대문자로 시작한다.(카멜케이스) */
        /* 필기. (주의) 자바에서는 클래스명만 유일하게 대문자로 시작한다. */
        int maxAge = 20;
        int maxage = 20;    // 글자의 뜻 구분하기 위해 대소문으로 구분해준다.
        int minAge = 10;

        /* 목차. 2-3. 단어와 단어 사이의 연결을 언더스코어로(_) 하지 않는다. */
        String user_name;   // 언더스코어로 하지 않는다.(자바 한정, 파이썬 등에서는 적용가능)
        String userName;

        /* 목차. 2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다. */
        int 나이;

        /* 목차. 2-5. 변수 안에 저장된 값이 어느 의미를 가지는 지 명확하게 표현하도록 한다. */
        String s;         // s가 무슨 의미인지 모르니깐 곤란.. 아래처럼 만들어줘라~~
        String name;     // 문자열 형태의 이름이 저장되겠구나~~하는 의도가 파악된다.

        /* 목차. 2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다. */
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        /* 목차. 2-7. 명사형으로 작성할 수 있도록 한다. */
        String goHome;     // 가능하긴 하나 가급 명사형으로 짓는다.

        /* 목차. 2-8. boolean 형은 의문문으로 가급적으로 긍정형태의 네이밍을 한다. */
        boolean isAlive = true;
        boolean isDead = false;     // 부정형 보다는 긍정형이 나은 방식이다.












    }
}

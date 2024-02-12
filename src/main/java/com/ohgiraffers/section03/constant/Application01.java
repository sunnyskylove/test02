package com.ohgiraffers.section03.constant;

public class Application01 {

    public static void main(String[] args) {

/* 수업목표. 상수에 대해 이해하고 사용할 수 있다.*/
        /* 필기.
        *   상수란?
        *   변수가 메모리에 변경 될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념이다.
        *   변하지 않을 값을 (넌 이걸로 끝) 저장해두기 위한 메모리상의 공간을 상수라고 한다.
        *
        *  필기.
        *   상수의 사용 목적
        *   변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
        *   초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.
        *    예) 수학 공식에 사용되는 수치 등
        *
        *
        *   필기.
        *    사용방법
        *    1. 상수를 선언한다. (변수 선언과 유사하지만, final 키워드를 사용한다.)
        *    2. 값을 초기화 한다. (초기화 이후에는 값 변경이 불가능하다!!!!!!!!)
        *    3. 필요한 위치에 상수를 호출해서 사용한다.
        * */

        /* 목차. 1. 상수선언 */
         final int AGE;

         /*목차. 2. 초기화 */
        AGE = 20;
//        AGE = 30;    //필기. 한번 초기화 한 이후 값을 재 대입하는 것은 불가!!!!!!!!!! 20으로 먼저 첫째 선언하면, 20으로 끝!


        /* 목차. 3. 필요한 위치에 상수를 호출해서 사용한다. */
        /* 목차. 3-1. 출력 구문에서의 사용 */
        System.out.println("AGE의 값은?:" + AGE);
        System.out.println("AGE의 2배는?:" + AGE*2);

        /* 목차. 3-3. 대입연산 시 활용 */
        int sum = AGE;
//        int AGE = AGE + 10;  // AGE 값은 이미 고정되어있어서 중복 나올 수 없다.


    }
}

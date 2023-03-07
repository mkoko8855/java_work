package oop.modi.cls.pac1;

/*

	- default ( package friendly) 제한자는 접근 제한자를 붙이지 않은 형태이며, 같은 패키지 내에서만 접근을 허용한다.

*/

class A {

	B b = new B();     //B가 public이니까 객체 생성이 되는 것이다.
}

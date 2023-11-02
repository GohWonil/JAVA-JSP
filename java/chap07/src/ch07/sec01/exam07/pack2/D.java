package ch07.sec01.exam07.pack2;

import ch07.sec01.exam07.pack1.A;

public class D extends A {

	//생성자에서 protected 접근제어자 테스트
	public D() {
		super();
		this.field = "Value";
		this.method();
	}
	
}

package com.company.java011;

//class Cat2{}
// The type Cat2 is already defined  Modifer2_protected.java 파일에서 작성함 .
// package - default - 기본 - 같은폴더에서 사용가능
public class Modifer3_package {
	public static void main(String[] args) {
		Cat2 cat = new Cat2();
		// import 안해도 사용가능! - 같은 패키지라서
		cat.public_ = 10;
		//cat.protected_ = 20; // Cat2에서만 사용가능 - extends 키워드 사용
		//cat.package_ = 30;
		//cat.private_ = 40; // getters + setters
		cat.show();
	}
}

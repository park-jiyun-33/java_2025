package com.company.java011;

import com.company.java011_ex.Apple;

public class ClassArrEx1 {
	public static void main(String[] args) {
        Apple[] apples= new Apple[3]; // apples[null, null, null]
        
        apples[0] = new Apple("RED", "iron", 2, 1000);
        apples[1] = new Apple("GREEN", "hulk", 1, 1500);
        apples[2] = new Apple("GOLD", "captain", 3, 2000);
        
//        System.out.println(apples[0]);
//        System.out.println(apples[1]);
//        System.out.println(apples[2]);
        
//       for(int i = 0; i < apples.length; i++) {System.out.println(apples[i]);}
        
        // 향상된 for문 (해당자료형 one  :  배열){}
        for(Apple one: apples) {System.out.println(one);}
}
}

/** 
* @author Oracle
* https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
* Copyright © 1995, 2022 Oracle and/or its affiliates. All rights reserved.
*/

public class EnumTest2 {
    Day day;
    
    public EnumTest2(Day day) {
        this.day = day;
    }
    
       
    public static void main(String[] args) {
		for (Day d: Day.values()){
			System.out.println(d);
		}
	}
}


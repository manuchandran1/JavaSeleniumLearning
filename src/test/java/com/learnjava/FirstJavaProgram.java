package com.learnjava;

public class FirstJavaProgram 
{
	
	static int func( int i){
        return  ++i;
    }     public static void main(String[] args) {
        int i=0;
        int j=func(i++) + i + func(++i);
        System.out.println(i);
        System.out.println(j);
    }
}

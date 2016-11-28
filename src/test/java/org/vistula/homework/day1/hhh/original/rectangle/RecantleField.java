package org.vistula.homework.day1.hhh.original.rectangle;

public class RecantleField {

	
	public static void main(String [] args){
	
	
		Rectangle fd = new Rectangle( 1, 2);
	
		fd.setA(5);
		fd.setB(4);
		
		System.out.println("Boki prostokata wynosz� : " + "bok a = " + fd.getA() + ","+ " bok b = " +fd.getB()  );
		System.out.println("Pole prostokata (a * b) = " + fd.field() );
		System.out.println("Obwod prostokata (2a + 2b) =  " + fd.perimeter() );
	}}
	



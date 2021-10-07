package com.janeonwuchekwa;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);//add is used to append or add things at the end
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.add(3,35 ); //This adds at the index or position given
        numbers.add(60);

//        numbers.remove(3);
//
////        numbers.clear(); //Clears the numbers
//        numbers.set(0,1); //to replace a number with the index to be replaced and the number replacing it.
//
//        numbers.add(70);
//
//        Boolean container = numbers.contains(70);

//        if (container == true){
//            System.out.println("Present");

            for(int i=0;i< numbers.size();i++){
                System.out.println(numbers.get(i));
            }

//
        }
//

//
    }





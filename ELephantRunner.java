package com.xworkz.inheritance;

public class ELephantRunner {

        public static void main(String[] args) {
            Elephant elephant = new Elephant();
            elephant.setName("African Elephant");
            elephant.setWeight(5000);
            elephant.setAge(25);

            System.out.println(elephant.getName());
            System.out.println(elephant.getWeight());
            System.out.println(elephant.getAge());
        }


}

package com.company;

public class Main {

    public static void main(String[] args) {
        methodString(50, 25);
        System.out.println(methodString(55, 65));
        System.out.println(methodString(66, 66));
        System.out.println(methodString(77, 67));
        System.out.println(methodString(88, 68));
        System.out.println(methodString(99, 69));
    }

    public static String methodString(int age, int temperatureOnStreet) {
        if (age <= 45 && temperatureOnStreet <= 30) {
            System.out.println("можно идти гулять");
        } else if (age < 20 && temperatureOnStreet <= 28) {
            System.out.println("можно идти гулять");
        } else if (temperatureOnStreet <= 25 || age > 45) {
            System.out.println("можно идти гулять");
        } else {
            System.out.println("оставайтесь дома");
        }

        String result = age + "." + temperatureOnStreet;
        return result;
    }
}

package org.example;

import ru.vsu.cs.dolzhenkoms.HashMap;
import ru.vsu.cs.dolzhenkoms.HashMultiMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ваш словарь будет иметь связь один-к-одному (1) или один-ко-многим (2) - ");
        String result = readLine();
        if(result.equals("1")) {
            workWithHashMap();
        }
        else if(result.equals("2")) {
            workWithHashMultiMap();
        } else {
            System.out.println("Вы ввели неправильное значение. Попробуйте заново...");
        }
    }

    private static void workWithHashMap() {
        HashMap<String, String> map = new HashMap<>();

        while(true) {
            System.out.println("Введите автора книги и её название, разделяя :: ");
            System.out.println("Например: Александр Пушкин::Руслан и Людмила");

            String result = readLine();

            if(result.equals("stop")) {
                break;
            }
            String name = result.split("::")[0];
            String book = result.split("::")[1];
            map.put(name,book);
        }
        printHashMapDetails(map);
    }

    private static void printHashMapDetails(HashMap<String, String> map) {
        for(var key : map.keys()){
            System.out.println(map.get(key));
        }
    }

    private static void printHashMultiMapDetails(HashMultiMap<String, String> map) {
        for(var key : map.keys()){
            System.out.println(key + " " + map.get(key));
        }
    }

    private static void workWithHashMultiMap() {
        HashMultiMap<String, String> map = new HashMultiMap<>();

        while(true) {
            System.out.println("Введите автора книги и её название, разделяя :: ");
            System.out.println("Например: Александр Пушкин::Руслан и Людмила");

            String result = readLine();

            if(result.equals("stop")) {
                break;
            }
            String name = result.split("::")[0];
            String book = result.split("::")[1];
            map.put(name,book);
        }
        printHashMultiMapDetails(map);
    }

    private static String readLine() {
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }
}
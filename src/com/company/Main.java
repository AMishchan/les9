package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int wordCount = 0;
        String text1 = " Change the color of the text with the fill() function.\n" +
                " The text displays in relation to the textAlign() function, which gives the option to draw to the left," +
                " right, and center of the coordinates.";
        Pattern p = Pattern.compile("\\w+");//создаем шаблон для поиска
        Matcher m = p.matcher(text1);       //ищем совпадения
        while (m.find()) {                  //пока совпадения находятся добавляем счетчик
            wordCount++;
        }
        System.out.println("Количество слов: " + wordCount); // выводим результат


          String text2 = "Коля заработал 10000 рублей, Миша 17334 рублей, а Катя - 40000 рублей";
        Pattern p2 = Pattern.compile("\\d+");
        Matcher m2 = p2.matcher(text2);
        ArrayList<String> arr = new ArrayList<>();   //создаем список на случай неизвестного количества чисел в строке
        while (m2.find()) {
            arr.add(m2.group(0));          //добавляем найденные числа в список
        }
        int sum = 0;
        for (String n : arr) {
            sum += Integer.parseInt(n);  //Преобразуем в интовое значение подсчитываем результат.
        }
        System.out.println("Общаяя сумма заработанных денег: " + sum);



    }
}

package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class Reader
{

    public static void main( String[] args )
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try {
                String[] input = reader.readLine().trim().split(" ");
                if(Parsing.isCommand(input[0])){
                    System.out.println("Неизвестная команда. Для справки по командам введите help.");
                    continue;
                }
                else {
                    switch (input[0]){
                        case"add":
                            if(Parsing.CheckAdd(input.length)) {
                                for (int i = 2; i < input.length; i = i + 2) {
                                    Commands.add(Double.parseDouble(input[i-1]),Double.parseDouble(input[i]));
                                }
                            }
                            else {
                                System.out.println("Неверное количество введеных данных. Повторите попытку.");
                                continue;
                            }
                            break;
                        case "print":
                            if (input[1].equals('1')||input[1].equals('2')||input[1].equals('3')||input[1].equals('4')){
                                Commands.print(Integer.parseInt(input[1]));
                            }
                            else {
                                Commands.print();
                            }
                            break;
                    }
                }
            }
            catch (Exception e){
                System.out.println("Ошибка выполнения.Повторите заново.");
                continue;

            }
        }
    }
}

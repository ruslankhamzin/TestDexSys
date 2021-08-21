package org.example;

import java.io.BufferedReader;
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
                String[] input = reader.readLine().split(" ");
                if(Parsing.isCommand(input[0])){
                    System.out.println("Неизвестная команда. Для справки по командам введите help.");

                }
                else {
                    switch (input[0]){
                        case ("add"):
                            if(Parsing.CheckAdd(input.length-1)) {
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
                            if(input.length<=1){
                                Commands.print();
                                break;
                            }
                            for(int i =1;i<input.length;i++)
                            if (input[i].equals("1") || input[i].equals("2") || input[i].equals("3") || input[i].equals("4")){
                                Commands.print(input[i]);
                            }
                            else {
                                System.out.println("Неизвестная группа");
                            }

                            break;
                        case "clear":
                            Commands.clear();
                            break;
                        case "help":
                            Commands.help();
                            break;
                        case "remove":
                            if(input.length==2){
                                Commands.remove(Integer.parseInt(input[1]));
                            }
                            if(input.length==3){
                                Commands.remove(Integer.parseInt(input[1]),Integer.parseInt(input[2]));
                            }
                            if(input.length==4){
                                Commands.remove(Integer.parseInt(input[1]),Integer.parseInt(input[2]),Integer.parseInt(input[3]));
                            }


                    }
                }
            }
            catch (Exception e){
                System.out.println("Ошибка выполнения.Повторите заново.");


            }
        }
    }
}

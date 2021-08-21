package org.example;

import java.util.ArrayList;

public class Commands {
    public static String[] commands ={"add","print","remove","clear","help"};
    public static ArrayList<Double> valueX1= new ArrayList<>();
    public static ArrayList<Double> valueY1= new ArrayList<>();
    public static ArrayList<Double> valueX2= new ArrayList<>();
    public static ArrayList<Double> valueY2= new ArrayList<>();
    public static ArrayList<Double> valueX3= new ArrayList<>();
    public static ArrayList<Double> valueY3= new ArrayList<>();
    public static ArrayList<Double> valueXNO= new ArrayList<>();
    public static ArrayList<Double> valueYNO= new ArrayList<>();
    public static void add(double x,double y){
       if(Commands.NoGroup(x,y)) {
           if (y >= x) {
               valueX1.add(x);
               valueY1.add(y);
           }
           if (y >= Math.pow(x, 2)) {
               valueX2.add(x);
               valueY2.add(y);
           }
           if (y >= Math.pow(x, 3)) {
               valueX3.add(x);
               valueY3.add(y);
           }
       }
       else {
           valueXNO.add(x);
           valueYNO.add(y);
       }

    }
    public static void print(){
        if(valueX1.isEmpty()||valueY1.isEmpty()){
            System.out.println("Группа 1 пуста");
        }
        else{
            System.out.print("Группа 1: ");
            for(int i=0;i<valueX1.size();i++){
                System.out.print(valueX1.get(i)+" "+valueY1.get(i)+" ");
            }
        }
        System.out.println();
        if(valueX2.isEmpty()||valueY2.isEmpty()){
            System.out.println("Группа 2 пуста");
        }
        else{
            System.out.print("Группа 2: ");
            for(int i=0;i<valueX2.size();i++){
                System.out.print(valueX2.get(i)+" "+valueY2.get(i)+" ");
            }
        }
        System.out.println();
        if(valueX3.isEmpty()||valueY3.isEmpty()){
            System.out.println("Группа 3 пуста");
        }
        else{
            System.out.print("Группа 3: ");
            for(int i=0;i<valueX3.size();i++){
                System.out.print(valueX3.get(i)+" "+valueY3.get(i)+" ");
            }
        }
        System.out.println();
        if(valueXNO.isEmpty()||valueYNO.isEmpty()){
            System.out.println("Группа 3 пуста");
        }
        else {
            System.out.print("Точки без группы: ");
            for (int i = 0; i < valueXNO.size(); i++) {
                System.out.print(valueXNO.get(i) + " " + valueYNO.get(i) + " ");
            }
        }
    }
    public static void print(int groupID){
        switch (groupID){
            case 1:
                if(valueX1.isEmpty()||valueY1.isEmpty()){
                    System.out.println("Группа 1 пуста");
                }
                else{
                    System.out.print("Группа 1: ");
                    for(int i=0;i<valueX1.size();i++){
                        System.out.print(valueX1.get(i)+" "+valueY1.get(i)+" ");
                    }
                }
                break;
            case 2: if(valueX2.isEmpty()||valueY2.isEmpty()){
                System.out.println("Группа 2 пуста");
            }
            else{
                System.out.print("Группа 2: ");
                for(int i=0;i<valueX2.size();i++){
                    System.out.print(valueX2.get(i)+" "+valueY2.get(i)+" ");
                }
            }
            break;
            case 3: if(valueX3.isEmpty()||valueY3.isEmpty()){
                System.out.println("Группа 3 пуста");
            }
            else{
                System.out.print("Группа 3: ");
                for(int i=0;i<valueX3.size();i++){
                    System.out.print(valueX3.get(i)+" "+valueY3.get(i)+" ");
                }
            }
            break;
            case 4:if(valueXNO.isEmpty()||valueYNO.isEmpty()){
                System.out.println("Группа 3 пуста");
            }
            else {
                System.out.print("Точки без группы: ");
                for (int i = 0; i < valueXNO.size(); i++) {
                    System.out.print(valueXNO.get(i) + " " + valueYNO.get(i) + " ");
                }
            }
            break;
            default:System.out.println("Неизвестная группа");
            break;
        }

    }
    public static boolean NoGroup(double x,double y){
        if(y>=x){
            return true;
        }
        if(y>=Math.pow(x,2)){
            return true;
        }
        if(y>=Math.pow(x,3)){
           return true;
        }
        return false;

    }
}

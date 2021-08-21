package org.example;

public class Parsing {
    static boolean isCommand(String firstword){
       for (int i=0;i<Commands.commands.length;i++){
           if(Commands.commands[i].equals(firstword)){
               return false;
           }
       }
       return true;
    }
    static boolean CheckAdd(int symInAdd){

        if(symInAdd%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}

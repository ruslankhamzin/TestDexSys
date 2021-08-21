package org.example;

public class Parsing {
    static boolean isCommand(String firstword){
       for(int i=0;i<Commands.commands.length;i++){
           if(firstword.equals(Commands.commands[i])){
               return true;
           }
       }
       return false;
    }
    static boolean CheckAdd(int symInAdd){
        symInAdd--;
        if(symInAdd/2==0){
            return true;
        }
        else return false;
    }
}

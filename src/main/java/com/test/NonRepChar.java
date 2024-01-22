package com.test;

public class NonRepChar {

    public String removeDuplicates(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : string.toCharArray()){
            if(stringBuilder.toString().indexOf(c) == -1){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}

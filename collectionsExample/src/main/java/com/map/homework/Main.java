package com.map.homework;

/**
 * Created by artem on 28.03.17.
 */
public class Main {

    public static void main(String[] args) {
        INaturalArray naturalArray = new NaturalArray();
        String input = "8;1,1;1,1;2;1,1;1,2;2;2;2";
        String[] actions = input.split(";");
        for (int i = 1; i < actions.length; i++) {
            System.out.println(parseAction(naturalArray, actions[i]));
        }
    }

    public static String parseAction(INaturalArray array, String action) {
        String[] operations = action.split(",");
        if (operations[0].equals("1")) {
            array.add(Integer.parseInt(operations[1]));
            return null;
        } else {
            return array.deleteMin().toString();
        }
    }

}

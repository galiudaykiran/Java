package org.example.Corejava.Encapsulation;

import java.util.Scanner;

public class encp_imp {

    private String name;

    private void setName(String name){
        this.name = name;

    }


    public String getName(){
        return name;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        encp_imp e = new encp_imp();
        e.setName(name);
        System.out.println(e.getName());

    }
}

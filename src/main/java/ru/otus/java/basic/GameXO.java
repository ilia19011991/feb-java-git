package ru.otus.java.basic;

import javax.swing.*;

public class GameXO {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(100, 100, 200, 200);
        jFrame.setVisible(true);
        System.out.println("game started");
        System.out.println("x turn");
        System.out.println("o turn");
        aiTurn();
        System.out.println("check win");
        System.out.println("try again");
        System.out.println("end game");
        System.out.println(2);
    }

    public static void aiTurn() {
        System.out.println("=  =");
        System.out.println(1);
        System.out.println(200);
        System.out.println(3);
        System.out.println("=  =");
    }
}

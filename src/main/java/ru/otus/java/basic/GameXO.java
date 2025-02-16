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
        System.out.println("check win");
        System.out.println("try again");
        System.out.println("end game");
    }
}

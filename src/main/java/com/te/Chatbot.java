package com.te;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class Chatbot {
//    public static void main (String[] args) {
////        public List<String> solution (int n);
////        List<String> result=new ArrayList<>();
////        Scanner in = new Scanner(System.in);
//
//        for (int i=0; i<5; i++) {
//            Scanner in=new Scanner(System.in);
//            System.out.println("You:");
//            String reply = in.next();
//            if (reply.equals("How are you?")) {
//                System.out.println("Bot: \nHow are you?");
//            } else {
//                System.out.println("Bot: \nyou are wrong");
//            }
//        }
//
//        Scanner in=new Scanner(System.in);
//        System.out.println("you:");
//        String reply2=in.next();
//        System.out.println("Bot: \nThank you");
//
//        System.out.println("you:");
//        String reply3=in.next();
//        System.out.println("Bot: \n76 °F");
//
//    }
//}

    public class Chatbot extends JFrame {

        private JTextField txtEnter = new JTextField();

        private JTextArea txtChat = new JTextArea();

        public Chatbot() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(600, 600);
            this.setVisible(true);
            this.setResizable(false);
            this.setLayout(null);
            this.setTitle("Java AI");

            txtEnter.setLocation(2, 540);
            txtEnter.setSize(590, 30);

            txtEnter.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    String uText = txtEnter.getText();
                    txtChat.append("You: " + uText + "\n");

                    if (uText.contains("Hi")) {
                        botSay("How are you?");
                    } else if (uText.contains("Fine")) {
                        botSay("Thank you");
                    } else if (uText.contains("Weather?")) {
                        botSay("76 °F");
                    }
                    txtEnter.setText("");
                }
            });

            txtChat.setLocation(15, 5);
            txtChat.setSize(560, 510);
            txtChat.setEditable(false);

            this.add(txtEnter);
            this.add(txtChat);
        }

        public void botSay(String s) {
            txtChat.append("AI: " + s + "\n");
        }

    public static void main(String[] args){
        new Chatbot();
    }
//
    }
//}

//javac
//java
//if
//else
//public static void main(String[] args){
//case      arg[0]
//switch    arg[1]

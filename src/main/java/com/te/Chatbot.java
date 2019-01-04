package com.te;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        txtEnter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                String uText = txtEnter.getText();
                txtChat.append("You: " + uText + "\n");

                if(uText.contains("Hi")){
                    botSay("How are you?");
                }
                else if(uText.contains("Fine")){
                    botSay("Thank you");
                } else if(uText.contains("Weather?")){
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

    public void botSay(String s){
        txtChat.append("AI: " + s + "\n");
    }

    public static void main(String[] args){
        new Chatbot();
    }

}

//javac
//java
//if
//else
//public static void main(String[] args){
//case      arg[0]
//switch    arg[1]

package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Give_FeedBack extends LayCon{

    private TextArea textArea;
    private JButton submit;
    private Font font,font1;
    private JFrame f;

    Give_FeedBack(){
        super.frame();
        super.setTitle("E Health Management");
        super.container();
        initcomponents();
    }

    public  void initcomponents(){


        button1.setText("***");
        button2.setText("Request Doctor");
        button3.setText("Home");
        button4.setText("***");



        font = new Font("Arial",Font.ROMAN_BASELINE , 20);
        font1 = new Font("Arial",Font.ROMAN_BASELINE , 15);
        textArea = new TextArea("Write your Feedback Here", 500, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
        textArea.setBounds(300,300,500,200);
        textArea.setFont(font);
        container.add(textArea);

        submit = new JButton("Submit");
        submit.setBounds(510,530,100,40);
        submit.setFont(font1);
        container.add(submit);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Request_Chat request_chat = new Request_Chat();
                request_chat.setVisible(true);
                dispose();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               view_doctor_forPaitent view_doctor_forPaitent = new view_doctor_forPaitent();
               view_doctor_forPaitent.setVisible(true);
               dispose();
            }
        });

    }

   /* public static void main(String[] args) {
        Give_FeedBack give_feedBack = new Give_FeedBack();
        give_feedBack.setVisible(true);
    }*/
}

package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Doctor_ChatBox extends LayCon{

    private TextArea chatBox_TA;
    private JTextField typing_field;
    private JButton submit_JB,send_JB,choose_JB;
    private JLabel photo_JL;
    private Font font;

    Doctor_ChatBox(){
        super.frame();
        super.setTitle("Patient Chat Box");
        super.container();
        initcomponents();
    }

    public void initcomponents(){

        button1.setText("Home");
        button2.setText("View Patient");
        button3.setText("Back");
        button4.setText("Log out");




        chatBox_TA = new TextArea();
        chatBox_TA.setBounds(230,240,500,350);
        chatBox_TA.setEditable(false);
        container.add(chatBox_TA);

        send_JB = new JButton("Send");
        send_JB.setBounds(750,610,80,30);
        container.add(send_JB);

        typing_field = new JTextField();
        typing_field.setBounds(230,610,500,30);
        container.add(typing_field);

        font = new Font("Arial",Font.BOLD ,15 );
        photo_JL = new JLabel("Photo");
        photo_JL.setBounds(270,650,100,50);
        photo_JL.setFont(font);
        container.add(photo_JL);

        choose_JB = new JButton("Choose Photo");
        choose_JB.setBounds(370,650,150,40);
        container.add(choose_JB);


        submit_JB = new JButton("Submit");
        submit_JB.setBounds(600,650,130,40);
        container.add(submit_JB);

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main logIn_page = new Main();
                logIn_page.setVisible(true);
                dispose();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                View_User view_user = new View_User();
                view_user.setVisible(true);
                dispose();
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Details details = new Details();
                details.setVisible(true);
                dispose();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                View_Request view_request = new View_Request();
                view_request.setVisible(true);
                dispose();
            }
        });

    }

}

package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class view_doctor_forPaitent extends LayCon{

    private Font font;
    private JLabel view_doctor;
    private TextArea textArea;

    view_doctor_forPaitent(){
        super.frame();
        super.setTitle("E Health Management");
        super.container();
        initcomponents();
    }
    public void initcomponents(){

       // button1.setText("Vew Doctor");
        button2.setText("Request Chat");
        button3.setText("Give Feedback");
        button4.setText("Log out");


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
                Give_FeedBack give_feedBack = new Give_FeedBack();
                give_feedBack.setVisible(true);
                dispose();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main logIn_page = new Main();
                logIn_page.setVisible(true);
                dispose();
            }
        });

        font = new Font("Artial",Font.BOLD,25);

        view_doctor = new JLabel();
        view_doctor.setText("View Doctor");
        view_doctor.setBounds(470,200,200,80);
        view_doctor.setFont(font);
        container.add(view_doctor);

        textArea = new TextArea("Doctors list will be here", 500, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
        textArea.setBounds(300,300,500,400);
        textArea.setFont(font);
        textArea.setEditable(false);
        container.add(textArea);
    }

   /* public static void main(String[] args) {
        view_doctor_forPaitent view_doctor_forPaitent = new view_doctor_forPaitent();
        view_doctor_forPaitent.setVisible(true);
    }*/
}

package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Patent_Login extends LayCon{

    private JLabel user_name_JLabel,password_JLabel,head_line;
    private JTextField user_name_text_field;
    private JPasswordField password_text_field;
    private Font font_for_text_field,font_for_text_JLabel,font_for_headline;
    private JButton log_in_button,back_button;
    Patent_Login(){
        super.frame();
        super.setTitle("Patient Log in");
        super.container();
        initcomponents();
    }
    public void initcomponents(){


        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);

        font_for_headline = new Font("Arial",Font.BOLD,25);
        head_line = new JLabel("Patient's Log in");
        head_line.setFont(font_for_headline);
        head_line.setBounds(300,30,300,70);
        container.add(head_line);




        font_for_text_JLabel = new Font("Arial",Font.BOLD,20);
        user_name_JLabel = new JLabel("User Name : ");
        user_name_JLabel.setFont(font_for_text_JLabel);
        user_name_JLabel.setBounds(210,170,150,60);
        container.add(user_name_JLabel);

        password_JLabel = new JLabel("Password : ");
        password_JLabel.setFont(font_for_text_JLabel);
        password_JLabel.setBounds(210,250,150,60);
        container.add(password_JLabel);

        font_for_text_field = new Font("Arial",Font.ROMAN_BASELINE,20);
        user_name_text_field = new JTextField();
        user_name_text_field.setBounds(350,170,220,60);
        user_name_text_field.setFont(font_for_text_field);
        container.add(user_name_text_field);


        password_text_field = new JPasswordField();
        password_text_field.setBounds(350,250,220,60);
        password_text_field.setFont(font_for_text_field);
        container.add(password_text_field);

        log_in_button = new JButton("Log in");
        log_in_button.setBounds(350,350,100,50);
        container.add(log_in_button);


        back_button = new JButton("Back");
        back_button.setBounds(485,350,90,50);
        container.add(back_button);

        log_in_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               view_doctor_forPaitent view_doctor_forPaitent = new view_doctor_forPaitent();
               view_doctor_forPaitent.setVisible(true);
               dispose();
            }
        });

        back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main logIn_page = new Main();
                logIn_page.setVisible(true);
                dispose();
            }
        });
    }

    /*public static void main(String[] args) {
        Patent_Login patent_login = new Patent_Login();
        patent_login.setVisible(true);
    }*/
}

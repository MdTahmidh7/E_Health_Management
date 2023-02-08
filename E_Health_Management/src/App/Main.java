package App;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Main extends LayCon {

    private JLabel jLabel ;
    private Font font_for_jabel,font_for_login_button;
    private JButton doctor_login, paitent_login,admin_login;
    private JFrame f;


 Main(){
     super.frame();
     super.setTitle("E Health Management");
     super.container();
     initcomponents();
 }
    public void initcomponents() {

        button1.setText("***");
        button2.setText("View Patient");
        button4.setText("***");

        font_for_jabel = new Font("Arial",Font.BOLD,30);
        jLabel = new JLabel("Welcome to E Health Management ");
        jLabel.setFont(font_for_jabel);
        jLabel.setBounds(280,30,600,170);
        container.add(jLabel);

        font_for_login_button = new Font("Arial",Font.ROMAN_BASELINE,15);
        doctor_login = new JButton("Doctor's Log in ");
        doctor_login.setBounds(180,250,200,80);
        doctor_login.setFont(font_for_login_button);
        container.add(doctor_login);


        font_for_login_button = new Font("Arial",Font.ROMAN_BASELINE,15);
        paitent_login = new JButton("Paitent's Log in ");
        paitent_login.setBounds(430,250,200,80);
        paitent_login.setFont(font_for_login_button);
        container.add(paitent_login);



        admin_login = new JButton("Admin's Log in ");
        admin_login.setBounds(680,250,200,80);
        admin_login.setFont(font_for_login_button);
        container.add(admin_login);



        doctor_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Doctor_Login doctor_login = new Doctor_Login();
                doctor_login.setVisible(true);
                dispose();
            }
        });

        paitent_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Patent_Login patent_login = new Patent_Login();
                patent_login.setVisible(true);
                dispose();
            }
        });


        admin_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin_Login admin_login = new Admin_Login();
                admin_login.setVisible(true);
                dispose();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                About_Us about_us = new About_Us();
                about_us.setVisible(true);
                dispose();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f = new JFrame();
                JOptionPane.showMessageDialog(f,"Email us");
            }
        });

    }
    public static void main(String[] args) {
        Main mc = new Main();
        mc.setVisible(true);
    }
}
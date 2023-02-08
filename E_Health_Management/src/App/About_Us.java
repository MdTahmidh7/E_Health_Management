package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About_Us extends LayCon{

    private JLabel aboutUs;
    private  Font font;
    private JFrame f;
    About_Us(){
        super.frame();
        super.setTitle("E Health Management");
        super.container();
        initcomponents();
    }

    public void initcomponents(){

        button1.setText("***");
        button2.setText("Home");
        button4.setText("***");

        font = new Font("Arial",Font.BOLD,25);
        aboutUs = new JLabel("We are here for You.\n We support" +
                "humanity.\n Hope you will like our service.");
        aboutUs.setBounds(80,200,900,300);
        aboutUs.setFont(font);
        container.add(aboutUs);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main logIn_page = new Main();
                logIn_page.setVisible(true);
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


}

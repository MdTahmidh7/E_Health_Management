package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Details extends LayCon{

    private JLabel details_JL,deoctorId_JL,name_JL,type_JL,
                    email_JL,qualificaiton_JL,doctorID,name,email,
                     type,qualification;

    private JButton update_JB;
    private Font font,font1;


    Details(){
        super.frame();
        super.setTitle("Patient Chat Box");
        super.container();
        initcomponents();
    }
    public void initcomponents(){

        button2.setText("View Patient");
        button3.setText("View Request");
        button4.setText("Log out");

        font = new Font("Arial",Font.BOLD,25);
        details_JL = new JLabel("Profile");
        details_JL.setBounds(500,200,200,80);
        details_JL.setFont(font);
        container.add(details_JL);

        font1 = new Font("Arial",Font.BOLD,15);
        deoctorId_JL = new JLabel("Doctor ID");
        deoctorId_JL.setBounds(400,270,150,60);
        deoctorId_JL.setFont(font1);
        container.add(deoctorId_JL);

        name_JL = new JLabel("Name");
        name_JL.setBounds(400,320,150,60);
        name_JL.setFont(font1);
        container.add(name_JL);

        type_JL = new JLabel("Type");
        type_JL.setBounds(400,370,150,60);
        type_JL.setFont(font1);
        container.add(type_JL);

        email_JL = new JLabel("Email");
        email_JL.setBounds(400,420,150,60);
        email_JL.setFont(font1);
        container.add(email_JL);


        qualificaiton_JL = new JLabel("Qualification");
        qualificaiton_JL.setBounds(400,470,150,60);
        qualificaiton_JL.setFont(font1);
        container.add(qualificaiton_JL);


        update_JB = new JButton("Update");
        update_JB.setBounds(500,540,150,40);
        update_JB.setFont(font);
        container.add(update_JB);


        doctorID  = new JLabel("203");
        doctorID.setBounds(560,270,150,60);
        doctorID.setFont(font1);
        container.add(doctorID);

        name = new JLabel("ABCD");
        name.setBounds(560,320,150,60);
        name.setFont(font1);
        container.add(name);

        type = new JLabel("Heart");
        type.setBounds(560,370,150,60);
        type.setFont(font1);
        container.add(type);

        email = new JLabel("xyz@gmail.com");
        email.setBounds(560,420,150,60);
        email.setFont(font1);
        container.add(email);

        qualification = new JLabel("MBBS");
        qualification.setBounds(560,470,150,60);
        qualification.setFont(font1);
        container.add(qualification);



        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                View_User view_user = new View_User();
                view_user.setVisible(true);
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

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main logIn_page = new Main();
                logIn_page.setVisible(true);
                dispose();
            }
        });

    }

}

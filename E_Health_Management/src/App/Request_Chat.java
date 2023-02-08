package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Request_Chat extends LayCon{

    private JLabel request_doctorJL, request_idJL,doctor_typeJL,doctor_nameJL,doctor_idJL,
    reqId,docNumber;
    private  JComboBox doctor_type,doctor_name;
    private Font font, font1;
    private  JButton submit;

    Request_Chat(){
        super.frame();
        super.setTitle("Request Chat");
        super.container();
        initcomponents();
    }
    public void initcomponents(){
        font = new Font("Arial",Font.BOLD,20);
        font1 = new Font("Arial",Font.BOLD,15);

        button1.setText("***");
        button2.setText("Give Feedback");
        button3.setText("Home");
        button4.setText("***");

        request_doctorJL = new JLabel("Request Doctor");
        request_doctorJL.setBounds(500,230,200,50);
        request_doctorJL.setFont(font);
        container.add(request_doctorJL);

        reqId = new JLabel("301");
        reqId.setBounds(580,267,200,40);
        reqId.setFont(font1);
        container.add(reqId);




        request_idJL = new JLabel("Request Id");
        request_idJL.setBounds(400,270,200,50);
        request_idJL.setFont(font1);
        container.add(request_idJL);

        doctor_typeJL = new JLabel("Doctor Type");
        doctor_typeJL.setBounds(400,300,200,50);
        doctor_typeJL.setFont(font1);
        container.add(doctor_typeJL);


        doctor_nameJL = new JLabel("Doctor Name");
        doctor_nameJL.setBounds(400,330,200,50);
        doctor_nameJL.setFont(font1);
        container.add(doctor_nameJL);


        doctor_idJL = new JLabel("Doctor ID");
        doctor_idJL.setBounds(400,360,200,50);
        doctor_idJL.setFont(font1);
        container.add(doctor_idJL);


        doctor_idJL = new JLabel("103");
        doctor_idJL.setBounds(580,360,200,50);
        doctor_idJL.setFont(font1);
        container.add(doctor_idJL);

        doctor_type = new JComboBox();
        doctor_type.setBounds(550,300,200,30);
        doctor_type.addItem("Bone");
        doctor_type.addItem("Heart");
        doctor_type.setSelectedItem("Heart");
        container.add(doctor_type);

        doctor_name = new JComboBox();
        doctor_name.setBounds(550,330,200,30);
        doctor_name.addItem("wwerfe");
        doctor_name.addItem("kkkk");
        doctor_name.setSelectedItem("kkkk");
        container.add(doctor_name);

        submit = new JButton("Submit");
        submit.setBounds(530,430,100,50);
        submit.setFont(font1);
        container.add(submit);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Give_FeedBack give_feedBack = new Give_FeedBack();
                give_feedBack.setVisible(true);
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


        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Patient_ChatBox patient_chatBox = new Patient_ChatBox();
                patient_chatBox.setVisible(true);
                dispose();
            }
        });


    }

    /*public static void main(String[] args) {
        Request_Chat request_chat = new Request_Chat();
        request_chat.setVisible(true);
    }*/
}

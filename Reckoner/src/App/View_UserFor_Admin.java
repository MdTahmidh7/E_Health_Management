package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View_UserFor_Admin extends LayCon{

    private JLabel view_doctor;
    private Font font,font1;
    private JLabel nameL;
    private JTextField nameTF;
    private JButton search_button;
    private TextArea textArea;

    View_UserFor_Admin(){
        super.frame();
        super.setTitle("Request Chat");
        super.container();
        initcomponents();
    }
    public void initcomponents(){

        button1.setText("***");
        button2.setText("View Feedback");
        button3.setText("Home");
        button4.setText("***");



        font = new Font("Artial",Font.BOLD,25);
        font1 = new Font("Artial",Font.BOLD,18);
        view_doctor = new JLabel();
        view_doctor.setText("View Patient");
        view_doctor.setBounds(470,200,200,80);
        view_doctor.setFont(font);
        container.add(view_doctor);


        nameL = new JLabel("User Name ");
        nameL.setBounds(350,280,250,40);
        nameL.setFont(font1);
        container.add(nameL);

        nameTF = new JTextField();
        nameTF.setBounds(480,280,200,40);
        nameTF.setFont(font1);
        container.add(nameTF);

        search_button = new JButton("Search");
        search_button.setBounds(430,330,100,40);
        search_button.setFont(font1);
        container.add(search_button);


        textArea = new TextArea("Patients list will be here", 500, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
        textArea.setBounds(300,400,500,340);
        textArea.setFont(font);
        textArea.setEditable(false);
        container.add(textArea);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                View_Feedback view_feedback = new View_Feedback();
                view_feedback.setVisible(true);
                dispose();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Add_Doctor add_doctor = new Add_Doctor();
                add_doctor.setVisible(true);
                dispose();
            }
        });
    }

    /*public static void main(String[] args) {
        View_UserFor_Admin view_userFor_admin = new View_UserFor_Admin();
        view_userFor_admin.setVisible(true);
    }*/
}

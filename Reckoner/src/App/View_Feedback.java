package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View_Feedback extends LayCon{

    private JLabel view_feedback;
    private Font font;
    private TextArea textArea;
    View_Feedback() {
        super.frame();
        super.setTitle("View Feedback");
        super.container();
        initcomponents();
    }
    public  void  initcomponents(){

        button1.setText("***");
        button2.setText("View Doctor");
        button3.setText("Home");
        button4.setText("***");


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                View_Doctor view_doctor = new View_Doctor();
                view_doctor.setVisible(true);
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



        font = new Font("Artial",Font.BOLD,25);
        view_feedback = new JLabel();
        view_feedback.setText("View Feedback");
        view_feedback.setBounds(470,200,200,80);
        view_feedback.setFont(font);
        container.add(view_feedback);


        textArea = new TextArea("Feedbacks list will be here", 500, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
        textArea.setBounds(300,300,500,400);
        textArea.setFont(font);
        textArea.setEditable(false);
        container.add(textArea);
    }

    /*public static void main(String[] args) {
        View_Feedback v = new View_Feedback();
        v.setVisible(true);
    }*/
}

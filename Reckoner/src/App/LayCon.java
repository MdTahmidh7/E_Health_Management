package App;
import javax.swing.*;
import java.awt.*;
public class LayCon extends JFrame {
    public JButton button1, button2, button3, button4;
    public Container container;

    public void frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(250, 50, 1050, 800);
        this.setResizable(false);
    }

    public void container() {
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(146, 141, 141));


        this.button1 = new JButton("Home");
        this.button1.setBounds(230,180,150,30);
        this.container.add(this.button1);


        this.button2 = new JButton("About Us");
        this.button2.setBounds(380,180,150,30);
        this.container.add(this.button2);

        this.button3 = new JButton("Contact Us");
        this.button3.setBounds(520,180,150,30);
        this.container.add(this.button3);

        this.button4 = new JButton("Log In");
        this.button4.setBounds(670,180,150,30);
        this.container.add(this.button4);


    }



}
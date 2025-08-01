package university.management.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{

    Thread t;

    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/first.png"));//load the image
        Image i2 = i1.getImage().getScaledInstance(1000,800, Image.SCALE_DEFAULT);// Creating a scaled version of image
        ImageIcon i3 = new ImageIcon(i2);//convert the scaled image into image icon
        JLabel img = new JLabel(i3);
        add(img);

        t = new Thread(this);
        t.start();
        setVisible(true);

// creating the animation effect
        int x=1;
        for(int i=2;i<=600; i+=4, x+=1){
            setLocation(600 - ((i+x)/2) , 350 - (i/2));
            setSize(i+3*x,i+x/2);
            try{
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
import java.applet.*;
import java.awt.*;

public class learning extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.cyan);
        g.drawOval(300,0,650,700);
        g.setColor(Color.red);
        g.drawOval(300,0,655,705);
        g.setColor(Color.magenta);
        g.setFont(new Font("Base 02",Font.PLAIN,50));
        g.drawString("Satyam",520,100);
        g.drawString("is",600,250);
        g.drawString("learning",500,500);
        g.setFont(new Font("Papyrus",Font.PLAIN,50));
        g.drawString("this now",520,600);
        g.setColor(Color.black);
        g.drawOval(350,180,150,60);
        g.fillOval(430,188,50,50);
        g.drawOval(690,180,150,60);
        g.fillOval(785,188,50,50);
        g.setColor(Color.yellow);
        g.fillRect(570,300,60,150);
        g.setColor(Color.black);
        g.drawRect(570,300,60,150);
    }
}
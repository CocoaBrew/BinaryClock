import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BinaryClockDisplay
{
    private static int[] hour;
    private static int[] minute;
    
    public static void main(String[] args)
    {
        BinaryClock bClock = new BinaryClock();
        
        bClock.makeTime();
        hour = bClock.getHour();
        minute = bClock.getMinute();
        
        JFrame frame = new JFrame();
        
        JPanel hourDisplay = new JPanel();
        hourDisplay.setLayout(new GridLayout(1,4));
//        hourDisplay.add(hour[0]);
//        hourDisplay.add(hour[1]);
//        hourDisplay.add(hour[2]);
//        hourDisplay.add(hour[3]);
        
        JPanel minDisplay = new JPanel();
        minDisplay.setLayout(new GridLayout(1,6));
        
        
        frame.setLayout(new BorderLayout());
        frame.add(hourDisplay, BorderLayout.NORTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
    }
}
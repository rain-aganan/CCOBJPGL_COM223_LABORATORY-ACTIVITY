import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

//inheritance
public class JTimer extends Countdown {
    static int i;
    static  Timer timer;
    
    public void CountdownTimer(){
        JFrame jframe = new JFrame();
        JLabel LabelTime = new JLabel();
        
        jframe.setLayout(new  FlowLayout());
        jframe.setBounds(500, 300, 400, 100);
        
        jframe.add(LabelTime);
        jframe.setVisible(true);
        
        //try-catach
        try {
        
        int minutes = 5; 
        i = minutes * 60;
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            
            public void run() {
                int seconds = i % 60;
                //format for mm:ss
                String time = String.format("%02d:%02d", i / 60, seconds);
                LabelTime.setText("Timer Countdown:" + time);
                    //times up
                    if (--i < 0) {
                        timer.cancel();
                        LabelTime.setText("You are termeinated!, System Failure");
                    }
            }
        }, 0, 1000);
    
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
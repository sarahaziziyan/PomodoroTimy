package userInterface;

import beans.Pomodoro;
import beans.PomodoroMinSec;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextUI {
    
    public static void main(String[] args) {
        Pomodoro pomodoro = new Pomodoro();
        int myMinute = Pomodoro.myMinutes;
        PomodoroMinSec pomodoroMinSec;
        for (int i = 0; i < myMinute*60; i++) {
            try {
                pomodoroMinSec = pomodoro.minusTime();
//          System.out.println("seconds remaining"+timer+"\n");
                System.out.println(pomodoroMinSec.getPomodoroMin()+":"+pomodoroMinSec.getPomodoroSec());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(TextUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        
        
    }
    
}

package beans;

public class Pomodoro {
    
    private int pomodoroTime;
    private PomodoroMinSec pomodoroMinSec;
    public static final int myMinutes = 25;

    public static int getMyMinutes() {
        return myMinutes;
    }
    
    public Pomodoro() {
        this.pomodoroMinSec = new PomodoroMinSec(myMinutes, 0);
        this.pomodoroTime = myMinutes*60;        
    }
    
    public PomodoroMinSec minusTime(){
        pomodoroTime-=1;
        pomodoroMinSec.setPomodoroMin(pomodoroTime/60);
        pomodoroMinSec.setPomodoroSec(pomodoroTime%60);
        return pomodoroMinSec;
    }
    
    
}

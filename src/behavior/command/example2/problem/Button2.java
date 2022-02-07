package behavior.command.example2.problem;

public class Button2 {

    private Alarm theAlarm;

    public Button2(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }

    public void pressed() {
        theAlarm.start();   //버튼을 누르면 알림이 울림
    }
}

package behavior.command.example2.problem;

public class Button3 {
    private Lamp theLamp;
    private Alarm theAlarm;
    private Mode theMode;

    public Button3(Lamp theLamp, Alarm theAlarm) {
        this.theLamp = theLamp;
        this.theAlarm = theAlarm;
    }

    public void setTheMode(Mode theMode) {
        this.theMode = theMode;
    }

    //설정된 모드에 따라 램프를 켜거나 알람을 울림
    public void pressed() {
        switch (theMode) {
            case LAMP:  //램프 모드면 램프를 켬
                theLamp.turnOn();
                break;
            case ALARM: //알람 모드면 알람을 울리게 함
                theAlarm.start();
                break;
        }
    }
}

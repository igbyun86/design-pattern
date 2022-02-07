package behavior.command.example2.solving;

/**
 * 커맨드 패턴은 이벤트가 발생했을 때 실행될 기능이 다양하면서도
 * 변경이 필요한 경우에 이벤트를 발생시키는 클래스를 변경하지 않고 재사용하고자 할때 유용하다.
 */
public class Client {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Button button1 = new Button(lampOnCommand); //램프를 켜는 커맨드를 설정함
        button1.pressed();                          //버튼이 눌리면 램프 켜는 기능이 실행됨

        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);

        Button button2 = new Button(alarmOnCommand);    //알람을 울리는 커맨드를 설정함
        button2.pressed();                              //이제 버튼이 눌리면 알람을 울리는 기능이 실행됨

        button2.setCommand(lampOnCommand);
        button2.pressed();                  //이제는 램프를 켜는 기능이 실행됨

        Command lampOffCommand = new LampOffCommand(lamp);
        button2.setCommand(lampOffCommand);     //램프를 끄는 커맨드를 설정함
        button2.pressed();                      //버튼을 누르면 램프가 꺼짐
    }
}

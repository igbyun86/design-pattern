package behavior.command.example2.problem;

/**
 * 문제점1) 버튼을 눌렀을 때 램프가 켜지는 대신 다른 기능을 실행하게 하려면? 예) 버튼을 눌렀을 때 알람이 시작되게 하려면?
 * 문제점2) 버튼을 누르는 동작에 따라 다른 기능을 실행하게 하려면?
 * 예) 버튼을 처음 눌렀을 때 램프를 켜고, 두번째 눌렀을 때는 알람을 작동하게 하려면
 */
public class Client {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Button lampButton = new Button(lamp);
        lampButton.pressed();

        /*
            - 버튼으르 눌렀을 때 다른 기능을 실행하는 경우
            기능을 변경하려고 기존 Button 클래스의 코드를 수정하는 것은 OCP에 위배된다.
         */
        Alarm alarm = new Alarm();
        Button2 alarmButton = new Button2(alarm);
        alarmButton.pressed();

        /*
            - 버튼을 누르는 동작에 따라 다른 기능을 실행하는 경우
            필요한 기능을 새로 추가할 때마다 반복적으로 수정이 필요하기 때문에 Button클래스는
            재사용하기 어렵다.
         */
        Button3 lampAlarmButton = new Button3(lamp, alarm);

        lampAlarmButton.setTheMode(Mode.LAMP);
        lampAlarmButton.pressed();      //램프 모드를 설정했으므로 램프가 켜짐

        lampAlarmButton.setTheMode(Mode.ALARM);
        lampAlarmButton.pressed();      //알람 모드를 설정했으므로 알람이 울림


    }
}

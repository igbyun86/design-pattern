package behavior.state.example3.solving;


/**
 * 문제점1) 새로운 상태가 추가되는 경우 if/else의 코드가 수정되는 문제가 있다.
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        light.off_button_pushed();
        light.on_button_pushed();
        light.off_button_pushed();
    }
}

package behavior.observer.example2.solving;

/**
 * 추상화된 통보 대상
 */
public interface Observer {
    void update();  //데이터의 변경을 통보했을 때 처리하는 메서드
}

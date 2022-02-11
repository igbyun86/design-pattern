package behavior.observer.example2.solving;

import java.util.List;

/**
 * DataSheetView 클래스는 Observer의 기능
 * update 메서드를 구현함으로써 통보 대상이 됨
 */
public class DataSheetView implements Observer {

    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    @Override
    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();    //점수를 조회함
        displayScores(record, viewCount);                       //조회된 점수를 viewCount 만큼만 출력함
    }

    private void displayScores(List<Integer> record, int viewCount) {
        System.out.println("List of " + viewCount + " entries: ");
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.print(record.get(i) + " ");
        }

        System.out.println();
    }

}

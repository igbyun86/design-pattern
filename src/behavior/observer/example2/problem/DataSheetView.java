package behavior.observer.example2.problem;

import java.util.List;

public class DataSheetView {
    private IScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(IScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

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

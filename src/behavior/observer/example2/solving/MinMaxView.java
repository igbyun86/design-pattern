package behavior.observer.example2.solving;


import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {
    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update() {
        List<Integer> record = this.scoreRecord.getScoreRecord();
        displayMinMax(record);

    }

    private void displayMinMax(List<Integer> record) {
        int min = Collections.min(this.scoreRecord.getScoreRecord(), null);
        int max = Collections.max(this.scoreRecord.getScoreRecord(), null);
        System.out.println("Min: " + min + " Max: " + max);
    }
}

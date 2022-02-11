package behavior.observer.example2.problem;

import java.util.Collections;
import java.util.List;

public class MinMaxView {
    private IScoreRecord scoreRecord;

    public MinMaxView(IScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

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

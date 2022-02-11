package behavior.observer.example2.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * score를 저장하는 클래스
 * 최대3개 목록, 최대 5개 목록, 최소/최대 값을 동시 또는 처음에는 목록으로 출력하고 나중에는 최소/최대 값을
 * 출력할 경우 해당 클래스의 변경이 이뤄져 OCP를 위반한다.
 */
public class ScoreRecord3 implements IScoreRecord {
    private List<Integer> scores = new ArrayList<>();   //점수를 저장함

    private List<DataSheetView> dataSheetViews = new ArrayList<>();

    //min, max보여주는 view 추가
    private MinMaxView minMaxView;


    public void addDataSheetView(DataSheetView dataSheetView) {
        dataSheetViews.add(dataSheetView);
    }

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    // 새로운 점수를 추가함
    @Override
    public void addScore(int score) {
        scores.add(score);          //scores 목록에 주어진 점수를 추가함

        dataSheetViews.forEach(v -> v.update());    //각 DataSheetView에 값의 변경을 통보

        // min, max update 변경
        minMaxView.update();
    }

    @Override
    public List<Integer> getScoreRecord() {
        return scores;
    }

}

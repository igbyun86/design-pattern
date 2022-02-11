package behavior.observer.example2.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * score를 저장하는 클래스
 * 최소, 최대값을 출력할 경우 해당 클래스의 변경이 이뤄져 OCP를 위반한다.
 */
public class ScoreRecord2 implements IScoreRecord {
    private List<Integer> scores = new ArrayList<>();   //점수를 저장함

    //min, max보여주는 view 추가
    private MinMaxView minMaxView;

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    // 새로운 점수를 추가함
    @Override
    public void addScore(int score) {
        scores.add(score);          //scores 목록에 주어진 점수를 추가함

        // min, max update 변경
        minMaxView.update();
    }

    @Override
    public List<Integer> getScoreRecord() {
        return scores;
    }

}

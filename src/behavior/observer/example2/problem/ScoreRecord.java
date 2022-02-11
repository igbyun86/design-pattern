package behavior.observer.example2.problem;

import behavior.observer.example2.problem.DataSheetView;

import java.util.ArrayList;
import java.util.List;

/**
 * score를 저장하는 클래스
 * 새로운 view가 생길때마다 해당 클래스의 변경이 이뤄져 OCP를 위반한다.
 */
public class ScoreRecord implements IScoreRecord {
    private List<Integer> scores = new ArrayList<>();   //점수를 저장함
    private DataSheetView dataSheetView;                //목록 형태로 점수를 출력하는 클래스


    public void setDataSheetView(DataSheetView dataSheetView) {
        this.dataSheetView = dataSheetView;
    }

    // 새로운 점수를 추가함
    @Override
    public void addScore(int score) {
        scores.add(score);          //scores 목록에 주어진 점수를 추가함
        dataSheetView.update();     //scores가 변경됨을 통보함
    }

    @Override
    public List<Integer> getScoreRecord() {
        return scores;
    }

}

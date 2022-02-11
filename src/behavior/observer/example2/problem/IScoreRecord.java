package behavior.observer.example2.problem;

import java.util.List;

public interface IScoreRecord {
    void addScore(int score);

    List<Integer> getScoreRecord();
}

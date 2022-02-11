package behavior.observer.example2.problem;

import java.util.stream.IntStream;

/**
 * 성적을 출력하는 기능(입력된 성적값을 출력하는 프로그램)
 * 문제점1) 성적을 다른 형태로 출력하고 싶다면? 예) 성적의 최소/최대값만 출력하려면?
 * 문제점2) 여러가지 형태의 성적을 동시 혹은 순차적으로 출력하려면?
 * 예) 성적이 입력되었을 때 최대 3개 목록, 최대 5개 목록, 최소/최대값을 동시에 출력하거나 처음에는 목록으로 출력하고 나중에느느 최소/최대 값을 출력하려면?
 *
 * 문제 해결의 핵심은 성적 통보 대상이 변경되더라도 ScoreRecord 클래스를 그대로 재사용할수 있어야 한다.
 */
public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        ScoreRecord3 scoreRecord3 = new ScoreRecord3();

        //3개까지의 점수만 출력함
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord3, 3);
        scoreRecord.setDataSheetView(dataSheetView3);

        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord3, 5);
        scoreRecord3.addDataSheetView(dataSheetView3);
        scoreRecord3.addDataSheetView(dataSheetView5);

        //ScoreRecord2 scoreRecord2 = new ScoreRecord2();
        //MinMaxView minMaxView = new MinMaxView(scoreRecord2);
        //scoreRecord2.setMinMaxView(minMaxView);

        MinMaxView minMaxView = new MinMaxView(scoreRecord3);
        scoreRecord3.setMinMaxView(minMaxView);

        IntStream.range(1, 6).forEach(index -> {
            int score = index * 10;
            System.out.println("Adding " + score);

            //10 20 30 40 50을 추가함, 추가할 때마다 최대 3개의 점수만 출력함
            //scoreRecord.addScore(score);
            //scoreRecord2.addScore(score);
            scoreRecord3.addScore(score);
        });
    }
}

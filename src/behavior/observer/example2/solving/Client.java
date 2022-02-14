package behavior.observer.example2.solving;

import java.util.stream.IntStream;

/**
 * 데이터의 변경이 발생했을 경우 상대 클래스나 객체에 의존하지 않으면서
 * 데이터 변경을 통보하고자 할때 유용하다.
 */
public class Client {

    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        //3개 목록 DataSheetView를 ScoreRecord에 Observer로 추가함
        scoreRecord.attach(dataSheetView3);

        //5개 목록 DataSheetView를 ScoreRecord에 Observer로 추가함
        scoreRecord.attach(dataSheetView5);

        //MinMaxView를 ScoreRecord에 Observer로 추가함
        scoreRecord.attach(minMaxView);

        IntStream.range(1, 6).forEach(index -> {
            int score = index * 10;
            System.out.println("Adding " + score);
            scoreRecord.addScore(score);
        });


    }
}

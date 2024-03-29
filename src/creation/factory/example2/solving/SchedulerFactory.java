package creation.factory.example2.solving;


import java.util.Calendar;

public class SchedulerFactory {

    public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
        ElevatorScheduler scheduler = null;

        switch (strategyID) {
            case RESPONSE_TIME: //대기시간 최소화 전략
                scheduler = new ResponseTimeScheduler();
                break;
            case THROUGHPUT:    //처리량 최대화 전략
                scheduler = new ThroughputScheduler();
                break;
            case DYNAMIC:       //오전에는 대기시간 최소화 전략, 오후에는 처리량 최대화 전략
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                if (hour < 12) {
                    scheduler = new ResponseTimeScheduler();
                } else {
                    scheduler = new ThroughputScheduler();
                }
                break;
        }

        return scheduler;
    }


}

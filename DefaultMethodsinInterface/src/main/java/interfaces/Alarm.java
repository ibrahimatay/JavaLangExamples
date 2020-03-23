package interfaces;

public interface Alarm {
    default String turnAlarmOn(){
        return "Turing the alarm on.";
    }

    default String turnAlarmOff(){
        return "Turing the alarm off.";
    }
}

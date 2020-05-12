package application;

/*
 *
 * @author ibrahimatay
 * @since 12.05.2020
 *
 * https://openjdk.java.net/jeps/361
* */

public class App {
    public static void main(String[] args) {
        System.out.println("Day index 5 is " + getDateType(5));
        System.out.println("Day index 7 is " + getDateType(7));

        System.out.println(getWorkerDefinition(WorkerType.TEACHER));
        System.out.println(getWorkerDefinition(WorkerType.STUDENT));
    }

    static DayType getDateType(final int index){
        return switch (index){
            case 1,2,3,4,5 -> DayType.WEEKDAY;
            case 6,7 -> DayType.WEEKEND;
            default -> DayType.UNKNOWN;
        };
    }

    public static String getWorkerDefinition(final WorkerType worker) {
        var workerDefinition = switch (worker) {
            case TEACHER -> "I'm a teacher";
            case STUDENT -> "I'm a student";
            case OTHER -> "Other...";
        };

        return workerDefinition;
    }

    enum WorkerType
    {
        TEACHER, STUDENT, OTHER
    }

    enum DayType
    {
        WEEKDAY, WEEKEND, UNKNOWN
    }
}


public class Main {
    public static void main(String[] args) {
        /*
        Задание 1
        Расширьте программу Task2MonthsEnums.
        Добавьте ещё один enum, который будет описывать времена года (зима, лето, весна, осень).
        Для введённого пользователем месяца напишите, к какому именно времени года относится выбранный месяц.
         */

    }

    private enum Month {
        JANUARY, // 0
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER,
    }

    private enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN,
    }
}
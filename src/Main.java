import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Задание 1
        Расширьте программу Task2MonthsEnums.
        Добавьте ещё один enum, который будет описывать времена года (зима, лето, весна, осень).
        Для введённого пользователем месяца напишите, к какому именно времени года относится выбранный месяц.
         */
        Map<Month, Integer> daysPerMonth = new HashMap<>();
        daysPerMonth.put(Month.JANUARY, 31);
        daysPerMonth.put(Month.FEBRUARY, 28); // год не високосный
        daysPerMonth.put(Month.MARCH, 31);
        daysPerMonth.put(Month.APRIL, 30);
        daysPerMonth.put(Month.MAY, 31);
        daysPerMonth.put(Month.JUNE, 30);
        daysPerMonth.put(Month.JULY, 31);
        daysPerMonth.put(Month.AUGUST, 31);
        daysPerMonth.put(Month.SEPTEMBER, 30);
        daysPerMonth.put(Month.OCTOBER, 31);
        daysPerMonth.put(Month.NOVEMBER, 30);
        daysPerMonth.put(Month.DECEMBER, 31);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number: ");
        int monthNumber = scanner.nextInt(); // порядковый номер месяца
        int monthIndex = monthNumber - 1; // индекс месяца в перечислении
        Month monthKey = Month.values()[monthIndex]; // месяц "как ключ словаря"
        int seasonIndex = monthNumber / 3;//
        Season seasonKey = Season.values()[seasonIndex]; // месяц "как ключ словаря"
        String seasonName = seasonKey.toString();
        int dayInSelectedMonth = daysPerMonth.get(monthKey);
        System.out.println(monthKey + " has " + dayInSelectedMonth + " days and season's name is " + seasonName);
        System.out.println();
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

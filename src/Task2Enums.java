import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2Enums {
    public static void main(String[] args) throws IOException {
        /*
        Задание 1
        Расширьте программу Task2MonthsEnums.
        Добавьте ещё один enum, который будет описывать времена года (зима, лето, весна, осень).
        Для введённого пользователем месяца напишите, к какому именно времени года относится выбранный месяц.
         */

        String fileName = "res/months.csv";
        Map<Month, Integer> daysPerMonth = readDaysPerMountFromFile(fileName);

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

    private static Map<Month, Integer> readDaysPerMountFromFile(String fileName) throws IOException {
        Map<Month, Integer> monthInMethod = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String monthAndDay = br.readLine();//читаем строку из файла
        while (monthAndDay != null) {
            String monthName = monthAndDay.substring(0, monthAndDay.indexOf(","));//парсим наименование месяца
            String dayCountStr = monthAndDay.substring(monthAndDay.indexOf(",") + 1);
            int dayCount = Integer.parseInt(dayCountStr);//парсим кво дней
            Month monthKey = Month.valueOf(monthName.toUpperCase()); // месяц "как ключ словаря"
            monthInMethod.put(monthKey, dayCount); //вставляем пару ключ значение в мапу
            monthAndDay = br.readLine();//читаем следующую строку
        }
        br.close();//закрываем ридер
        return monthInMethod;//возвращаем созданную и заполненную мапу
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

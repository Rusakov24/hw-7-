public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int savings = 0;
        int monthlySavings = 15000;
        int targetAmount = 2459000;
        int month = 0;
        while (savings < targetAmount) {
            month++;
            savings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int population = 12000000;
        double birthRate = 17.0 / 1000.0;
        double deathRate = 8.0 / 1000.0;
        for (int year = 1; year <= 10; year++) {
            int births = (int) (population * birthRate);
            int deaths = (int) (population * deathRate);
            population += (births - deaths);
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек.");
        }
        System.out.println("Задание 4");
        long initialDeposit = 15000;
        long target = 12000000;
        double monthlyInterestRate = 0.07;
        int mounth = 0;
        var currentAmount = initialDeposit;
        while (currentAmount < targetAmount) {
            mounth++;
            currentAmount += currentAmount * monthlyInterestRate;
            System.out.println("Месяц " + mounth + ", сумма накоплений составляет " + currentAmount + " рублей.");
        }
        System.out.println("Задание 5");
        long initialDeposit2 = 15000;
        long targetAmount2 = 12000000;
        double monthlyInterestRate2 = 0.07;
        int month2 = 0;
        var currentAmount2 = initialDeposit2;
        while (currentAmount2 < targetAmount2) {
            month++;
            currentAmount2 += currentAmount2 * monthlyInterestRate2;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений составляет " + currentAmount2 + " рублей.");
                ;
            }
            System.out.println("Задание 6");
            var initialDeposit3 = 15000;
            var monthlyInterestRate3 = 0.07;
            int totalMonths3 = 9 * 12;

            long currentAmount3 = initialDeposit3;
            for (int month3 = 1; month3 <= totalMonths3; month3++) {
                currentAmount3 += currentAmount3 * monthlyInterestRate3;
                if (month3 % 6 == 0) {
                    System.out.println("Месяц " + month3 + ", сумма накоплений составляет " + currentAmount3 + " рублей.");
                }
                int firstFriday = 3;
                int daysInMonth = 31;
                int currentDay = firstFriday;
                while (currentDay <= daysInMonth) {
                    System.out.println("Сегодня пятница, " + currentDay + "-е число. Необходимо подготовить отчет.");
                    currentDay += 7;
                }
                System.out.println("Задание 8");
                int currentYear = 2024;
                int startYear = currentYear - 200;
                int endYear = currentYear + 100;
                int cometPeriod = 79;
                for (int year = startYear; year <= endYear; year++) {
                    if (year % cometPeriod == 0) {
                        System.out.println(year);
                    }
                }
            }
        }
    }
}
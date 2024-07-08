public class Main {
    public static void main(String[] args) {
        System.out.println("\n Задание 1");
        int savings = 0;
        int monthlySavings = 15000;
        int targetAmount = 2459000;
        int month = 0;
        while (savings < targetAmount) {
            month++;
            savings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }


        System.out.println("\n Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }


        System.out.println("\n \n Задание 3");
        int population = 12000000;
        double birthRate = 17.0 / 1000.0;
        double deathRate = 8.0 / 1000.0;
        for (int year = 1; year <= 10; year++) {
            int births = (int) (population * birthRate);
            int deaths = (int) (population * deathRate);
            population += (births - deaths);
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек.");
        }

        System.out.println("\n Задание 4");
        int initialDeposit = 15000;
        int target = 12000000;
        double monthlyInterestRate = 0.07;
        month = 0;
        int currentAmount = initialDeposit;
        while (currentAmount < targetAmount) {
            month++;
            currentAmount += currentAmount * monthlyInterestRate;
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + currentAmount + " рублей.");
        }

        System.out.println("\n Задание 5");
        month = 0;
        currentAmount = initialDeposit;
        while (currentAmount < targetAmount) {
            month++;
            currentAmount += currentAmount * monthlyInterestRate;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + currentAmount + " рублей.");
            }
        }


        System.out.println("\n Задание 6");
        int totalMonths = 9 * 12;

        currentAmount = initialDeposit;
        for (month = 1; month <= totalMonths; month++) {
            currentAmount += currentAmount * monthlyInterestRate;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + currentAmount + " рублей.");
            }
        }

        System.out.println("\n Задание 7");
        int firstFriday = 3;
        int daysInMonth = 31;
        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("\n Задание 8");
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
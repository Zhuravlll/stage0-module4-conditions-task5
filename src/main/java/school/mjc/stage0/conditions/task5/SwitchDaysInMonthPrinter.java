package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        int amount;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                amount = 31;
                System.out.println(amount);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                amount = 30;
                System.out.println(amount);
                break;
            case 2:
                amount = 28;
                System.out.println(amount);
                break;
            default:
                System.out.println("wrong number!");
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//
//        int eaters = 5; // сколько людей будут есть
//
//        int water = 3000; // миллилитров воды
//        int potatoes = 5; // картофелин
//        int chicken = 6; // куриных бёдер
//        int spices = 10; // ложек специй
//
//        System.out.println("Сварили суп. На одного человека вышло:");
//        System.out.println((water / eaters) + " миллилитров(а) воды");
//        System.out.println((potatoes / eaters) + " картофелин(а/ы)");
//        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
//        System.out.println((spices / eaters) + " ложек(ка) специй");
//
//    }
//}

//public class Main {

//    public static void main(String[] args) {
//        int amount = 150;
//        boolean isRegistered = true;
//
//        int percent;
//        if (isRegistered) {
//            percent = 3;
//        } else {
//            percent = 1;
//        }
//        int percent = isRegistered ? 3 : 1; тернарный оператор

//        int bonus = amount * percent / 100;
//        if (bonus > 500) {
//            bonus = 500;
//        }
//
//        System.out.println("Total bonus:" + bonus);
//    }
//}

// Homework 2

//public class Main {
//
//    public static void main(String[] args) {
//
//        int cost = 18369; //стоимость билета
//        int mile = 20;       // 1 миля за каждые 20 рублей
//        int bonus = cost / mile;
//
//        System.out.println("Your accrued bonus miles:" + bonus);
//    }
//
//}
//Task 2

//public class Main {
//    public static void main(String[] args) {
//        int balance = 200; // баланс
//        int amount = 1730;        // сумма пополнения
//        int account = amount + balance;
//        int bonus;
//        if (amount >= 1000) {
//            bonus = amount / 100;
//        } else {
//            bonus = 0;
//        }
//        int total_bonus = bonus;
//        System.out.println("Your balance: " + account + " rubles");
//        System.out.println("You've received: " + total_bonus + " bonus.");
//
//    }
//}

// ЛЕКЦИЯ 3, работа на занятие.

//public class Main {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//
//        int result;
//        if (a > b) {              // типо ниже тоже самое но только круче
//            result = a;
//        }else {
//                result = b;
//        }
//        System.out.println("Max: " + result);
//    }
//}

// типо круче
//public class Main {
//    public static void main(String[] args) {
//        CalcService service = new CalcService();
////        int x = 5;  // я их могу передать в скобки ниже
////        int y = 3;
////        int myMax = service.max(5, 6);
////        System.out.println(myMax);
//        System.out.println();
//        System.out.println("5 / 6");
//        System.out.println(service.max(5, 6));
//
//        System.out.println();
//        System.out.println(("10 / 10"));
//        System.out.println(service.max(10, 10));
//
//        System.out.println();
//        System.out.println("-20 / -10");
//        System.out.println(service.max(-10, -20));
//
//    }
//}

// 2 решения, требуемое и мое, Задача 1.
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//
//        BonusMilesService service = new BonusMilesService();
//        System.out.println();
//        System.out.println(service.calculate(15000));
//
//        System.out.println();
//        System.out.println(service.calculate(20_000));
//    }
//}
// Their solution
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}

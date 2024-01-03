public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! It's my homework_3!");

        int apples = 95000;
        System.out.println("Значение переменной apples с типом int равно " +apples+ " штук");
        byte pears = 101;
        System.out.println("Значение переменной pears с типом byte равно " +pears+ " штук");
        short cherries = 25000;
        System.out.println("Значение переменной cherries с типом short равно " +cherries+ " штук");
        long apricots = 10000000;
        System.out.println("Значение переменной apricots с типом long равно " +apricots+ " штук");
        float sugar = 7.355f;
        System.out.println("Значение переменной sugar с типом float равно " +sugar+ " кг");
        double whiteBeet = 1000000.6123456789;
        System.out.println("Значение переменной whiteBeet с типом double равно " +whiteBeet+ " кг");

        float apples_1 = 27.12f;
        System.out.println("Значение переменной apples_ с типом int равно " +apples_1+ " кг");
        long pears_1 = 987678965549L;
        System.out.println("Значение переменной pears_1 с типом byte равно " +pears_1+ " грамм");
        float cherries_1 = 2.786f;
        System.out.println("Значение переменной cherries_1 с типом short равно " +cherries_1+ " кг");
        short apricots_1 = 569;
        System.out.println("Значение переменной apricots_1 с типом long равно " +apricots_1+ " штук");
        short sugar_1 = -159;
        System.out.println("Значение переменной sugar_1 с типом float равно " +sugar_1+ " кг");
        short whiteBeet_1 = 27897;
        System.out.println("Значение переменной whiteBeet_1 с типом double равно " +whiteBeet_1+ " кг");
        byte whiteBeet_2 = 67;
        System.out.println("Значение переменной whiteBeet_2 с типом double равно " +whiteBeet_2+ " шт");

        int teacherLudmilaPavlovna = 23;
        int teacherAnnaSergeevna = 27;
        int teacherEkaterinaAndreevna = 30;
        int paperForAllStudent = 480;
        int paperForOneStudent = paperForAllStudent / (teacherEkaterinaAndreevna + teacherLudmilaPavlovna + teacherAnnaSergeevna);
        System.out.println("На каждого ученика рассчитано " +paperForOneStudent+ " листов бумаги");

        int efficiencyBootlesPerTwoMinutes = 16;
        int timePer16BootlesMinutes = 2;
        int bootlesPer1Minute = efficiencyBootlesPerTwoMinutes / timePer16BootlesMinutes;
        System.out.println("Производительность бутылок за 1 минуту = " +bootlesPer1Minute+ " штук");
        int bootlesPer20Minutes = bootlesPer1Minute * 20;
        System.out.println("Производительность бутылок за 20 минут = " +bootlesPer20Minutes+ " штук");
        int hoursPerDay = 24;
        int minutesPerDay = 60 * hoursPerDay;
        int minutesPer3Days = 3 * minutesPerDay;
        int minutesPer1Month = 31 * minutesPerDay;
        int bootlesPerDay = bootlesPer1Minute * minutesPerDay;
        int bootlesPer3Days = bootlesPer1Minute * minutesPer3Days;
        int bootlesPer1Month = bootlesPer1Minute * minutesPer1Month;
        System.out.println("Производительность бутылок за 1 сутки = " +bootlesPerDay+ " штук");
        System.out.println("Производительность бутылок за 3 суток = " +bootlesPer3Days+ " штук");
        System.out.println("Производительность бутылок за 1 месяц = " +bootlesPer1Month+ " штук");

        int totalCansOfPaint = 120;
        int canOfBrownPaintForOneClass = 2;
        int canOfWhitePaintForOneClass = 4;
        int numberOfClasses = totalCansOfPaint / (canOfBrownPaintForOneClass + canOfWhitePaintForOneClass);
        int needCansOfWhitePaint = numberOfClasses * canOfWhitePaintForOneClass;
        int needCansOfBrownPaint = numberOfClasses * canOfBrownPaintForOneClass;
        System.out.println("В школе, где " +numberOfClasses+ " классов, нужно " +needCansOfWhitePaint+ " банок белой краски и " +needCansOfBrownPaint+ " банок коричневой краски");

        int bananasPieces = 5;
        int milkMilliliters = 200;
        int iceCreamPieces = 2;
        int eggsPieces = 4;
        int weightBanana = 80;
        float weightMilk = 105f / 100;
        int weightIceCream = 100;
        int weightEgg = 70;
        float totalWeightMilligrams = bananasPieces * weightBanana + milkMilliliters * weightMilk + iceCreamPieces * weightIceCream + eggsPieces * weightEgg;
        float totalWeightKilograms = totalWeightMilligrams / 1000;
        System.out.println(weightMilk);
        System.out.println("Итоговая масса завтрака спортсмена в граммах = " +totalWeightMilligrams);
        System.out.println("Итоговая масса завтрака спортсмена в килограммах = " +totalWeightKilograms);

        int massToBeDroppedKg = 7;
        int convertingOneKilogramsToGrams = 1000;
        int massToBeDroppedG = massToBeDroppedKg * convertingOneKilogramsToGrams;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int dayOfweightLoss1 = massToBeDroppedG / weightLoss1;
        int dayOfweightLoss2 = massToBeDroppedG / weightLoss2;
        System.out.println("Столько дней = " +dayOfweightLoss1+ " уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а столько = " +dayOfweightLoss2+ " — если каждый день будет худеть на 500 грамм");
        System.out.println("В среднем, для похудения, спортсмену нужно от " +dayOfweightLoss2+ " до " +dayOfweightLoss1+ " дней" );

        int currentSalaryMaria = 67760;
        int currentSalaryDenis = 83690;
        int currentSalaryKristina = 76230;
        float allowanceCurrentSalaryMaria = currentSalaryMaria * 0.1f;
        float increasedCurrentSalaryMaria = allowanceCurrentSalaryMaria + currentSalaryMaria;
        float allowanceCurrentSalaryDenis = currentSalaryDenis * 0.1f;
        float increasedCurrentSalaryDenis = allowanceCurrentSalaryDenis + currentSalaryDenis;
        float allowanceCurrentSalaryKristina = currentSalaryKristina * 0.1f;
        float increasedCurrentSalaryKristina = allowanceCurrentSalaryKristina + currentSalaryKristina;
        float monthsForOneYear = 12;

        float oneYearCurrentSalaryMaria = currentSalaryMaria * monthsForOneYear;
        float oneYearIncreasedCurrentSalaryMaria = increasedCurrentSalaryMaria * monthsForOneYear;
        float incomeDifferenceOneYearMaria = oneYearIncreasedCurrentSalaryMaria - oneYearCurrentSalaryMaria;
        System.out.println ("Мария получала ежемесячную зарплату = " +currentSalaryMaria+ " рублей. После 3 - х лет работы, повышение составило 10%. Теперь Мария получает ежемесячно " +increasedCurrentSalaryMaria+ " рублей. Ежемесячный доход вырос на " +allowanceCurrentSalaryMaria+ " рублей");
        System.out.println ("Годовой доход у Марии до повышения был " +oneYearCurrentSalaryMaria+ " рублей, а стал " +oneYearIncreasedCurrentSalaryMaria+ " рублей. Годовой доход вырос на " +incomeDifferenceOneYearMaria+ " рублей");

        float oneYearCurrentSalaryDenis = currentSalaryDenis * monthsForOneYear;
        float oneYearIncreasedCurrentSalaryDenis = increasedCurrentSalaryDenis * monthsForOneYear;
        float incomeDifferenceOneYearDenis = oneYearIncreasedCurrentSalaryDenis - oneYearCurrentSalaryDenis;
        System.out.println ("Денис получал ежемесячную зарплату = " +currentSalaryDenis+ " рублей. После 3 - х лет работы, повышение составило 10%. Теперь Денис получает ежемесячно " +increasedCurrentSalaryDenis+ " рублей. Ежемесячный доход вырос на " +allowanceCurrentSalaryDenis+ " рублей");
        System.out.println ("Годовой доход у Дениса до повышения был " +oneYearCurrentSalaryDenis+ " рублей, а стал " +oneYearIncreasedCurrentSalaryDenis+ " рублей. Годовой доход вырос на " +incomeDifferenceOneYearDenis+ " рублей");

        float oneYearCurrentSalaryKristina = currentSalaryKristina * monthsForOneYear;
        float oneYearIncreasedCurrentSalaryKristina = increasedCurrentSalaryKristina * monthsForOneYear;
        float incomeDifferenceOneYearKristina = oneYearIncreasedCurrentSalaryKristina - oneYearCurrentSalaryKristina;
        System.out.println ("Кристина получала ежемесячную зарплату = " +currentSalaryKristina+ " рублей. После 3 - х лет работы, повышение составило 10%. Теперь Кристина получает ежемесячно " +increasedCurrentSalaryKristina+ " рублей. Ежемесячный доход вырос на " +allowanceCurrentSalaryKristina+ " рублей");
        System.out.println ("Годовой доход у Кристины до повышения был " +oneYearCurrentSalaryKristina+ " рублей, а стал " +oneYearIncreasedCurrentSalaryKristina+ " рублей. Годовой доход вырос на " +incomeDifferenceOneYearKristina+ " рублей!");



















        }


    }
public class CaloriesCalculatorTest {
    public static void main(String[] args) {
        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakkwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);

        System.out.println("Pinapple Tarts more sinful than Bak Kwa: "+ tart.isMoreSinful(bakkwa));

        System.out.printf("Pinapple Tarts (calories per gram): %.2f\n",tart.getCaloriesPerGram());
        System.out.printf("Bak Kwa (calories per gram): %.2f\n", bakkwa.getCaloriesPerGram());
        System.out.printf("Love Letters (calories per gram): %.2f\n", loveLetters.getCaloriesPerGram());

        CaloriesCalculator calculator = new CaloriesCalculator();
        calculator.addNewYearGoodie(tart, 2);
        calculator.addNewYearGoodie(bakkwa, 3);
        calculator.addNewYearGoodie(loveLetters, 5);
        System.out.printf("Total Calories: %.2f\n",calculator.getTotalCalories());
        System.out.println("Most sinful goodie: "+ (calculator.getMostSinfulGoodie()).getName());

        




    }
}

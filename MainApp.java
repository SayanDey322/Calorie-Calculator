
public class MainApp {
    public static void main(String[] args) {
        UserInputHandler inputHandler = new UserInputHandler();
        CalorieCalculator calculationService = new CalorieCalculator();
        ResultDisplay resultDisplay = new ResultDisplay();

        UserData userData = inputHandler.gatherUserData();

        double bmr = calculationService.calculateBMR(userData);
        double dailyCalorieNeeds = calculationService.calculateDailyCalorieNeeds(bmr, userData.getActivityLevel());

        resultDisplay.displayResults(bmr, dailyCalorieNeeds);

        inputHandler.closeScanner();
    }
}

package feature_5_2_26;


interface MealPlan {
    String getMealType();
    boolean isValidCalories(int calories);
}


class VegetarianMeal implements MealPlan {

    public String getMealType() {
        return "Vegetarian";
    }

    public boolean isValidCalories(int calories) {
        return calories >= 1200 && calories <= 2200;
    }
}

class VeganMeal implements MealPlan {

    public String getMealType() {
        return "Vegan";
    }

    public boolean isValidCalories(int calories) {
        return calories >= 1300 && calories <= 2100;
    }
}

class KetoMeal implements MealPlan {

    public String getMealType() {
        return "Keto";
    }

    public boolean isValidCalories(int calories) {
        return calories >= 1400 && calories <= 2500;
    }
}

class HighProteinMeal implements MealPlan {

    public String getMealType() {
        return "High Protein";
    }

    public boolean isValidCalories(int calories) {
        return calories >= 1500 && calories <= 2800;
    }
}


class Meal<T extends MealPlan> {

    private String userName;
    private int calories;
    private T mealType;

    public Meal(String userName, int calories, T mealType) {

        if (!mealType.isValidCalories(calories)) {
            throw new IllegalArgumentException(
                    "Invalid calories for " + mealType.getMealType()
            );
        }

        this.userName = userName;
        this.calories = calories;
        this.mealType = mealType;
    }

    public String getDetails() {
        return userName + " | " +
                mealType.getMealType() +
                " | Calories: " + calories;
    }
}


class MealGenerator {

    public static <T extends MealPlan>
    Meal<T> generateMeal(String user, int calories, T type) {

        return new Meal<>(user, calories, type);
    }
}


public class MealPlanApp {

    public static void main(String[] args) {

        Meal<VegetarianMeal> m1 =
                MealGenerator.generateMeal(
                        "Sarthak", 1800, new VegetarianMeal());

        Meal<VeganMeal> m2 =
                MealGenerator.generateMeal(
                        "Riya", 1700, new VeganMeal());

        Meal<KetoMeal> m3 =
                MealGenerator.generateMeal(
                        "Aman", 2200, new KetoMeal());

        Meal<HighProteinMeal> m4 =
                MealGenerator.generateMeal(
                        "Neha", 2600, new HighProteinMeal());

        System.out.println(m1.getDetails());
        System.out.println(m2.getDetails());
        System.out.println(m3.getDetails());
        System.out.println(m4.getDetails());
    }
}


package com.codewithmosh.abstractFactory;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GoalFactory goalfactory) {
        workoutPlan = goalfactory.createWorkoutPlan();
        mealPlan = goalfactory.createMealPlan();

        System.out.println(workoutPlan);
        System.out.println(mealPlan);

    }
}

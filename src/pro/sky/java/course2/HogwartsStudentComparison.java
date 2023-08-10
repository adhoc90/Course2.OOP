package pro.sky.java.course2;

import pro.sky.java.course2.hw2.*;

public class HogwartsStudentComparison {
    public static void GryffindorStudentComparison(Gryffindor first, Gryffindor second) {
        int firstSum = first.getBravery() + first.getNobility() + first.getHonor();
        int secondSum = second.getBravery() + second.getNobility() + second.getHonor();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучше чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println(second.getName() + " равен " + first.getName());
        }
    }

    public static void HufflepuffStudentComparison(Hufflepuff first, Hufflepuff second) {
        int firstSum = first.getIndustriousness() + first.getLoyalty() + first.getLoyalty();
        int secondSum = second.getIndustriousness() + second.getLoyalty() + second.getLoyalty();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучше чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println(second.getName() + " равен " + first.getName());
        }
    }

    public static void RavenclawStudentComparison(Ravenclaw first, Ravenclaw second) {
        int firstSum = first.getSmart() + first.getWisdom() + first.getWit() + first.getFullOfCreativity();
        int secondSum = second.getSmart() + second.getWisdom() + second.getWit() + second.getFullOfCreativity();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучше чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println(second.getName() + " равен " + first.getName());
        }
    }

    public static void SlytherinStudentComparison(Slytherin first, Slytherin second) {
        int firstSum = first.getCunning() + first.getAmbition() + first.getDetermination()
                + first.getResourcefulness() + first.getLustForPower();
        int secondSum = second.getCunning() + second.getAmbition() + second.getDetermination()
                + second.getResourcefulness() + second.getLustForPower();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучше чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println(second.getName() + " равен " + first.getName());
        }
    }

    public static void ComparisonTwoHogwartsStudents(Hogwarts first, Hogwarts second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println(first.getName() + " обладает большей силой магии чем " + second.getName());

        } else if (second.getMagicPower() > first.getMagicPower()) {
            System.out.println(second.getName() + " обладает большей силой магии чем " + first.getName());

        } else {
            System.out.println(second.getName() + " равны по силе магии " + first.getName());
        }

        if (first.getTransgressPower() > second.getTransgressPower()) {
            System.out.println(first.getName() + " обладает большем расстоянием трансгрессии чем " + second.getName());

        } else if (second.getTransgressPower() > first.getTransgressPower()) {
            System.out.println(second.getName() + " обладает большем расстоянием трансгрессии чем " + first.getName());

        } else {
            System.out.println(second.getName() + " равны по силе трансгрессии " + first.getName());
        }
    }
}


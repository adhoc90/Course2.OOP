package pro.sky.java.course2;

import pro.sky.java.course2.hw2.*;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor(
                "Harry Potter",
                94,
                87,
                91,
                90,
                89);

        Gryffindor hermioneGranger = new Gryffindor(
                "Hermione Granger",
                77,
                88,
                81,
                92,
                50);

        Gryffindor ronWeasley = new Gryffindor(
                "Ron Weasley",
                78,
                89,
                47,
                67,
                56);

        Slytherin dracoMalfoy = new Slytherin(
                "Draco Malfoy",
                79,
                76,
                66,
                55,
                44,
                21,
                34);

        Slytherin grahamMontagu = new Slytherin(
                "Graham Montagu",
                44,
                55,
                22,
                33,
                11,
                45,
                23);

        Slytherin gregoryGoyle = new Slytherin(
                "Gregory Goyle",
                15,
                34,
                32,
                11,
                12,
                31,
                15);

        Hufflepuff zachariasSmith = new Hufflepuff(
                "Zacharias Smith",
                32,
                34,
                35,
                56,
                48);

        Hufflepuff cedricDiggory = new Hufflepuff(
                "Cedric Diggory",
                56,
                61,
                34,
                31,
                45);

        Hufflepuff justinFinchFletchley = new Hufflepuff(
                "Justin Finch-Fletchley",
                33,
                22,
                55,
                11,
                23);

        Ravenclaw zhouChang = new Ravenclaw(
                "Zhou Chang",
                42,
                41,
                44,
                23,
                22,
                11);

        Ravenclaw padmaPatil = new Ravenclaw(
                "Padma Patil",
                22,
                24,
                32,
                41,
                27,
                11);

        Ravenclaw marcusBelby = new Ravenclaw(
                "Marcus Belby",
                34,
                35,
                44,
                28,
                27,
                17);

        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        System.out.println(dracoMalfoy);
        System.out.println(cedricDiggory);
        System.out.println();

        HogwartsStudentComparison.GryffindorStudentComparison(harryPotter, hermioneGranger);
        HogwartsStudentComparison.GryffindorStudentComparison(ronWeasley, hermioneGranger);

        HogwartsStudentComparison.SlytherinStudentComparison(dracoMalfoy, gregoryGoyle);
        HogwartsStudentComparison.RavenclawStudentComparison(zhouChang, padmaPatil);
        HogwartsStudentComparison.HufflepuffStudentComparison(cedricDiggory, justinFinchFletchley);

        HogwartsStudentComparison.ComparisonTwoHogwartsStudents(harryPotter, dracoMalfoy);
    }
}

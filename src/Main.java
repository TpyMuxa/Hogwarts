public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 10, 5,
                15, 12, 20);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 5,
                8, 20, 10, 8);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 4, 5,
                10, 11, 7);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 3, 2,
                10, 15, 16);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 6, 4,
                5, 16, 17);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 2,
                4, 6, 7, 1);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 7, 2,
                7, 15, 20, 14);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 4, 2,
                3, 15, 14, 18);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 2, 15,
                2, 17, 20, 14);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 9, 5,
                20, 15, 16, 18, 20);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 5, 5,
                4, 11, 15, 10, 8);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 3, 3,
                10, 10, 8, 7, 4);
        showCharacter(dracoMalfoy);
        compareStudentFacultyGryffindor(hermioneGranger, harryPotter);
        compareStudentFacultyHufflepuff(cedricDiggory, justinFinchFletchley);
        compareStudentFacultyRavenclaw(padmaPatil, marcusBelby);
        compareStudentFacultySlytherin(gregoryGoyle, dracoMalfoy);
        printPowerfullCharacter(dracoMalfoy, harryPotter);
    }

    private static void showCharacter(hogwarts studentName) {

        System.out.println(studentName.toString());
    }

    private static void compareStudentFacultyGryffindor(Gryffindor first, Gryffindor second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getNameCharacter() + " лучший Гриффиндорец, чем " + second.getNameCharacter());
        } else {
            System.out.println(second.getNameCharacter() + " лучший Гриффиндорец, чем " + first.getNameCharacter());
        }
    }

    private static void compareStudentFacultyHufflepuff(Hufflepuff first, Hufflepuff second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getNameCharacter() + " лучший Пуффендуец, чем " + second.getNameCharacter());
        } else {
            System.out.println(second.getNameCharacter() + " лучший Пуффендуец, чем " + first.getNameCharacter());
        }
    }

    private static void compareStudentFacultyRavenclaw(Ravenclaw first, Ravenclaw second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getNameCharacter() + " лучший Когтевранец, чем " + second.getNameCharacter());
        } else {
            System.out.println(second.getNameCharacter() + " лучший Когтевранец, чем " + first.getNameCharacter());
        }
    }

    private static void compareStudentFacultySlytherin(Slytherin first, Slytherin second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getNameCharacter() + " лучший Слизеринец, чем " + second.getNameCharacter());
        } else {
            System.out.println(second.getNameCharacter() + " лучший Слизеринец, чем " + first.getNameCharacter());
        }
    }

    private static void printPowerfullCharacter(hogwarts first, hogwarts second) {
        if (first.getTotalPointsMagic() > second.getTotalPointsMagic()) {
            System.out.println(first.getNameCharacter() + " обладает большей мощностью магии, чем " +
                    second.getNameCharacter());
        } else if (first.getTotalPointsMagic() < second.getTotalPointsMagic()) {
            System.out.println(second.getNameCharacter() + " обладает большей мощностью магии, чем " +
                    first.getNameCharacter());
        } else {
            System.out.println(first.getNameCharacter() + " и " + second.getNameCharacter() + " равны по силе магии");
        }
    }
}

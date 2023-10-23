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
        hogwarts.showCharacter(dracoMalfoy);
        hogwarts.compareStudentFacultyGryffindor(hermioneGranger, harryPotter);
        hogwarts.compareStudentFacultyHufflepuff(cedricDiggory, justinFinchFletchley);
        hogwarts.compareStudentFacultyRavenclaw(padmaPatil, marcusBelby);
        hogwarts.compareStudentFacultySlytherin(gregoryGoyle, dracoMalfoy);
        hogwarts.printPowerfullCharacter(dracoMalfoy, harryPotter);
    }
}

public class Main {
    public static void main(String[] args) {

        GryffindorStudent harryPotter = new GryffindorStudent("Гарри Поттер", 10, 5,
                15, 12, 20);
        GryffindorStudent hermioneGranger = new GryffindorStudent("Гермиона Грейнджер", 5,
                8, 20, 10, 8);
        GryffindorStudent ronWeasley = new GryffindorStudent("Рон Уизли", 4, 5,
                10, 11, 7);
        HufflepuffStudent zachariahSmith = new HufflepuffStudent("Захария Смит", 3, 2,
                10, 15, 16);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent("Седрик Диггори", 6, 4,
                5, 16, 17);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent("Джастин Финч-Флетчли", 2,
                4, 6, 7, 1);
        RavenclawStudent zhouChang = new RavenclawStudent("Чжоу Чанг", 7, 2,
                7, 15, 20, 14);
        RavenclawStudent padmaPatil = new RavenclawStudent("Падма Патил", 4, 2,
                3, 15, 14, 18);
        RavenclawStudent marcusBelby = new RavenclawStudent("Маркус Белби", 2, 15,
                2, 17, 20, 14);
        SlytherinStudent dracoMalfoy = new SlytherinStudent("Драко Малфой", 9, 5,
                20, 15, 16, 18, 20);
        SlytherinStudent grahamMontague = new SlytherinStudent("Грэхэм Монтегю", 5, 5,
                4, 11, 15, 10, 8);
        SlytherinStudent gregoryGoyle = new SlytherinStudent("Грегори Гойл", 3, 3,
                10, 10, 8, 7, 4);
        harryPotter.showCharacter();
        dracoMalfoy.showCharacter();
        hermioneGranger.compareStudentFacultyGryffindor(harryPotter);
        cedricDiggory.compareStudentFacultyHufflepuff(justinFinchFletchley);
        padmaPatil.compareStudentFacultyRavenclaw(marcusBelby);
        gregoryGoyle.compareStudentFacultySlytherin(dracoMalfoy);
        dracoMalfoy.printPowerfullCharacter(cedricDiggory);
    }
}

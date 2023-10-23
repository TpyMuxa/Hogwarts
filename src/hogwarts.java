public class hogwarts {

    private String nameCharacter;
    private int powerOfMagic;
    private int transgressionDistance;
    private int totalPointsMagic;

    public hogwarts(String nameCharacter, int powerOfMagic, int transgressionDistance) {
        this.nameCharacter = nameCharacter;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Имя персонажа: " + nameCharacter + "\n" + "Сила магии: " + powerOfMagic + "\n" + "Расстояние" +
                " трансгрессии: " + transgressionDistance;
    }

    public String getNameCharacter() {
        return nameCharacter;
    }

    public int getTotalPointsMagic() {
        this.totalPointsMagic = this.powerOfMagic + this.transgressionDistance;
        return totalPointsMagic;
    }

    public static void showCharacter(hogwarts studentName) {

        System.out.println(studentName.toString());
    }

    public static void compareStudentFacultyGryffindor(Gryffindor first, Gryffindor second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getNameCharacter() + " лучший Гриффиндорец, чем " + second.getNameCharacter());
        } else {
            System.out.println(second.getNameCharacter() + " лучший Гриффиндорец, чем " + first.getNameCharacter());
        }
    }

    public static void compareStudentFacultyHufflepuff(Hufflepuff first, Hufflepuff second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getNameCharacter() + " лучший Пуффендуец, чем " + second.getNameCharacter());
        } else {
            System.out.println(second.getNameCharacter() + " лучший Пуффендуец, чем " + first.getNameCharacter());
        }
    }

    public static void compareStudentFacultyRavenclaw(Ravenclaw first, Ravenclaw second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getNameCharacter() + " лучший Когтевранец, чем " + second.getNameCharacter());
        } else {
            System.out.println(second.getNameCharacter() + " лучший Когтевранец, чем " + first.getNameCharacter());
        }
    }

    public static void compareStudentFacultySlytherin(Slytherin first, Slytherin second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getNameCharacter() + " лучший Слизеринец, чем " + second.getNameCharacter());
        } else {
            System.out.println(second.getNameCharacter() + " лучший Слизеринец, чем " + first.getNameCharacter());
        }
    }

    public static void printPowerfullCharacter(hogwarts first, hogwarts second) {
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

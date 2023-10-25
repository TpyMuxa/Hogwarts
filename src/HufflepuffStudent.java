public class HufflepuffStudent extends HogwartsStudent {

    private int hardWorker;
    private int loyalty;
    private int honesty;
    private int totalPoints;

    public HufflepuffStudent(String nameCharacter, int powerOfMagic, int transgressionDistance, int hardWorker, int loyalty,
                             int honesty) {
        super(nameCharacter, powerOfMagic, transgressionDistance);
        this.hardWorker = hardWorker;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Трудолюбие: " + hardWorker + "\n" + "Верность: " + loyalty + "\n" +
                "Честность: " +
                honesty;
    }

    public int getTotalPoints() {
        this.totalPoints = this.hardWorker + this.loyalty + this.honesty;
        return totalPoints;
    }

    public void compareStudentFacultyHufflepuff(HufflepuffStudent name) {
        if (this.getTotalPoints() > name.getTotalPoints()) {
            System.out.println(this.getNameCharacter() + " лучший Пуффендуец, чем " + name.getNameCharacter());
        } else if (this.getTotalPoints() < name.getTotalPoints()) {
            System.out.println(name.getNameCharacter() + " лучший Пуффендуец, чем " + this.getNameCharacter());
        } else {
            System.out.println(this.getNameCharacter() + " и " + name.getNameCharacter() +
                    " свойства персонажей равны");
        }
    }
}

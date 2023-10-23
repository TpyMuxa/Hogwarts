public class Hufflepuff extends hogwarts {

    private int hardWorker;
    private int loyalty;
    private int honesty;
    private int totalPoints;

    public Hufflepuff(String nameCharacter, int powerOfMagic, int transgressionDistance, int hardWorker, int loyalty,
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
}

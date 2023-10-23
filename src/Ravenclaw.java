public class Ravenclaw extends hogwarts {

    private int intelligent;
    private int wisdom;
    private int ingenious;
    private int creative;
    private int totalPoints;

    public Ravenclaw(String nameCharacter, int powerOfMagic, int transgressionDistance, int intelligent, int wisdom,
                     int ingenious, int creative) {
        super(nameCharacter, powerOfMagic, transgressionDistance);
        this.intelligent = intelligent;
        this.wisdom = wisdom;
        this.ingenious = ingenious;
        this.creative = creative;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Ум: " + intelligent + "\n" + "Мудрость: " + wisdom + "\n" + "Остроумие: " +
                ingenious + "\n" + "Творчество: " + creative;
    }

    public int getTotalPoints() {
        this.totalPoints = this.intelligent + this.wisdom + this.ingenious + this.creative;
        return totalPoints;
    }
}

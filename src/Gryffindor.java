public class Gryffindor extends hogwarts {

    private int nobleness;
    private int honor;
    private int bravery;
    private int totalPoints;

    public Gryffindor(String nameCharacter, int powerOfMagic, int transgressionDistance, int nobleness, int honor,
                      int bravery) {
        super(nameCharacter, powerOfMagic, transgressionDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Благородство: " + nobleness + "\n" + "Честь: " + honor + "\n" + "Храбрость: "
                + bravery;
    }

    public int getTotalPoints() {
        this.totalPoints = this.honor + this.bravery + this.nobleness;
        return totalPoints;
    }
}

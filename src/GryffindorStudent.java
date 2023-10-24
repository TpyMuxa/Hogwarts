public class GryffindorStudent extends HogwartsStudent {

    private int nobleness;
    private int honor;
    private int bravery;
    private int totalPoints;

    public GryffindorStudent(String nameCharacter, int powerOfMagic, int transgressionDistance, int nobleness, int honor,
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

    public void compareStudentFacultyGryffindor(GryffindorStudent name) {
        if (this.getTotalPoints() > name.getTotalPoints()) {
            System.out.println(this.getNameCharacter() + " лучший Гриффиндорец, чем " + name.getNameCharacter());
        } else if (this.getTotalPoints() < name.getTotalPoints()) {
            System.out.println(name.getNameCharacter() + " лучший Гриффиндорец, чем " + this.getNameCharacter());
        } else {
            System.out.println(this.getNameCharacter() + " и " + name.getNameCharacter() +
                    " свойства персонажей равны");
        }
    }
}

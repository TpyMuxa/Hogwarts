public class RavenclawStudent extends HogwartsStudent {

    private int intelligent;
    private int wisdom;
    private int ingenious;
    private int creative;
    private int totalPoints;

    public RavenclawStudent(String nameCharacter, int powerOfMagic, int transgressionDistance, int intelligent, int wisdom,
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

    public void compareStudentFacultyRavenclaw(RavenclawStudent name) {
        if (this.getTotalPoints() > name.getTotalPoints()) {
            System.out.println(this.getNameCharacter() + " лучший Когтевранец, чем " + name.getNameCharacter());
        } else if (this.getTotalPoints() < name.getTotalPoints()) {
            System.out.println(name.getNameCharacter() + " лучший Когтевранец, чем " + this.getNameCharacter());
        } else {
            System.out.println(this.getNameCharacter() + " и " + name.getNameCharacter() +
                    " свойства персонажей равны");
        }
    }
}

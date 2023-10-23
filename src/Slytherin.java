public class Slytherin extends hogwarts {

    private int agility;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int imperiousness;
    private int totalPoints;

    public Slytherin(String nameCharacter, int powerOfMagic, int transgressionDistance, int agility, int resoluteness,
                     int ambition, int resourcefulness, int imperiousness) {
        super(nameCharacter, powerOfMagic, transgressionDistance);
        this.agility = agility;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.imperiousness = imperiousness;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Хитрость: " + agility + "\n" + "Решительность: " + resoluteness + "\n" +
                "Амбициозность: " + ambition + "\n" + "Находчивость: " + resourcefulness + "\n" + "Жажда власти:" +
                imperiousness;
    }

    public int getTotalPoints() {
        this.totalPoints = this.agility + this.resoluteness + this.ambition + this.resourcefulness + this.imperiousness;
        return totalPoints;
    }
}

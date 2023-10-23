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
}

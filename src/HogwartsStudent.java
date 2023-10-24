public abstract class HogwartsStudent {

    private String nameCharacter;
    private int powerOfMagic;
    private int transgressionDistance;
    private int totalPointsMagic;

    public HogwartsStudent(String nameCharacter, int powerOfMagic, int transgressionDistance) {
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

    public void showCharacter() {

        System.out.println(toString());
    }

    public void printPowerfullCharacter(HogwartsStudent name) {
        if (this.getTotalPointsMagic() > name.getTotalPointsMagic()) {
            System.out.println(this.getNameCharacter() + " обладает большей мощностью магии, чем " +
                    name.getNameCharacter());
        } else if (this.getTotalPointsMagic() < name.getTotalPointsMagic()) {
            System.out.println(name.getNameCharacter() + " обладает большей мощностью магии, чем " +
                    this.getNameCharacter());
        } else {
            System.out.println(this.getNameCharacter() + " и " + name.getNameCharacter() + " равны по силе магии");
        }
    }
}

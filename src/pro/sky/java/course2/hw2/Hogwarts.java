package pro.sky.java.course2.hw2;

public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressPower;

    public Hogwarts(String name, int magicPower, int transgress) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressPower = transgress;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressPower() {
        return transgressPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgress(int transgress) {
        this.transgressPower = transgress;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Hogwarts{" +
                "name=" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgress=" + transgressPower +
                '}';
    }
}

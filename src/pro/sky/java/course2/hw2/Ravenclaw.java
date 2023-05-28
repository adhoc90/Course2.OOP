package pro.sky.java.course2.hw2;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int fullOfCreativity;

    public Ravenclaw(String name, int magicPower, int transgress, int smart, int wisdom, int wit, int fullOfCreativity) {
        super(name, magicPower, transgress);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name=" + getName() +
                ",magicPower=" + getMagicPower() +
                ",transgressPower=" + getTransgressPower() +
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", fullOfCreativity=" + fullOfCreativity +
                '}';
    }
}

public class Beby_Bear extends Bears{
    private String name;

    public Beby_Bear(int age,Teeth teeth, Liar liar,int byteForces, String name) {
        super(age, teeth, liar,byteForces);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nИмя: "+name;
    }
}


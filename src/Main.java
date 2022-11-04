public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------");// ДЗ
        Liar liar0 = new Liar("Азия","Манголия");
        Bears bears = new Bears(9,Teeth.BLUNT,liar0,71);
        System.out.println(bears.getInfo());
        bears.makeVoice();

        System.out.println("----------------------------");
        Liar liar = new Liar("Азия","Кыргызстан");
        Beby_Bear beby_Bear = new Beby_Bear(3,Teeth.SHARP,liar,23,"Pumba");
        System.out.println(beby_Bear.getInfo());
        beby_Bear.makeVoice("Vaaau");

        System.out.println("----------------------------");
        Liar liar1 = new Liar("Сибир","Диксон");
         Beby_Bear beby_bear2 = new Beby_Bear(2,Teeth.STRAIGHT,liar1,23,"Timon");
        System.out.println(beby_bear2.getInfo());
        beby_bear2.makeVoice("Вааааааа");
    }
    }

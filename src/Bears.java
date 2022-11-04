public class Bears extends Bear {
    public Bears( int age, Teeth teeth, Liar liar,int byteForces) {
        super(age, teeth, liar,byteForces);
    }
    public final void makeVoice(){
        System.out.println("Враааа");
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }
    public String  getInfo(){
        return  "\nВозраст: "+super.getAge()
                +"\nНазвание материка: "+super.getLiar().getName()
                +"\nМестоположение: "+ super.getLiar().getWhereIsLiar()+
                "\nЗубы : "+super.getTeeth()+"\nСила укуса: "+super.getByteForces();
    }

}

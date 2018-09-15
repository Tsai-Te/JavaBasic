public class Bike {
    String wheelShape;
    int wheelNum;;
    String seatShape;

    public Bike (){}


    public Bike(String ws,int wn,String sh){
        this.wheelShape = ws;
        this.wheelNum=wn;
        this.seatShape=sh;
    }
    public void print(){
      System.out.println("ws chosen is:" + wheelShape);
      System.out.println("sh chosen is:" + seatShape);
      System.out.println("wn chosen is:" + wheelNum);
    }

    public static void main (String []args){
        Bike b= new Bike("square",2,"triangle");
        b.print();

    }

}

class Bicycle extends Bike{
    int pedalNum;
    public Bicycle(int pn){
        this.pedalNum = pn;
    }
    public void print(){
        System.out.println("pn chosen is:" + pedalNum);
    }

    public static void main (String args[]){
        Bicycle bi = new Bicycle(2);
        bi.print();
    }
}

class Motorcycle extends Bike{
    int pedalNum;
    String gasTank;
    String motor;

    public Motorcycle (int pn, String gt, String mo){
        this.pedalNum = pn;
        this.gasTank = gt;
        this.motor = mo;
    }

    public void print(){
        System.out.println("pn chosen is:" + pedalNum);
        System.out.println("gt chosen is:" + gasTank);
        System.out.println("mo chosen is:" + motor);
    }
    public static void main (String args[]){
        Motorcycle m = new Motorcycle(2,"gas", "yes");
        m.print();
    }
}


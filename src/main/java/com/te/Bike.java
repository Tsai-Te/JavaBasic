public class Bike {
    String wheelShape;
    int wheelNum;;
    String seatShape;
    Integer handleNum;

    public Bike(){};

    public Bike(String ws,int wn,String sh, Integer hn){
        this.wheelShape = ws;
        this.wheelNum=wn;
        this.seatShape=sh;
        this.handleNum=hn;
    }
    public void print(){
        System.out.println("ws chosen is:" + wheelShape);
        System.out.println("sh chosen is:" + seatShape);
        System.out.println("wn chosen is:" + wheelNum);
        System.out.println("hn chosen is:" + handleNum);
    }

    public static void main (String []args){
        Bike b= new Bike("square",2,"triangle",6);
        b.print();
        Bike b2 = new Bike();
        b2.print();

    }


    public int getWheelNum(){
        return wheelNum;
    }
    public String getWheelShape(){
        return wheelShape;
    }
}



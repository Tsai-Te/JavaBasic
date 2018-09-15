public class Bike {
    String wheelShape;
    int wheelNum;;
    String seatShape;

    public Bike(){};

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


    public int getWheelNum(){
        return wheelNum;
    }
    public String getWheelShape(){
        return wheelShape;
    }
}



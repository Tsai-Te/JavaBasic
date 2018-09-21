public class Bike3 {
    String wheelShape;
    int wheelNum;
    int seatNum;

    public Bike3 (){};

    public Bike3 (String ws, int wn, int sn){
        this.wheelShape=ws;
        this.seatNum=wn;
        this.wheelNum=sn;
    }

    public void print(){
        System.out.println("ws is:"+wheelShape);
        System.out.println("wn is:"+wheelNum);
        System.out.println("sn is"+wheelNum);
    }

    public static void main (String[] args){
        Bike3 b3=new Bike3 ("circle", 2,1);
        b3.print();

        String str1 = new String("1234");
        String str2 = new String ("1234");
        if (str1.equals(str2)) System.out.println("string comparsion");
    }
}





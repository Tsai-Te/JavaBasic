public class Motorcycle extends Bicycle {
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

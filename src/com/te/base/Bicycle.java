public class Bicycle extends Bike {
        int pedalNum;
        public Bicycle(int pn){
            this.pedalNum = pn;
        }
        public Bicycle (){}
        public void print(){
            System.out.println("pn chosen is:" + pedalNum);
        }

        public static void main (String args[]){
            Bicycle bi = new Bicycle(2);
            bi.print();
            String instanceStr = bi.toString();
            System.out.println(instanceStr);
        }
        int getPedalNum(){
            return pedalNum;
        }

        public String toString(){
            return "wheelShape:" + getWheelShape()+", wheelNum:" + getWheelNum()+", pedalNum:" + getPedalNum();
        }
}

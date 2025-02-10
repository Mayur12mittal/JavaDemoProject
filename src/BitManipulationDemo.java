public class BitManipulationDemo {

    //getting the bit at particular position
    public static void getBit(){
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        if((bitmask & n) == 0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }

    //setting the bit to 1 at our position
    public static void setBit(){
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int newMask = bitmask | n;
        System.out.println(newMask);
    }

    // setting the bit to 0 at our position
    public static void clearBit(){
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        int revertBitMask = ~(bitmask);
        int newMask = revertBitMask & n;
        System.out.println(newMask);
    }

    public static void main(String[] args){
        getBit();
        setBit();
        clearBit();
    }


}

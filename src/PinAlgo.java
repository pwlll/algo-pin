import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class PinAlgo {
    private String pin;
    private Random random;
    private String charsShort="0123456789";
    private String charsLong="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public PinAlgo(int length){
        random=new Random();
        pin=new String();
        if(length==4 || length==6){
            for(int i=0;i<length;i++){
                pin+=charsShort.charAt(random.nextInt(charsShort.length()));
            }
        }
        else if(length==12 || length==16){
            for(int i=0;i<length;i++){
                pin+=charsLong.charAt(random.nextInt(charsLong.length()));
            }
        }
        else{
            System.out.println("Invalid pin length");
            pin="0";
        }
    }
    public void showPin(){
        System.out.println(pin);
    }
    public void saveToFile(){
        try {
            FileWriter fileWriter=new FileWriter("pin.txt");
            fileWriter.write(pin);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

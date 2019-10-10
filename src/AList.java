import java.util.ArrayList;
import java.util.List;

public class AList {
    public static void main (String[]args){
        List<String> bc = new ArrayList<>();
        bc.add("Mas Joko");
        bc.add("Mas Dev");
        bc.add("Mas Aji");
        bc.add("Pak Adi");
        System.out.println("Trainer"+bc);
        System.out.println("Trainer Bootcamp31 "+bc.get(1));
    }
}


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
         Map<String, String> entry = new HashMap<String, String>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = in.next();

            entry.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String name = in.next();
            // Write code here
            if (entry.containsKey(name)){
                System.out.println(name + "=" + entry.get(name));
            }
            else {
                System.out.println("Not found");
            }


        }
        in.close();
    }
}

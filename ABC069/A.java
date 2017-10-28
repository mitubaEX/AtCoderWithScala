import java.io.*;
import java.util.*;

class A{
    public void run(){
        BufferedReder br = new BufferedReder(new InputStreamReder(System.in));
        String[] arg = br.readLine().split(" ");

    }
    public static void main(String... args){
        new A().run();
    }
}

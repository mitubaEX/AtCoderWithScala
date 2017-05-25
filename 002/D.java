import java.io.*;
import java.util.*;

class D{
    int[][] map;
    public int saiki(int shiten, int current, int arrive_count){
        System.out.println("now:" + current + ": ");
        if(arrive_count > 1 && current == shiten)
            return arrive_count;

        boolean flag = false;
        for(int j = 0 ; j < map.length; j++){
            if(map[j][current] == 1){
                System.out.println(current + ": " + j);
                flag = true;
                return saiki(shiten, j, ++arrive_count);
            }
        }
        if(flag)arrive_count = 0;
        return arrive_count;
    }
    public void run(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] arg = br.readLine().split(" ");
            int n = Integer.parseInt(arg[0]);
            int m = Integer.parseInt(arg[1]);
            map = new int[n][n];
            for(int i = 0; i < n;i++){
                for(int j = 0;j < n; j++){
                    map[i][j] = 0;
                }
            }
            br.lines()
                .filter(i -> !Objects.equals(i, ""))
                .map(i -> i.split(" "))
                .forEach(i -> map[Integer.parseInt(i[0]) - 1][Integer.parseInt(i[1]) - 1] = 1);
            for(int i = 0; i < n;i++){
                for(int j = 0;j < n; j++){
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
            int max = 0;
            for(int i = 0; i < n;i++){
                max = Math.max(saiki(i, i, 1), max);
            }
            System.out.println(max);
        }catch(Exception e){

        }
    }

    public static void main(String... args){
        new D().run();
    }
}


/*
 *
 *@Data 22.04.2020
 *@autor Fedorov Yuri
 *@project Новая папка
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<Song> users=new ArrayList<>();

    public static void main(String[] args) {
        getUsers();
        System.out.println(users);
        List<Song> users2=users.stream().filter(x -> x.isApprove()).collect(Collectors.toList());
        System.out.println(users2);
        users.stream().filter(x -> x.isApprove()).forEach(System.out::println);
    }

    private static void getUsers() {
        for (int i=0;i<10;i++){
            String s=Integer.toString(i);
            boolean q=true;
            if(i%3!=0){
                q=false;
            }
            users.add(new Song(s,q));
        }
    }
}

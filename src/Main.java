
/*
 *
 *@Data 22.04.2020
 *@autor Fedorov Yuri
 *@project Новая папка
 *
 */

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<User> users=new ArrayList<>();

    public static void main(String[] args) {
        getUsers();
        System.out.println(users);
     //   List<User> users2=

    }

    private static void getUsers() {
        for (int i=0;i<10;i++){
            String s=Integer.toString(i);
            boolean q=true;
            if(i%2==0){
                q=false;
            }
            users.add(new User(s,q));
        }
    }
}

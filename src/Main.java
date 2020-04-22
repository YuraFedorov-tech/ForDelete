
/*
 *
 *@Data 22.04.2020
 *@autor Fedorov Yuri
 *@project Новая папка
 *
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Main {
    static Set<Song> songs = new HashSet<>();

    public static void main(String[] args) {
        getUsers();
        List<SongComplectation> songComplectationList = new ArrayList<>();
        songComplectationList.add(new SongComplectation("123", songs));
        songComplectationList.add(new SongComplectation("234", songs));
        System.out.println(songComplectationList);


        songComplectationList.forEach(list->
                list.setSongs(list.getSongs().stream().filter(song -> song.isApprove()).collect(toSet()))

        );
        System.out.println(songComplectationList);
    }
    private static void getUsers() {
        for (int i = 0; i < 10; i++) {
            String s = Integer.toString(i);
            boolean q = false;
            if (i % 3 == 0) {
                q = true;
            }
            songs.add(new Song(s, q));
        }
    }
}

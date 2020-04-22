
/*
 *
 *@Data 22.04.2020
 *@autor Fedorov Yuri
 *@project Новая папка
 *
 */

import java.util.Set;

public class SongComplectation {
    private String name;
    private Set<Song> songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public SongComplectation(String name, Set<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "SongComplectation{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}

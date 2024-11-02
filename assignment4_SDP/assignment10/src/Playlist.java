//Импортируем библиотеки списков и массивов для конкретного списка песен в плэйлисте
import java.util.ArrayList;
import java.util.List;

//Класс плэйлист, который будет хранить список песен
public class Playlist {
    //составляющее, список песен
    private List<Song> songs = new ArrayList<>();

    //метод добавления песни в список
    public void addSong(Song song) {
        songs.add(song);
    }

    //геттер списков песен
    public List<Song> getSongs() {
        return songs;
    }

    //метод последовательного вывода песен
    public Iterator getSequentialIterator() {
        return new SequentialIterator(songs);
    }

    //метод для перемешивания
    public Iterator getShuffleIterator() {
        return new ShuffleIterator(songs);
    }

    //метод для фильтрации жанров
    public Iterator getGenreFilterIterator(String genre) {
        return new GenreFilterIterator(songs, genre);
    }
}

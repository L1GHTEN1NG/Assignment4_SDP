//Импортируем библиотеку списокв
import java.util.List;

//Создали итератор фильтрации жанров, который взаимствует свойства интерфейса
public class GenreFilterIterator implements Iterator {
    //список песен
    private List<Song> songs;
    //жанры
    private String genre;
    //также позиция для каждой песни
    private int position = 0;

    //конструктор фильтрации жанров
    public GenreFilterIterator(List<Song> songs, String genre) {
        this.songs = songs;
        this.genre = genre;
    }

    //взаимственный метод определения следущей песни, который проверяет жанр
    public boolean hasNext() {
        while (position < songs.size()) {
            if (songs.get(position).getGenre().equalsIgnoreCase(genre)) {
                return true;
            }
            position++;
        }
        return false;
    }

    //взаимственный метод вывода следущей песни, который фильтрует жанры
    public Song next() {
        return hasNext() ? songs.get(position++) : null;
    }
}

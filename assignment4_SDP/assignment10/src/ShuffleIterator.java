//Импортируем библиотеки коллекций, списков и рандомайзера
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Создали итератор перемешивания песен, который взаимствует свойства интерфейса
public class ShuffleIterator implements Iterator {
    //список песен
    private List<Song> songs;
    //также позиция для каждой песни
    private int position = 0;

    //конструктор перемешивания песен
    public ShuffleIterator(List<Song> songs) {
        this.songs = new ArrayList<>(songs);
        Collections.shuffle(this.songs, new Random()); //перемешивание используя рандомайзер
    }

    //взаимственный метод определения следущей песни
    public boolean hasNext() {
        return position < songs.size();
    }

    //взаимственный метод вывода следущей песни
    public Song next() {
        return hasNext() ? songs.get(position++) : null;
    }
}

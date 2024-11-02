//Импортируем библиотеку списокв
import java.util.List;

//Теперь уже создаем отдельные классы для каждой итерации, он взаимствует свойства интерфейса
public class SequentialIterator implements Iterator {
    //список песен
    private List<Song> songs;
    //также позиция для каждой песни
    private int position = 0;

    //конструктор последовательного вопсроизведения
    public SequentialIterator(List<Song> songs) {
        this.songs = songs;
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

//Класс Мэйн для проверки функционала
public class Main {
    public static void main(String[] args) {
        //Создали новый плэйлист
        Playlist playlist = new Playlist();

        //добавляем песни в плэйлист
        playlist.addSong(new Song("Song A", "Rock"));
        playlist.addSong(new Song("Song C", "Rock"));
        playlist.addSong(new Song("Song D", "Jazz"));

        //Метод последовательного воспроизведения
        System.out.println("Sequential Order:");
        Iterator sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        //Метод перемешивания песен
        System.out.println("Shuffle Order:");
        Iterator shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        //Метод фильтрации жанров
        System.out.println("Filter by Genre (Pop):");
        Iterator genreFilterIterator = playlist.getGenreFilterIterator("Pop");
        while (genreFilterIterator.hasNext()) {
            System.out.println(genreFilterIterator.next());
        }
    }
}

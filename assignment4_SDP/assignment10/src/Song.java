//Создаем объект песни для дальнейшего использования в плэйлистах
public class Song {
    //у него должно быть название и жанр
    private String title;
    private String genre;

    //конструктор класса
    public Song(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    //геттер названия
    public String getTitle() {
        return title;
    }

    //геттер жанра
    public String getGenre() {
        return genre;
    }

    //метод тустринг для вывода песни по названию и жанру
    public String toString() {
        return "Song: " + title + " (" + genre + ")";
    }
}

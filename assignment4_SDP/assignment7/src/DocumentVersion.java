//класс для определения версии документа
public class DocumentVersion {
    //финальный контент
    private final String content;

    //конструктор класса
    public DocumentVersion(String content) {
        this.content = content;
    }

    //геттер для контента
    public String getContent() {
        return content;
    }
}

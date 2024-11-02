//Создаем класс документа
public class Document {
    //составляющее контента
    private String content;

    //также конструктор класса
    public Document() {
        this.content = "";
    }

    //метод добавления контента
    public void addContent(String newContent) {
        content += newContent + "\n";
    }

    //геттер для контента
    public String getContent() {
        return content;
    }

    //сохранения этого документа
    public DocumentVersion save() {
        return new DocumentVersion(content);
    }

    //восстановление контента
    public void restore(DocumentVersion version) {
        this.content = version.getContent();
    }
}

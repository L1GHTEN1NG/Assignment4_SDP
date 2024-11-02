//Импортируем библиотеки списков и массивов для создания списка версий
import java.util.ArrayList;
import java.util.List;

//также наш класс для контроля версии
public class VersionControl {
    //создаем список версий
    private List<DocumentVersion> versions = new ArrayList<>();

    //сохраняем данную версию
    public void saveVersion(Document document) {
        versions.add(document.save());//добавляем в список и сохраняем
        System.out.println("Version saved. Total versions: " + versions.size());//количество версий
    }

    //геттер для версии
    public DocumentVersion getVersion(int index) {
        if (index < 0 || index >= versions.size()) {
            System.out.println("Invalid version index");
            return null;
        }
        return versions.get(index); //геттер индекса
    }

    //также метод списка версий и вывода их поочередно
    public void listVersions() {
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1));
        }
    }
}

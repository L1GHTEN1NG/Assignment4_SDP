//Класс Мэйн для показа функицонала
public class Main {
    public static void main(String[] args) {
        //Создаем новый документ
        Document document = new Document();
        //Также контроль версий
        VersionControl versionControl = new VersionControl();

        //Добавляем контент в документ и сохраняем версии
        document.addContent("Version 1: Initial content.");
        versionControl.saveVersion(document);

        document.addContent("Version 2: Added more content.");
        versionControl.saveVersion(document);

        //выводим список
        System.out.println("\nList of versions:");
        versionControl.listVersions();

        // Восстановление документа к первой версии
        System.out.println("\nRestoring to Version 1:");
        document.restore(versionControl.getVersion(0));
        System.out.println("Document Content:\n" + document.getContent());
    }
}

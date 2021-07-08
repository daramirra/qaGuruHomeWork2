package guru.qa;

public class Main {
    public static void main(String[] args) {
        Task task = new Task(13,"qaGuruHomeWork2");
        task.setDescription("Показать через метод main: создание, работу с данными и методами объекта");
        task.setResolved(true);

        System.out.println(task.getCreationDate() + " создана задача с идентификатором " + task.getId());
        System.out.println(task.getCreationDate() + " создана задача с темой " + task.getTitle());
        System.out.println(task.getCreationDate() + " создана задача с описанием \"" + task.getDescription() + "\"");
    }
}

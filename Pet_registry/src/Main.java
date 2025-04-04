import model.AbstractAnimal;
import presenter.Presenter;
import services.FileOperationsImpl;
import view.ConsoleView;

import java.io.IOException;

/*todo
    13.Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
    14. Написать программу, имитирующую работу реестра домашних животных.
    В программе должен быть реализован следующий функционал:
    14.1 Завести новое животное
    14.2 определять животное в правильный класс
    14.3 увидеть список команд, которое выполняет животное
    14.4 обучить животное новым командам
    14.5 Реализовать навигацию по меню
    15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
        значение внутренней int переменной на 1 при нажатие “Завести новое
        животное” Сделайте так, чтобы с объектом такого типа можно было работать в
        блоке try-with-resources. Нужно бросить исключение, если работа с объектом
        типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
        считать в ресурсе try, если при заведения животного заполнены все поля.
*/

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        AbstractAnimal data = new AbstractAnimal();
        FileOperationsImpl fileOperationsImpl = new FileOperationsImpl(); //экземпляр класса, в котором переопределен метод интерфейса FileOperations
        ConsoleView consoleView = new ConsoleView();
        Presenter presenter = new Presenter(data, fileOperationsImpl, consoleView);
        presenter.run();
    }
}
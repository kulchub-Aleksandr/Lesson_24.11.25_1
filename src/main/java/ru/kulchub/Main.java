package ru.kulchub;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
 */
class Dog {

    // поле
    String name;          // ✅ создаем переменную для будущего объекта (поле объекта)

    // методы
    String setName() {
        name = "Рексик ";  // ✅ меняем значение переменной будущего объекта (поле name)
        return name;      // ✅ отправляем значение переменной name по месту вызова этого метода
    }

    String speak() {        // ✔️ метод вернет текст
        return "кричит";
    }

    String speak1() {        // ✔️ метод вернет текст
        return "Ваф!";
    }
    String speak3() {
        return "гулять";
    }
    //"Тузик говорит: Ваф! Я хочу гулять!"
    String speak4() {
        return setName() + speak() + ": " + speak1() + " Я хочу " + speak3();
    }

    static class Test {   // ✔️ создаем тестовый класс

        // ✔️ главный метод main (точка входа)
        public static void main(String[] args) {

            Dog dog1 = new Dog();           // ☑️ создаем "контейнер" (объект) класса Cat
            String message = dog1.speak4(); // ✅ вызываем "зашитый" в него метод (вызывающий другие)
            // результат работы метода сохраняем в строковый объект message
            System.out.println(message);    // ☑️ выводим на экран значение из объекта строки message
        }
    }


}

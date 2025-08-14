package Practice_Inheritance.Task3;

public class Main {
    public static void main(String[] args) {
        Spartans[] army = {
                new Luchniki("Лучник-1", 15, 100, "Узун жаа"),
                new Rytsari("Рыцарь-1", 8, "Узун кылыч", "Темир соот"),
                new Vsadniki("Всадник-1", 12, "Тулпар", "Сулуу найза"),
                new Filosofy("Философ-1", 5, "Республика", "Эркиндик")
        };

        System.out.println("~~~~ Бардык маалыматтар ~~~~");
        for (Spartans s : army) {
            s.showInfo();
            System.out.println();
        }

        System.out.println("~~~~ Сортировка (count боюнча) ~~~~");
        sortByCount(army);

        for (Spartans s : army) {
            s.showInfo();
            System.out.println();
        }
    }

    public static void sortByCount(Spartans[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getCount() > arr[j + 1].getCount()) {
                    Spartans temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

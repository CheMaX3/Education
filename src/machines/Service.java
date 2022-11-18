package machines;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public static void main(String[] args) {

/*        List<SheetBendingPress> presses = new ArrayList();

        presses.add(new SheetBendingPress("Ermaksan", "Speed Bend T3", 2017));
        presses.add(new SheetBendingPress("Durma", "AD-S 40220", 2016));
        presses.add(new SheetBendingPress("KuzLitMash", "IR1330V", 1997));
        presses.add(new SheetBendingPress("TIANSHU", "WE67K-800/7000", 2011));
        presses.add(new SheetBendingPress("KuzLitMash", "IR1330V", 1997));

        System.out.println("Выводим коллекцию по производителю");
        presses.stream().map(SheetBendingPress::getBrand).forEach(System.out::println);
        System.out.println("Фильтруемся по оборудованию старше 2000 года и выводим коллекцию");
        presses.stream().filter(x -> x.getManufacturingYear() > 2000).forEach(x -> System.out.println(x.getBrand()));
        System.out.println("Фильтруемся по модели и выводим производителя этой модели");
        presses.stream().filter(x -> x.getModel().equalsIgnoreCase("ir1330v")).collect(Collectors.toList()).forEach(x -> System.out.println(x.getBrand()));
        System.out.println("Сортировка от самого нового к самому старому");
        presses.stream().sorted((o1, o2) -> o2.getManufacturingYear() - o1.getManufacturingYear()).forEach(System.out::println);
        System.out.println("Сортировка от самого старого к самому новому");
        presses.stream().sorted(Comparator.comparingInt(SheetBendingPress::getManufacturingYear)).forEach(System.out::println);
        System.out.println("Убираем повторяющийся станок из списка и выводим список по производителю");
        presses.stream().distinct().forEach(System.out::println);
*/
        System.out.println("Тест MyArrayList");
        List<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 17; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



        System.out.println("Контрольный ArrayList");
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            list1.add(i);
        }
        list1.forEach(System.out::println);

    }
}
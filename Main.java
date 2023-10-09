package org.example.task4;


import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;
//Дописать третье задание таким образом, чтобы в идентификатор
//        типа Developer записывался объект Frontender, и далее
//        вызывался метод developGUI(),
//        не изменяя существующие интерфейсы,
//        только код основного класса.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Developer> developers = new ArrayList<>();

        int tempInt = rand.nextInt(0, 100);
        for (int i = 0; i < tempInt; i++) {
            if (rand.nextBoolean()) {
                developers.add(new Frontender());
            } else {
                developers.add(new Backender());
            }
        }
        for (Developer developer : developers) {
            Checks.speciality(developer);
        }
//        var test1 = new BackEndProgramming() {
//            @Override
//            public void developAPI() {
//            }
//        };
//
//
//        var test2 = new BackEndProgramming() {
//            @Override
//            public void developAPI() {
//            }
//        };

//        System.out.println(test1.getClass().toString());
//        System.out.println(test2.getClass().toString());
    }

}
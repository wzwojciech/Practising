package org.example;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Wojtek", 2023);

        Worker worker = new Worker("Wojtek", "Zawadzki", "20");
        Worker worker_2 = new Worker("Wojtek", "Zawadzki", "21");

        System.out.println(true);
        System.out.println(worker.equals(worker_2));

        WorkingTime workingTime = new WorkingTime(160.0, 30.0);
        WorkingTime workingTime_2 = new WorkingTime(150.0, 40.0);

        HashMap<Worker, WorkingTime> map = new HashMap<>();

        map.put(worker, workingTime);
        map.put(worker_2, workingTime_2);

        System.out.println(map.entrySet());

        for (Map.Entry<Worker, WorkingTime> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        LocalDate date = LocalDate.of(2023, 8,17);

        date.getMonth();

        HashSet<Person> people = new HashSet<>();

        Person person1 = new Person("Baran", LocalDate.of(2003, 3, 23));

        people.add(new Person("Zawadzki", LocalDate.of(2002, 8, 17)));
        people.add(new Person("Wach", LocalDate.of(2004, 2, 2)));
        people.add(person1);

        System.out.println("Third people exist: " + people.contains(person1));

        for (Person person : people) {
            if (person.birthdate.getYear() <= 2002) {
                System.out.println(person);
            }
        }

        ArrayDeque<String> queue = new ArrayDeque<>();


        for (int i=0; i<= 5; i++){
            queue.offer("Numer " + (i+1) +  " zadania: " + (i+1) );
        }
        Manager manager = new Manager();

        manager.performTasks(queue);

    }
}
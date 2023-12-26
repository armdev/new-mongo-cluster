package io.project.app.people.services;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.github.javafaker.Faker;
import io.project.app.people.domain.People;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class PeopleDataGenerator {

    private static final Faker faker = new Faker();

    public static List<People> generateData(int numberOfRecords) {
        List<People> peoples = new CopyOnWriteArrayList<>();

        ForkJoinPool forkJoinPool = new ForkJoinPool(10); // Adjust the parallelism level as needed

        forkJoinPool.submit(()
                -> IntStream.range(0, numberOfRecords)
                        .parallel()
                        .forEach(i -> {

                            People people = new People();
                            LocalDateTime time = generateRandomTime();
                            String fname = faker.name().firstName();
                            String lname = faker.name().firstName();
                            people.setFirstname(fname);
                            people.setLastname(lname);
                            people.setEmail(fname + "." + lname + "@gmail.com");
                            people.setRegisterDate(time);

                            peoples.add(people);
                        })
        ).join();

        return peoples;
    }

    public static LocalDateTime generateRandomTime() {
        long tenYearsInSeconds = 10L * 365 * 24 * 60 * 60; // 10 years in seconds
        long randomSeconds = new Random().nextLong() % tenYearsInSeconds;

        // Ensure the randomSeconds is positive
        randomSeconds = Math.abs(randomSeconds);

        // Calculate the LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        return now.minusSeconds(randomSeconds);
    }

}

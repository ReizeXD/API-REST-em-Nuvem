package me.dio.bootcampsantander;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
@SpringBootApplication
public class DioBootcampSantanderApplication implements CommandLineRunner {

	 @Autowired
    private Environment env;
	public static void main(String[] args) {
		SpringApplication.run(DioBootcampSantanderApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
        System.out.println("Active Profiles: " + Arrays.toString(env.getActiveProfiles()));
    }
}

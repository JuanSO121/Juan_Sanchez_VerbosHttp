package co.com.sanchez.Juan_Sanchez_VerbosHttp;

import co.com.sanchez.Juan_Sanchez_VerbosHttp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JuanSanchezVerbosHttpApplication {

	@Autowired
	ItemRepository groceryItemRepo;
	public static void main(String[] args) {
		SpringApplication.run(JuanSanchezVerbosHttpApplication.class, args);
	}

}

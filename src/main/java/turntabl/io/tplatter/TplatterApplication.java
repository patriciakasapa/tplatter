package turntabl.io.tplatter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import turntabl.io.tplatter.models.DomainTplatter;
import turntabl.io.tplatter.services.TplatterService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@SpringBootApplication
public class TplatterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TplatterApplication.class, args);
	}
	@Bean
	CommandLineRunner runner (TplatterService tplatterService){
		return args -> {
			//To read the json file and write to the database
			ObjectMapper mapper = new ObjectMapper();
			com.fasterxml.jackson.core.type.TypeReference<List<DomainTplatter>> typeReference = new com.fasterxml.jackson.core.type.TypeReference<List<DomainTplatter>>(){};
			InputStream inputStream =  com.fasterxml.jackson.core.type.TypeReference.class.getResourceAsStream("/json/platterdb.json");
			try {
				List<DomainTplatter> weather = mapper.readValue(inputStream, typeReference);
				tplatterService.save(weather);
				System.out.println("Weather recorded!");
			}catch (IOException e){
				System.out.println("Unable to record weather: " + e.getMessage());
			}
		};
	}

}

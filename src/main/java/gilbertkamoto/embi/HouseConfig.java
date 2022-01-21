package gilbertkamoto.embi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class HouseConfig {

    @Bean
    CommandLineRunner commandLineRunner(HouseRepository repository){
        return args -> {
          House gilbert=  new House(
            1L,
            "gilbert",
            "gilbert@gmail.com",
            "ndirande-blantyre",
                  34
            );
            House mary=  new House(
                    1L,
                    "mary",
                    "mary@gmail.com",
                    "chilobwe-blantyre",
                    37
                    );
            repository.saveAll(
                    List.of(gilbert,mary)
            );
        };
    }
}

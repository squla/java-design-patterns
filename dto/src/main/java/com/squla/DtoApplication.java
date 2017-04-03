package com.squla;

import com.squla.dto.AlbumDTO;
import com.squla.service.AlbumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DtoApplication {
    private static final Logger log = LoggerFactory.getLogger(DtoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DtoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(AlbumService service) {
        return (args) -> {
            service.save(new AlbumDTO().setAlbumTitle("Album Title 1").setArtistName("Artist Name 1"));
            service.save(new AlbumDTO().setAlbumTitle("Album Title 2").setArtistName("Artist Name 2"));
        };
    }
}

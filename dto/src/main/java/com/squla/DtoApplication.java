package com.squla;

import com.squla.dto.AlbumDto;
import com.squla.service.AlbumService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DtoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DtoApplication.class, args);
  }

  /**
   * Load demo data.
   *
   * @param service AlbumService
   * @return lambda with demo data
   */
  @Bean
  public CommandLineRunner demo(AlbumService service) {
    return (args) -> {
      service.save(new AlbumDto().setAlbumTitle("Album Title 1").setArtistName("Artist Name 1"));
      service.save(new AlbumDto().setAlbumTitle("Album Title 2").setArtistName("Artist Name 2"));
    };
  }
}

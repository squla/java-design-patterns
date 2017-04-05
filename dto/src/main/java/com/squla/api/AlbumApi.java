package com.squla.api;

import com.squla.dto.AlbumDto;
import com.squla.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kujbimic on 03.04.17.
 */
@RestController
@RequestMapping(value = "/album")
public class AlbumApi {
  @Autowired
  AlbumService albumService;

  @RequestMapping(value = "", method = RequestMethod.GET)
  List<AlbumDto> findAll() {
    return albumService.findAll();
  }
}

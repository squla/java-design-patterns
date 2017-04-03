package com.squla.api;

import com.squla.dto.AlbumDTO;
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
public class AlbumAPI {
    @Autowired
    AlbumService albumService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    List<AlbumDTO> findAll() {
        return albumService.findAll();
    }
}

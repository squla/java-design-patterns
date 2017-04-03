package com.squla.service;

import com.squla.dto.AlbumDTO;
import com.squla.model.Album;

import java.util.List;

/**
 * Created by kujbimic on 03.04.17.
 */
public interface AlbumService {
    List<AlbumDTO> findAll();

    Album save(AlbumDTO dto);
}

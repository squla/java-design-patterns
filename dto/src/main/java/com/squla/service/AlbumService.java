package com.squla.service;

import com.squla.dto.AlbumDto;
import com.squla.model.Album;

import java.util.List;

/**
 * Created by kujbimic on 03.04.17.
 */
public interface AlbumService {
  List<AlbumDto> findAll();

  Album save(AlbumDto dto);
}

package com.squla.service;

import com.squla.dto.AlbumDto;
import com.squla.model.Album;
import com.squla.model.Artist;
import com.squla.repository.AlbumRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by kujbimic on 03.04.17.
 */
@Service
public class AlbumServiceImpl implements AlbumService {

  @Autowired
  AlbumRepository repository;

  /**
   * @return list of all album.
   */
  public List<AlbumDto> findAll() {
    ModelMapper modelMapper = new ModelMapper();
    LinkedList<AlbumDto> list = new LinkedList<AlbumDto>();
    repository.findAll().forEach(it -> list.add(modelMapper.map(it, AlbumDto.class)));
    return list;
  }

  /**
   * @param dto instance of album dto object to save.
   * @return save object.
   */
  public Album save(AlbumDto dto) {
    Album album = new Album()
        .setArtist(new Artist().setName(dto.getArtistName()))
        .setTitle(dto.getAlbumTitle());

    return repository.save(album);
  }
}

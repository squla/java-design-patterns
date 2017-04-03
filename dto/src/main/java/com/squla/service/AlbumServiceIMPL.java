package com.squla.service;

import com.squla.dto.AlbumDTO;
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
public class AlbumServiceIMPL implements AlbumService {

    @Autowired
    AlbumRepository repository;

    public List<AlbumDTO> findAll() {
        ModelMapper modelMapper = new ModelMapper();
        LinkedList<AlbumDTO> list = new LinkedList<AlbumDTO>();
        repository.findAll().forEach(it -> list.add(modelMapper.map(it, AlbumDTO.class)));
        return list;
    }

    public Album save(AlbumDTO dto) {
        Album album = new Album()
                .setArtist(new Artist().setName(dto.getArtistName()))
                .setTitle(dto.getAlbumTitle());

        return repository.save(album);
    }
}

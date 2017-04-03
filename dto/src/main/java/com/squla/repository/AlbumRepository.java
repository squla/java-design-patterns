package com.squla.repository;

import com.squla.model.Album;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kujbimic on 03.04.17.
 */
public interface AlbumRepository extends CrudRepository<Album, Long> {
}

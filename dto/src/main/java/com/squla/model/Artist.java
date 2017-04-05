package com.squla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by kujbimic on 03.04.17.
 */
@Entity
public class Artist {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long artistId;
  private String name;

  public Long getArtistId() {
    return artistId;
  }

  public Artist setArtistId(Long artistId) {
    this.artistId = artistId;
    return this;
  }

  public String getName() {
    return name;
  }

  public Artist setName(String name) {
    this.name = name;
    return this;
  }
}

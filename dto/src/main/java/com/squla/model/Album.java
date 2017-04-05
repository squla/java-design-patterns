package com.squla.model;

import javax.persistence.*;

/**
 * Created by kujbimic on 03.04.17.
 */
@Entity
public class Album {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long albumId;
  private String title;

  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "artistId")
  private Artist artist;

  public Long getAlbumId() {
    return albumId;
  }

  public Album setAlbumId(Long albumId) {
    this.albumId = albumId;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Album setTitle(String title) {
    this.title = title;
    return this;
  }

  public Artist getArtist() {
    return artist;
  }

  public Album setArtist(Artist artist) {
    this.artist = artist;
    return this;
  }
}

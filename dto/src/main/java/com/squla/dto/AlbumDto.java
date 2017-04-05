package com.squla.dto;

/**
 * Created by kujbimic on 03.04.17.
 */
public class AlbumDto {
  private String albumTitle;
  private String artistName;

  public String getAlbumTitle() {
    return albumTitle;
  }

  public AlbumDto setAlbumTitle(String albumTitle) {
    this.albumTitle = albumTitle;
    return this;
  }

  public String getArtistName() {
    return artistName;
  }

  public AlbumDto setArtistName(String artistName) {
    this.artistName = artistName;
    return this;
  }

  @Override
  public String toString() {
    return "AlbumDto{"
        + "albumTitle='" + albumTitle + '\''
        + ", artistName='" + artistName + '\''
        + '}';
  }
}

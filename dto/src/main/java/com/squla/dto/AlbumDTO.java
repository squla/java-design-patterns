package com.squla.dto;

/**
 * Created by kujbimic on 03.04.17.
 */
public class AlbumDTO {
    private String albumTitle;
    private String artistName;

    public String getAlbumTitle() {
        return albumTitle;
    }

    public AlbumDTO setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
        return this;
    }

    public String getArtistName() {
        return artistName;
    }

    public AlbumDTO setArtistName(String artistName) {
        this.artistName = artistName;
        return this;
    }

    @Override
    public String toString() {
        return "AlbumDTO{" +
                "albumTitle='" + albumTitle + '\'' +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}

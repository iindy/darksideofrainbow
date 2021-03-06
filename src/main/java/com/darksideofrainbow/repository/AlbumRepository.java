package com.darksideofrainbow.repository;

import com.darksideofrainbow.models.Album;
import com.darksideofrainbow.models.Genre;
import java.time.LocalDateTime;
import java.util.List;

public interface AlbumRepository { // extends PagingAndSortingRepository<Album, Long> {
    List<Album> findAll();
    Album find(Long id);
    List<Album> findByName(String name);
    Album create(Album album);
    Album edit(Long id, String name, String artist, LocalDateTime dateReleased, int tracks, Genre genre, Double price);
    Boolean delete(Long id);
}

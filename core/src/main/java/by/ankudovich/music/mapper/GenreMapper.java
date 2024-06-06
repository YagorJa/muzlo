package by.ankudovich.music.mapper;

import by.ankudovich.music.apis.album.AlbumResponse;
import by.ankudovich.music.apis.genres.GenreCreateRequest;
import by.ankudovich.music.apis.genres.GenreResponse;
import by.ankudovich.music.apis.track.TrackResponse;
import by.ankudovich.music.entity.Album;
import by.ankudovich.music.entity.Genres;
import by.ankudovich.music.entity.Track;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GenreMapper {


    GenreResponse toResponse(Genres genre);

    @Mapping(target = "genre", ignore = true)
    @Mapping(target = "artist", ignore = true)
    AlbumResponse toAlbumResponse(Album album);

    @Mapping(target = "artist", ignore = true)
    @Mapping(target = "genre", ignore = true)
    @Mapping(target = "album", ignore = true)
    TrackResponse toSongResponse(Track song);


    Genres toEntity(GenreCreateRequest request);
}
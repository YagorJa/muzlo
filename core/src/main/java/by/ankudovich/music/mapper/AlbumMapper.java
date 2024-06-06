package by.ankudovich.music.mapper;

import by.ankudovich.music.apis.album.AlbumCreateRequest;
import by.ankudovich.music.apis.album.AlbumResponse;
import by.ankudovich.music.apis.artist.ArtistResponse;
import by.ankudovich.music.apis.genres.GenreResponse;
import by.ankudovich.music.entity.Album;
import by.ankudovich.music.entity.Artist;
import by.ankudovich.music.entity.Genres;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AlbumMapper {

    public AlbumResponse toResponse(Album album);

    @Mapping(target = "albums", ignore = true)
    @Mapping(target = "songs", ignore = true)
    ArtistResponse toArtistResponse(Artist artist);

    @Mapping(target = "albums", ignore = true)
    @Mapping(target = "songs", ignore = true)
    GenreResponse toGenreResponse(Genres genre);

    public Album toEntity(AlbumCreateRequest albumCreateRequest);
}

package by.ankudovich.music.mapper;

import by.ankudovich.music.apis.album.AlbumResponse;
import by.ankudovich.music.apis.track.TrackResponse;
import by.ankudovich.music.entity.Album;
import by.ankudovich.music.entity.Artist;
import by.ankudovich.music.apis.artist.ArtistCreateRequest;
import by.ankudovich.music.apis.artist.ArtistResponse;
import by.ankudovich.music.apis.artist.ArtistUpdateRequest;
import by.ankudovich.music.entity.Track;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ArtistMapper {

    ArtistResponse toResponse(Artist artist);

    @Mapping(target = "genre", ignore = true)
    @Mapping(target = "artist", ignore = true)
    AlbumResponse toAlbumResponse(Album album);

    @Mapping(target = "artist",ignore = true)
    @Mapping(target = "album", ignore = true)
    @Mapping(target = "genre", ignore = true)
    TrackResponse toTrackResponse(Track track);
    Artist toEntity(ArtistCreateRequest artistCreateRequest);
//
//    Artist toEntity(ArtistCreateRequest artistCreateRequest);

//    @Mapping(target = "id", ignore = true)
//    void updateService(@MappingTarget Artist artist, ArtistUpdateRequest artistUpdateReqeust);
}

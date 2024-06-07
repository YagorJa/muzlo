package by.ankudovich.music.mapper;

import by.ankudovich.music.apis.track.TrackCreateRequest;
import by.ankudovich.music.apis.track.TrackResponse;
import by.ankudovich.music.entity.Track;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TrackMapper {
    @Mapping(target = "artist.songs",  ignore = true)
    @Mapping(target = "artist.albums", ignore = true)
    @Mapping(target = "album.artist", ignore = true)
    @Mapping(target = "album.genre", ignore = true)
    @Mapping(target = "genre.albums", ignore = true)
    @Mapping(target = "genre.songs", ignore = true)
    TrackResponse toResponse(Track track);
    Track toEntity(TrackCreateRequest trackCreateRequest);
}

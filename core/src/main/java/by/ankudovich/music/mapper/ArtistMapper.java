package by.ankudovich.music.mapper;

import by.ankudovich.music.entity.Artist;
import by.ankudovich.music.apis.artist.ArtistCreateRequest;
import by.ankudovich.music.apis.artist.ArtistResponse;
import by.ankudovich.music.apis.artist.ArtistUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ArtistMapper {
    ArtistResponse toResponse(Artist artist);

    Artist toEntity(ArtistCreateRequest artistCreateRequest);

//    @Mapping(target = "id", ignore = true)
    void updateService(@MappingTarget Artist artist, ArtistUpdateRequest artistUpdateReqeust);
}

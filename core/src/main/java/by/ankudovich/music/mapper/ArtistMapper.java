package by.ankudovich.music.mapper;

import by.ankudovich.music.entity.Artist;
import by.ankudovich.music.service.ArtistCreateRequest;
import by.ankudovich.music.service.ArtistResponse;
import by.ankudovich.music.service.ArtistUpdateReqeust;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ArtistMapper {
    ArtistResponse toResponse(Artist artist);

    Artist toEntity(ArtistCreateRequest artistCreateRequest);

//    @Mapping(target = "id", ignore = true)
    void updateService(@MappingTarget Artist artist, ArtistUpdateReqeust artistUpdateReqeust);
}

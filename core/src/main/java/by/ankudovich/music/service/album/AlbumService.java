package by.ankudovich.music.service.album;

import by.ankudovich.music.apis.album.AlbumCreateRequest;
import by.ankudovich.music.apis.album.AlbumResponse;

public interface AlbumService {
    public AlbumResponse addAlbum(AlbumCreateRequest request);
    public AlbumResponse getAlbum(Long id);
}

package by.ankudovich.music.controller;

import by.ankudovich.music.apis.album.AlbumCreateRequest;
import by.ankudovich.music.apis.album.AlbumResponse;
import by.ankudovich.music.exception.UniversalException;
import by.ankudovich.music.service.album.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("album")
public class AlbumRestController {
    private final AlbumService albumService;

    @Transactional
    @PostMapping("/add")
    public AlbumResponse addAlbum(@RequestBody AlbumCreateRequest request) {
        return albumService.addAlbum(request);
    }

    @GetMapping("/get/{id}")
    public AlbumResponse getAlbum(@PathVariable Long id) {
        var album = albumService.getAlbum(id);
        if (album == null) {
            throw new UniversalException("Album not found");
        }
        return album;
    }
}
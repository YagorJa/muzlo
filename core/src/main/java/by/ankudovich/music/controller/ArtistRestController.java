package by.ankudovich.music.controller;

import by.ankudovich.music.aspect.Logg;
import by.ankudovich.music.apis.artist.ArtistCreateRequest;
import by.ankudovich.music.apis.artist.ArtistResponse;
import by.ankudovich.music.apis.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("artists")
public class ArtistRestController {

    private final ArtistService artistService;

    @PostMapping
    @Logg
    public ArtistResponse addArtist(@RequestBody ArtistCreateRequest createRequest) {
        return artistService.addArtist(createRequest);
    }

    @GetMapping
    @Logg
    public Collection<ArtistResponse> services() {
        return artistService.getArtists();
    }


}
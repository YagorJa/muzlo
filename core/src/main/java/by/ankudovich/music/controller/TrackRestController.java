package by.ankudovich.music.controller;

import by.ankudovich.music.apis.track.TrackCreateRequest;
import by.ankudovich.music.apis.track.TrackResponse;
import by.ankudovich.music.exception.UniversalException;
import by.ankudovich.music.service.track.TrackService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("track")
@RequiredArgsConstructor
public class TrackRestController {
    private final TrackService trackService;

    @Transactional
    @PostMapping
    public TrackResponse add(@RequestBody TrackCreateRequest request){
        return trackService.add(request);
    }

    @GetMapping("/findByArtistId/{id}")
    public Collection<TrackResponse> getSongByArtistId(@PathVariable("id") Long artistId){
        return trackService.getSongsByArtistId(artistId);
    }

    @GetMapping("/song/{id}")
    public TrackResponse getSongById(@PathVariable("id") Long id){
        TrackResponse songById = trackService.getTrackById(id);
        if(songById == null)
            throw new UniversalException("песня не существует");
        return songById;
    }
}

package by.ankudovich.music.controller;

import by.ankudovich.music.apis.genres.GenreCreateRequest;
import by.ankudovich.music.apis.genres.GenreResponse;
import by.ankudovich.music.exception.UniversalException;
import by.ankudovich.music.service.album.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("genres")
public class GenreRestController {
    private final GenreService genreService;
    @Transactional
    @PostMapping("/add")
    public GenreResponse addGenre(@RequestBody GenreCreateRequest request){
        return genreService.addGenre(request);
    }

    @GetMapping("/get/{id}")
    public GenreResponse getGenre(@PathVariable Long id){
        var genre =  genreService.getGenre(id);
        if(genre == null){
            throw new UniversalException("жанр не существует");
        }
        return genre;
    }
}

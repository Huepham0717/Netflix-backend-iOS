package rmit.ios.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.ios.backend.entity.SaveList;
import rmit.ios.backend.repository.SaveListRepository;
import rmit.ios.backend.service.SaveListService;

import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping(path = "/saveList")
public class SaveListController {
    @Autowired
    private final SaveListService saveListService;
    @Autowired
    private final SaveListRepository saveListRepository;
    @Autowired
    public SaveListController(SaveListService saveListService, SaveListRepository saveListRepository){
        this.saveListService = saveListService;
        this.saveListRepository = saveListRepository;
    }

    @PutMapping(path="update/{userName}/{movieId}")
    public String updateSaveList(
            @PathVariable("userName") String userName,
            @PathVariable("movieId") Long movieId){
        return saveListService.addMovieToSaveList(userName,movieId);
    }
    @GetMapping
    public Set<SaveList> getSaveList(){
        return saveListRepository.getAll();
    }

    @GetMapping(path = "userName/{userName}")
    public Set<SaveList> loadUserByUserName(@PathVariable("userName") String userName) {
        return saveListService.loadSaveListByUserName(userName);
    }
}

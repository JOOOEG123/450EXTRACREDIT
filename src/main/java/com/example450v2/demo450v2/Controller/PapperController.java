package com.example450v2.demo450v2.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;    
import org.springframework.web.bind.annotation.RestController;  
import java.util.List;
import java.util.Optional;

import com.example450v2.demo450v2.Entity.Publications;
import com.example450v2.demo450v2.service.PaperService; 
@RestController
public class PapperController {
    @Autowired
    private PaperService paperService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Publications> getAllPublications() {
        return paperService.getAllPublications();
    }
    @RequestMapping(value = "/paper", method = RequestMethod.POST)
    public void addPublication(@RequestBody Publications publication) {
        paperService.addPublication(publication);
    }
    @RequestMapping(value = "/paper/{publicationid}", method = RequestMethod.GET)
    public Optional<Publications> getPublication(@PathVariable("publicationid") String publicationid) {
        return paperService.getPublication(publicationid);
    }
    @RequestMapping(value = "/paper/title/{title}", method = RequestMethod.GET)
    public List<Publications> getPublicationByTitle(@PathVariable("title") String title) {
        return paperService.getPublicationByTitle(title);
    }

    // @RequestMapping(value = "/paper", method = RequestMethod.POST)
    // public void addPublication(@RequestBody Publications publication) {
    //     paperService.addPublication(publication);
    // }
    // @RequestMapping(value = "/paper/{PUBLICATIONID}", method = RequestMethod.GET)
    // public Optional<Publications> getPublication(String PUBLICATIONID) {
    //     return paperService.getPublication(PUBLICATIONID);
    // }

}

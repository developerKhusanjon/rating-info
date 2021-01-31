package io.developerkhusanjon.ratinginfo.resources;

import io.developerkhusanjon.ratinginfo.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalog {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getMovieList(@PathVariable("userId") String userId){
        return Collections.singletonList(
                new CatalogItem("Hackers","Documentary",9)
        );
    }
}

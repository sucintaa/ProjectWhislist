/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wishlist;

/**
 *
 * @author palan
 */
// A controller is the part of spring Boot that receives HHTP request from postman or the fornend

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class ScrapeController {
    
    @Autowired
    private ScrapeService scrapeService;
    
    @PostMapping("/scrape")
    public String scrape(@RequestBody ScrapeRequest request){
        String url =request.getUrl();
        return scrapeService.processUrl(url);
    }
}

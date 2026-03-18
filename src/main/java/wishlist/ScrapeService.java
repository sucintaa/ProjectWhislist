/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wishlist;

/**
 *
 * @author palan
 */
import org.springframework.stereotype.Service;

@Service
public class ScrapeService {
    public String processUrl(String url){
        System.out.println("Received URL:" + url);
        return "Processed:"+url;
    } 
}

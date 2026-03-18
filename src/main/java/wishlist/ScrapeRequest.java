/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wishlist;

/**
 *
 * @author palan
 */
//lets spring take JSON (json to java container)
public class ScrapeRequest {
    private String url;
     public String getUrl(){
         return url;
     }
     public void setUrl(String url){
         this.url =url;
     }  
}

import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;
import java.net.URL;

public class ParseURL{
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.google.com/images");

            //the url is composed of a protocol, a host and a path.
            //Ex:- http://www.google.com/images
            //    protocol     host       path
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
        }catch(MalformedURLException e){
            System.out.println(e.getMessage());
        }
        
    }
}
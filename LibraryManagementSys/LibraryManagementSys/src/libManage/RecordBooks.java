package libManage;

/**
 * @author Charles Brady
 * 
 * Last updated 2/20
*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

public class RecordBooks {
    
    public static void add(BookObject bookObject) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("books.txt", "UTF-8");
        writer.println(bookObject.author);
        writer.println(bookObject.imageLink);
        writer.println(bookObject.title);

    }
    
}

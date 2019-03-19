import java.sql.Timestamp;
import org.json.JSONObject;
import org.json.JSONException;

public class Push{
   public static void main(String[] args){
     String path = "/2013-09-01/push";
     String applicationKey = "d288714a5a801f4ccaaac99c87df41d35e38b5804a9ecbcd2026c1901e914fc0";
     Timestamp ts = new Timestamp(System.currentTimeMillis());
     JSONObject data = new JSONObject();
     data.put("immediateDeliveryFlag", true);
     String[] target = {"ios"};
     data.put("target", target);
     data.put("message", "Hello");
     String clientKey = "3395ea58a34af1edb5009c9d15b3379761539ef3c8eb0ee0d797274e122359b8";
     Signature s = new Signature();
     String results = s.post(path, applicationKey, ts, data, clientKey);
     System.out.println(results);
   }
}

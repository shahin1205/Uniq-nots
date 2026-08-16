package practice2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserConroller {
    public void controller() throws JsonProcessingException {

        String json =
                 "{\"userID\":1,\"userName\":\"Shahin\",\"phoneNumber\":1000},";
        ObjectMapper mapper=new ObjectMapper();

        User user=mapper.readValue(json,User.class);

        System.out.println("UserID - "+user.userID+" User name - "+user.userName+" PhoneNumber - "+user.phoneNumber);

       ////object to json
        System.out.println("Object to json");
        String json2=mapper.writeValueAsString(user);
        System.out.println(json2);
    }


}

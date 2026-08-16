package jsontoobjecct;

import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonToObject {
    public static void main(String[] args) throws JsonProcessingException {
        Controller controller = new Controller();

        controller.jsonToObject();
        controller.objectToJson();
    }
}

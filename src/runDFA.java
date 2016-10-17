import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;


public class runDFA {
    public static void parser() throws IOException, ParseException, JSONException {
        File file = new File("resources/examples.json");
        String fileData = FileUtils.readFileToString(file).replace("\\","").replaceFirst("\"","");
        JSONArray array = new JSONArray(fileData);
        for (int i = 0;i < array.length();i++){
            JSONObject jsonObject = (JSONObject) array.get(i);
            System.out.println("jsonObject = " + jsonObject.);
            System.out.println("array["+i+"] = " + array.get(i));
        }
    }
    public static void main(String[] args) throws IOException, JSONException, ParseException {
        HashMap<String,HashMap<Character,String>> state = new HashMap<String,HashMap<Character,String>>();
        HashMap<Character,String> transition_for_q1 = new HashMap<Character,String>();
        HashMap<Character,String> transition_for_q2 = new HashMap<Character,String>();
        transition_for_q1.put('0',"q2");
        transition_for_q1.put('1',"q1");
        transition_for_q2.put('0',"q1");
        transition_for_q2.put('1',"q2");
        DFA_Generator machine_1  = new DFA_Generator(state);
        machine_1.addStateAndTransition("q1",transition_for_q1);
        machine_1.addStateAndTransition("q2",transition_for_q2);
        boolean result = machine_1.calculateFinalState("q1","0001","q1");
        System.out.println("result = " + result);
        parser();
    }

}

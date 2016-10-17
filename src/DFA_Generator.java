import java.util.HashMap;
import java.util.Objects;

public class DFA_Generator {
    private HashMap<String,HashMap<Character,String>> DFA_machine;
    public DFA_Generator(HashMap<String,HashMap<Character,String>> machine){
        this.DFA_machine = machine;
    }

    public void addStateAndTransition(String state,HashMap<Character,String> transitionFunction){
        DFA_machine.put(state,transitionFunction);
    }

    public boolean calculateFinalState(String startState, String language, String finalState) {
        while(language.length() != 0){
            String[] parts = language.split("");
            startState = transitState(DFA_machine.get(startState), parts[0].charAt(0));
            language = language.substring(1, language.length());
        }
        return Objects.equals(startState, finalState);
    }

    private String transitState(HashMap<Character,String> value, char key){
        return value.get(key);
    }
}

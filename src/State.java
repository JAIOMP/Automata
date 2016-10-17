public class State {
    private boolean finalState = false;
    private String state;
    private boolean acceptState = false;
    public State(String input){
        this.state = input;
    }
    public boolean isFinalState() {
        return finalState;
    }
    public void setFinalState(boolean finalState) {
        this.finalState = finalState;
    }
    public boolean isAcceptState() {
        return acceptState;
    }
    public void setAcceptState(boolean acceptState) {
        this.acceptState = acceptState;
    }
}

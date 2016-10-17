public class Transition<T> {
    private State input;
    private T symbol;
    private State output;

    public Transition(State input, T symbol, State output){
        this.input = input;
        this.symbol = symbol;
        this.output = output;
    }
    public State getInputState() {
        return input;
    }

    public T getSymbol() {
        return symbol;
    }

    public State getOutputState() {
        return output;
    }
}

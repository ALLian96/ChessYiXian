package Model;

public abstract class State {
    String name;
    String effect;

    public State(String name,String effect){
        this.name = name;
        this.effect = effect;
    }

    public void handleEffect(String effect) {

    }

}

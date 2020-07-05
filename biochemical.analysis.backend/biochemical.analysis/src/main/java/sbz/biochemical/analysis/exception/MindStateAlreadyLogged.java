package sbz.biochemical.analysis.exception;

public class MindStateAlreadyLogged extends Exception {
    public MindStateAlreadyLogged(){
        super("You already logged your daily mind state for today.");
    }
}

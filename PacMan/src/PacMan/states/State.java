
package PacMan.states;

import java.awt.Graphics;
import PacMan.Game;
import PacMan.Handler;


public abstract class State {
    
    public static State currentState = null;
    protected Handler handler;
    
    public State(Handler handler)
    {
        this.handler = handler;
    }
    public static State getCurrentState() {
        return currentState;
    }

    public static void setCurrentState(State currentState) {
        State.currentState = currentState;
    }
    
    
    
    public abstract void tick();
    public abstract void render(Graphics g);
    
}

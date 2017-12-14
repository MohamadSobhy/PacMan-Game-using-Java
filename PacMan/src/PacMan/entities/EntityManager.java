
package PacMan.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import PacMan.Handler;
import PacMan.entities.creature.Beast;
import PacMan.entities.creature.BeastUp;
import PacMan.entities.creature.Player;
import PacMan.entities.statics.Food;

public class EntityManager {
    
    private Handler handler;
    private Player player;
    private ArrayList<Entity> entities;

    public EntityManager(Handler handler, Player player) {
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<>();

        if( handler.getGame().getWorldNumber() == 1 ){
            EntitiesOfWorld1();
        }
        else{
            EntitiesOfWorld2();
        }
        
        
        addEntity(player);
    }
    
    
    public void tick()
    {
        for(int i = 0 ; i < entities.size() ; i++){
            Entity e = entities.get(i);
            e.tick();
            if(!e.isActive())
                entities.remove(e);
        }
    }
    
    public void render(Graphics g)
    {
        for(Entity e : entities){
            e.render(g);
        }
    }

    public void addEntity(Entity e)
    {
        entities.add(e);
    }
    
    
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
    
    private void EntitiesOfWorld1(){
        
        
        //Food 
        
        
        addEntity(new Food(handler, 64, 64));
        addEntity(new Food(handler, 110 , 64));
        addEntity(new Food(handler, 164 , 64 ));
        addEntity(new Food(handler, 228 , 64 ));
        addEntity(new Food(handler, 292 , 64 ));
        addEntity(new Food(handler, 356 , 64 ));
        addEntity(new Food(handler, 420 , 64 ));
        addEntity(new Food(handler, 484 , 64 ));
        addEntity(new Food(handler, 548 , 64 ));
        addEntity(new Food(handler, 612 , 64 ));
        addEntity(new Food(handler, 676 , 64 ));
        addEntity(new Food(handler, 740 , 64 ));
        addEntity(new Food(handler, 804 , 64 ));
        addEntity(new Food(handler, 868 , 64 ));
        addEntity(new Food(handler, 932 , 64 ));
        addEntity(new Food(handler, 996 , 64 ));
        addEntity(new Food(handler, 1064 , 64 ));
        addEntity(new Food(handler, 1128 , 64 ));
        
        
        addEntity(new Food(handler, 64, 128));
        addEntity(new Food(handler, 110 , 128));
        addEntity(new Food(handler, 164 , 128 ));
        addEntity(new Food(handler, 228 , 128 ));
        addEntity(new Food(handler, 292 , 128 ));
        addEntity(new Food(handler, 356 , 128 ));
        addEntity(new Food(handler, 420 , 128 ));
        addEntity(new Food(handler, 484 , 128 ));
        addEntity(new Food(handler, 548 , 128 ));
        addEntity(new Food(handler, 612 , 128 ));
        addEntity(new Food(handler, 676 , 128 ));
        addEntity(new Food(handler, 740 , 128 ));
        addEntity(new Food(handler, 804 , 128 ));
        addEntity(new Food(handler, 868 , 128 ));
        addEntity(new Food(handler, 932 , 128 ));
        addEntity(new Food(handler, 996 , 128 ));
        addEntity(new Food(handler, 1064 , 128 ));
        addEntity(new Food(handler, 1128 , 128 ));
        
        
        
        addEntity(new Food(handler, 64, 384));
        addEntity(new Food(handler, 128 , 384));
        addEntity(new Food(handler, 256 , 384 ));
        addEntity(new Food(handler, 320 , 384 ));
        addEntity(new Food(handler, 448 , 384 ));
        addEntity(new Food(handler, 512 , 384 ));
        addEntity(new Food(handler, 576 , 384 ));
        addEntity(new Food(handler, 640 , 384 ));
        addEntity(new Food(handler, 704 , 384 ));
        addEntity(new Food(handler, 768 , 384 ));
        addEntity(new Food(handler, 832 , 384 ));
        addEntity(new Food(handler, 964 , 384 ));
        addEntity(new Food(handler, 1096 , 384 ));
        addEntity(new Food(handler, 1150 , 384 ));
        
        
        addEntity(new Food(handler, 64, 448));
        addEntity(new Food(handler, 128 , 448));
        addEntity(new Food(handler, 256 , 448 ));
        addEntity(new Food(handler, 320 , 448 ));
        addEntity(new Food(handler, 448 , 448 ));
        addEntity(new Food(handler, 512 , 448 ));
        addEntity(new Food(handler, 576 , 448 ));
        addEntity(new Food(handler, 640 , 448 ));
        addEntity(new Food(handler, 704 , 448 ));
        addEntity(new Food(handler, 768 , 448 ));
        addEntity(new Food(handler, 832 , 448 ));
        addEntity(new Food(handler, 964 , 448 ));
        addEntity(new Food(handler, 1096 , 448 ));
        addEntity(new Food(handler, 1150 , 448 ));
        
        
        addEntity(new Food(handler, 64, 704));
        addEntity(new Food(handler, 128 , 704));
        addEntity(new Food(handler, 256 , 704 ));
        addEntity(new Food(handler, 320 , 704 ));
        addEntity(new Food(handler, 448 , 704 ));
        addEntity(new Food(handler, 512 , 704 ));
        addEntity(new Food(handler, 576 , 704 ));
        addEntity(new Food(handler, 640 , 704 ));
        addEntity(new Food(handler, 704 , 704 ));
        addEntity(new Food(handler, 768 , 704 ));
        addEntity(new Food(handler, 832 , 704 ));
        addEntity(new Food(handler, 964 , 704 ));
        addEntity(new Food(handler, 1096 , 704 ));
        addEntity(new Food(handler, 1150 , 704 ));
        
        
        addEntity(new Food(handler, 64, 768));
        addEntity(new Food(handler, 128 , 768));
        addEntity(new Food(handler, 256 , 768 ));
        addEntity(new Food(handler, 320 , 768 ));
        addEntity(new Food(handler, 448 , 768 ));
        addEntity(new Food(handler, 512 , 768 ));
        addEntity(new Food(handler, 576 , 768 ));
        addEntity(new Food(handler, 640 , 768 ));
        addEntity(new Food(handler, 704 , 768 ));
        addEntity(new Food(handler, 768 , 768 ));
        addEntity(new Food(handler, 832 , 768 ));
        addEntity(new Food(handler, 964 , 768 ));
        addEntity(new Food(handler, 1096 , 768 ));
        addEntity(new Food(handler, 1150 , 768 ));
        
        
        
        addEntity(new Food(handler, 64, 832));
        addEntity(new Food(handler, 128 , 832));
        addEntity(new Food(handler, 256 , 832 ));
        addEntity(new Food(handler, 320 , 832 ));
        addEntity(new Food(handler, 448 , 832 ));
        addEntity(new Food(handler, 512 , 832 ));
        addEntity(new Food(handler, 576 , 832 ));
        addEntity(new Food(handler, 640 , 832 ));
        addEntity(new Food(handler, 704 , 832 ));
        addEntity(new Food(handler, 768 , 832 ));
        addEntity(new Food(handler, 832 , 832 ));
        addEntity(new Food(handler, 964 , 832 ));
        addEntity(new Food(handler, 1096 , 832 ));
        addEntity(new Food(handler, 1150 , 832 ));
        
        
        addEntity(new Food(handler, 64, 1096));
        addEntity(new Food(handler, 128 , 1096));
        addEntity(new Food(handler, 192 , 1096));
        addEntity(new Food(handler, 256 , 1096 ));
        addEntity(new Food(handler, 320 , 1096 ));
        addEntity(new Food(handler, 384 , 1096));
        addEntity(new Food(handler, 448 , 1096 ));
        addEntity(new Food(handler, 512 , 1096 ));
        addEntity(new Food(handler, 576 , 1096 ));
        addEntity(new Food(handler, 640 , 1096 ));
        addEntity(new Food(handler, 704 , 1096 ));
        addEntity(new Food(handler, 768 , 1096 ));
        addEntity(new Food(handler, 832 , 1096 ));
        addEntity(new Food(handler, 896 , 1096));
        addEntity(new Food(handler, 964 , 1096 ));
        addEntity(new Food(handler, 1028 , 1096));
        addEntity(new Food(handler, 1096 , 1096 ));
        addEntity(new Food(handler, 1150 , 1096 ));
        
        
        
        addEntity(new Food(handler, 64, 1150));
        addEntity(new Food(handler, 128 , 1150));
        addEntity(new Food(handler, 192 , 1150));
        addEntity(new Food(handler, 256 , 1150 ));
        addEntity(new Food(handler, 320 , 1150 ));
        addEntity(new Food(handler, 384 , 1150));
        addEntity(new Food(handler, 448 , 1150 ));
        addEntity(new Food(handler, 512 , 1150 ));
        addEntity(new Food(handler, 576 , 1150 ));
        addEntity(new Food(handler, 640 , 1150 ));
        addEntity(new Food(handler, 704 , 1150 ));
        addEntity(new Food(handler, 768 , 1150 ));
        addEntity(new Food(handler, 832 , 1150 ));
        addEntity(new Food(handler, 896 , 1150));
        addEntity(new Food(handler, 964 , 1150 ));
        addEntity(new Food(handler, 1028 , 1150));
        addEntity(new Food(handler, 1096 , 1150 ));
        addEntity(new Food(handler, 1150 , 1150 ));
        
        
        
        addEntity(new Food(handler, 64, 512));
        addEntity(new Food(handler, 128 , 512));
        addEntity(new Food(handler, 192 , 512));
        addEntity(new Food(handler, 256 , 512 ));
        addEntity(new Food(handler, 320 , 512 ));
        addEntity(new Food(handler, 448 , 512 ));
        addEntity(new Food(handler, 512 , 512 ));
        addEntity(new Food(handler, 576 , 512 ));
        addEntity(new Food(handler, 640 , 512 ));
        addEntity(new Food(handler, 704 , 512 ));
        addEntity(new Food(handler, 768 , 512 ));
        addEntity(new Food(handler, 832 , 512 ));
        addEntity(new Food(handler, 964 , 512 ));
        addEntity(new Food(handler, 1032 , 512));
        addEntity(new Food(handler, 1096 , 512 ));
        addEntity(new Food(handler, 1150 , 512 ));
        
        addEntity(new Food(handler, 64, 256));
        addEntity(new Food(handler, 128 , 256));
        addEntity(new Food(handler, 292 , 256 ));
        addEntity(new Food(handler, 356 , 256 ));
        addEntity(new Food(handler, 420 , 256 ));
        addEntity(new Food(handler, 484 , 256 ));
        addEntity(new Food(handler, 548 , 256 ));
        addEntity(new Food(handler, 612 , 256 ));
        addEntity(new Food(handler, 676 , 256 ));
        addEntity(new Food(handler, 740 , 256 ));
        addEntity(new Food(handler, 804 , 256 ));
        addEntity(new Food(handler, 868 , 256 ));
        addEntity(new Food(handler, 932 , 256 ));
        addEntity(new Food(handler, 1096 , 256 ));
        addEntity(new Food(handler, 1150 , 256 ));
        
        
        addEntity(new Food(handler, 64, 576));
        addEntity(new Food(handler, 110 , 576));
        addEntity(new Food(handler, 164 , 576 ));
        addEntity(new Food(handler, 228 , 576 ));
        addEntity(new Food(handler, 292 , 576 ));
        addEntity(new Food(handler, 356 , 576 ));
        addEntity(new Food(handler, 420 , 576 ));
        addEntity(new Food(handler, 484 , 576 ));
        addEntity(new Food(handler, 548 , 576 ));
        addEntity(new Food(handler, 740 , 576 ));
        addEntity(new Food(handler, 804 , 576 ));
        addEntity(new Food(handler, 868 , 576 ));
        addEntity(new Food(handler, 932 , 576 ));
        addEntity(new Food(handler, 996 , 576 ));
        addEntity(new Food(handler, 1064 , 576 ));
        addEntity(new Food(handler, 1128 , 576 ));
        
        
        addEntity(new Food(handler, 64, 640));
        addEntity(new Food(handler, 110 , 640));
        addEntity(new Food(handler, 164 , 640 ));
        addEntity(new Food(handler, 228 , 640 ));
        addEntity(new Food(handler, 292 , 640 ));
        addEntity(new Food(handler, 356 , 640 ));
        addEntity(new Food(handler, 420 , 640 ));
        addEntity(new Food(handler, 484 , 640 ));
        addEntity(new Food(handler, 548 , 640 ));
        addEntity(new Food(handler, 740 , 640 ));
        addEntity(new Food(handler, 804 , 640 ));
        addEntity(new Food(handler, 868 , 640 ));
        addEntity(new Food(handler, 932 , 640 ));
        addEntity(new Food(handler, 996 , 640 ));
        addEntity(new Food(handler, 1064 , 640 ));
        addEntity(new Food(handler, 1128 , 640 ));
        
        
        addEntity(new Food(handler, 292 , 960 ));
        addEntity(new Food(handler, 356 , 960 ));
        addEntity(new Food(handler, 420 , 960 ));
        addEntity(new Food(handler, 484 , 960 ));
        addEntity(new Food(handler, 548 , 960 ));
        addEntity(new Food(handler, 612 , 960 ));
        addEntity(new Food(handler, 676 , 960 ));
        addEntity(new Food(handler, 740 , 960 ));
        addEntity(new Food(handler, 804 , 960 ));
        addEntity(new Food(handler, 868 , 960 ));
        addEntity(new Food(handler, 932 , 960 ));
        
        
        
        
        
        //Beasts
        
        
        addEntity(new Beast(handler, 64 , 64 ));
        addEntity(new Beast(handler, 256, 256 ));
        addEntity(new Beast(handler, 64, 600));
        addEntity(new Beast(handler, 256, 960));
        addEntity(new Beast(handler, 960, 1152));
        addEntity(new BeastUp(handler , 64 , 164 ));
        addEntity(new BeastUp(handler , 640 , 64 ));
        addEntity(new BeastUp(handler , 320 , 320 ));
        addEntity(new BeastUp(handler , 960 , 320 ));
        addEntity(new BeastUp(handler , 1152 , 384 ));
        
    }
    
    
    private void EntitiesOfWorld2(){
        
        
        //Food 
        
        
        addEntity(new Food(handler, 64, 64));
        addEntity(new Food(handler, 110 , 64));
        addEntity(new Food(handler, 164 , 64 ));
        addEntity(new Food(handler, 228 , 64 ));
        addEntity(new Food(handler, 292 , 64 ));
        addEntity(new Food(handler, 356 , 64 ));
        addEntity(new Food(handler, 420 , 64 ));
        addEntity(new Food(handler, 484 , 64 ));
        addEntity(new Food(handler, 548 , 64 ));
        addEntity(new Food(handler, 612 , 64 ));
        addEntity(new Food(handler, 676 , 64 ));
        addEntity(new Food(handler, 740 , 64 ));
        addEntity(new Food(handler, 804 , 64 ));
        addEntity(new Food(handler, 868 , 64 ));
        addEntity(new Food(handler, 932 , 64 ));
        addEntity(new Food(handler, 996 , 64 ));
        addEntity(new Food(handler, 1064 , 64 ));
        addEntity(new Food(handler, 1128 , 64 ));
        
        
        addEntity(new Food(handler, 64, 128));
        addEntity(new Food(handler, 110 , 128));
        addEntity(new Food(handler, 164 , 128 ));
        addEntity(new Food(handler, 228 , 128 ));
        addEntity(new Food(handler, 292 , 128 ));
        addEntity(new Food(handler, 356 , 128 ));
        addEntity(new Food(handler, 420 , 128 ));
        addEntity(new Food(handler, 484 , 128 ));
        addEntity(new Food(handler, 548 , 128 ));
        addEntity(new Food(handler, 612 , 128 ));
        addEntity(new Food(handler, 676 , 128 ));
        addEntity(new Food(handler, 740 , 128 ));
        addEntity(new Food(handler, 804 , 128 ));
        addEntity(new Food(handler, 868 , 128 ));
        addEntity(new Food(handler, 932 , 128 ));
        addEntity(new Food(handler, 996 , 128 ));
        addEntity(new Food(handler, 1064 , 128 ));
        addEntity(new Food(handler, 1128 , 128 ));
        
        
        
        addEntity(new Food(handler, 64, 384));
        addEntity(new Food(handler, 128 , 384));
        addEntity(new Food(handler, 256 , 384 ));
        addEntity(new Food(handler, 320 , 384 ));
        addEntity(new Food(handler, 448 , 384 ));
        addEntity(new Food(handler, 512 , 384 ));
        addEntity(new Food(handler, 576 , 384 ));
        addEntity(new Food(handler, 640 , 384 ));
        addEntity(new Food(handler, 704 , 384 ));
        addEntity(new Food(handler, 768 , 384 ));
        addEntity(new Food(handler, 964 , 384 ));
        addEntity(new Food(handler, 1096 , 384 ));
        addEntity(new Food(handler, 1150 , 384 ));
        
        
        addEntity(new Food(handler, 64, 448));
        addEntity(new Food(handler, 128 , 448));
        addEntity(new Food(handler, 256 , 448 ));
        addEntity(new Food(handler, 320 , 448 ));
        addEntity(new Food(handler, 448 , 448 ));
        addEntity(new Food(handler, 512 , 448 ));
        addEntity(new Food(handler, 576 , 448 ));
        addEntity(new Food(handler, 640 , 448 ));
        addEntity(new Food(handler, 704 , 448 ));
        addEntity(new Food(handler, 768 , 448 ));
        addEntity(new Food(handler, 832 , 448 ));
        addEntity(new Food(handler, 964 , 448 ));
        addEntity(new Food(handler, 1096 , 448 ));
        addEntity(new Food(handler, 1150 , 448 ));
        
        
        addEntity(new Food(handler, 64, 704));
        addEntity(new Food(handler, 128 , 704));
        addEntity(new Food(handler, 256 , 704 ));
        addEntity(new Food(handler, 320 , 704 ));
        addEntity(new Food(handler, 448 , 704 ));
        addEntity(new Food(handler, 512 , 704 ));
        addEntity(new Food(handler, 576 , 704 ));
        addEntity(new Food(handler, 640 , 704 ));
        addEntity(new Food(handler, 704 , 704 ));
        addEntity(new Food(handler, 768 , 704 ));
        addEntity(new Food(handler, 832 , 704 ));
        addEntity(new Food(handler, 964 , 704 ));
        addEntity(new Food(handler, 1096 , 704 ));
        addEntity(new Food(handler, 1150 , 704 ));
        
        
        addEntity(new Food(handler, 64, 768));
        addEntity(new Food(handler, 128 , 768));
        addEntity(new Food(handler, 256 , 768 ));
        addEntity(new Food(handler, 640 , 768 ));
        addEntity(new Food(handler, 964 , 768 ));
        addEntity(new Food(handler, 1096 , 768 ));
        addEntity(new Food(handler, 1150 , 768 ));
        
        
        
        addEntity(new Food(handler, 64, 832));
        addEntity(new Food(handler, 128 , 832));
        addEntity(new Food(handler, 256 , 832 ));
        addEntity(new Food(handler, 320 , 832 ));
        addEntity(new Food(handler, 448 , 832 ));
        addEntity(new Food(handler, 512 , 832 ));
        addEntity(new Food(handler, 576 , 832 ));
        addEntity(new Food(handler, 640 , 832 ));
        addEntity(new Food(handler, 704 , 832 ));
        addEntity(new Food(handler, 768 , 832 ));
        addEntity(new Food(handler, 964 , 832 ));
        addEntity(new Food(handler, 1096 , 832 ));
        addEntity(new Food(handler, 1150 , 832 ));
        
        
        addEntity(new Food(handler, 64, 1150));
        addEntity(new Food(handler, 128 , 1150));
        addEntity(new Food(handler, 192 , 1150));
        addEntity(new Food(handler, 256 , 1150 ));
        addEntity(new Food(handler, 320 , 1150 ));
        addEntity(new Food(handler, 384 , 1150));
        addEntity(new Food(handler, 448 , 1150 ));
        addEntity(new Food(handler, 512 , 1150 ));
        addEntity(new Food(handler, 576 , 1150 ));
        addEntity(new Food(handler, 640 , 1150 ));
        addEntity(new Food(handler, 704 , 1150 ));
        addEntity(new Food(handler, 768 , 1150 ));
        addEntity(new Food(handler, 832 , 1150 ));
        addEntity(new Food(handler, 896 , 1150));
        addEntity(new Food(handler, 964 , 1150 ));
        addEntity(new Food(handler, 1028 , 1150));
        addEntity(new Food(handler, 1096 , 1150 ));
        addEntity(new Food(handler, 1150 , 1150 ));
        
        
        
        addEntity(new Food(handler, 64, 1214));
        addEntity(new Food(handler, 128 , 1214));
        addEntity(new Food(handler, 192 , 1214));
        addEntity(new Food(handler, 256 , 1214 ));
        addEntity(new Food(handler, 320 , 1214 ));
        addEntity(new Food(handler, 384 , 1214));
        addEntity(new Food(handler, 448 , 1214 ));
        addEntity(new Food(handler, 512 , 1214 ));
        addEntity(new Food(handler, 576 , 1214 ));
        addEntity(new Food(handler, 640 , 1214 ));
        addEntity(new Food(handler, 704 , 1214 ));
        addEntity(new Food(handler, 768 , 1214 ));
        addEntity(new Food(handler, 832 , 1214 ));
        addEntity(new Food(handler, 896 , 1214));
        addEntity(new Food(handler, 964 , 1214 ));
        addEntity(new Food(handler, 1028 , 1214));
        addEntity(new Food(handler, 1096 , 1214 ));
        addEntity(new Food(handler, 1150 , 1214 ));
        
        
        
        addEntity(new Food(handler, 64, 512));
        addEntity(new Food(handler, 128 , 512));
        addEntity(new Food(handler, 256 , 512 ));
        addEntity(new Food(handler, 640 , 512 ));
        addEntity(new Food(handler, 964 , 512 ));
        addEntity(new Food(handler, 1096 , 512 ));
        addEntity(new Food(handler, 1150 , 512 ));
        
        addEntity(new Food(handler, 64, 256));
        addEntity(new Food(handler, 128 , 256));
        addEntity(new Food(handler, 484 , 256 ));
        addEntity(new Food(handler, 548 , 256 ));
        addEntity(new Food(handler, 612 , 256 ));
        addEntity(new Food(handler, 676 , 256 ));
        addEntity(new Food(handler, 740 , 256 ));
        addEntity(new Food(handler, 932 , 256 ));
        addEntity(new Food(handler, 1096 , 256 ));
        addEntity(new Food(handler, 1150 , 256 ));
        
        
        addEntity(new Food(handler, 64, 576));
        addEntity(new Food(handler, 110 , 576));
        addEntity(new Food(handler, 292 , 576 ));
        addEntity(new Food(handler, 356 , 576 ));
        addEntity(new Food(handler, 420 , 576 ));
        addEntity(new Food(handler, 484 , 576 ));
        addEntity(new Food(handler, 548 , 576 ));
        addEntity(new Food(handler, 740 , 576 ));
        addEntity(new Food(handler, 804 , 576 ));
        addEntity(new Food(handler, 868 , 576 ));
        addEntity(new Food(handler, 932 , 576 ));
        addEntity(new Food(handler, 1128 , 576 ));
        
        
        addEntity(new Food(handler, 64, 640));
        addEntity(new Food(handler, 110 , 640));
        addEntity(new Food(handler, 292 , 640 ));
        addEntity(new Food(handler, 356 , 640 ));
        addEntity(new Food(handler, 420 , 640 ));
        addEntity(new Food(handler, 484 , 640 ));
        addEntity(new Food(handler, 548 , 640 ));
        addEntity(new Food(handler, 740 , 640 ));
        addEntity(new Food(handler, 804 , 640 ));
        addEntity(new Food(handler, 868 , 640 ));
        addEntity(new Food(handler, 932 , 640 ));
        addEntity(new Food(handler, 996 , 640 ));
        addEntity(new Food(handler, 1064 , 640 ));
        addEntity(new Food(handler, 1128 , 640 ));
        
        
        addEntity(new Food(handler, 292 , 960 ));
        addEntity(new Food(handler, 484 , 960 ));
        addEntity(new Food(handler, 548 , 960 ));
        addEntity(new Food(handler, 612 , 960 ));
        addEntity(new Food(handler, 676 , 960 ));
        addEntity(new Food(handler, 740 , 960 ));
        addEntity(new Food(handler, 932 , 960 ));
        
        
        
        
        
        //Beasts
        
        
        addEntity(new Beast(handler, 64 , 64 ));
        addEntity(new Beast(handler, 420, 320 ));
        addEntity(new Beast(handler, 64, 640));
        addEntity(new Beast(handler, 420, 896));
        addEntity(new Beast(handler, 960, 1152));
        addEntity(new BeastUp(handler , 64 , 164 ));
        addEntity(new BeastUp(handler , 640 , 64 ));
        addEntity(new BeastUp(handler , 256 , 320 ));
        addEntity(new BeastUp(handler , 960 , 320 ));
        addEntity(new BeastUp(handler , 1152 , 384 ));
        
    }
    
    
}

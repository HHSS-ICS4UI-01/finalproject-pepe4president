/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrlamont.Model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

/**
 *
 * @author isles3536
 */
public class World {
    
    private Wheely wheely;
    private Array<Block> blocks;
    
    
    
    public World(){
       
      wheely = new Wheely(16,2850, 16, 32);
       blocks = new Array<Block>();
       demoLevel();
      
    }
    
    private void demoLevel(){
       
    }
    
    public void update(float delta){
        
    }
    
    public Wheely getPlayer(){
       return wheely;
    }
    public Array<Block> getBlocks(){
        return blocks;
    }
}

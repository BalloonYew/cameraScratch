package KarnMenuTest.Screens;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;




import com.badlogic.gdx.graphics.Texture;

/*
 */
public class BlockClass {
    Texture tBlock;
    float fX, fY;
    
    public void BlockClass(Texture _tBlock, float _fX, float _fY, CharClass charChar){
        tBlock = _tBlock;
        fX= _fX;
        fY = _fY;
    }
   
}

package KarnMenuTest.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import java.util.Random;

public class EnemyClass {

    CharClass charSonic = new CharClass();
    Vector2 vBad = new Vector2();
    Sprite sprBad;
    public Animation aniBad[] = new Animation[4];
    TextureAtlas textureAtlas2;
    int nDir2 = 0, nJum;
    float x, y = 100, fDy, fSY, fSX, fBX = 50, fBY = 50, fSx;

    public void show() {
        textureAtlas2 = new TextureAtlas(Gdx.files.internal("dogRight.atlas"));
        aniBad[0] = new Animation(1 / 5f, textureAtlas2.getRegions());
        textureAtlas2 = new TextureAtlas(Gdx.files.internal("dogLeft.atlas"));
        aniBad[1] = new Animation(1 / 5f, textureAtlas2.getRegions());
        textureAtlas2 = new TextureAtlas(Gdx.files.internal("dogLaugh.atlas"));
        aniBad[2] = new Animation(1 / 5f, textureAtlas2.getRegions());

    }

    public void update() {
        charSonic.update();
        fSY = vBad.y;
        fSX = vBad.x;
        vBad.add(fSx, fDy);

        System.out.println("sonic x " + charSonic.vChar.x);
        System.out.println("dog x " + vBad.x);


        if (isHitBad(vBad.x, vBad.y, 50, 40, charSonic.vChar.x, charSonic.vChar.y, 30, 40)) {
            nDir2 = 2;
        } else if (vBad.x < charSonic.vChar.x) {
            vBad.x++;
            nDir2 = 0;
        } else if (vBad.x > charSonic.vChar.x) {
            vBad.x--;
            nDir2 = 1;
        }
    }

    Animation aniBad(Animation aniBad) {


        return aniBad;
    }

    int Direction2() {
        return (nDir2);
    }

    boolean isHitBad(float nX1, float nY1, float nW1, float nH1, float nX2, float nY2, float nW2, float nH2) {

        if ((((nX1 <= nX2) && (nX1 + nW1 >= nX2))
                || ((nX1 >= nX2) && (nX1 <= nX2 + nW2)))
                && (((nY1 <= nY2) && (nY1 + nH1 >= nY2))
                || ((nY1 >= nY2) && (nY1 <= nY2 + nH2)))) {
            return true;
        } else {
            return (false);
        }
    }
}

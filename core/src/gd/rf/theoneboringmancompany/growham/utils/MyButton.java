package gd.rf.theoneboringmancompany.growham.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import gd.rf.theoneboringmancompany.growham.Main;

public abstract class MyButton extends Button {
    protected final Main main;

    private Texture img;
    protected Sound sound;

    protected final float Volume = 30/100f;

    public MyButton(Main main, String pathToImage){
        this.main = main;

        img = new Texture(pathToImage);
        sound = Gdx.audio.newSound(Gdx.files.internal("Audio/UI/button.mp3"));

        setWidth(img.getWidth());
        setHeight(img.getHeight());
    }

    public void dispose(){
        sound.dispose();
        //img.dispose();
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(img, getX(), getY());
    }
}

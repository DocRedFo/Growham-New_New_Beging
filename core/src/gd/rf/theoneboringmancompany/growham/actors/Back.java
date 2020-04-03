package gd.rf.theoneboringmancompany.growham.actors;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import gd.rf.theoneboringmancompany.growham.Main;
import gd.rf.theoneboringmancompany.growham.screens.MenuScreen;
import gd.rf.theoneboringmancompany.growham.screens.PlayRoomScreen;
import gd.rf.theoneboringmancompany.growham.utils.MyButton;

public class Back extends MyButton {
    public Back(final Main main, final int i) {
        super(main, "Pictures/Buttons/NonAnimation/prev.png");
        setPosition(0, main.stage.getHeight() - getHeight());

        addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                sound.play(Volume);
                switch (i) {
                    case MenuScreen.NUMBER:
                        main.setScreen(new MenuScreen(main));
                        break;
                    case PlayRoomScreen.NUMBER:
                        main.setScreen(new PlayRoomScreen(main));
                        break;
                }
                dispose();
            }
        });
    }
}

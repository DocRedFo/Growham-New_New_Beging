package gd.rf.theoneboringmancompany.growham.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import gd.rf.theoneboringmancompany.growham.Main;
import gd.rf.theoneboringmancompany.growham.utils.MyButton;

public class Med extends MyButton {
    public Med(final Main main) {
        super(main, "Pictures/Buttons/NonAnimation/buy.png",
                    "Pictures/Other/Med/med.png", "50");
        setPosition(main.stage.getWidth() - imgButton.getWidth()*1.5f,
                    main.stage.getHeight()/2 + main.stage.getHeight()/6);

        addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                if (main.hamster.getHealth() < 100 && main.hamster.getMoney() >= Integer.parseInt(howMuch)){
                    main.hamster.setMoney(main.hamster.getMoney() - Integer.parseInt(howMuch));
                    int n = main.hamster.getHealth() + 5;
                    if (n > 100){
                        main.hamster.setHealth(100);
                    }
                    else {
                        main.hamster.setHealth(main.hamster.getHealth() + 5);
                    }
                }
                else {
                    Gdx.input.vibrate(20);
                }
            }
        });
    }
}

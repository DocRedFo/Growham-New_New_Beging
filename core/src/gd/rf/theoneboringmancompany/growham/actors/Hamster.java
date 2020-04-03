package gd.rf.theoneboringmancompany.growham.actors;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;

import gd.rf.theoneboringmancompany.growham.Main;

public class Hamster extends Actor {
    private final Main main;

    private int age = 0;
    private int health = 100;
    private int hungry = 100;
    private int money = 100;
    private int roomLevel = 1;

    private TextureAtlas atlas;
    private Animation animation;

    private float animationTime = 0f;

    public Hamster(Main main){
        this.main = main;
    }

    public int getHealth() {
        return health;
    }

    public int getAge() {
        return age;
    }

    public int getMoney() {
        return money;
    }

    public int getHungry() {
        return hungry;
    }

    public int getRoomLevel() {
        return roomLevel;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setRoomLevel(int roomLevel) {
        this.roomLevel = roomLevel;
    }
}

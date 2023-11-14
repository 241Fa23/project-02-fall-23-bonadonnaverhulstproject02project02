/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S543153
 */
public abstract class Player {

    private int health;
    private int score;

    public Player() {
        health = 10;
        score = 0;
    }

    public Player(int health, int score) {
        this.health = health;
        this.score = score;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public abstract String getSpecialMove();

    public abstract void useSpecialMove();

    public abstract String toString();

}

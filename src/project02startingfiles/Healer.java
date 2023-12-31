/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s548114
 */
public class Healer extends Player {

    private String specialMove;

    public Healer() {

    }

    @Override
    public String getSpecialMove() {
        return "'Sleeping Powder'";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The healer uses sleeping powder!");
    }

    @Override
    public String toString() {
        return "Healer Status:\nHealth: " + getHealth() + "\nScore: " + getScore() + "\nThe Healer's special move is " + getSpecialMove();
    }

}

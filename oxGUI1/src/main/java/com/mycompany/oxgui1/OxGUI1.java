/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oxgui1;

/**
 *
 * @author minnie
 */
public class OxGUI1 {

    public static void main(String[] args) {
        Game game = new Game();
        game.showWelcome();
        game.newBoard();
        while(true) {
            game.showTable();
            game.showTurn();
            game.inputRowCol();
            if(game.isFinish()) {
                game.showTable();
                game.showResult();
                game.showStat();
                game.newBoard();
            }
        }               
    }
}

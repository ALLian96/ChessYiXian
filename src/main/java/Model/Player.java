package Model;

import Model.Chess;

import java.util.List;

public class Player {
    private int hp;
    private int exp;
    private List<Chess> chessList;
    private State etat;

    public Player(int hp,int exp) {
        this.hp = hp;
        this.exp = exp;

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public List<Chess> getChessList() {
        return chessList;
    }

    public void setChessList(List<Chess> chessList) {
        this.chessList = chessList;
    }

    @Override
    public String toString() {
        return "Player{" +
                "hp=" + hp +
                ", exp=" + exp +
                '}';
    }
}

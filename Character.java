public class Character {
    private String name;
    private int atk;
    private int def;
    private int life;
    private int cri;
    private int flee;

    public String getName(){
        return name;
    }

    public int getAtk(){
        return atk;
    }

    public int getDef(){
        return def;
    }

    public int getLife(){
        return life;
    }

    public int getCri(){
        return cri;
    }

    public int grtFlee(){
        return flee;
    }


}

class Ch1 extends Character {

    public String getName() {
        return "哈奇老大";
    }

    public int getAtk() {
        return 36;
    }

    public int getDef() {
        return 16;
    }

    public int getLife(){
        return 351;
    }

    public int getCri(){
        return 5;
    }

    public int grtFlee(){
        return 20;
    }


}

class Ch2 extends Character {

    public String getName() {
        return "安";
    }

    public int getAtk() {
        return 38;
    }

    public int getDef() {
        return 12;
    }

    public int getLife(){
        return 360;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }


}

class Ch3 extends Character {

    public String getName() {
        return "神手";
    }

    public int getAtk() {
        return 37;
    }

    public int getDef() {
        return 10;
    }

    public int getLife(){
        return 355;
    }

    public int getCri(){
        return 20;
    }

    public int grtFlee(){
        return 5;
    }


}

class Ch4 extends Character {

    public String getName() {
        return "你麻吉";
    }

    public int getAtk() {
        return 24;
    }

    public int getDef() {
        return 27;
    }

    public int getLife(){
        return 315;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }



}
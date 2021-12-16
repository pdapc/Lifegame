public class Monster {
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

class Mons1 extends Monster {

    public String getName() {
        return "車禍";
    }

    public int getAtk() {
        return 19;
    }

    public int getDef() {
        return 10;
    }

    public int getLife(){
        return 151;
    }

    public int getCri(){
        return 5;
    }

    public int grtFlee(){
        return 20;
    }


}

class Mons2 extends Monster {

    public String getName() {
        return "癌症";
    }

    public int getAtk() {
        return 22;
    }

    public int getDef() {
        return 6;
    }

    public int getLife(){
        return 160;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }


}

class Mons3 extends Monster {

    public String getName() {
        return "房貸";
    }

    public int getAtk() {
        return 25;
    }

    public int getDef() {
        return 4;
    }

    public int getLife(){
        return 155;
    }

    public int getCri(){
        return 20;
    }

    public int grtFlee(){
        return 5;
    }


}

class Mons4 extends Monster {

    public String getName() {
        return "車禍";
    }

    public int getAtk() {
        return 14;
    }

    public int getDef() {
        return 17;
    }

    public int getLife(){
        return 115;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }
}
class Mons5 extends Monster {

    public String getName() {
        return "啃老族";
    }

    public int getAtk() {
        return 14;
    }

    public int getDef() {
        return 17;
    }

    public int getLife(){
        return 115;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }
}
class Mons6 extends Monster {

    public String getName() {
        return "小三";
    }

    public int getAtk() {
        return 14;
    }

    public int getDef() {
        return 17;
    }

    public int getLife(){
        return 115;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }
}

class Mons7 extends Monster {

    public String getName() {
        return "股災";
    }

    public int getAtk() {
        return 14;
    }

    public int getDef() {
        return 17;
    }

    public int getLife(){
        return 115;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }
}

class Mons8 extends Monster {

    public String getName() {
        return "萬萬稅";
    }

    public int getAtk() {
        return 14;
    }

    public int getDef() {
        return 17;
    }

    public int getLife(){
        return 115;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }
}


class Mons9 extends Monster {

    public String getName() {
        return "主管";
    }

    public int getAtk() {
        return 14;
    }

    public int getDef() {
        return 17;
    }

    public int getLife(){
        return 115;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }
}

class Mons10 extends Monster {

    public String getName() {
        return "雷同事";
    }

    public int getAtk() {
        return 14;
    }

    public int getDef() {
        return 17;
    }

    public int getLife(){
        return 115;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }
}

class Mons11 extends Monster {

    public String getName() {
        return "仙人跳";
    }

    public int getAtk() {
        return 14;
    }

    public int getDef() {
        return 17;
    }

    public int getLife(){
        return 115;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }
}

class Mons12 extends Monster {

    public String getName() {
        return "人生";
    }

    public int getAtk() {
        return 14;
    }

    public int getDef() {
        return 17;
    }

    public int getLife(){
        return 115;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }
}

class MonsRan extends Monster {

    public String getName() {
        return "隨機魔獸";
    }

    public int getAtk() {
        //x = (int)(Math.random()*100)  ;
        int raAtk = (int)(Math.random()*15) + 27;
        return raAtk;
    }

    public int getDef() {
        int raDef = (int)(Math.random()*20);
        return raDef;
    }

    public int getLife(){
        int raLife = (int)(Math.random()*100) + 100;
        return raLife;
    }

    public int getCri(){
        int raCri = (int) (Math.random()*20);
        return raCri;
    }

    public int grtFlee(){
        int raFlee = (int)(Math.random()*5);
        return raFlee;
    }
}

import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws InterruptedException {


        testChar.main(args);
        Character[] characters = new Character[]{new Ch1(), new Ch2(), new Ch3(), new Ch4()};
        int calCharacterVol = characters.length;
        Delay250ms.delay25(1);
        System.out.println("角色有" + calCharacterVol + "位");

        //腳色顯示能力顯示
        System.out.printf("%-10s", "角色名稱");
        for (Character character : characters) {

            String x = character.getName();
            System.out.printf("%-10s", x);
        }
        System.out.println();

        int[][] getCharactersVol = new int[calCharacterVol][5];

        for (int i = 0; i < calCharacterVol; i++) {
            getCharactersVol[i][0] = characters[i].getAtk();
            getCharactersVol[i][1] = characters[i].getDef();
            getCharactersVol[i][2] = characters[i].getLife();
            getCharactersVol[i][3] = characters[i].getCri();
            getCharactersVol[i][4] = characters[i].grtFlee();
        }

        String[] prfCharacterVolName = {"攻擊", "防禦", "生命", "爆擊率", "迴避率"};
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s", prfCharacterVolName[i]);
            for (int j = 0; j < calCharacterVol; j++) {
                System.out.printf("%-10s", getCharactersVol[j][i]);
            }
            System.out.println();
        }

        //選角系統

        System.out.println("請選擇角色1~4");
        Delay250ms.delay25(4);
        System.out.println("對戰角色");
        int selCh1;
        Scanner scanner1 = new Scanner(System.in);
        selCh1 = scanner1.nextInt();


        Character character1 = characters[selCh1 - 1];
        System.out.println("姓名" + character1.getName());
        System.out.println("攻擊力" + character1.getAtk());
        System.out.println("防禦力" + character1.getDef());
        System.out.println("生命" + character1.getLife());
        System.out.println("爆擊率" + character1.getCri());
        System.out.println("閃避率" + character1.grtFlee());

        Delay250ms.delay25(4);

        System.out.println("悲慘人生開始");
        Delay250ms.delay25(4);
        int calLife1 = character1.getLife();
        //System.out.println(calLife1);

        //int calLife2 = character2.getLife();
        //System.out.println(calLife2);
        //流程開始
        for (int floor = 1; floor < 4; floor++) {
            System.out.println("人生第" + floor + "層試煉");
            Delay250ms.delay25(4);
            String[] monstername = {"碰瓷", "房貸", "車貸", "啃老族", "小三", "股災", "萬萬稅", "仙人跳", "畫大餅老闆", "可愛雷同事", "無止境的工作"};
            Monster[] motests = new Monster[]{new MonsRan()};
            Monster fightingMonster = motests[0];
            System.out.print("面對人生的坎....");
            String temMonterName = new String(monstername[ (int) (Math.random() * 13)]);
            System.out.println(temMonterName);
            Delay250ms.delay25(10);
            //System.out.println("姓名"+fightingMonster.getName());
            System.out.println("攻擊力" + fightingMonster.getAtk());
            System.out.println("防禦力" + fightingMonster.getDef());
            System.out.println("生命" + fightingMonster.getLife());
            System.out.println("爆擊率" + fightingMonster.getCri());
            System.out.println("閃避率" + fightingMonster.grtFlee());
            int calLife2 = fightingMonster.getLife();
            //戰鬥系統
            for (int i = 1; i < 99; i++) {
                System.out.println("第" + i + "回合攻擊");

                //腳色1攻擊腳色2
                System.out.println(character1.getName() + "攻擊力" + character1.getAtk() + "攻擊" + temMonterName + "防禦力" + fightingMonster.getDef());
                //爆擊計算
                int judCri;
                if (character1.getCri() < (int) (Math.random() * 100)) {
                    judCri = 1;
                } else {
                    //爆擊成立
                    judCri = 2;
                }

                //計算閃避
                int judFlee;
                if (fightingMonster.grtFlee() < (int) (Math.random() * 100)) {
                    judFlee = 1;
                } else {
                    //閃避成立
                    judFlee = 0;
                }

                //爆擊閃避文字顯示

                if (judFlee == 0) {
                    System.out.println(temMonterName + "幸運閃避");
                } else {
                    if (judCri == 2) {
                        System.out.println(character1.getName() + "爆擊");
                    }
                }

                //傷害計算
                calLife2 = calLife2 - (character1.getAtk() * judCri * judFlee - fightingMonster.getDef() * judFlee);
                System.out.println(temMonterName + "剩餘血量" + calLife2);
                if (calLife2 < 0) {
                    System.out.println(temMonterName + "已死亡" + character1.getName() + "勝利");
                    break;
                }

                Delay250ms.delay25(2);
                //腳色2攻擊腳色1
                System.out.println(temMonterName + "攻擊力" + fightingMonster.getAtk() + "攻擊" + character1.getName() + "防禦力" + character1.getDef());
                if (fightingMonster.getCri() < (int) (Math.random() * 100)) {
                    judCri = 1;
                } else {
                    //爆擊成立
                    judCri = 2;
                }

                //計算閃避
                if (character1.grtFlee() < (int) (Math.random() * 100)) {
                    judFlee = 1;
                } else {
                    //閃避成立
                    judFlee = 0;
                }

                //爆擊閃避文字顯示

                if (judFlee == 0) {
                    System.out.println(character1.getName() + "幸運閃避");
                } else {
                    if (judCri == 2) {
                        System.out.println(temMonterName + "爆擊");
                    }
                }

                calLife1 = calLife1 - (fightingMonster.getAtk() * judCri * judFlee - character1.getDef() * judFlee);
                System.out.println(character1.getName() + "剩餘血量" + calLife1);
                if (calLife1 < 0) {
                    System.out.println(character1.getName() + "已死亡" + temMonterName + "勝利");
                    break;
                }
                if (calLife1 < 0) {
                    System.out.println(character1.getName() + "已死亡");
                    break;
                }

                String delFig = "........";
                String[] split1 = delFig.split("");
                for (int del = 0; del < split1.length; del++) {

                    System.out.print(split1[del]);
                    Delay250ms.delay25(1);
                }
                System.out.println("");

            }

            /*for (int del = 0 ; del < 5 ; del++) {
                try {
                    for (int j = 0; j < 1; j++) {
                        Thread.sleep(250);
                        System.out.print(".");
                    }
                }catch(Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("");*/
        }
        if (calLife1 < 0) {
            System.out.print(character1.getName());
            String overGame = ".......可悲阿....居然失敗了..人生重來吧!!";
            String[] split1 = overGame.split("");
            for (int i = 0; i < split1.length; i++) {

                System.out.print(split1[i]);
                Delay250ms.delay25(2);
            }

        } else {
            System.out.print(character1.getName());
            String overGame = "沒想到這樣機歪的人生經歷你都可以通過!";
            String[] split1 = overGame.split("");
            for (int i = 0; i < split1.length; i++) {

                System.out.print(split1[i]);
                Delay250ms.delay25(2);


            }
        }
    }
}


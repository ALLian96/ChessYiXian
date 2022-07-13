import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

import Global.Configuration;
import Model.Player;

public class ChessYiXian {
    public static void main(String[] args) {

        Player me = new Player(40,1);
        Player enemis = new Player(40,1);

        //用户输入各自血量经验
        InputStream in;
        in = Configuration.ouvre("default.cfg");
        Properties defaut = new Properties();
        Configuration.chargerProprietes(defaut,in,"default.cfg");
        System.out.println("血量经验加载完成");
        //P1
        String hp = defaut.getProperty("P1HP");
        String exp = defaut.getProperty("P1EXP");
        me.setHp(Integer.parseInt(hp));
        me.setExp(Integer.parseInt(exp));
        //P2
        hp = defaut.getProperty("P2HP");
        exp = defaut.getProperty("P2EXP");
        enemis.setHp(Integer.parseInt(hp));
        enemis.setExp(Integer.parseInt(exp));

        System.out.println(me);
        System.out.println(enemis);;


        //读取双方牌
        in = Configuration.ouvre("Test");
        System.out.println("双方牌加载完成");








    }
}

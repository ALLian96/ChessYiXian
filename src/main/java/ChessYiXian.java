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
        try {
            in = new FileInputStream("default.cfg");
            Properties defaut = new Properties();
            Configuration.chargerProprietes(defaut,in,"default.cfg");
            System.out.println("血量经验加载完成");
        } catch (FileNotFoundException e) {
            System.err.println("读取血量经验失败");
            System.exit(1);
        }
        String hp = System.getProperty("P1HP");
        System.out.println(hp);

        //读取双方牌
        in = Configuration.ouvre("Test");
        System.out.println("双方牌加载完成");








    }
}

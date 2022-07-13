package Global;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 使用单例模式（Singleton），目的是为了保证在一个进程中，Configuration有且仅有一个实例。
 */

public class Configuration {
    static Configuration instance = null;

    public static Configuration instance() {
        if (instance == null)
            instance = new Configuration();
        return instance;
    }

    public static void chargerProprietes(Properties p, InputStream in, String nom) {

        try {
            p.load(in);
        } catch (IOException e) {
            // Le logger n'est pas encore en place à ce moment là
            System.err.println("Impossible de charger " + nom);
            System.err.println(e.toString());
            System.exit(1);
        }
    }

    protected Configuration(){


    }

    public static InputStream ouvre(String s){
        InputStream in = ClassLoader.getSystemClassLoader().getSystemResourceAsStream(s);
        if(in == null){
            System.err.println("Impossible de charger le ressource" + s);
            System.exit(1);
        }
        return in;

    }
}

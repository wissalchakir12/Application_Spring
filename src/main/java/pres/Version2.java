package pres;

import dao.ICalcul;
import metier.IGestion;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Version2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("Config.txt"));
        String daoclassName=scanner.nextLine();
        Class cCalcul=Class.forName(daoclassName);
        ICalcul calcul=(ICalcul) cCalcul.getConstructor().newInstance();
        System.out.println(calcul.getValue());

        String metierClassName=scanner.nextLine();
        Class cGestion=Class.forName(metierClassName);
        IGestion gestion=(IGestion)cGestion.getConstructor().newInstance();
        Method m=cGestion.getMethod("setCal",ICalcul.class);
        m.invoke(gestion,calcul);
        System.out.println(gestion.calcul());
    }
}

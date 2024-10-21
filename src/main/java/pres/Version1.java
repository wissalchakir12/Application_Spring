package pres;

import dao.CalculV1;
import dao.ICalcul;
import metier.Gestion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Version1 {
    public static void main(String[] args)
    {

        ICalcul cal=new CalculV1();
        System.out.println(cal.getValue());
        //Gestion gestion=new Gestion(cal);

        //System.out.println(gestion.calcul());
    }
}
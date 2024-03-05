package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresStatic {
    public static void main(String[] args) {
        DaoImpl IDao = new DaoImpl();
        MetierImpl iMetier = new MetierImpl();
        iMetier.setDao(IDao);
        System.out.println(iMetier.calcul());
    }
}

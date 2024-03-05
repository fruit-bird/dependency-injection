package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class PresDyn {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("./src/main/resources/config.txt"));

        String daoClassName = sc.nextLine();
        Class<?> cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance();
        System.out.println(dao.getData());

        String metierClassName = sc.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
        cMetier.getMethod("setDao", IDao.class).invoke(metier, dao);
        System.out.println(metier.calcul());
    }
}

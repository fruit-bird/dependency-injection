package metier;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * Math.PI;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

package metier;
import dao.IDao;

public class MetierImpl implements IMetier {

    // couplage faible
    private IDao dao=null;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*37;
        return res;
    }

    // Pour Injecter dans la variable dao un objetd'une classe qui implémente l'interafce IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

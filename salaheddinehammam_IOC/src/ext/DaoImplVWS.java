package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double temp=70;
        return temp;
    }
}
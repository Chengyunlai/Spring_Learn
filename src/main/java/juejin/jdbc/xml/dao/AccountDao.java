package juejin.jdbc.xml.dao;

public interface AccountDao {
    public void addMoney(Integer id,Integer num);

    public void reduceMoney(Integer id,Integer num);
}

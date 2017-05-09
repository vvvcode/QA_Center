import dao.GlobalUserDao;
import model.IntlAccount;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

/**
 * Created by risan on 17/5/8.
 */
public class TestMybatisByMutilTables {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    static {
        try {
            reader = Resources.getResourceAsReader("dataSourceConfiguration/Configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch ( Exception e ){
            e.printStackTrace();
        }
    }

//    public static SqlSessionFactory getSession(){
//        return sqlSessionFactory;
//    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            GlobalUserDao globalUserDao = session.getMapper(GlobalUserDao.class);
            List<IntlAccount> intlAccounts =  globalUserDao.getGlobalUserIntlAccountByUid("60ECA5A8-87C5-413B-B1AF-9BAEC6DB1472");
            for (IntlAccount intlAccount:intlAccounts) {
                System.out.println(intlAccount.getGlobalUser().getUid()+" 的开户email为： "+intlAccount.getEmail());
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

}

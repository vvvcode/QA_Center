import dao.GlobalUserDao;
import model.GlobalUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

/**
 * Created by risan on 17/5/8.
 */
public class TestMybatisBySingleTable {
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
//            //1.通过sqlsession执行sql获取结果
//            GlobalUser globalUser = (GlobalUser) session.selectOne("model.GlobalUser.selectGlobalUserByUid",
//                    "60ECA5A8-87C5-413B-B1AF-9BAEC6DB1472");
//            System.out.println(globalUser.getUid());
//            System.out.println(globalUser.getAccountType());
//            //2.通过dao接口获取mapper信息，获取结果
            GlobalUserDao globalUserDao = session.getMapper(GlobalUserDao.class);
//            GlobalUser globalUser = globalUserDao.selectGlobalUserByUid("60ECA5A8-87C5-413B-B1AF-9BAEC6DB1472");
//            System.out.println(globalUser.getUid());
//            System.out.println(globalUser.getAccountType());
//            List<GlobalUser> users = globalUserDao.selectGlobalUserByUidLike("%60E%");
//            for (GlobalUser globalUser:users) {
//                System.out.println(globalUser.getUid());
//            }

            // 新增用户&&查询多条记录
//            GlobalUser globalUser = new GlobalUser();
//            globalUser.setUid("test_insert");
//            globalUser.setAccountType("intl");
//            globalUserDao.addGlobalUser(globalUser);
//            List<GlobalUser> users = globalUserDao.selectGlobalUserByUidLike("%");
//            for (GlobalUser user:users) {
//                System.out.println(user.getUid()+"的账户类型为："+user.getAccountType());
//            }

            // 修改用户accountType,先得到用户信息，然后修改，并提交
//            GlobalUser globalUser1 = globalUserDao.selectGlobalUserByUid("60ACA5A8-87C5-413B-B1AF-9BAEC6DB1473");
//            globalUser1.setAccountType("intl");
//            globalUserDao.modifyGlobalUserAccountTypeByUid(globalUser1);

            // 通过uid删除用户
            globalUserDao.deleteGlobalUserByUid("test_insert");

            // 进行增，删，改，操作时必须进行commit操作，否则修改不会提交
            session.commit();
//            System.out.println(globalUserDao.selectGlobalUserByUid("60ACA5A8-87C5-413B-B1AF-9BAEC6DB1473").getUid()+"的账户类型为："+globalUserDao.selectGlobalUserByUid("60ACA5A8-87C5-413B-B1AF-9BAEC6DB1473").getAccountType());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

}

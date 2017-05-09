package dao;

import model.GlobalUser;
import model.IntlAccount;

import java.util.List;

/**
 * Created by risan on 17/5/8.
 */
public interface GlobalUserDao {
    // 通过uid获取用户信息
    public GlobalUser selectGlobalUserByUid(String uid);

    // 通过类似的uid获取批量用户信息
    public List<GlobalUser> selectGlobalUserByUidLike(String uid_parten);

    // 新增用户
    public void addGlobalUser(GlobalUser globalUser);

    // 通过uid修改用户accountType
    public void modifyGlobalUserAccountTypeByUid(GlobalUser globalUser);

    // 通过uid删除指定用户
    public void deleteGlobalUserByUid(String uid);

    // 通过uid 联表查询用户的intl账户开户信息
    public List<IntlAccount> getGlobalUserIntlAccountByUid(String uid);

}

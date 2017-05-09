package dao;

import model.GlobalUser;
import model.IntlAccount;

import java.util.List;

/**
 * Created by risan on 17/5/8.
 */
public interface IntlAccountDao {
    // 通过uid获取用户intl开户信息
    public IntlAccount selectIntlAccountByUid(String uid);

    // 通过类似的uid获取批量用户intl开户信息
    public List<IntlAccount> selectIntlAccountByUidLike(String uid_parten);

    // 新增用户intl账户
    public void addIntlAccount(IntlAccount intlAccount);

    // 通过uid修改用户intl账户：email
    public void modifyIntlAccountEmailByUid(IntlAccount intlAccount);

    // 通过uid删除指定用户的intl账户
    public void deleteIntlAccountByUid(String uid);
}

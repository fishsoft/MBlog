package com.morse.service.userService;

import com.morse.entites.User;
import com.morse.service.BaseService;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * Created by mac on 2016/12/15.
 */
public interface UserService extends BaseService<User> {
    @Override
    void add(User user) throws Exception;

    @Override
    List<User> findAll(int pageNum, int pageSize);

    /**
     * 根据用户ID获取用户信息
     *
     * @param userId   用户ID
     * @param metaKeys 需要被查询的键组
     * @return
     */
    List<HashMap<String, String>> getUserMeta(int userId, String... metaKeys);

    @Override
    User findOneById(Serializable id);
}

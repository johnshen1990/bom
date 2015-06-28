package com.xishi.bom.service.sys;

import com.xishi.bom.dao.core.sys.UserDao;
import com.xishi.bom.dao.query.tran.TrandataDao;
import com.xishi.bom.entity.sys.User;
import com.xishi.bom.entity.tran.Trandata;
import com.xishi.bom.util.BOMDateUtil;
import com.xishi.bom.util.BOMStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;


@Service
public class UserService {

    @Autowired
	private UserDao userDao;

    /**
     * 创建用户
     * @param user
     */
    public User createUser(User user){
        //TODO
        return null;
    }

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    public void changePassword(Long userId, String newPassword){
        //TODO
    }

    /**
     * 添加用户-角色关系
     * @param userId
     * @param roleIds
     */
    public void correlationRoles(Long userId, Long... roleIds){
        //TODO
    }


    /**
     * 移除用户-角色关系
     * @param userId
     * @param roleIds
     */
    public void uncorrelationRoles(Long userId, Long... roleIds){
        //TODO
    }

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username){
        return userDao.getByUsername(username);
    }

    /**
     * 根据用户名查找其角色
     * @param username
     * @return
     */
    public Set<String> findRoles(String username){
        //TODO
        return null;
    }

    /**
     * 根据用户名查找其权限
     * @param username
     * @return
     */
    public Set<String> findPermissionsByUsername(String username){
        //TODO
        return null;
    }
}

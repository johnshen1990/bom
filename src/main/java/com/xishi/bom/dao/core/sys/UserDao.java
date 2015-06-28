package com.xishi.bom.dao.core.sys;

import com.xishi.bom.entity.sys.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDao {
    List<User> getAll(Map<String, Object> param);
    User getByUsername(String username);
}

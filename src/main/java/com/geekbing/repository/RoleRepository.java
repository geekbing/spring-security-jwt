package com.geekbing.repository;

import com.geekbing.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: bing
 * Date: 2017-03-11 12:55
 * Email: dhuzbb@163.com
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}

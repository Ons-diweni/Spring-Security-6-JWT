package com.ons.securitylayerJwt.persistence;

import com.ons.securitylayerJwt.models.Role;
import com.ons.securitylayerJwt.models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role,Integer> {

    Role findByRoleName(RoleName roleName);


}

package com.kapcb.framework.data.component;

import com.kapcb.framework.data.service.IDeptService;
import com.kapcb.framework.data.service.IRoleService;
import com.kapcb.framework.data.service.IUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <a>Title: DataScopeConfiguration </a>
 * <a>Author: Kapcb <a>
 * <a>Description: DataScopeConfiguration <a>
 *
 * @author Kapcb
 * @version 1.0.0
 * @date 2021/11/21 12:55
 */
@Slf4j
@Component
public class DataScopeComponent {

    private final IUserService userService;
    private final IRoleService roleService;
    private final IDeptService deptService;

    public DataScopeComponent(IUserService userService, IRoleService roleService, IDeptService deptService) {
        this.userService = userService;
        this.roleService = roleService;
        this.deptService = deptService;
    }


}

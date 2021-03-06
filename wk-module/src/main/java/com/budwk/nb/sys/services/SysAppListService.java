package com.budwk.nb.sys.services;

import com.budwk.nb.sys.models.Sys_app_list;
import com.budwk.nb.commons.base.service.BaseService;

import java.util.List;

/**
 * @author wizzer(wizzer@qq.com) on 2019/12/12.
 */
public interface SysAppListService extends BaseService<Sys_app_list> {
    /**
     * 获取应用列表
     * @return
     */
    List<String> getAppNameList();
}

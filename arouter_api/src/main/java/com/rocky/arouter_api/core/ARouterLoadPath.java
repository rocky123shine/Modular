package com.rocky.arouter_api.core;

import com.rocky.arouter_annotation.model.RouterBean;

import java.util.Map;

public interface ARouterLoadPath {

    /**
     * 加载路由组Group中的Path详细数据
     * 比如："app"分组下有这些信息：
     *
     * @return key:"/app/MainActivity", value:MainActivity信息封装到RouterBean对象中
     */
    Map<String, RouterBean> loadPath();
}

package com.rocky.arouter_compiler.utils;

import javax.lang.model.type.TypeMirror;

public class Constants {
    //ARouter 的全类名
    public static final String AROUTER_ANNOTATION_TYPES = "com.rocky.arouter_annotation.ARouter";
    public static final String MODULE_NAME = "moduleName";
    public static final String APT_PACKAGE = "packageNameForAPT";

    // String全类名"
    public static final String STRING = "java.lang.String";
    // Activity全类名
    public static final String ACTIVITY = "android.app.Activity";

    // 跨模块业务，回调接口
    public static final String CALL =  "com.rocky.arouter_api.core.Call";
    public static final CharSequence AROUTE_GROUP = "com.rocky.arouter_api.core.ARouterLoadGroup";
    public static final CharSequence AROUTE_PATH = "com.rocky.arouter_api.core.ARouterLoadPath";
    public static final String PATH_METHOD_NAME = "loadPath";
    // 路由组Group对应的详细Path，参数名
    public static final String PATH_PARAMETER_NAME = "pathMap";
    public static final String PATH_FILE_NAME = "ARouter$$Path$$";
    public static final String GROUP_METHOD_NAME = "loadGroup";
    public static final String GROUP_PARAMETER_NAME = "groupMap";
    public static final String GROUP_FILE_NAME = "ARouter$$Group$$";

    public static final String PARAMETER_ANNOTATION_TYPES = "com.rocky.arouter_annotation.Parameter";

    public static final CharSequence PARAMETER_LOAD = "com.rocky.arouter_api.core.ParameterLoad";
    public static final String PARAMETER_NAME = "target";
    public static final String PARAMETER_METHOD_NAME = "loadParameter";
    // RouterManager类名
    public static final String ROUTER_MANAGER = "RouterManager";
    public static final String BASE_PACKAGE = "com.rocky.arouter_api";
    // APT生成的获取参数类文件名
    public static final String PARAMETER_FILE_NAME = "$$Parameter";}



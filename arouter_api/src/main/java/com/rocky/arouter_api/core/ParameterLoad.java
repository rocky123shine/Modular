package com.rocky.arouter_api.core;

//参数加载接口
public interface ParameterLoad {
    /**
     * @param target ，目标对象 如 MainActivity中的某些属性
     *               目标对象.属性名 = getIntent().属性类型（"注解值or属性名"）；完成赋值
     */
    void loadParameter(Object target);
}

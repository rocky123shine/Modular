package com.rocky.arouter_annotation.model;

import javax.lang.model.element.Element;

/**
 * 这是路由路径的实体封装类
 * 比如：app分组中的MainActivity对象，这个对象有更多的属性
 */
public class RouterBean {


    //支持的类型  注解在Activity上 和 模块对外提供的接口（属性注解）
    public enum Type {
        ACTIVITY, CALL
    }

    //注解类型
    private Type type;
    //类节点
    private Element element;
    //注解使用类对象
    private Class<?> clazz;
    //路由地址
    private String path;
    //路由组
    private String group;

    private RouterBean(Builder builder) {
        this.group = builder.group;
        this.element = builder.element;
        this.path = builder.path;
    }

    private RouterBean(Type type, Class<?> clazz, String path, String group) {
        this.type = type;
        this.clazz = clazz;
        this.path = path;
        this.group = group;
    }

    // 对外提供简易版构造方法，主要是为了方便APT生成代码
    public static RouterBean create(Type type, Class<?> clazz, String path, String group) {
        return new RouterBean(type, clazz, path, group);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public Element getElement() {
        return element;
    }

    //使用构建者模式
    public static class Builder {
        //路由地址
        private String path;
        //路由组
        private String group;
        //类节点
        private Element element;

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setGroup(String group) {
            this.group = group;
            return this;
        }

        public Builder setElement(Element element) {
            this.element = element;
            return this;
        }

        //提供创建方法
        public RouterBean build() {
            if (path == null || path.length() == 0) {
                throw new IllegalArgumentException("path必填项为空，如：/app/MainActivity");
            }
            return new RouterBean(this);
        }
    }

    @Override
    public String toString() {
        return "RouterBean{" +
                "path='" + path + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}

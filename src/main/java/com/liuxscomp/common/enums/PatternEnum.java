package com.liuxscomp.common.enums;

/**
 * 日期模版枚举类
 */
public enum PatternEnum {

    /** g  global全称，cn中国 */
    G_DATE_TIME_DEFAULT("yyyy-MM-dd HH:mm:ss"),// 默认的年月日时分秒格式
    G_DATE_TIME_FOR_CN("yyyy年MM月dd日 HH时mm分ss秒"),// 中文格式
    DATE_FOR_DAY("yyyy-MM-dd"),// 一般的天格式
    DATE_FOR_DAY_CN("yyyy年MM月dd日");

    private PatternEnum(String name){
        this.name=name;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

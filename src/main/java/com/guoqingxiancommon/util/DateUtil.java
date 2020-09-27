/**
 * 作者:   郭青贤
 * 时间:   2020/9/27 8:15
 */
package com.guoqingxiancommon.util;

import java.util.Date;

public class DateUtil {
    /*
     * 方法1：(10分)
     * 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
     * 则返回的结果为2019-05-01 00:00:00
     */
    public static Date getDateByInitMonth(Date src){
        //TODO 实现代码
        return cn.hutool.core.date.DateUtil.beginOfMonth(src);
    }
    /*
     * 方法2：(10分)
     * 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
     * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
     * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
     */
    public static Date getDateByFullMonth(Date src){
        //TODO 实现代码
        return cn.hutool.core.date.DateUtil.endOfMonth(src);
    }


}

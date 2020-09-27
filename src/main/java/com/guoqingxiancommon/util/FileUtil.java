/**
 * 作者:   郭青贤
 * 时间:   2020/9/27 8:17
 */
package com.guoqingxiancommon.util;

import com.sun.xml.internal.bind.v2.TODO;

public class FileUtil {

    /*
     * 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
     */
    public static String getExtendName(String fileName){
        //TODO 实现代码
        return fileName.substring(fileName.lastIndexOf("."));
    }

}

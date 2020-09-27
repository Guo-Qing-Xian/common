/**
 * 作者:   郭青贤
 * 时间:   2020/9/27 8:18
 */
package com.guoqingxiancommon.util;

import java.awt.*;
import java.io.*;

public class StreamUtil {
    /*
     * 方法1：批量关闭流，参数能传入无限个。(10分)
     * 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
     */
    public static void closeAll(Closeable...closeables){
        //TODO 实现代码
        for (Closeable closeable : closeables) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /*
     * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
     */
    public static String readTextFile(InputStream src) throws IOException {
        //TODO 实现代码
        InputStreamReader streamReader = new InputStreamReader(src, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        String readLine = bufferedReader.readLine();
        closeAll(streamReader);
        return readLine;
    }
    /*
     * 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
     */
    public static String readTextFile(File txtFile) throws IOException {
        //TODO 实现代码
        String textFile = readTextFile(new FileInputStream(txtFile));
        return textFile;
    }

}

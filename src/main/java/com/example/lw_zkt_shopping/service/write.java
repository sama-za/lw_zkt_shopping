package com.example.lw_zkt_shopping.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.ListUtils;
import javafx.animation.PathTransition;
import org.junit.jupiter.api.Test;

import java.util.List;


public class write {

    private List<DemoData> data() {
        List<DemoData> list = ListUtils.newArrayList();
        for (int i = 0; i < 10; i++) {
//            DemoData data = new DemoData();
//            data.setString("字符串" + i);
//            data.setDate(new Date());
//            data.setDoubleData(0.56);
//            list.add(data);
        }
        return list;
    }

    public void simpleWrite() {
        PathTransition TestFileUtil = null;
        String fileName = TestFileUtil.getPath() + "write" + System.currentTimeMillis() + ".xlsx";
        // 这里 需要指定写用哪个class去读，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, DemoData.class).sheet("模板").doWrite(data());
    }

}

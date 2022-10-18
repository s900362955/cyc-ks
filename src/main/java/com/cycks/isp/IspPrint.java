package com.cycks.isp;

import com.opencsv.bean.CsvToBeanBuilder;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class IspPrint {
    public IspPrint(String link) throws FileNotFoundException, UnsupportedEncodingException, JRException {
        InputStreamReader file = new InputStreamReader(new FileInputStream(link), "UTF-8"); //input檔案，檔案編碼為UTF-8
        List<IspBean> beans = new CsvToBeanBuilder<IspBean>(file) //將CSV 儲存進beans，以供後續使用
                .withType(IspBean.class)
                .withSkipLines(1)
                .build()
                .parse();

        JRDataSource dataSource = new JRBeanCollectionDataSource(beans);
        JasperDesign design = JRXmlLoader.load("layout/Isp.jrxml"); // 版面位置
        JasperReport report = JasperCompileManager.compileReport(design);
        JasperPrint jasperPrint = JasperFillManager.fillReport(report, null, dataSource);
        JasperViewer jv = new JasperViewer(jasperPrint, false);  //開啟jasper列印前預覽視窗, false為預覽是窗關閉後程式不會隨之關閉，預設為ture
        jv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jv.setVisible(true);
    }
}

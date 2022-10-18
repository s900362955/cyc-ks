package com.cycks.isp;

import com.cycks.bill.BillPrint;
import net.sf.jasperreports.engine.JRException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static com.cycks.Log.logger;

public class Isp {
    private static String userSelection = ""; //CSV路徑存儲

    public static void isp() {
        Font font = new Font("msjh", Font.TYPE1_FONT, 30);
        JFrame selectFileWindow = new JFrame("列印寬頻");
        selectFileWindow.setSize(600, 400);
        selectFileWindow.setBackground(Color.white);
        selectFileWindow.setLayout(null);
        selectFileWindow.setResizable(false);
        selectFileWindow.setVisible(true);
        selectFileWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        TextArea textArea = new TextArea("", 10, 200, TextArea.SCROLLBARS_BOTH);
        textArea.setBounds(30, 80, 500, 300);
        textArea.setEditable(false);
        selectFileWindow.add(textArea);

        JButton select = new JButton("選擇列印檔");
        selectFileWindow.add(select);
        select.setFont(font);
        select.setBounds(10, 10, 200, 50);
        select.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser fileChooser = new JFileChooser(userSelection);//宣告filechooser
                int returnValue = fileChooser.showOpenDialog(null);//叫出filechooser
                if (returnValue == JFileChooser.APPROVE_OPTION) //判斷是否選擇檔案
                {
                    if (fileChooser.getSelectedFile().getName().toUpperCase().endsWith(".CSV")) { //判斷副檔名
                        userSelection = fileChooser.getSelectedFile().getAbsolutePath(); //儲存完整路徑
                        try {
                            textArea.setText(fileChooser.getSelectedFile().getName() + "   檔案讀取中...");
                            new IspPrint(userSelection);
                        } catch (IOException ex) {
                            logger.error(String.valueOf(ex));
                            textArea.setText(String.valueOf(ex));
                        } catch (JRException ex) {
                            JOptionPane.showMessageDialog(null, "版面或資料有問題!", "錯誤", JOptionPane.ERROR_MESSAGE);
                            logger.error(String.valueOf(ex));
                            textArea.setText(String.valueOf(ex));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "檔案錯誤!", "錯誤", JOptionPane.ERROR_MESSAGE);
                        textArea.setText("附檔名不是CSV，請選擇CSV檔");
                    }
                }
            }
        });
    }
}

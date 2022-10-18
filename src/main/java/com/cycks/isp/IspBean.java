package com.cycks.isp;

import com.opencsv.bean.CsvBindByPosition;

public class IspBean {
    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByPosition(position = 1)
    private String custNumber;

    @CsvBindByPosition(position = 2)
    private String name;

    @CsvBindByPosition(position = 3)
    private String company;

    @CsvBindByPosition(position = 5)
    private String email; //qrcode欄位，依檔案命名

    @CsvBindByPosition(position = 6)
    private String postCode;

    @CsvBindByPosition(position = 7)
    private String post;

    @CsvBindByPosition(position = 8)
    private String isp;

    @CsvBindByPosition(position = 10)
    private String product1;

    @CsvBindByPosition(position = 13)
    private String dueDate;

    @CsvBindByPosition(position = 15)
    private String bar1;

    @CsvBindByPosition(position = 16)
    private String bar2;

    @CsvBindByPosition(position = 17)
    private String bar3;

    @CsvBindByPosition(position = 21)
    private String amount;

    @CsvBindByPosition(position = 28)
    private String machinePost;

    @CsvBindByPosition(position = 29)
    private String postCoBar1;

    @CsvBindByPosition(position = 30)
    private String postCoBar2;

    @CsvBindByPosition(position = 31)
    private String postCoBar3;

    @CsvBindByPosition(position = 32)
    private String atm;

    @CsvBindByPosition(position = 39)
    private String chargeItems1;

    @CsvBindByPosition(position = 38)
    private String systemNum;

    @CsvBindByPosition(position = 40)
    private String chargeItems2;

    @CsvBindByPosition(position = 41)
    private String nameMasking;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getProduct1() {
        return product1;
    }

    public void setProduct1(String product1) {
        this.product1 = product1;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getBar1() {
        return bar1;
    }

    public void setBar1(String bar1) {
        this.bar1 = bar1;
    }

    public String getBar2() {
        return bar2;
    }

    public void setBar2(String bar2) {
        this.bar2 = bar2;
    }

    public String getBar3() {
        return bar3;
    }

    public void setBar3(String bar3) {
        this.bar3 = bar3;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMachinePost() {
        return machinePost;
    }

    public void setMachinePost(String machinePost) {
        this.machinePost = machinePost;
    }

    public String getPostCoBar1() {
        return postCoBar1;
    }

    public void setPostCoBar1(String postCoBar1) {
        this.postCoBar1 = postCoBar1;
    }

    public String getPostCoBar2() {
        return postCoBar2;
    }

    public void setPostCoBar2(String postCoBar2) {
        this.postCoBar2 = postCoBar2;
    }

    public String getPostCoBar3() {
        return postCoBar3;
    }

    public void setPostCoBar3(String postCoBar3) {
        this.postCoBar3 = postCoBar3;
    }

    public String getAtm() {
        return atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }

    public String getSystemNum() {
        return systemNum;
    }

    public void setSystemNum(String systemNum) {
        this.systemNum = systemNum;
    }

    public String getChargeItems1() {
        return chargeItems1;
    }

    public void setChargeItems1(String chargeItems1) {
        this.chargeItems1 = chargeItems1;
    }

    public String getChargeItems2() {
        return chargeItems2;
    }

    public void setChargeItems2(String chargeItems2) {
        this.chargeItems2 = chargeItems2;
    }

    public String getNameMasking() {
        return nameMasking;
    }

    public void setNameMasking(String nameMasking) {
        this.nameMasking = nameMasking;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{id=").append(id).append(", custNumber=").append(custNumber)
                .append(", name=").append(name).append(", company=").append(company)
                .append(", email=").append(email).append(", postCode=").append(postCode).append(", post=").append(post)
                .append(", isp=").append(isp).append(", product1=").append(product1)
                .append(", dueDate").append(dueDate).append(", bar1=").append(bar1)
                .append(", bar2=").append(bar2).append(", bar3=").append(bar3)
                .append(", amount=").append(amount).append(", machinePost").append(machinePost)
                .append(", postCoBar1=").append(postCoBar1).append(", postCoBar2=").append(postCoBar2)
                .append(", postCoBar3=").append(postCoBar3).append(", atm=").append(atm)
                .append(", systemNum=").append(systemNum).append(", chargeItems1=").append(chargeItems1)
                .append(", chargeItems2=").append(chargeItems2).append(", nameMasking=").append(nameMasking)
                .append("}");
        return builder.toString();
    }
}

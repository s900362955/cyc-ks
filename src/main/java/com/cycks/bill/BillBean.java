package com.cycks.bill;

import com.opencsv.bean.CsvBindByPosition;

public class BillBean {
    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByPosition(position = 1)
    private String custNumber;

    @CsvBindByPosition(position = 2)
    private String name;

    @CsvBindByPosition(position = 3)
    private String company;

    @CsvBindByPosition(position = 5)
    private String email;   //qrcode，配合檔案命名

    @CsvBindByPosition(position = 7)
    private String postCode;

    @CsvBindByPosition(position = 8)
    private String post;

    @CsvBindByPosition(position = 10)
    private String atm;

    @CsvBindByPosition(position = 11)
    private String amount;

    @CsvBindByPosition(position = 12)
    private String dueDate;

    @CsvBindByPosition(position = 13)
    private String bar1;

    @CsvBindByPosition(position = 14)
    private String bar2;

    @CsvBindByPosition(position = 15)
    private String bar3;

    @CsvBindByPosition(position = 16)
    private String nameMasking;

    @CsvBindByPosition(position = 18)
    private String product1;

    @CsvBindByPosition(position = 19)
    private String unitPrice1;

    @CsvBindByPosition(position = 20)
    private String postCoBar1;

    @CsvBindByPosition(position = 21)
    private String postCoBar2;

    @CsvBindByPosition(position = 22)
    private String postCoBar3;

    @CsvBindByPosition(position = 24)
    private String tollNumber;

    @CsvBindByPosition(position = 26)
    private String machinePost;

    @CsvBindByPosition(position = 38)
    private String product2;

    @CsvBindByPosition(position = 39)
    private String unitPrice2;

    @CsvBindByPosition(position = 41)
    private String product3;

    @CsvBindByPosition(position = 42)
    private String unitPrice3;

    @CsvBindByPosition(position = 44)
    private String product4;

    @CsvBindByPosition(position = 45)
    private String unitPrice4;

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

    public String getAtm() {
        return atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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

    public String getNameMasking() {
        return nameMasking;
    }

    public void setNameMasking(String nameMasking) {
        this.nameMasking = nameMasking;
    }

    public String getProduct1() {
        return product1;
    }

    public void setProduct1(String product1) {
        this.product1 = product1;
    }

    public String getUnitPrice1() {
        return unitPrice1;
    }

    public void setUnitPrice1(String unitPrice1) {
        this.unitPrice1 = unitPrice1;
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

    public String getTollNumber() {
        return tollNumber;
    }

    public void setTollNumber(String tollNumber) {
        this.tollNumber = tollNumber;
    }

    public String getMachinePost() {
        return machinePost;
    }

    public void setMachinePost(String machinePost) {
        this.machinePost = machinePost;
    }

    public String getProduct2() {
        return product2;
    }

    public void setProduct2(String product2) {
        this.product2 = product2;
    }

    public String getUnitPrice2() {
        return unitPrice2;
    }

    public void setUnitPrice2(String unitPrice2) {
        this.unitPrice2 = unitPrice2;
    }

    public String getProduct3() {
        return product3;
    }

    public void setProduct3(String product3) {
        this.product3 = product3;
    }

    public String getUnitPrice3() {
        return unitPrice3;
    }

    public void setUnitPrice3(String unitPrice3) {
        this.unitPrice3 = unitPrice3;
    }

    public String getProduct4() {
        return product4;
    }

    public void setProduct4(String product4) {
        this.product4 = product4;
    }

    public String getUnitPrice4() {
        return unitPrice4;
    }

    public void setUnitPrice4(String unitPrice4) {
        this.unitPrice4 = unitPrice4;
    }


    //StringBuilder要加上名稱，否則jasper無法辨別欄位
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{id=").append(id).append(", custNumber=").append(custNumber)
                .append(", name=").append(name).append(", company=").append(company)
                .append(", email=").append(email).append(", postCode=").append(postCode)
                .append(", post=").append(post).append(", atm=").append(atm)
                .append(", amount=").append(amount).append(", dueDate=").append(dueDate)
                .append(", bar1=").append(bar1).append(", bar2=").append(bar2)
                .append(", bar3=").append(bar3).append(", nameMasking=").append(nameMasking)
                .append(", product1=").append(product1).append(", unitPrice1=").append(unitPrice1)
                .append(", postCoBar1=").append(postCoBar1).append(", postCoBar2=").append(postCoBar2)
                .append(", postCoBar3=").append(postCoBar3).append(", tollNumber=").append(tollNumber)
                .append(", machinePost=").append(machinePost).append(", product2=").append(product2)
                .append(", unitPrice2=").append(unitPrice2).append(", product3=").append(product3)
                .append(", unitPrice3=").append(unitPrice3).append(", product4=").append(product4)
                .append(", unitPrice4=").append(unitPrice4).append("}");
        return builder.toString();
    }
}

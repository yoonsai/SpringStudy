package com.sist.dao;

import lombok.Data;

/*
 *    NO                                        NOT NULL NUMBER
 GOODS_NAME                                NOT NULL VARCHAR2(1000)
 GOODS_SUB                                          VARCHAR2(1000)
 GOODS_PRICE                               NOT NULL VARCHAR2(50)
 GOODS_DISCOUNT                                     NUMBER
 GOODS_FIRST_PRICE                                  VARCHAR2(20)
 GOODS_DELIVERY                            NOT NULL VARCHAR2(20)
 GOODS_POSTER                                       VARCHAR2(260)
 HIT                                                NUMBER
 */
@Data
public class GoodsVO {
   private int no,discount;
   private String name,sub,price,first_price,deliver;
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getFirst_price() {
	return first_price;
}
public void setFirst_price(String first_price) {
	this.first_price = first_price;
}
public String getDeliver() {
	return deliver;
}
public void setDeliver(String deliver) {
	this.deliver = deliver;
}
   
   
   
}

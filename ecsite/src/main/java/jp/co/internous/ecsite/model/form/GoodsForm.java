//String BootのFormクラスにはブラウザから送られた情報が自動的に格納される。

package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

//ブラウザから情報を受け取るFormクラスはSerializableというインターフェイスをimplementsする
public class GoodsForm implements Serializable{
	
	private int id;
	private String goodsName;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price =price;
	}
}

//domain(entity) - DBテーブルの1レコードを表すファイルを格納, DBテーブル「mst_goods」の実体


package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class MstGoods {
	private int id;
	private String goodsName;
	private int price;
	//MySQLのdatetime型はJavaのTimestamp型として定義
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
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
		this.price = price;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	

}

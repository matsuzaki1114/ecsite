//TblPurchaseを介してtbl_purchaseテーブルにアクセスするインターフェイス

package jp.co.internous.ecsite.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.internous.ecsite.model.dto.HistoryDto;

@Mapper
public interface TblPurchaseMapper {
	
	//購入履歴を検索するメソッド
	List<HistoryDto> findHistory(int userId);
	
	//ここに今までならSQL文を書いていた。
	//ORMapper = MyBatisではSQLをXMLファイルにも書くことができる。（CSS、JSと同じイメージ？）
	int insert(int userId, int goodsId, String goodsName, int itemCount, int total);
}

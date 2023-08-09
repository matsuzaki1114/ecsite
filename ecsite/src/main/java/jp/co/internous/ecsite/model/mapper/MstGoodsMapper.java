//全商品をmst_goodsテーブルから検索するためのDAO

package jp.co.internous.ecsite.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.ecsite.model.domain.MstGoods;

@Mapper
public interface MstGoodsMapper {
	
	
	
	//記述するSQLの種類によりアノテーションが変わる。SELECT>@Select, INSERT>@Insert, UPDATEやDELETE>@Update
	@Select(value="SELECT * FROM mst_goods")
	List<MstGoods> findAll();
	//findAllメソッドを呼び出すことで、呼び出し元にあるList<MstGoods>型の変数に、全ての商品情報（SQLによるSELECT * FROM文の実行結果）が代入される。
	
	@Insert("INSERT INTO mst_goods (goods_name, price) VALUES (#{goodsName}, #{price})")
	@Options(useGeneratedKeys=true, keyProperty="id")//idがauto_incrementで作成されている場合、これによりDB側で自動採番されるよう設定。
	int insert(MstGoods goods);
	
	@Update("DELETE FROM mst_goods WHERE id = #{id}")
	int deleteById(long id);

}

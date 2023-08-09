//ログインによってLoginFormに格納されるユーザ情報を条件に、データベースを検索するためのDAO

package jp.co.internous.ecsite.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.ecsite.model.domain.MstUser;
import jp.co.internous.ecsite.model.form.LoginForm;


//Mapperのメソッドが呼ばれるとそのメソッドに付随するSQLが実行される
@Mapper
public interface MstUserMapper {
	
	@Select(value="SELECT * FROM mst_user WHERE user_name = #{userName} and password = #{password}")
	MstUser findByUserNameAndPassword(LoginForm form);
	// ！ findByUser~メソッドを呼び出す（インスタンス化）することで、このSQLの実行結果が呼び出し元にあるMstUser型の変数に代入される
	
	@Select(value="SELECT count(id) FROM mst_user WHERE user_name = #{userName}")
	int findCountByUserName(String userName);
}

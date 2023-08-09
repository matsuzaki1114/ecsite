//ログイン入力情報をHTMLのformからJavaプログラムに渡すためのクラス

package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

//ブラウザから情報を受け取るFormクラスはserializableというインターフェイスをimplements
public class LoginForm implements Serializable {
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

//domain - DBテーブルの1レコードを表すファイルを格納

package jp.co.internous.ecsite.model.domain;

public class MstUser {
	
	//MySQLのvarchar = JavaではString, MySQLは_を使うスネーク記法 Javaでは大文字で区切るキャメル記法
	private int id;
	private String userName;
	private String password;
	private String fullName;
	private int isAdmin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

}

package com.util;

public class SingletonDesignPattern {

	public static void main(String[] args) {

		DbConnection con1 = DbConnection.getDbConnection();
		con1.print();

		DbConnection con2 = DbConnection.getDbConnection();
		con2.print();

		System.out.println(con1);
		System.out.println(con2);
		

	}
}

class DbConnection {
	// step2
	static DbConnection obj = null;

	// step1
	private DbConnection() {
	}

	// step3
	public static DbConnection getDbConnection() {
		if(obj == null) {
			obj = new DbConnection();
		}
		return obj;
	}

	void print() {
		System.out.println("print");
	}

}

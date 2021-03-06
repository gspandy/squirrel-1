package org.squirrel;
/**
 * SQL模型
 * @author Lychie Fan ( lychie@yeah.net )
 * @since 1.0.0
 */
public class SQLModel {
	
	private String sql;
	private Object[] params;
	private Object[] traces;
	
	public SQLModel(String sql, Object[] params, Object[] traces){
		this.sql = sql;
		this.params = params;
		this.traces = traces;
	}

	Object[] params() {
		return params;
	}

	@SuppressWarnings("unchecked")
	<E> E trace(int index) {
		return (E) traces[index];
	}
	
	public String build(boolean build) {
		if(build) System.out.println(sql);
		return sql;
	}
	
}
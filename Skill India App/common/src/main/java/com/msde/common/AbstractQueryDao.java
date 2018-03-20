package com.msde.common;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


public abstract class AbstractQueryDao {


	private static NamedParameterJdbcTemplate jdbcTemplate;

	/**
	 * @return the jdbcTemplate
	 */
	protected static NamedParameterJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate
	 *            the jdbcTemplate to set
	 */
	@Autowired
	@Qualifier(ApplicationDataSource.NAME)
	public void setJdbcTemplate(DataSource applicationDataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(
				applicationDataSource);
		
		
	}

}

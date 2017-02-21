package sbs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcAdrOptimaRepositoryImpl implements JdbcAdrOptimaRepository {

	 @Autowired 
	 @Qualifier("optimaAdrJdbcTemplate") 
	 protected JdbcTemplate jdbc;

	@Override
	public List<String> findAllUsers() {

        List<Map<String,Object>> resultSet = jdbc.queryForList(
        		"SELECT [PRI_PriId],[PRI_Nazwisko],[PRI_Imie1] FROM [CDN_ADR].[CDN].[Pracidx]"
        		,
                new Object[]{});
        
        List<String> result = new ArrayList<>();
        for(Map<String,Object> row: resultSet ){
        	result.add((String)row.get("PRI_Nazwisko") + " " + row.get("PRI_Imie1"));
        } 
		
		return result;
	}

}
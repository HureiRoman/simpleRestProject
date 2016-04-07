package my.restserver.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.test.jdbc.JdbcTestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

@Controller
@ComponentScan(basePackages = { "my.restserver.service" })
public class GeneralController {

	@Autowired
	Environment environment;

	@RequestMapping(value = "/")
	public ModelAndView welcomePage() {
		ModelAndView modelAndView = new ModelAndView("welcome");
		return modelAndView;
	}

	@RequestMapping(value = "/fillDatabase")
	public ModelAndView fillDatabase() {
		
		MysqlDataSource ds = new MysqlDataSource();
		
		ds.setURL(environment.getProperty("jdbc.url"));
		ds.setUser(environment.getProperty("jdbc.user"));
		ds.setPassword(environment.getProperty("jdbc.pass"));
		
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);

			BufferedReader in = new BufferedReader(new InputStreamReader(
					getClass().getResourceAsStream("/BaseScript.sql")));
			
			LineNumberReader fileReader = new LineNumberReader(in);
			
			String query = JdbcTestUtils.readScript(fileReader);
			String[] queries = query.split(";");

			for (int i = 0; i < queries.length; i++)
				jdbcTemplate.execute(queries[i]);
		} catch (Exception e) {
			System.out.println(e);
		}
		return new ModelAndView("redirect:" + "/");
	}
}

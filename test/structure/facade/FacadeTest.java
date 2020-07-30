package structure.facade;

import java.sql.Connection;

import org.junit.Test;

import structure.facade.example1.HelperFacade;
import structure.facade.example1.MySqlHelper;
import structure.facade.example1.OracleHelper;

public class FacadeTest {

	@Test
	public void dbHelperTest() {
		String tableName = "employee";
		
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport();
		
		Connection con2 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport();
		
		// facade »ç¿ë
		HelperFacade.generateReport(HelperFacade.DBType.MYSQL, HelperFacade.ReportType.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBType.ORCLE, HelperFacade.ReportType.PDF, tableName);
	}
}

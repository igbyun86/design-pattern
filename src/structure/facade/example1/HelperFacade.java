package structure.facade.example1;

import java.sql.Connection;

public class HelperFacade {

	public static void generateReport(DBType dbType, ReportType reportType, String tableName) {
		Connection con = null;
		switch (dbType) {
			case MYSQL:
				con = MySqlHelper.getMySqlDBConnection();
				MySqlHelper mySqlHelper = new MySqlHelper();

				switch (reportType) {
					case HTML:
						mySqlHelper.generateMySqlHTMLReport();
						break;
					case PDF:
						mySqlHelper.generateMySqlPDFReport();
						break;
					default:
						break;
				}
				
				break;
			case ORCLE:
				con = OracleHelper.getOracleDBConnection();
				OracleHelper oracleHelper = new OracleHelper();
				
				switch (reportType) {
					case HTML:
						oracleHelper.generateOracleHTMLReport();
						break;
					case PDF:
						oracleHelper.generateOraclePDFReport();
						break;
					default:
						break;
				}
				
				break;
			default:
				break;
		}
	}
	
	public static enum DBType {
		MYSQL,
		ORCLE
	}
	
	public static enum ReportType {
		HTML,
		PDF
	}
	
}

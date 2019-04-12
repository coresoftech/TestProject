package base;

public class ConfigExtentReports extends BaseClass {
	

public String getReportConfigPath(){
	
	String reportConfigPath = BaseClass.extentPath;
	if(reportConfigPath!= null) 
		return reportConfigPath;
	
	else 
		throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		

}
}

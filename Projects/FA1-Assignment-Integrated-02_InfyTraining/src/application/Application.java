package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.apache.logging.log4j.Logger;

import resources.LogConfig;

public class Application {
	
	public Integer bookAssessment(Booking booking) throws Exception {
		Validator v=new Validator();
		Integer result=null;
		DataProvider dpr=new DataProvider();
		
		try {
			v.validate(booking);
			booking.setDurationInMin(getDurationOfExam(booking.getAssessmentType()));
			result=dpr.bookAssessment(booking);
			
			
		} catch (Exception e) {
			if(e.getMessage().contains("Application"))
			{
					LogConfig.getLogger(this.getClass()).error(e.getMessage(),e);			
			}
			throw e;
		}
		
		return result;
	}
	
	public Integer getDurationOfExam(String assessmentType) {
		DataProvider dp1=new DataProvider();
		Map<String, Integer> m1=new HashMap<>();
		Integer d1=0;
		try {
			m1=dp1.getExamDuration();
			d1=m1.get(assessmentType);
		
			
		}  catch (Exception e) {
			if(e.getMessage().contains("Application"))
			{
					LogConfig.getLogger(this.getClass()).error(e.getMessage(),e);			
			}
			throw e;
		}
		return d1;
	}
	
	public List<Report> getAssessmentReport(String batchName) throws Exception {
		List<Report> batchNameList=new ArrayList<Report>();
		List<Report> assesmentList=new ArrayList<Report>();
//		DataProvider dataProvider = new DataProvider();
//		
//		try {
//			assesmentList = dataProvider.getAssessmentReport();
//			for(Report report: assesmentList) {
//				if(report.getBatchName().equals(batchName) && report.getAssessmentDate().isAfter(LocalDate.now()))
//					batchNameList.add(report);
//			}
//			
//			if(batchNameList.isEmpty())
//				throw new Exception("Application.NO_RECORDS_FOUND");
//		}
//		catch (Exception e) {
//			Logger logger  = LogConfig.getLogger(this.getClass());
//			if(e.getMessage().contains("Application")){
//				logger.error(e.getMessage(),e);
//					//LogConfig.getLogger(this.getClass()).error(e.getMessage(),e);			
//			}
//			throw e;
//		}
//		
//		return batchNameList;
		DataProvider dp2=new DataProvider();
		int c=0;
		try {
			assesmentList=dp2.getAssessmentReport();
			for (Report report : assesmentList) {
				if(report.getBatchName()==batchName && report.getAssessmentDate().isAfter(LocalDate.now()))
				{
					batchNameList.add(report);
					c++;
				}
			}
			if(c==0)
			{
				throw new Exception("Application.NO_RECORDS_FOUND");
			}
			
		} catch (Exception e) {
			if(e.getMessage().contains("Application"))
			{
					LogConfig.getLogger(this.getClass()).error(e.getMessage(),e);			
			}
			throw e;
			// TODO: handle exception
		}
		return batchNameList;
	}
}

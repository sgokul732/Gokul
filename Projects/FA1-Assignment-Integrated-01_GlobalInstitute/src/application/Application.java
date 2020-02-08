package application;

import java.util.ArrayList;
import java.util.List;

import resources.LogConfig;

public class Application {

	// can have status as 'P' only if all 3 marks are 50 and above
	public String addStudent(Student student) throws Exception {
		Validator v= new Validator();
		String result="";
		DataProvider dp=new DataProvider();
		
		try{
			v.validate(student);
			if(student.getMark1()>=50 && student.getMark2()>=50 && student.getMark3()>=50 && student.getResult()=='F')
				throw new Exception("Application.INVALID_RESULT_PASS");
			else if(student.getMark1()<50 || student.getMark2()<50 || student.getMark3()<50 && student.getResult()=='P')
				throw new Exception("Application.INVALID_RESULT_FAIL");	
			else
			
			result=dp.addStudent(student);
			
		}
		catch(Exception e)
		{	LogConfig.getLogger(this.getClass()).error(e.getMessage(), e);
			throw e;
			
		}
		
		return result;
	}

	public String calculateGrade(StudentReport studentReport) throws Exception {
		Integer m=studentReport.getTotalMarks();
		Integer n=studentReport.getNoOfSubjects();
		String grade="";
		try{
		if( studentReport.getResult().equals('F'))
			grade="NA";
		else if(studentReport.getResult().equals('P'))
		{                                                               
			if(m/n>=90)
				grade="A+";
			else if(m/n>=80 && m/n<90)
				grade="A";
			else if(m/n>=70 && m/n<80 )
				grade="B";
			else if(m/n<70)
				grade="C";
           


		}
		}
		catch(Exception e)
		{    if(e.getMessage().contains("Application")){
           LogConfig.getLogger(this.getClass()).error(e.getMessage(),e);
            }
            throw e;

		}
		
		return grade;
	}

	public List<StudentReport> getGradesForStudentsInRange(String range) throws Exception {
		
        DataProvider d = new DataProvider();
        List<StudentReport> list = d.getAllStudents();
        
        int lRange;
        int uRange;
        String rArr[] = range.split("-");
        lRange = Integer.parseInt(rArr[0]);
        uRange = Integer.parseInt(rArr[1]);
        
        List<StudentReport> list2 = new ArrayList<>();
        
        try {
                        
                        
                        for(StudentReport stu: list)
                                        if(stu.getTotalMarks() >= lRange && stu.getTotalMarks() <= uRange)
                                                        list2.add(stu);
                        
                        if(list2.isEmpty())
                                        throw new Exception("Application.NO_RECORDS");
                        
                        
                        for(StudentReport stu: list2) {
                                        stu.setGrade(calculateGrade(stu));
                        }              
        }
        catch(Exception e){
                        if(e.getMessage().contains("Application")){
                        LogConfig.getLogger(this.getClass()).error(e.getMessage(),e);
                        }
                        throw e;
        }
                                        
        return list2;

	}
}

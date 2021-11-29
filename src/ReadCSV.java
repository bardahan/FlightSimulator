import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class ReadCSV { // עמודות של מערך 
	
	private String myfilename;
	private Col[] cols;
	
	public ReadCSV(String csvFileName) {	
		this.myfilename = csvFileName;
		this.readcsvfile();
	}
	
	
	public class Col{ // עמודה
		private String name;
		private ArrayList<Float> floats;
		
		
		public Col(String name) {
			
			this.name = name;
			this.floats = new ArrayList<Float>();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public ArrayList<Float> getFloats() {
			return floats;
		}
		
		public int SizeArray(ArrayList<Float> floats)
		{
			return floats.size();
		}
		
		public void setFloats(ArrayList<Float> floats) {
			this.floats = floats;
		}
	}
	
	
	
	public Col[] getCols() {
		return cols;
	}



	public void setCols(Col[] cols) {
		this.cols = cols;
	}



	public void readcsvfile() { // מקובץ קריאה
		
		  
		String splitBy = ",";
		
		try{
			 BufferedReader br = new BufferedReader(new FileReader(this.myfilename));
			 String line = br.readLine() ;
			 int i = 0;
			 String[] lineCol = line.split(splitBy);
			 cols = new Col[lineCol.length];
			  if(lineCol.length <= 1) {
			     line = br.readLine();
			     lineCol = line.split(splitBy);	
			     cols = new Col[lineCol.length];
			  }
			  for(int j = 0; j < lineCol.length; j++) // העמודה שם
			    {
			    		 cols[j] = new Col(lineCol[j]);
			    }
				 while((line = br.readLine()) != null) {
				 lineCol = line.split(splitBy);
				 for(int j = 0; j < lineCol.length; j++) // בעמודה המספר
		    	 {
		    		 cols[j].getFloats().add(Float.parseFloat(lineCol[j]));
		    		 
		    	 }
		     }
			 br.close();
			 System.out.println("donecol");

		} catch (IOException e) {
			
		}
	}



	
}

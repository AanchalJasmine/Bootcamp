package Feb_20_2023; 
public class FileOutputStream {
	 
	
	    public FileOutputStream(String string) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
	             fout.write(65);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }

		void close() {
			// TODO Auto-generated method stub
			
		}

		void write(int i) {
			// TODO Auto-generated method stub
			
		}    
	}  


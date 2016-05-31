package model;

public class guitarspec {

	private String builder; 
	  
	  private String type;
	  private String backWood;
	 

	  public guitarspec() {
	 
	  }

	  public void setBuilder(String builder) {
			this.builder = builder;
		}
	  
	  public String getBuilder() {
	    return builder;
	  }
	  
	  

	  public String getType() {
	    return type;
	  }

	  public String getBackWood() {
	    return backWood;
	  }

	 
	

		public void setBackWood(String backwood) {
			 this.backWood = backwood;
			
		}

		public void setType(String type) {
			this.type=type;
		}
		
		
		
	  public boolean matches(guitarspec spec) {
		  if(spec.getType()!=null && !spec.getType().equals(type)){
				return false;
			}
			if(spec.getBuilder()!=null && !spec.getBuilder().equals(builder)){
				return false;
			}
			
			if(spec.getBackWood()!=null && !spec.getBackWood().equals(backWood)){
				return false;
			}
			return true;
	  }
	  }



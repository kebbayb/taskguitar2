package model;

public class guitar {
	 private String ID;
	  private String price;
	  guitarspec spec;

	  public guitar() {
	 
	  }

		public String getID() {
			return ID;
		}

		public void setID(String ID) {
            this.ID=ID;
        }

	  public String getPrice() {
	    return price;
	  }

	  public void setPrice(String newPrice) {
	    this.price = newPrice;
	  }

	  public guitarspec getSpec() {
	    return spec;
	  }

	public void setGuitarSpec(guitarspec spec) {
		 this.spec = spec;
	}


	}


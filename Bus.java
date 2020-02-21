package encapsulation;

public class bus {

		private int time;
	    private String name;
	    private int passengers;

	    //Getter and Setter methods
	    public String getName(){
	        return name ;
	    }

	    public int getAverageWaitTime(){
	        return time;
	    }

	    public int getPassengers(){
	        return passengers;
	    }

	    public void setAverageWaitTime(int time){
	        this.time=time;
	    }

	    public void setName(String name){
	        this.name=name;
	    }

	    public void setPassengers(int passengers){
	       this.passengers = passengers;
	    }
	}





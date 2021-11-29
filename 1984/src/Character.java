
public class Character {

	private String 	name;
	private String 	vorName;

	//GETMETHOD
	public String getName(){
		return name;
	}
	public String getVorName(){
		return vorName;
	}

	//SETMETHOD
	public void setName (String name){
		this.name= name;
	}
	public void setVorName (String vorName){
		this.vorName= vorName;
	}
				
//First character Winston Smith:
public class WinstonSmith extends Character {		
	private int 	alter;
	private String 	krankheiten;
	private int 	healthPoints;
	private int 	traitorPoints;
	private int 	partyPoints;	
	
	//GETMETHOD
	public int getAlter(){
		return alter;
	}
	public String getKrankheiten(){
		return krankheiten;
	}
	public int getHealthPoints(){
		return healthPoints; 
	}
	private int getTraitorPoints(){
		return traitorPoints;
	}
	private int getPartyPoints(){
		return partyPoints;
	}
	//SETMETHOD
	public void setAlter(int alter){
		this.alter= alter;
	}
	public void setKranktheiten(String krankheiten){
		this.krankheiten= krankheiten; 
	}
	public void setHealthPoints(int healthPoints){
		this.healthPoints= healthPoints;
	}
	public void setTraitorPoints(int traitorPoints){
		this.traitorPoints= traitorPoints;
	}
	public void setPartyPoints(int partyPoints){
		this.partyPoints= partyPoints;
	}
	}//Ende Class Winston






}//Ende Class Character

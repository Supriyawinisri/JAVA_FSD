package comm.example.enum1;

public class TennisCoach implements Coach {
	
	private String name;
	private Level level;
	
	public TennisCoach() {
		super();
	}
	
	public void createCoach(String name, Level level) {
		this.name = name;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practise back Tennis today...";
	}

	public String getCoachDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nToday's workout plan: "+getDailyWorkOut());
		sb.append("\nName of the coach: "+getName());
		sb.append("\nlevel of the coach: "+getLevel());
		sb.append("\nRank of the coach: "+level.getLevelCode());
		return sb.toString();
	}

}

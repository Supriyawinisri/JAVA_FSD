package comm.example.enum1;

public enum Level {

	HIGH(3),
	MEDIUM(2),
	LOW(1);
	private int level_code ;
	private Level(int levelCode) {
		this.level_code = levelCode;
	}
	public int getLevelCode() {
		return level_code;
	}
}
package comm.example.abstrct1;

public class Line extends Model {
	
	public int startLine, endLine;

	public int getStartLine() {
		return startLine;
	}

	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}

	public int getEndLine() {
		return endLine;
	}

	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	public Line() {
		super();
	}

	public Line(int startLine, int endLine) {
		super();
		this.startLine = startLine;
		this.endLine = endLine;
	}
	
	public int calculate() {
		return getEndLine() - getStartLine();
	}

	@Override
	public boolean isGreater(Object obj) {
		// TODO Auto-generated method stub
		Line line = (Line)obj;
		if(line.calculate() > this.calculate()) {
			
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isLesser(Object obj) {
		// TODO Auto-generated method stub
		Line line = (Line)obj;
		if(line.calculate() < this.calculate()) {
			
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isEqual(Object obj) {
		// TODO Auto-generated method stub
		Line line = (Line)obj;
		if(line.calculate() == this.calculate()) {
			
			return true;
		}
		else {
			return false;
		}
	}

}

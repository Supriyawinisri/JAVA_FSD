package comm.example.model;

public class Aeroplane {

	private int plane_id;
	private String plane_name;
	private int seat_no;

	public Aeroplane(int plane_id, String plane_name, int seat_no) {
		super();
		this.plane_id = plane_id;
		this.plane_name = plane_name;
		this.seat_no = seat_no;
	}

	@Override
	public String toString() {
		return "Aeroplane [plane_id=" + plane_id + ", plane_name=" + plane_name + ", seat_no=" + seat_no + "]";
	}

	public int getPlane_id() {
		return plane_id;
	}

	public void setPlane_id(int plane_id) {
		this.plane_id = plane_id;
	}

	public String getPlane_name() {
		return plane_name;
	}

	public void setPlane_name(String plane_name) {
		this.plane_name = plane_name;
	}

	public int getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}

}

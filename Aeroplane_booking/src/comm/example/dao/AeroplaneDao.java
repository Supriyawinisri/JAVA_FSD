package comm.example.dao;

import java.util.List;

import comm.example.model.Aeroplane;

public interface AeroplaneDao {
	
	public void createAeroplane(Aeroplane aeroplane);
	public List<Aeroplane> getAllAeroplane();

}

package comm.example.service;

import java.util.List;

import comm.example.model.Aeroplane;

public interface AeroplaneService {
	
	public void createAeroplane(Aeroplane aeroplane);
	public List<Aeroplane> getAllAeroplane();

}

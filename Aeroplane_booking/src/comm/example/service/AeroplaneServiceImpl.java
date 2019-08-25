package comm.example.service;

import java.sql.SQLException;
import java.util.List;

import comm.example.dao.AeroplaneDao;
import comm.example.dao.AeroplaneDaoImpl;
import comm.example.model.Aeroplane;

public class AeroplaneServiceImpl implements AeroplaneService {
	
	private AeroplaneDao dao = null;
	
	public AeroplaneServiceImpl() throws SQLException {
		super();
		dao = new AeroplaneDaoImpl();
	}

	@Override
	public void createAeroplane(Aeroplane aeroplane) {
		// TODO Auto-generated method stub
		dao.createAeroplane(aeroplane);
		
	}

	@Override
	public List<Aeroplane> getAllAeroplane() {
		// TODO Auto-generated method stub
		return dao.getAllAeroplane();
	}

}

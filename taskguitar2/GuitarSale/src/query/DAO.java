package query;


import java.util.List;
import model.guitar;


public interface DAO {
	public List<guitar> guitars();

	public List<guitar> search(String type);
}

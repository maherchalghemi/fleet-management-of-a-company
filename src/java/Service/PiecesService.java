package Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import Model.Pieces;
import DAO.IPiecesDAO;

/**
 * 
 * Pieces Service
 * 
 *
 */
@Transactional(readOnly = true)
public class PiecesService implements IPiecesService {

	// PiecesDAO is injected...
	IPiecesDAO piecesDAO;
	
	/**
	 * Add Pieces
	 * 
	 * @param  Pieces pieces
	 */
	@Transactional(readOnly = false)
	@Override
	public void addPieces(Pieces pieces) {
		getPiecesDAO().addPieces(pieces);
	}

	/**
	 * Delete Pieces
	 * 
	 * @param  Pieces pieces
	 */
	@Transactional(readOnly = false)
	@Override
	public void deletePieces(Pieces pieces) {
		getPiecesDAO().deletePieces(pieces);
	}
	
	/**
	 * Update Pieces
	 * 
	 * @param  Pieces pieces
	 */
	@Transactional(readOnly = false)
	@Override
	public void updatePieces(Pieces pieces) {
		getPiecesDAO().updatePieces(pieces);
	}
	
	/**
	 * Get Pieces
	 * 
	 * @param  int Pieces Id
	 */
	
	public Pieces getPiecesById(int id) {
		return getPiecesDAO().getPiecesById(id);
	}

	/**
	 * Get Pieces List
	 * 
	 */
	@Override
	public List<Pieces> getPieces() {	
		return getPiecesDAO().getPieces();
	}

	/**
	 * Get Pieces DAO
	 * 
	 * @return IPiecesDAO - Pieces DAO
	 */
	public IPiecesDAO getPiecesDAO() {
		return piecesDAO;
	}

	/**
	 * Set Pieces DAO
	 * 
	 * @param IPiecesDAO - Pieces DAO
	 */
	public void setPiecesDAO(IPiecesDAO piecesDAO) {
		this.piecesDAO = piecesDAO;
	}

}

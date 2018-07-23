package Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import Model.DemPiece;
import DAO.IDemandPieceDAO;

/**
 * 
 * DemandPiece Service
 * 
 *
 */
@Transactional(readOnly = true)
public class DemandPieceService implements IDemandPieceService {

	// DemandPieceDAO is injected...
	IDemandPieceDAO demandPieceDAO;
	
	/**
	 * Add DemandPiece
	 * 
	 * @param  DemandPiece demandPiece
	 */
	@Transactional(readOnly = false)
	@Override
	public void addDemandPiece(DemPiece demandPiece) {
		getDemandPieceDAO().addDemandPiece(demandPiece);
	}

	/**
	 * Delete DemandPiece
	 * 
	 * @param  DemandPiece demandPiece
	 */
	@Transactional(readOnly = false)
	@Override
	public void deleteDemandPiece(DemPiece demandPiece) {
		getDemandPieceDAO().deleteDemandPiece(demandPiece);
	}
	
	/**
	 * Update DemandPiece
	 * 
	 * @param  DemandPiece demandPiece
	 */
	@Transactional(readOnly = false)
	@Override
	public void updateDemandPiece(DemPiece demandPiece) {
		getDemandPieceDAO().updateDemandPiece(demandPiece);
	}
	
	/**
	 * Get DemandPiece
	 * 
	 * @param  int DemandPiece Id
	 */
	
	public DemPiece getDemandPieceById(int id) {
		return getDemandPieceDAO().getDemandPieceById(id);
	}

	/**
	 * Get DemandPiece List
	 * 
	 */
	@Override
	public List<DemPiece> getDemandPiece() {	
		return getDemandPieceDAO().getDemandPiece();
	}

	/**
	 * Get DemandPiece DAO
	 * 
	 * @return IDemandPieceDAO - DemandPiece DAO
	 */
	public IDemandPieceDAO getDemandPieceDAO() {
		return demandPieceDAO;
	}

	/**
	 * Set DemandPiece DAO
	 * 
	 * @param IDemandPieceDAO - DemandPiece DAO
	 */
	public void setDemandPieceDAO(IDemandPieceDAO demandPieceDAO) {
		this.demandPieceDAO = demandPieceDAO;
	}

}

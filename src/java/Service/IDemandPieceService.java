package Service;

import java.util.List;

import Model.DemPiece;

/**
 * 
 * DemandPiece Service Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface IDemandPieceService {
	
	/**
	 * Add DemandPiece
	 * 
	 * @param  DemandPiece demandPiece
	 */
	public void addDemandPiece(DemPiece demandPiece);
	
	/**
	 * Update DemandPiece
	 * 
	 * @param  DemandPiece demandPiece
	 */
	public void updateDemandPiece(DemPiece demandPiece);

	/**
	 * Delete DemandPiece
	 * 
	 * @param  DemandPiece demandPiece
	 */
	public void deleteDemandPiece(DemPiece demandPiece);
	
	/**
	 * Get DemandPiece
	 * 
	 * @param  int DemandPiece Id
	 */
	public DemPiece getDemandPieceById(int id);
	
	/**
	 * Get DemandPiece List
	 * 
	 * @return List - DemandPiece list
	 */
	public List<DemPiece> getDemandPiece();
}

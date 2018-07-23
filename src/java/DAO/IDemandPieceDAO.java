package DAO;

import java.util.List;

import Model.DemPiece;

/**
 * 
 * DemandPiece DAO Interface
 * 
 *
 */
public interface IDemandPieceDAO {

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
	 */
	public List<DemPiece> getDemandPiece();
}

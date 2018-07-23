package DAO;

import java.util.List;

import Model.Pieces;

/**
 * 
 * Pieces DAO Interface
 * 
 *
 */
public interface IPiecesDAO {

	/**
	 * Add Pieces
	 * 
	 * @param  Pieces pieces
	 */
	public void addPieces(Pieces pieces);
	
	/**
	 * Update Pieces
	 * 
	 * @param  Pieces pieces
	 */
	public void updatePieces(Pieces pieces);
	
	/**
	 * Delete Pieces
	 * 
	 * @param  Pieces pieces
	 */
	public void deletePieces(Pieces pieces);
	
	/**
	 * Get Pieces
	 * 
	 * @param  int Pieces Id
	 */
	public Pieces getPiecesById(int id);
	
	/**
	 * Get Pieces List
	 * 
	 */
	public List<Pieces> getPieces();
}

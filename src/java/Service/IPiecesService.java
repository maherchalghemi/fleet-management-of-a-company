package Service;

import java.util.List;

import Model.Pieces;

/**
 * 
 * Pieces Service Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface IPiecesService {
	
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
	 * @return List - Pieces list
	 */
	public List<Pieces> getPieces();
}

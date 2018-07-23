package DAO;

import java.util.List;

import Model.Pieces;

import org.hibernate.SessionFactory;

/**
 * 
 * Pieces DAO
 * 
 *
 */

public class PiecesDAO implements IPiecesDAO {
	
	private SessionFactory sessionFactory;

	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	/**
	 * Add Pieces
	 * 
	 * @param  Pieces pieces
	 */
	@Override
	public void addPieces(Pieces pieces) {
		getSessionFactory().getCurrentSession().save(pieces);
	}

	/**
	 * Delete Pieces
	 * 
	 * @param  Pieces pieces
	 */
	@Override
	public void deletePieces(Pieces pieces) {
		getSessionFactory().getCurrentSession().delete(pieces);
	}

	/**
	 * Update Pieces
	 * 
	 * @param  Pieces pieces
	 */
	@Override
	public void updatePieces(Pieces pieces) {
		getSessionFactory().getCurrentSession().update(pieces);
	}

	/**
	 * Get Pieces
	 * 
	 * @param  int Pieces Id
	 * @return Pieces 
	 */
	@Override
	public Pieces getPiecesById(int id) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from Pieces where idP=?")
									        .setParameter(0, id).list();
		return (Pieces)list.get(0);
	}

	/**
	 * Get Pieces List
	 * 
	 * @return List - Pieces list
	 */
	@Override
	public List<Pieces> getPieces() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Pieces").list();
		return list;
	}

}

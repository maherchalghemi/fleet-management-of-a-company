package DAO;

import java.util.List;

import Model.DemPiece;

import org.hibernate.SessionFactory;

/**
 * 
 * DemandPiece DAO
 * 
 *
 */

public class DemandPieceDAO implements IDemandPieceDAO {
	
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
	 * Add DemandPiece
	 * 
	 * @param  DemandPiece demandPiece
	 */
	@Override
	public void addDemandPiece(DemPiece demandPiece) {
		getSessionFactory().getCurrentSession().save(demandPiece);
	}

	/**
	 * Delete DemandPiece
	 * 
	 * @param  DemandPiece demandPiece
	 */
	@Override
	public void deleteDemandPiece(DemPiece demandPiece) {
		getSessionFactory().getCurrentSession().delete(demandPiece);
	}

	/**
	 * Update DemandPiece
	 * 
	 * @param  DemandPiece demandPiece
	 */
	@Override
	public void updateDemandPiece(DemPiece demandPiece) {
		getSessionFactory().getCurrentSession().update(demandPiece);
	}

	/**
	 * Get DemandPiece
	 * 
	 * @param  int DemandPiece Id
	 * @return DemandPiece 
	 */
	@Override
	public DemPiece getDemandPieceById(int id) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from DemPiece where id_c=?")
									        .setParameter(0, id).list();
		return (DemPiece)list.get(0);
	}

	/**
	 * Get DemandPiece List
	 * 
	 * @return List - DemandPiece list
	 */
	@Override
	public List<DemPiece> getDemandPiece() {
		List list = getSessionFactory().getCurrentSession().createQuery("from DemPiece").list();
		return list;
	}

}

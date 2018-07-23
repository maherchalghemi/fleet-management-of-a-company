package DAO;

import java.util.List;

import Model.DemCarb;

import org.hibernate.SessionFactory;

/**
 * 
 * DemandCarburant DAO
 * 
 *
 */

public class DemandCarburantDAO implements IDemandCarburantDAO {
	
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
	 * Add DemandCarburant
	 * 
	 * @param  DemandCarburant demandCarburant
	 */
	@Override
	public void addDemandCarburant(DemCarb demandCarburant) {
		getSessionFactory().getCurrentSession().save(demandCarburant);
	}

	/**
	 * Delete DemandCarburant
	 * 
	 * @param  DemandCarburant demandCarburant
	 */
	@Override
	public void deleteDemandCarburant(DemCarb demandCarburant) {
		getSessionFactory().getCurrentSession().delete(demandCarburant);
	}

	/**
	 * Update DemandCarburant
	 * 
	 * @param  DemandCarburant demandCarburant
	 */
	@Override
	public void updateDemandCarburant(DemCarb demandCarburant) {
		getSessionFactory().getCurrentSession().update(demandCarburant);
	}

	/**
	 * Get DemandCarburant
	 * 
	 * @param  int DemandCarburant Id
	 * @return DemandCarburant 
	 */
	@Override
	public DemCarb getDemandCarburantById(int id) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from DemCarb where id_c=?")
									        .setParameter(0, id).list();
		return (DemCarb)list.get(0);
	}

	/**
	 * Get DemandCarburant List
	 * 
	 * @return List - DemandCarburant list
	 */
	@Override
	public List<DemCarb> getDemandCarburant() {
		List list = getSessionFactory().getCurrentSession().createQuery("from DemCarb").list();
		return list;
	}

}

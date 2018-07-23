package DAO;

import java.util.List;

import Model.Affectations;
import java.util.Date;

import org.hibernate.SessionFactory;

/**
 * 
 * Affectations DAO
 * 
 *
 */

public class AffectationsDAO implements IAffectationsDAO {
	
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
	 * Add Affectations
	 * 
	 * @param  Affectations affectations
	 */
	@Override
	public void addAffectations(Affectations affectations) {
		getSessionFactory().getCurrentSession().save(affectations);
	}

	/**
	 * Delete Affectations
	 * 
	 * @param  Affectations affectations
	 */
	@Override
	public void deleteAffectations(Affectations affectations) {
		getSessionFactory().getCurrentSession().delete(affectations);
	}

	/**
	 * Update Affectations
	 * 
	 * @param  Affectations affectations
	 */
	@Override
	public void updateAffectations(Affectations affectations) {
		getSessionFactory().getCurrentSession().update(affectations);
	}

	/**
	 * Get Affectations
	 * 
	 * @param  int Affectations Id
	 * @return Affectations 
	 */
	@Override
	public Affectations getAffectationsById(int id) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from Affectations where idAffectations=?")
									        .setParameter(0, id).list();
		return (Affectations)list.get(0);
	}

	/**
	 * Get Affectations List
	 * 
	 * @return List - Affectations list
	 */
	@Override
	public List<Affectations> getAffectations() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Affectations").list();
		return list;
	}

}

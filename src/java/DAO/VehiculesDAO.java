package DAO;

import java.util.List;

import Model.Vehicules;

import org.hibernate.SessionFactory;

/**
 * 
 * Vehicules DAO
 * 
 *
 */

public class VehiculesDAO implements IVehiculesDAO {
	
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
	 * Add Vehicules
	 * 
	 * @param  Vehicules vehicules
	 */
	@Override
	public void addVehicules(Vehicules vehicules) {
		getSessionFactory().getCurrentSession().save(vehicules);
	}

	/**
	 * Delete Vehicules
	 * 
	 * @param  Vehicules vehicules
	 */
	@Override
	public void deleteVehicules(Vehicules vehicules) {
		getSessionFactory().getCurrentSession().delete(vehicules);
	}

	/**
	 * Update Vehicules
	 * 
	 * @param  Vehicules vehicules
	 */
	@Override
	public void updateVehicules(Vehicules vehicules) {
		getSessionFactory().getCurrentSession().update(vehicules);
	}

	/**
	 * Get Vehicules
	 * 
	 * @param  String Vehicules Id
	 * @return Vehicules 
	 */
	@Override
	public Vehicules getVehiculesById(String id) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from Vehicules where idV=?")
									        .setParameter(0, id).list();
		return (Vehicules)list.get(0);
	}

	/**
	 * Get Vehicules List
	 * 
	 * @return List - Vehicules list
	 */
	@Override
	public List<Vehicules> getVehicules() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Vehicules").list();
		return list;
	}
        
        /**
	 * Get Vehicules List
	 * 
	 * @return List - Vehicules dispo list
	 */
	@Override
	public List<Vehicules> getVehiculesDispo() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Vehicules where dispo = 1 and panne = 0").list();
		return list;
	}
        
        	public List<Vehicules> getVehiculesPanne() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Vehicules where panne = 1").list();
		return list;
	}

}

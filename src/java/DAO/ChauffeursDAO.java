package DAO;

import java.util.List;

import Model.Chauffeurs;
import java.util.Date;

import org.hibernate.SessionFactory;

/**
 * 
 * Chauffeurs DAO
 * 
 *
 */

public class ChauffeursDAO implements IChauffeursDAO {
	
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
	 * Add Chauffeurs
	 * 
	 * @param  Chauffeurs chauffeurs
	 */
	@Override
	public void addChauffeurs(Chauffeurs chauffeurs) {
		getSessionFactory().getCurrentSession().save(chauffeurs);
	}

	/**
	 * Delete Chauffeurs
	 * 
	 * @param  Chauffeurs chauffeurs
	 */
	@Override
	public void deleteChauffeurs(Chauffeurs chauffeurs) {
		getSessionFactory().getCurrentSession().delete(chauffeurs);
	}

	/**
	 * Update Chauffeurs
	 * 
	 * @param  Chauffeurs chauffeurs
	 */
	@Override
	public void updateChauffeurs(Chauffeurs chauffeurs) {
		getSessionFactory().getCurrentSession().update(chauffeurs);
	}

	/**
	 * Get Chauffeurs
	 * 
	 * @param  int Chauffeurs Id
	 * @return Chauffeurs 
	 */
	@Override
	public Chauffeurs getChauffeursById(int id) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from Chauffeurs where idC=?")
									        .setParameter(0, id).list();
		return (Chauffeurs)list.get(0);
	}

	/**
	 * Get Chauffeurs List
	 * 
	 * @return List - Chauffeurs list
	 */
	@Override
	public List<Chauffeurs> getChauffeurs() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Chauffeurs").list();
		return list;
	}
        
        /**
	 * Get Chauffeurs List
	 * 
	 * @return List - Chauffeurs list
	 */
	@Override
	public List<Chauffeurs> getChauffeursDispo() {
           
		List list = getSessionFactory().getCurrentSession().createQuery("from Chauffeurs where diispo = 1").list();
		return list;
	}

        
}

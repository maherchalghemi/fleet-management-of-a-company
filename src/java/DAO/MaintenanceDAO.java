package DAO;

import java.util.List;

import Model.Maintenance;

import org.hibernate.SessionFactory;

/**
 * 
 * Maintenance DAO
 * 
 *
 */

public class MaintenanceDAO implements IMaintenanceDAO {
	
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
	 * Add Maintenance
	 * 
	 * @param  Maintenance maintenance
	 */
	@Override
	public void addMaintenance(Maintenance maintenance) {
		getSessionFactory().getCurrentSession().save(maintenance);
	}

	/**
	 * Delete Maintenance
	 * 
	 * @param  Maintenance maintenance
	 */
	@Override
	public void deleteMaintenance(Maintenance maintenance) {
		getSessionFactory().getCurrentSession().delete(maintenance);
	}

	/**
	 * Update Maintenance
	 * 
	 * @param  Maintenance maintenance
	 */
	@Override
	public void updateMaintenance(Maintenance maintenance) {
		getSessionFactory().getCurrentSession().update(maintenance);
	}

	/**
	 * Get Maintenance
	 * 
	 * @param  int Maintenance Id
	 * @return Maintenance 
	 */
	@Override
	public Maintenance getMaintenanceById(int id) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from Maintenance where idMaintenance=?")
									        .setParameter(0, id).list();
		return (Maintenance)list.get(0);
	}

	/**
	 * Get Maintenance List
	 * 
	 * @return List - Maintenance list
	 */
	@Override
	public List<Maintenance> getMaintenance() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Maintenance").list();
		return list;
	}

        
	public List<Maintenance> getMaintenanceTraiter() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Maintenance where traiter = 1").list();
		return list;
	}
        
        public List<Maintenance> getMaintenanceNonTraiter() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Maintenance where traiter = 0").list();
		return list;
	}
}

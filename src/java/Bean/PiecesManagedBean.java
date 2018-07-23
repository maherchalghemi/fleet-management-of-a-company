package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.springframework.dao.DataAccessException;
import Model.Pieces;
import Service.IPiecesService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * Pieces Managed Bean
 * 
 *
 */
@ManagedBean(name="piecesMB")
@SessionScoped
public class PiecesManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR   = "error";
        private List<String> selectedOptions; 
	
	//Spring Pieces Service is injected...
	@ManagedProperty(value="#{PiecesService}")
	IPiecesService piecesService;
	
	List<Pieces> piecesList;
        
	
	
        private Pieces pieces;
	private Pieces selectedPieces;
	
	
	
	public PiecesManagedBean() {
		selectedPieces = new Pieces();
                pieces = new Pieces();
	}

	/**
	 * Add Pieces
	 * 
	 * @return String - Response Message
	 */
	public String addPieces() throws ParseException {
		try {
			
			getPiecesService().addPieces(pieces);
			return "/chefmagPage/listepiecem.xhtml?faces-redirect=true";
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	
	/**
	 * Update Pieces
	 * 
	 * @return String - Response Message
	 */
	public String updPieces() {
		try {
                    
                         System.out.println("MAHO"   + selectedPieces.getIdP());
                   
			getPiecesService().updatePieces(selectedPieces);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	
	/**
	 * Delete Pieces
	 * 
	 * @return String - Response Message
	 */
	public String deletePieces() {
		try {
			getPiecesService().deletePieces(selectedPieces);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}

	/**
	 * Get Pieces List
	 * 
	 * @return List - Pieces List
	 */
	public List<Pieces> getPiecesList() {
            System.out.println("je suis la");
		piecesList = new ArrayList<Pieces>();
		piecesList.addAll(getPiecesService().getPieces()); 
                 System.out.println(piecesList.size());
		return piecesList;
	}
	
	/**
	 * Get Pieces Service
	 * 
	 * @return IPiecesService - Pieces Service
	 */
	public IPiecesService getPiecesService() {
		return piecesService;
	}

	/**
	 * Set Pieces Service
	 * 
	 * @param IPiecesService - Pieces Service
	 */
	public void setPiecesService(IPiecesService piecesService) {
		this.piecesService = piecesService;
	}
	
	/**
	 * Set Pieces List
	 * 
	 * @param List - Pieces List
	 */
	public void setPiecesList(List<Pieces> piecesList) {
		this.piecesList = piecesList;
	}
	
	


	public Pieces getSelectedPieces() {
		return selectedPieces;
	}

	public void setSelectedPieces(Pieces selectedPieces) {
		this.selectedPieces = selectedPieces;
	}

    public Pieces getPieces() {
        return pieces;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }

 

    
    
 	
}
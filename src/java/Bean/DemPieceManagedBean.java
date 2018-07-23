/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;


import Model.Pieces;

import Model.DemPiece;

import Service.IPiecesService;

import Service.IDemandPieceService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author maho
 */
@ManagedBean(name="demPieceMB")
@SessionScoped
public class DemPieceManagedBean implements Serializable{

    /**
     * Creates a new instance of AffectationManagedBean
     */
	@ManagedProperty(value="#{DemandPieceService}")
	IDemandPieceService demandPieceService;
	@ManagedProperty(value="#{PiecesService}")
	       IPiecesService piecesService;
        
        
        List<DemPiece> demPiecesList;
        
        private int idPSelected ;
        private DemPiece demPiece;

        private DemPiece selectDemPiece;
        
       
    
    public DemPieceManagedBean() {
        demPiece = new DemPiece();
    }
   
    public void addDemPiece( int idPSelected ){
        System.out.println("Id Piece   " + idPSelected);
        
                Pieces piece = new Pieces();
                System.out.println("1");
                piece.setIdP(idPSelected);
                System.out.println("2");
                demPiece.setPieces(new Pieces());
                System.out.println("3");
                demPiece.setPieces(piece);
                System.out.println("4");
        getDemandPieceService().addDemandPiece(demPiece);
        
       
        
    }
    
    	public void deleteDemPiece() {
		Pieces pieces = new Pieces();
                System.out.println("je suis la"   + selectDemPiece.getPieces().getIdP());
                int qte = getPiecesService().getPiecesById(selectDemPiece.getPieces().getIdP()).getQte() - selectDemPiece.getQte();
                System.out.println("je suis la"   + qte);
                pieces = getPiecesService().getPiecesById(selectDemPiece.getPieces().getIdP());
               pieces.setQte(qte);
               getPiecesService().updatePieces(pieces);
	getDemandPieceService().deleteDemandPiece(selectDemPiece);
		
	}

    

    public IDemandPieceService getDemandPieceService() {
        return demandPieceService;
    }

    public void setDemandPieceService(IDemandPieceService demandPieceService) {
        this.demandPieceService = demandPieceService;
    }

  

    public DemPiece getSelectDemPiece() {
        return selectDemPiece;
    }

    public void setSelectDemPiece(DemPiece selectDemPiece) {
        this.selectDemPiece = selectDemPiece;
    }

    
  

    public int getIdPSelected() {
        return idPSelected;
    }

    public void setIdPSelected(int idPSelected) {
        this.idPSelected = idPSelected;
    }

    public List<DemPiece> getDemPiecesList() {
        		demPiecesList = new ArrayList<DemPiece>();
		demPiecesList.addAll(getDemandPieceService().getDemandPiece()); 
        return demPiecesList;
    }

    public void setDemPiecesList(List<DemPiece> demPiecesList) {
        this.demPiecesList = demPiecesList;
    }

    public DemPiece getDemPiece() {
        return demPiece;
    }

    public void setDemPiece(DemPiece demPiece) {
        this.demPiece = demPiece;
    }

    public IPiecesService getPiecesService() {
        return piecesService;
    }

    public void setPiecesService(IPiecesService piecesService) {
        this.piecesService = piecesService;
    }

   

    
    

    
}

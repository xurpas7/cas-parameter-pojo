/**
 * @author  Michael Cuison
 */
package org.rmj.cas.parameter.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.constants.RecordStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Category_Level2")

public class UnitCategoryLevel2 implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sCategrCd")
    private String sCategrCd;
    @Column(name = "sDescript")
    private String sDescript;
    @Column(name = "sInvTypCd")
    private String sInvTypCd;
    @Column(name = "sMainCatx")
    private String sMainCatx;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitCategoryLevel2(){
        this.sCategrCd = "";
        this.sDescript = "";
        this.sInvTypCd = "";
        this.sMainCatx = "";
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sCategrCd");
        laColumns.add("sDescript");
        laColumns.add("sInvTypCd");
        laColumns.add("sMainCatx");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setCategoryID(String sCategrID){
        this.sCategrCd = sCategrID;
    }
    public String getCategoryID(){
        return sCategrCd;
    }
    
    public void setCategoryName(String sDescript){
        this.sDescript = sDescript;
    }
    public String getCategoryName(){
        return sDescript;
    }
    
    public void setInvTypeCode(String sInvTypCd){
        this.sInvTypCd = sInvTypCd;
    }
    public String getInvTypeCode(){
        return sInvTypCd;
    }
    
    public void setMainCategory(String sMainCatx){
        this.sMainCatx = sMainCatx;
    }
    public String getMainCategory(){
        return sMainCatx;
    }
    
    public void setRecordStat(String cRecdStat){
        this.cRecdStat = cRecdStat;
    }
    public String getRecordStat(){
        return cRecdStat;
    }
    
    public void setModifiedBy(String sModified){
        this.sModified = sModified;
    }
    public String getModifiedBy(){
        return sModified;
    }
    
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sCategrCd != null ? sCategrCd.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitCategoryLevel2)) {
            return false;
        }
        UnitCategoryLevel2 other = (UnitCategoryLevel2) object;
        if ((this.sCategrCd == null && other.sCategrCd != null) || (this.sCategrCd != null && !this.sCategrCd.equals(other.sCategrCd))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitCategoryLevel2[sCategrCd=" + sCategrCd + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sCategrCd;
            case 2: return sDescript;
            case 3: return sInvTypCd;
            case 4: return sMainCatx;
            case 5: return cRecdStat;
            case 6: return sModified;
            case 7: return dModified;
            default: return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);
        
        if (lnCol > 0){
            return getValue(lnCol);
        } else
            return null;
    }

    @Override
    public String getTable() {
        return "Category_Level2";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol){
            return "";
        } else 
            return (String) laColumns.get(fnCol - 1);
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1:
                sCategrCd = (String) foValue;
                break;
            case 2:
                sDescript = (String) foValue;
                break;
            case 3:
                sInvTypCd = (String) foValue;
                break;
            case 4:
                sMainCatx = (String) foValue;
                break;
            case 5:
                cRecdStat = (String) foValue;
                break;
            case 6:
                sModified = (String) foValue;
                break;
            case 7:
                dModified = (Date) foValue;
                break;
        }    
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0){
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

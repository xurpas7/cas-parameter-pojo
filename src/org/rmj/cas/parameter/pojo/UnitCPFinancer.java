/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * author jovanalic
 * since 2021-07-12
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
@Table(name="CP_Financer")

public class UnitCPFinancer implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sFnancrID")
    private String sFnancrID;
    @Column(name = "sCompnyNm")
    private String sCompnyNm;
    @Column(name = "sCPerson1")
    private String sCPerson1;
    @Column(name = "sCPPosit1")
    private String sCPPosit1;
    @Column(name = "sTelNoxxx")
    private String sTelNoxxx;
    @Column(name = "sFaxNoxxx")
    private String sFaxNoxxx;
    @Column(name = "sRemarksx")
    private String sRemarksx;
    @Column(name = "sTermIDxx")
    private String sTermIDxx;
    @Column(name = "nDiscount")
    private Number nDiscount;
    @Column(name = "nCredLimt")
    private Number nCredLimt;
    @Column(name = "nABalance")
    private Number nABalance;
    @Column(name = "dCltSince")
    private Date dCltSince;
    @Column(name = "cInHousex")
    private String cInHousex;    
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    public String getsFnancrID() {
        return sFnancrID;
    }

    public void setsFnancrID(String sFnancrID) {
        this.sFnancrID = sFnancrID;
    }

    public String getsCompnyNm() {
        return sCompnyNm;
    }

    public void setsCompnyNm(String sCompnyNm) {
        this.sCompnyNm = sCompnyNm;
    }

    public String getsCPerson1() {
        return sCPerson1;
    }

    public void setsCPerson1(String sCPerson1) {
        this.sCPerson1 = sCPerson1;
    }

    public String getsCPPosit1() {
        return sCPPosit1;
    }

    public void setsCPPosit1(String sCPPosit1) {
        this.sCPPosit1 = sCPPosit1;
    }

    public String getsTelNoxxx() {
        return sTelNoxxx;
    }

    public void setsTelNoxxx(String sTelNoxxx) {
        this.sTelNoxxx = sTelNoxxx;
    }

    public String getsFaxNoxxx() {
        return sFaxNoxxx;
    }

    public void setsFaxNoxxx(String sFaxNoxxx) {
        this.sFaxNoxxx = sFaxNoxxx;
    }

    public String getsRemarksx() {
        return sRemarksx;
    }

    public void setsRemarksx(String sRemarksx) {
        this.sRemarksx = sRemarksx;
    }

    public String getsTermIDxx() {
        return sTermIDxx;
    }

    public void setsTermIDxx(String sTermIDxx) {
        this.sTermIDxx = sTermIDxx;
    }

    public Number getnDiscount() {
        return nDiscount;
    }

    public void setnDiscount(Double nDiscount) {
        this.nDiscount = nDiscount;
    }

    public Number getnCredLimt() {
        return nCredLimt;
    }

    public void setnCredLimt(Double nCredLimt) {
        this.nCredLimt = nCredLimt;
    }

    public Number getnABalance() {
        return nABalance;
    }

    public void setnABalance(Double nABalance) {
        this.nABalance = nABalance;
    }

    public Date getdCltSince() {
        return dCltSince;
    }

    public void setdCltSince(Date dCltSince) {
        this.dCltSince = dCltSince;
    }

    public String getcInHousex() {
        return cInHousex;
    }

    public void setcInHousex(String cInHousex) {
        this.cInHousex = cInHousex;
    }

    public String getcRecdStat() {
        return cRecdStat;
    }

    public void setcRecdStat(String cRecdStat) {
        this.cRecdStat = cRecdStat;
    }

    public String getsModified() {
        return sModified;
    }

    public void setsModified(String sModified) {
        this.sModified = sModified;
    }

    public Date getdModified() {
        return dModified;
    }

    public void setdModified(Date dModified) {
        this.dModified = dModified;
    }

    public LinkedList getLaColumns() {
        return laColumns;
    }

    public void setLaColumns(LinkedList laColumns) {
        this.laColumns = laColumns;
    }
    

    LinkedList laColumns = null;
    
    public UnitCPFinancer(){
        this.sFnancrID = "";
        this.sCompnyNm = "";
        this.sCPerson1 = "";
        this.sCPPosit1 = "";
        this.sTelNoxxx = "";
        this.sFaxNoxxx = "";
        this.sRemarksx = "";
        this.sTermIDxx = "";
        this.nDiscount = 0.0;
        this.nCredLimt = 0.0;
        this.nABalance = 0.0;
        this.dCltSince = null;
        this.cInHousex = "";
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sFnancrID");
        laColumns.add("sCompnyNm");
        laColumns.add("sCPerson1");
        laColumns.add("sCPPosit1");
        laColumns.add("sTelNoxxx");
        laColumns.add("sFaxNoxxx");
        laColumns.add("sRemarksx");
        laColumns.add("sTermIDxx");
        laColumns.add("nDiscount");
        laColumns.add("nCredLimt");
        laColumns.add("nABalance");
        laColumns.add("dCltSince");
        laColumns.add("cInHousex");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitCPFinancer)) {
            return false;
        }
        UnitCPFinancer other = (UnitCPFinancer) object;
        if ((this.sFnancrID == null && other.sFnancrID != null) || (this.sFnancrID != null && !this.sFnancrID.equals(other.sFnancrID))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitCPFinancer[sFnancrID=" + sFnancrID + "]";
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sFnancrID != null ? sFnancrID.hashCode() : 0);
        return hash;
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sFnancrID;
            case 2: return sCompnyNm;
            case 3: return sCPerson1;
            case 4: return sCPPosit1;
            case 5: return sTelNoxxx;
            case 6: return sFaxNoxxx;
            case 7: return sRemarksx;
            case 8: return sTermIDxx;
            case 9: return nDiscount;
            case 10: return nCredLimt;
            case 11: return nABalance;
            case 12: return dCltSince;
            case 13: return cInHousex;
            case 14: return cRecdStat;
            case 15: return sModified;
            case 16: return dModified;
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
        return "CP_Financer";
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
                sFnancrID = (String) foValue;
                break;
            case 2:
                sCompnyNm = (String) foValue;
                break;
            case 3:
                sCPerson1 = (String) foValue;
                break;
            case 4:
                sCPPosit1 = (String) foValue;
                break;
            case 5:
                sTelNoxxx = (String) foValue;
                break;
            case 6:
                sFaxNoxxx = (String) foValue;
                break;
            case 7:
                sRemarksx = (String) foValue;
                break;
            case 8:
                sTermIDxx = (String) foValue;
                break;
            case 9:
                nDiscount = (Number) foValue;
                break;
            case 10:
                nCredLimt = (Number) foValue;
                break;
            case 11:
                nABalance = (Number) foValue;
                break;
            case 12:
                dCltSince = (Date) foValue;
                break;
            case 13:
                cInHousex = (String) foValue;
                break;
            case 14:
                cRecdStat = (String) foValue;
                break;
            case 15:
                sModified = (String) foValue;
                break;
            case 16:
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
        int lnCtr;
        for(lnCtr = 0; lnCtr < laColumns.size() -1; lnCtr ++){
            System.out.println(laColumns.get(lnCtr));
        }
    }
    
}

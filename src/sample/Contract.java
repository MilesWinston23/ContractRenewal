package sample;

import java.time.LocalDate;

public class Contract {

    private String contractType, contractName, contractBusinessUnit, contractOwner, contractDocType,
    contractStatus;

    private LocalDate contractStartDate, contractEndDate, contractReviewDate;

    private int contractId;

    public Contract(String contractType, String contractName, String contractBusinessUnit, String contractOwner, String contractDocType, String contractStatus, LocalDate contractStartDate, LocalDate contractEndDate, LocalDate contractReviewDate, Integer contractId) {
        this.contractType = contractType;
        this.contractName = contractName;
        this.contractBusinessUnit = contractBusinessUnit;
        this.contractOwner = contractOwner;
        this.contractDocType = contractDocType;
        this.contractStatus = contractStatus;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractReviewDate = contractReviewDate;
        this.contractId = contractId;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractBusinessUnit() {
        return contractBusinessUnit;
    }

    public void setContractBusinessUnit(String contractBusinessUnit) {
        this.contractBusinessUnit = contractBusinessUnit;
    }

    public String getContractOwner() {
        return contractOwner;
    }

    public void setContractOwner(String contractOwner) {
        this.contractOwner = contractOwner;
    }

    public String getContractDocType() {
        return contractDocType;
    }

    public void setContractDocType(String contractDocType) {
        this.contractDocType = contractDocType;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(LocalDate contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(LocalDate contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public LocalDate getContractReviewDate() {
        return contractReviewDate;
    }

    public void setContractReviewDate(LocalDate contractReviewDate) {
        this.contractReviewDate = contractReviewDate;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }
}

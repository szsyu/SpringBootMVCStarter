package sbs.controller.qualitysurveys;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class QualitySurveySessionForm {

	@Size(min = 1, max = 10)
	private String operatorId;
	
	@Size(min = 1, max = 15)
	private String operatorRcpNo;

	@Size(min = 1, max = 55)
	private String operatorLastName;
	
	@Size(min = 1, max = 35)
	private String operatorFirstName;
	
	@Size(min = 1, max = 90)
	private String operatorDepartment;

	@Size(min = 1, max = 120)
	private String operatorPosition;
	
	@Size(min = 1, max = 20)
	private String productionOrder;
	
	@Size(min = 1, max = 25)
	private String productCode;

	@Size(min = 1, max = 100)
	private String productDescription;
	
	@Size(min = 1, max = 10)
	private String clientCode;	
	
	@Size(min = 1, max = 120)
	private String clientName;

	@Size(min = 1, max = 250)
	private String salesOrder;
	
	@NotNull
	private int operationNumber;

	private String operationDescription;
	
	
	private String type;
	
	@NotNull
	private int producedQuantity;
	
	public String getOperatorId() {
		return operatorId;
	}
	
	
	public QualitySurveySessionForm() {
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorRcpNo() {
		return operatorRcpNo;
	}

	public void setOperatorRcpNo(String operatorRcpNo) {
		this.operatorRcpNo = operatorRcpNo;
	}

	public String getOperatorLastName() {
		return operatorLastName;
	}

	public void setOperatorLastName(String operatorLastName) {
		this.operatorLastName = operatorLastName;
	}

	public String getOperatorFirstName() {
		return operatorFirstName;
	}

	public void setOperatorFirstName(String operatorFirstName) {
		this.operatorFirstName = operatorFirstName;
	}

	public String getOperatorDepartment() {
		return operatorDepartment;
	}

	public void setOperatorDepartment(String operatorDepartment) {
		this.operatorDepartment = operatorDepartment;
	}

	public String getOperatorPosition() {
		return operatorPosition;
	}

	public void setOperatorPosition(String operatorPosition) {
		this.operatorPosition = operatorPosition;
	}

	public String getProductionOrder() {
		return productionOrder;
	}

	public void setProductionOrder(String productionOrder) {
		this.productionOrder = productionOrder;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(String salesOrder) {
		this.salesOrder = salesOrder;
	}

	
	
	public int getProducedQuantity() {
		return producedQuantity;
	}


	public void setProducedQuantity(int producedQuantity) {
		this.producedQuantity = producedQuantity;
	}


	public void copyOperatorInfo(QualitySurveySessionForm sessionForm) {
		this.setOperatorId(sessionForm.getOperatorId());
		this.setOperatorFirstName(sessionForm.getOperatorFirstName());
		this.setOperatorLastName(sessionForm.getOperatorLastName());
		this.setOperatorRcpNo(sessionForm.getOperatorRcpNo());
		this.setOperatorDepartment(sessionForm.getOperatorDepartment());
		this.setOperatorPosition(sessionForm.getOperatorPosition());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	
	public int getOperationNumber() {
		return operationNumber;
	}


	public void setOperationNumber(int operationNumber) {
		this.operationNumber = operationNumber;
	}


	@Override
	public String toString() {
		return "QualitySurveySessionForm [" +
				System.getProperty("line.separator") 
				+ ", operatorId=" + operatorId + 
				System.getProperty("line.separator") +
				", operatorRcpNo=" + operatorRcpNo +
				System.getProperty("line.separator") +
				", operatorLastName=" + operatorLastName + 
				System.getProperty("line.separator") +
				", operatorFirstName=" + operatorFirstName + 
				System.getProperty("line.separator") +
				", operatorDepartment=" + operatorDepartment + 
				System.getProperty("line.separator") +
				", operatorPosition=" + operatorPosition +
				System.getProperty("line.separator") +
				", productionOrder=" + productionOrder + 
				System.getProperty("line.separator") +
				", productCode=" + productCode + 
				System.getProperty("line.separator") +
				", productDescription=" + productDescription + 
				", clientCode=" + clientCode + 
				System.getProperty("line.separator") +
				", clientName=" + clientName + 
				System.getProperty("line.separator") +
				", salesOrder=" + salesOrder +
				System.getProperty("line.separator") +
				", type=" + type + "]";
	}


	public String getOperationDescription() {
		return operationDescription;
	}


	public void setOperationDescription(String operationDescription) {
		this.operationDescription = operationDescription;
	}

	

	
}
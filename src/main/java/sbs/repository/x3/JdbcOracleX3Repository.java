package sbs.repository.x3;
// http://www.codesenior.com/en/tutorial/Spring-Generic-DAO-and-Generic-Service-Implementation
import java.util.List;

import sbs.model.wpslook.WpslookRow;
import sbs.model.x3.X3BomItem;
import sbs.model.x3.X3Client;
import sbs.model.x3.X3Product;
import sbs.model.x3.X3ProductionOrderDetails;
import sbs.model.x3.X3SalesOrder;

public interface JdbcOracleX3Repository  {
	
    public List<String> findAllUsers(String company);
    public List<X3Product> findAllActiveProducts(String company);
	public X3Product findProductByCode(String company, String code);
    public String findItemDescription(String company, String code);
	public List<X3Client> findAllClients(String company);
	public X3Client findClientByCode(String company, String code);
	public List<X3SalesOrder> findAllSalesOrders(String company);
	public List<X3SalesOrder> findOpenedSalesOrders(String company);
	public X3SalesOrder findSalesOrderByNumber(String company, String number);
	public X3ProductionOrderDetails getProductionOrderInfoByNumber(String company, String number);
	public List<X3BomItem> findBomPartsByParent(String company, String productCode);
	public List<WpslookRow> findLocationsOfProduct(String company, String code);
	public List<X3BomItem> findProductionPartsByProductionOrderAndOperation(String company, String productionOrder, int operationNumber);
	public String getOperationDescriptionByProductionOrder(String company, String productionOrder, int operationNumber);
	
	
}

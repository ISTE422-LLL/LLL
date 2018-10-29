import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.awt.*;
import javax.swing.*;

public class createDDLMySQLTest{

	CreateDDLMySQL testObj;
	EdgeTable eTable;
	EdgeField eField;
	String addString;

	@Before
	public void setUp() throws Exception{
		eField = new EdgeField("1|MySQLDB");
		eTable = new EdgeTable("1|MySQLDB");
		eTable.addNativeField(1);
		eTable.addRelatedTable(1);
		eTable.makeArrays();
		eTable.setRelatedField(0,1);


		eField.setTableID(1);
		eField.setTableBound(1);
		eField.setFieldBound(1);
		eField.setDataType(1);
		
		EdgeField[] inputF = {eField};
		EdgeTable[] inputT = {eTable};
		testObj = new CreateDDLMySQL(inputT,inputF);
		//System.out.println(testObj.getSQLString());
		runner();
	
	}
	public void runner(){
	}

	@Test
	public void testCreateDDL(){
	System.out.println("create DLL");
	testObj.createDDL();
	}

	@Test
	public void testGenerateDatabaseName(){
	assertEquals("User input name to MySQLDB","MySQLDB",testObj.generateDatabaseName());
	assertEquals("Get database name","MySQLDB",testObj.getDatabaseName());
	}

	@Test
	public void testConvertStrBooleanToInt(){
	assertEquals("input value true, should return 1 back",1,testObj.convertStrBooleanToInt("true"));
	}

	@Test
	public void testGetProductName(){
	assertEquals("get product name is MySQL","MySQL",testObj.getProductName());
	}
	
	@Test
	public void testGetSQLString(){
	System.out.println("GetSQLString is not null");
	assertNotNull(testObj.getSQLString());
	}	
}

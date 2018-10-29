import static  org.junit.Assert.*;

import org.junit.Before;
import  org.junit.Test;

public class EdgeConvertCreateDDLTest extends EdgeConvertCreateDDL{
	
	EdgeConvertCreateDDLTest testObj;
	CreateFieldsAndTables ft = new CreateFieldsAndTables();	
		
	EdgeField[] field ;
	EdgeTable[] table;
	
	public void createDDL(){
		System.out.println("CreateDDL");
	}
	public String getSQLString(){
		System.out.println("GetSQLString");
		return "GetSQLString";	
	}
	public String getProductName(){
		System.out.println("GetProductName");
		return "GetProductName";
	}
	public String getDatabaseName(){
		System.out.println("GetDatabaseName");
		return "GetDatabaseName";
	}	
	
	public EdgeConvertCreateDDLTest(){
		super();
	}	

	

	@Before
	public void setUp(){
		testObj = new EdgeConvertCreateDDLTest();
		field = ft.getEdgeFields();
	 	table = ft.getEdgeTables();
		testObj.tables = table;
		testObj.fields = field;
	}
	@Test	
	public void testInitialize(){
		//System.out.println(table[0].tables);
		//System.out.println(testObj.numBoundTables);
		//testObj.tables.append(table[0]);
		//testObj.tables = table;
		//testObj.fields = field;
		testObj.initialize();
		/*
		System.out.println(testObj.tables[0]);
		System.out.println(testObj.tables.length);
		System.out.println(testObj.numBoundTables);
		System.out.println(testObj.maxBound);
		System.out.println(testObj.getTable(1)); 
		System.out.println(testObj.getField(1)); 
		System.out.println(table[0]);
		*/
	}
	@Test
	public void testGetTable(){
	assertEquals("table is equal to first table",table[0],testObj.getTable(1));
	}
	@Test
	public void testGetField(){
	assertEquals("table is equal to first table",field[0],testObj.getField(1));
	}
	
}

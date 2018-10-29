import static  org.junit.Assert.*;

import org.junit.Before;
import  org.junit.Test;

public class EdgeConvertCreateDDLTest extends EdgeConvertCreateDDL{
	
	EdgeConvertCreateDDLTest testObj;
	CreateFieldsAndTables ft = new CreateFieldsAndTables();	
		
	EdgeField[] field ;
	EdgeTable[] table;
	
	public void createDDL(){
		System.out.println("createDDL");
	}
	public String getSQLString(){

		return "GetSQLString";	
	}
	public String getProductName(){

		return "GetProductName";
	}
	public String getDatabaseName(){
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
	public void runner(){

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
		System.out.println(table[0]);
		System.out.println(field[0]);
	}
	@Test
	public void testGetTable(){
	assertNotNull(testObj.getTable(1));
	assertEquals("table is equal to first table",table[0],testObj.getTable(1));
	}
	@Test
	public void testGetField(){
	assertNotNull(testObj.getField(1));
	assertEquals("table is equal to first field",field[0],testObj.getField(1));
	}
	
}

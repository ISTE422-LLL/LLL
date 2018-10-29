import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {
   EdgeField test;

	@Before
	public void setUp() throws Exception {
	  test = new EdgeField("1|test");
	  runner();
	}
	
	public void runner() {
	  testGetNumFigure();
	  testGetName();
	  testGetTableId();
	  testGetTableBound();
	  testGetFieldBound();
	  testGetDisallowNull();
	  testGetIsPrimaryKey();
	  testGetDefaultValue();
	  testGetVarcharValue();
	  testGetDataType();
	}

	@Test
	public void testGetNumFigure() {
	  assertEquals("numFigure was intialized to 1 so it should be 1",1,test.getNumFigure());
	}

    @Test
	public void testGetName(){		
	  assertEquals("Name was intialized to \"test\" so it should be \"test\"","test",test.getName());
	}
	
	@Test
	public void testGetTableId(){
	   assertEquals("TableId should be 0",0,test.getTableID());
	}
	
	@Test
	public void testSetTableId(){
	  test.setTableID(2);
	  assertEquals("TableId should be what you set it to ",2,test.getTableID());
	}
	
	@Test
	public void testGetTableBound(){
	  assertEquals("TableBound should be 0",0,test.getTableBound());
	}
	
	@Test
	public void testSetTableBound(){
	  test.setTableBound(3);
	  assertEquals("TableBound should be what you set it to ",3,test.getTableBound());
	}
	
	@Test
	public void testGetFieldBound(){
	  assertEquals("FieldBound should be 0",0,test.getFieldBound());
	}

	@Test
	public void testSetFieldBound(){
	  test.setFieldBound(4);
	  assertEquals("FieldBound should be what you set it to",4,test.getFieldBound());
	}
	
	@Test
	public void testGetDisallowNull(){
	  assertEquals("DisallowNull should be \"false\"",false,test.getDisallowNull());
	}
	
	
	@Test
	public void testSetDisallowNull(){
	  test.setDisallowNull(true);
	  assertEquals("DisallowNull should be what you set it to ",true,test.getDisallowNull());
	}

	@Test
	public void testGetIsPrimaryKey(){
	  assertEquals("IsPrimaryKey should be \"false\"",false,test.getIsPrimaryKey());
	}
	
	@Test
	public void testSetIsPrimaryKey(){
	  test.setIsPrimaryKey(true);
	  assertEquals("IsPrimaryKey should be what you set it to ",true,test.getIsPrimaryKey());
	}
	
	@Test
	public void testGetDefaultValue(){
	  assertEquals("DefaultValue should be \"\"","",test.getDefaultValue());
	}
	
	@Test
	public void testSetDefaultValue(){
	  test.setDefaultValue("LLL");
	  assertEquals("DefaultValue should be what you set it to ","LLL",test.getDefaultValue());
	}
	
	@Test
	public void testGetVarcharValue(){
	  assertEquals("VarcharValue should be 1",1,test.getVarcharValue());
	}
	
	@Test
	public void testSetVarcharValue(){
	  test.setVarcharValue(2);
	  assertEquals("VarcharValue should be what you set it to",2,test.getVarcharValue());
	}
	
	@Test
	public void testGetDataType(){
	  assertEquals("DataType should be 0",0,test.getDataType());
	}
	
	@Test
	public void testSetDataType(){
	  test.setDataType(1);
	  assertEquals("DataType should be what you set it to",1,test.getDataType());
	}
   
   
   @Test
   public void testGetStrDataType(){
	  String [] type= {"Varchar", "Boolean", "Integer", "Double"};
    	  assertArrayEquals("GetStrDataType should be  ",type,test.getStrDataType());
   } 
   
   @Test
   public void testToString(){
      String toStr = test.getNumFigure() + EdgeConvertFileParser.DELIM +
      test.getName() + EdgeConvertFileParser.DELIM +
      test.getTableID() + EdgeConvertFileParser.DELIM +
      test.getTableBound() + EdgeConvertFileParser.DELIM +
      test.getFieldBound() + EdgeConvertFileParser.DELIM +
      test.getDataType() + EdgeConvertFileParser.DELIM +
      test.getVarcharValue() + EdgeConvertFileParser.DELIM +
      test.getIsPrimaryKey() + EdgeConvertFileParser.DELIM +
      test.getDisallowNull() + EdgeConvertFileParser.DELIM +
      test.getDefaultValue();
      assertEquals("ToString should be ",toStr,test.toString());
      
   }
   
   
}

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest {
        EdgeTable testObj;

	@Before
	public void setUp() throws Exception {
	String input = System.getProperty("input");
        testObj = new EdgeTable(input);
        runner();
	}
	
	public void runner() {
		testGetNumFigure();	
		testGetName();
		testAddRelatedTable();
		testAddNativeField();
		testSetRelatedField();
		testMoveFieldUp();
		testMoveFieldDown();
		testToString();
	}

	@Test
	public void testGetNumFigure() {
		assertEquals("numFigure was intialized to 1 so it should be 1",1,testObj.getNumFigure());
	}

	@Test
	public void testGetName() {
		assertEquals("numName was intilized to \"test\"","test",testObj.getName());
	}

	@Test
	public void testAddRelatedTable(){
		testObj.addRelatedTable(2);
		testObj.makeArrays();	
		assertEquals("tableArray[0] should had integer 2",2,testObj.getRelatedTablesArray()[0]);
	}

	@Test
	public void testAddNativeField(){
		testObj.addNativeField(4);
		testObj.addNativeField(0);
		testObj.addNativeField(0);
		testObj.addNativeField(0);
		testObj.makeArrays();
		assertEquals("nativeArray[0] should had integer 4",4,testObj.getNativeFieldsArray()[0]);
		assertEquals("nativeArray[1] should had integer 0",0,testObj.getNativeFieldsArray()[1]);
		assertEquals("nativeArray[2] should had integer 0",0,testObj.getNativeFieldsArray()[2]);
		assertEquals("nativeArray[3] should had integer 0",0,testObj.getNativeFieldsArray()[3]);
	}

	@Test
	public void testSetRelatedField(){
		testObj.setRelatedField(0,3);
		testObj.setRelatedField(1,5);
		assertEquals("relatedArray[0] should had integer 3",3,testObj.getRelatedFieldsArray()[0]);
		assertEquals("relatedArray[1] should had integer 5",5,testObj.getRelatedFieldsArray()[1]);
	}

	@Test
	public void testMoveFieldUp(){	
		testObj.setRelatedField(2,9);
		testObj.moveFieldUp(2);
		assertEquals("relatedArray[1] should had integer 9",9,testObj.getRelatedFieldsArray()[1]);
	}

	@Test
	public void testMoveFieldDown(){	
		testObj.setRelatedField(2,8);
		testObj.moveFieldDown(2);
		assertEquals("nativeArray[3] should had integer 8",8,testObj.getRelatedFieldsArray()[3]);
	}

	@Test
	public void testToString(){
		String cmpStr = "Table: 1\r\n"+
				"{\r\n"+
				"TableName: test\r\n"+
				"NativeFields: 4|0|0|0\r\n"+
				"RelatedTables: 2\r\n"+
				"RelatedFields: 3|9|0|8\r\n"+
				"}\r\n";
		
		assertEquals(cmpStr,testObj.toString());
	}

	
	
	
	
	

}

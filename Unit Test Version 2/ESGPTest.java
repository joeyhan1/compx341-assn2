import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;
import java.io.*;
/**
 * ESGPTest class
 * 
 * ESGPTest class is a class that is used
 * to test the operations in ESGP class.
 * 
 */
public class ESGPTest {

    //Categorizing Users Tests

    //Test Case 1
	@Test
	public void categorizeUsersTest1() {
		//Arrange
        ESGP esgp = new ESGP();
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Community User";
        String actual = esgp.categorizeUser();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 2
    @Test
	public void categorizeUsersTest2() {
		//Arrange
        ESGP esgp = new ESGP();
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Encost User";
        String actual = esgp.categorizeUser();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 3
    @Test
	public void categorizeUsersTest3() {
		//Arrange
        ESGP esgp = new ESGP();
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Please input 1 or 2!";
        String actual = esgp.categorizeUser();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 4
    @Test
	public void categorizeUsersTest4() {
		//Arrange
        ESGP esgp = new ESGP();
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Please input 1 or 2!";
        String actual = esgp.categorizeUser();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //ESGP Account Login Tests

    //Test Case 1
	@Test
	public void accountLoginTest1() {
		//Arrange
        ESGP esgp = new ESGP();
        String username = "BAMBI@!3";
        String password = "bozeia@!zZ";
        String input = username + "\n" + password + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Incorrect Username and Password!";
        String actual = esgp.login();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 2
    @Test
	public void accountLoginTest2() {
		//Arrange
        ESGP esgp = new ESGP();
        String username = "BAMBI@!3";
        String password = "bobai21Z";
        String input = username + "\n" + password + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Incorrect Username and Password!";
        String actual = esgp.login();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 3
    @Test
	public void accountLoginTest3() {
		//Arrange
        ESGP esgp = new ESGP();
        String username = "user_1";
        String password = "bozeia@!zZ";
        String input = username + "\n" + password + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Incorrect Username and Password!";
        String actual = esgp.login();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 4
    @Test
	public void accountLoginTest4() {
		//Arrange
        ESGP esgp = new ESGP();
        String username = "user_1";
        String password = "bobai21Z";
        String input = username + "\n" + password + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Welcome user_1";
        String actual = esgp.login();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Categorizing Smart Home Devices Tests

    //Test Case 1
	@Test
	public void categorizingDevicesTest1() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Wifi Routers!";
        String actual = esgp.categorizeDevices("Router");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 2
    @Test
	public void categorizingDevicesTest2() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The data type doesn't exist!";
        String actual = esgp.categorizeDevices("TV");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 3
    @Test
	public void categorizingDevicesTest3() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "Please add the data type!";
        String actual = esgp.categorizeDevices("");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Calculating Device Distribution Tests

    //Test Case 1
	@Test
	public void calculatingDeviceDistributionTest1() {
		//Arrange
		//Act
		//Assert
	}

    //Test Case 2
    @Test
	public void calculatingDeviceDistributionTest2() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "Wrong device category!";
        String actual = esgp.categorizeDeviceDistribution();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 3
    @Test
	public void calculatingDeviceDistributionTest3() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "Wrong device type!";
        String actual = esgp.categorizeDeviceDistribution();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 4
	@Test
	public void calculatingDeviceDistributionTest4() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "Wrong device product!";
        String actual = esgp.categorizeDeviceDistribution();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 5
    @Test
	public void calculatingDeviceDistributionTest5() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "Please add the device category, type and product!";
        String actual = esgp.categorizeDeviceDistribution();
		//Assert
		Assertions.assertEquals(expected, actual);
	}
}
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
    @DisplayName("Categorize User Method For Test Case 1")
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
    @DisplayName("Categorize User Method For Test Case 2")
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
    @DisplayName("Categorize User Method For Test Case 3 (Wrong Number Input)")
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

    //Test Case 3
    @Test
    @DisplayName("Categorize User Method For Test Case 3 (Blank Input)")
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
    @DisplayName("Account Login Method For Test Case 1")
	public void accountLoginTest1() {
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

    //Test Case 2
	@Test
    @DisplayName("Account Login Method For Test Case 2 (Incorrect Username and Password)")
	public void accountLoginTest2() {
		//Arrange
        ESGP esgp = new ESGP();
        String username = "BAMBI@!3";
        String password = "bozeia@!zZ";
        String input = username + "\n" + password + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Username and Password are wrong!";
        String actual = esgp.login();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 2
    @Test
    @DisplayName("Account Login Method For Test Case 2 (Incorrect Username)")
	public void accountLoginTest3() {
		//Arrange
        ESGP esgp = new ESGP();
        String username = "BAMBI@!3";
        String password = "bobai21Z";
        String input = username + "\n" + password + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Username and Password are wrong!";
        String actual = esgp.login();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 2
    @Test
    @DisplayName("Account Login Method For Test Case 2 (Incorrect Password)")
	public void accountLoginTest4() {
		//Arrange
        ESGP esgp = new ESGP();
        String username = "user_1";
        String password = "bozeia@!zZ";
        String input = username + "\n" + password + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Username and Password are wrong!";
        String actual = esgp.login();
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 3
    @Test
    @DisplayName("Account Login Method For Test Case 3 (Blank/NULL Username)")
	public void accountLoginTest5() {
		//Arrange
        ESGP esgp = new ESGP();
        String username = "";
        String password = "bozeia@!zZ";
        String input = username + "\n" + password + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Please enter username and password!";
        String actual = esgp.login();
		//Assert
		Assertions.assertEquals(expected, actual);
	}    

    //Test Case 3
    @Test
    @DisplayName("Account Login Method For Test Case 3 (Blank/NULL Password)")
	public void accountLoginTest6() {
		//Arrange
        ESGP esgp = new ESGP();
        String username = "user_1";
        String password = "";
        String input = username + "\n" + password + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Please enter username and password!";
        String actual = esgp.login();
		//Assert
		Assertions.assertEquals(expected, actual);
	} 

    //Test Case 3
    @Test
    @DisplayName("Account Login Method For Test Case 3 (Blank/NULL Username and Password)")
	public void accountLoginTest7() {
		//Arrange
        ESGP esgp = new ESGP();
        String username = "";
        String password = "";
        String input = username + "\n" + password + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
		//Act
        String expected = "Please enter username and password!";
        String actual = esgp.login();
		//Assert
		Assertions.assertEquals(expected, actual);
	} 

    //Categorizing Smart Home Devices Tests

    //Test Case 1
	@Test
    @DisplayName("Categorize Devices Method For Test Case 1")
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
    @DisplayName("Categorize Devices Method For Test Case 2")
	public void categorizingDevicesTest2() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Wifi Routers!";
        String actual = esgp.categorizeDevices("Extender");
		//Assert
		Assertions.assertEquals(expected, actual);
	}    

    //Test Case 3
	@Test
    @DisplayName("Categorize Devices Method For Test Case 3")
	public void categorizingDevicesTest3() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Hubs/Controllers!";
        String actual = esgp.categorizeDevices("Hub/Controller");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 4
	@Test
    @DisplayName("Categorize Devices Method For Test Case 4")
	public void categorizingDevicesTest4() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Smart Lighting!";
        String actual = esgp.categorizeDevices("Light Bulb");
		//Assert
		Assertions.assertEquals(expected, actual);
	}  

    //Test Case 5
	@Test
    @DisplayName("Categorize Devices Method For Test Case 5")
	public void categorizingDevicesTest5() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Smart Lighting!";
        String actual = esgp.categorizeDevices("Strip Lighting");
		//Assert
		Assertions.assertEquals(expected, actual);
	} 

    //Test Case 6
	@Test
    @DisplayName("Categorize Devices Method For Test Case 6")
	public void categorizingDevicesTest6() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Smart Lighting!";
        String actual = esgp.categorizeDevices("Other Lighting");
		//Assert
		Assertions.assertEquals(expected, actual);
	} 

    //Test Case 7
	@Test
    @DisplayName("Categorize Devices Method For Test Case 7")
	public void categorizingDevicesTest7() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Smart Appliances!";
        String actual = esgp.categorizeDevices("Kettle");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 8
	@Test
    @DisplayName("Categorize Devices Method For Test Case 8")
	public void categorizingDevicesTest8() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Smart Appliances!";
        String actual = esgp.categorizeDevices("Toaster");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 9
	@Test
    @DisplayName("Categorize Devices Method For Test Case 9")
	public void categorizingDevicesTest9() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Smart Appliances!";
        String actual = esgp.categorizeDevices("Coffee Maker");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 10
	@Test
    @DisplayName("Categorize Devices Method For Test Case 10")
	public void categorizingDevicesTest10() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Smart Whiteware!";
        String actual = esgp.categorizeDevices("Washing Machine/Dryer");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 11
	@Test
    @DisplayName("Categorize Devices Method For Test Case 11")
	public void categorizingDevicesTest11() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Smart Whiteware!";
        String actual = esgp.categorizeDevices("Refrigerator/Freezer");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 12
	@Test
    @DisplayName("Categorize Devices Method For Test Case 12")
	public void categorizingDevicesTest12() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The product category attribute is Encost Smart Whiteware!";
        String actual = esgp.categorizeDevices("Dishwasher");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 13
    @Test
    @DisplayName("Categorize Devices Method For Test Case 13 (Type does not exist)")
	public void categorizingDevicesTest13() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The device type is incorrect!";
        String actual = esgp.categorizeDevices("TV");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 13
    @Test
    @DisplayName("Categorize Devices Method For Test Case 13 (Wrong Spelling)")
	public void categorizingDevicesTest14() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "The device type is incorrect!";
        String actual = esgp.categorizeDevices("Routers");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Test Case 14
    @Test
    @DisplayName("Categorize Devices Method For Test Case 14")
	public void categorizingDevicesTest15() {
		//Arrange
        ESGP esgp = new ESGP();
		//Act
        String expected = "There is no device type input!";
        String actual = esgp.categorizeDevices("");
		//Assert
		Assertions.assertEquals(expected, actual);
	}

    //Calculating Device Distribution Tests

    //Test Case 1
	@Test
    @DisplayName("Calculate Device Distribution Method For Test Case 1")
	public void calculateDeviceDistributionTest1() {
		//Arrange
        ESGP esgp = new ESGP();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
		//Act
        esgp.calculateDeviceDistribution();
        String actual = outContent.toString();
        String expectedOutput = "Device Distribution                             \n"
                                + "===============================================\n"
                                + "Encost Wifi Routers                   | 20     \n"
                                + "     Router                           | 15     \n"
                                + "         Encost Router 360            | 2      ";
		//Assert
        Assertions.assertEquals(expectedOutput, actual);
	}

    //Test Case 2
    @Test
    @DisplayName("Calculate Device Distribution Method For Test Case 2")
	public void calculateDeviceDistributionTest2() {
		//Arrange
        ESGP esgp = new ESGP();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
		//Act
        esgp.calculateDeviceDistribution();
        String actual = outContent.toString();
        String expectedOutput = "The string inputted for all getDevice methods are incorrect!";
		//Assert
        Assertions.assertEquals(expectedOutput, actual);
	}

    //Test Case 3
    @Test
    @DisplayName("Calculate Device Distribution Method For Test Case 3")
	public void calculateDeviceDistributionTest3() {
		//Arrange
        ESGP esgp = new ESGP();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
		//Act
        esgp.calculateDeviceDistribution();
        String actual = outContent.toString();
        String expectedOutput = "The string inputted for getDeviceByCategory method is incorrect!";
		//Assert
        Assertions.assertEquals(expectedOutput, actual);
	}

    //Test Case 4
	@Test
    @DisplayName("Calculate Device Distribution Method For Test Case 4")
	public void calculateDeviceDistributionTest4() {
		//Arrange
        ESGP esgp = new ESGP();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
		//Act
        esgp.calculateDeviceDistribution();
        String actual = outContent.toString();
        String expectedOutput = "The string inputted for getDeviceByType method is incorrect!";
		//Assert
        Assertions.assertEquals(expectedOutput, actual);
	}

    //Test Case 5
    @Test
    @DisplayName("Calculate Device Distribution Method For Test Case 5")
	public void calculateDeviceDistributionTest5() {
		//Arrange
        ESGP esgp = new ESGP();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
		//Act
        esgp.calculateDeviceDistribution();
        String actual = outContent.toString();
        String expectedOutput = "The string inputted for getDeviceByProduct method is incorrect!";
		//Assert
        Assertions.assertEquals(expectedOutput, actual);        
	}

    //Test Case 6
    @Test
    @DisplayName("Calculate Device Distribution Method For Test Case 6")
	public void calculateDeviceDistributionTest6() {
		//Arrange
        ESGP esgp = new ESGP();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
		//Act
        esgp.calculateDeviceDistribution();
        String actual = outContent.toString();
        String expectedOutput = "The string inputted for getDeviceByCategory and getDeviceByType methods are incorrect!";
		//Assert
        Assertions.assertEquals(expectedOutput, actual);        
	}

    //Test Case 7
    @Test
    @DisplayName("Calculate Device Distribution Method For Test Case 7")
	public void calculateDeviceDistributionTest7() {
		//Arrange
        ESGP esgp = new ESGP();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
		//Act
        esgp.calculateDeviceDistribution();
        String actual = outContent.toString();
        String expectedOutput = "The string inputted for getDeviceByCategory and getDeviceByProduct methods are incorrect!";
		//Assert
        Assertions.assertEquals(expectedOutput, actual);        
	}

    //Test Case 8
    @Test
    @DisplayName("Calculate Device Distribution Method For Test Case 8")
	public void calculateDeviceDistributionTest8() {
		//Arrange
        ESGP esgp = new ESGP();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
		//Act
        esgp.calculateDeviceDistribution();
        String actual = outContent.toString();
        String expectedOutput = "The string inputted for getDeviceByType and getDeviceByProduct methods are incorrect!";
		//Assert
        Assertions.assertEquals(expectedOutput, actual);        
	}
}
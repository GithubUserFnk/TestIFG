package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_URL_Consumer
     
    /**
     * <p></p>
     */
    public static Object G_URL_Producer
     
    /**
     * <p></p>
     */
    public static Object G_SPRING_KAFKA
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            G_URL_Consumer = selectedVariables['G_URL_Consumer']
            G_URL_Producer = selectedVariables['G_URL_Producer']
            G_SPRING_KAFKA = selectedVariables['G_SPRING_KAFKA']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

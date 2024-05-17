import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

def objectSelector(value){
    return TestObject(value).addProperty("text", ConditionType.EQUALS, value)
}
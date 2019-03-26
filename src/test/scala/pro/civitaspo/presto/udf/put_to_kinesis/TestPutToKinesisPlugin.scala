package pro.civitaspo.presto.udf.put_to_kinesis

import com.facebook.presto.operator.scalar.AbstractTestFunctions
import com.facebook.presto.spi.`type`.BooleanType.BOOLEAN
import com.facebook.presto.spi.`type`.VarcharType.VARCHAR
import org.scalatest.testng.TestNGSuiteLike
import org.testng.annotations.{BeforeClass, Test}

class TestPutToKinesisPlugin
  extends AbstractTestFunctions with TestNGSuiteLike {

  @BeforeClass
  def setup(): Unit = {
    registerFunctions(new PutToKinesisPlugin)
  }

  @Test
  def testSample(): Unit = {
    assertFunction("hello('world')", VARCHAR, "Hello world")
    assertFunction("put_to_kinesis('hello')", BOOLEAN, true)
  }

}

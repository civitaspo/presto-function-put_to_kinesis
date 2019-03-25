package pro.civitaspo.presto.udf.put_to_kinesis

import com.facebook.presto.metadata.FunctionExtractor
import com.facebook.presto.operator.scalar.AbstractTestFunctions
import com.facebook.presto.spi.`type`.VarcharType.VARCHAR
import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, BeforeAndAfterAll, DiagrammedAssertions, FunSuiteLike}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestPutToKinesisPlugin
  extends AbstractTestFunctions
  with FunSuiteLike
  with BeforeAndAfter
  with BeforeAndAfterAll
  with DiagrammedAssertions {

  override protected def beforeAll(): Unit = {
    super.beforeAll()
    functionAssertions.addFunctions(FunctionExtractor.extractFunctions(new PutToKinesisPlugin().getFunctions))
  }

  test("sample") {
    assertFunction("hello('world')", VARCHAR, "hello world")
  }

}

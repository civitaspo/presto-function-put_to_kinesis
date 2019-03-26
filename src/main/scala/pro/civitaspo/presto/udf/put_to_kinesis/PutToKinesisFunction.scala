package pro.civitaspo.presto.udf.put_to_kinesis


import com.facebook.presto.spi.`type`.StandardTypes.{BOOLEAN, VARCHAR}
import com.facebook.presto.spi.function.{Description, ScalarFunction, SqlNullable, SqlType}
import io.airlift.slice.Slice

object PutToKinesisFunction {

  @ScalarFunction("put_to_kinesis")
  @Description("A UDF to put records to Kinesis Streams.")
  @SqlType(BOOLEAN)
  def putToKinesis(@SqlNullable @SqlType(VARCHAR) v: Slice): Boolean = {
    true
  }
}

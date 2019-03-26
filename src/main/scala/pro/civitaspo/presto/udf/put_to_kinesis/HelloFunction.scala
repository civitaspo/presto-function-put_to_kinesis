package pro.civitaspo.presto.udf.put_to_kinesis


import com.facebook.presto.spi.`type`.StandardTypes.VARCHAR
import com.facebook.presto.spi.function.{Description, ScalarFunction, SqlNullable, SqlType}
import io.airlift.slice.{Slice, Slices}

object HelloFunction {
  @ScalarFunction("hello")
  @Description("Hello Function")
  @SqlType(VARCHAR)
  def hello(@SqlNullable @SqlType(VARCHAR) v: Slice): Slice = {
    if (v == null || v.toStringUtf8.isEmpty) Slices.utf8Slice("Hello World")
    else Slices.utf8Slice(String.format("Hello %s", v.toStringUtf8))
  }
}
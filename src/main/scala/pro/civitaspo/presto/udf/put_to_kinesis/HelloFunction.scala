package pro.civitaspo.presto.udf.put_to_kinesis


import com.facebook.presto.spi.function.Description
import com.facebook.presto.spi.function.ScalarFunction
import com.facebook.presto.spi.function.SqlNullable
import com.facebook.presto.spi.function.SqlType
import io.airlift.slice.Slice
import io.airlift.slice.Slices
import com.facebook.presto.spi.`type`.StandardTypes.VARCHAR

object HelloFunction {
  @ScalarFunction("hello")
  @Description("Hello Function")
  @SqlType(VARCHAR) def hello(@SqlNullable @SqlType(VARCHAR) v: Slice): Slice = {
    if (v == null || v.toStringUtf8.isEmpty) Slices.utf8Slice("Hello World")
    else Slices.utf8Slice(String.format("Hello %s", v.toStringUtf8))
  }
}
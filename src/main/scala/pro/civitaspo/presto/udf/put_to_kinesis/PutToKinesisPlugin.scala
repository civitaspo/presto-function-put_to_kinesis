package pro.civitaspo.presto.udf.put_to_kinesis

import java.util.{Set => JSet}

import com.facebook.presto.spi.Plugin
import com.google.common.collect.ImmutableSet

class PutToKinesisPlugin extends Plugin {

  override def getFunctions: JSet[Class[_]] = {
    ImmutableSet.builder[Class[_]]
      .add(classOf[HelloFunction])
      .build()
  }

}

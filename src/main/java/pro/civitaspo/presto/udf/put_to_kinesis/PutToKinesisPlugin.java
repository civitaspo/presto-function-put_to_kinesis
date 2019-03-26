package pro.civitaspo.presto.udf.put_to_kinesis;

import com.facebook.presto.spi.Plugin;
import com.google.common.collect.ImmutableSet;

import java.util.Set;

// NOTE: Presto requires the udf implementation as a static method of a class,
//       but this cannot be defined in Scala because static methods are defined as instance methods of a singleton object.
//       That's why this Plugin class references compiled Scala sources to fulfill the requirements.
public class PutToKinesisPlugin
        implements Plugin
{
    @Override
    public Set<Class<?>> getFunctions()
    {
        return ImmutableSet.<Class<?>>builder()
                .add(HelloFunction.class)
                .build();
    }
}
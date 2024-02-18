package builder;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@GeneratePojoBuilder(
    withFactoryMethod = "instance",
        withSetterNamePattern = "with*",
        withBuilderInterface = Builder.class,
        withBuilderProperties = true
)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
public @interface Buildable {
}

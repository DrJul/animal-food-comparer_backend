package builder;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Annotation for generating builders in Transfer Objects with OpenApi Generator
 * https://github.com/mkarneim/pojobuilder
 */
@GeneratePojoBuilder(
    withFactoryMethod = "instance"
)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
public @interface Buildable {
}

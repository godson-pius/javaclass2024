package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD})
public @interface ValDay { }
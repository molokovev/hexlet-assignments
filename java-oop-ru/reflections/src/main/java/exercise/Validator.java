package exercise;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class Validator {
    public static List<String> validate(Address address) {
        Field[] fields = address.getClass().getDeclaredFields();
        List<String> result = new ArrayList<>();

        for (Field field :
                fields) {
            Annotation annotation = field.getAnnotation(NotNull.class);
            if (annotation == null) continue;
            try {
                field.setAccessible(true);
                if (field.get(address) == null) {
                    result.add(field.getName());
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return result;
    }
}
// END

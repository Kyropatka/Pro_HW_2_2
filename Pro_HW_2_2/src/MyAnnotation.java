import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    @Retention(RetentionPolicy.RUNTIME)
    @interface SaveTo {
        String path();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Saver {
    }
}

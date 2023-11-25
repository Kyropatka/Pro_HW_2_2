import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TextContainer con = new TextContainer();
        Class<?> clas = con.getClass();

        if (clas.isAnnotationPresent(MyAnnotation.SaveTo.class)) {
            MyAnnotation.SaveTo saveTo = clas.getAnnotation(MyAnnotation.SaveTo.class);
            String path = saveTo.path();

            Method[] methods = clas.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(MyAnnotation.Saver.class)) {
                    method.invoke(con, path);
                    break;
                }
            }
        }
    }
}



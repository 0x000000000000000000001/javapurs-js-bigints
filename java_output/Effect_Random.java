public class Effect_Random {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object random = FFI_STUB;
    public static Object random(Object... args) { return null; }

public static final Object randomRange = (java.util.function.Function<Object, Object>) (min_0) -> (java.util.function.Function<Object, Object>) (max_1) -> Effect_Random.random;
public static final Object randomInt = (java.util.function.Function<Object, Object>) (low_0) -> (java.util.function.Function<Object, Object>) (high_1) -> Effect_Random.random;
public static final Object randomBool = Effect_Random.random;
}

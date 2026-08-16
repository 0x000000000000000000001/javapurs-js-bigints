public class Record_Unsafe_Union {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object unsafeUnionFn = FFI_STUB;
    public static Object unsafeUnionFn(Object... args) { return null; }

public static final Object unsafeUnion = (java.util.function.Function<Object, Object>) (__local_var_0) -> (java.util.function.Function<Object, Object>) (__local_var_1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Record_Unsafe_Union.unsafeUnionFn)).apply(__local_var_0))).apply(__local_var_1);
}

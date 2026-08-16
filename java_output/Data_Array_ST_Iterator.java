public class Data_Array_ST_Iterator {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final class Iterator {
            public final Object value0;
            public final Object value1;
            public Iterator(Object value0, Object value1) {
                this.value0 = value0;
                this.value1 = value1;
            }
        }
public static final Object Iterator = (java.util.function.Function<Object, Object>) (value0) -> (java.util.function.Function<Object, Object>) (value1) -> new Data_Array_ST_Iterator.Iterator(value0, value1);
public static final Object peek = (java.util.function.Function<Object, Object>) (v_0) -> { Object __local_var_1 = (((Data_Array_ST_Iterator.Iterator) v_0).value1); return null /* TODO: unknown syntax PrimEffect */; };
public static final Object next = (java.util.function.Function<Object, Object>) (v_0) -> { Object __local_var_1 = (((Data_Array_ST_Iterator.Iterator) v_0).value1); return null /* TODO: unknown syntax PrimEffect */; };
public static final Object pushWhile = (java.util.function.Function<Object, Object>) (p_0) -> (java.util.function.Function<Object, Object>) (iter_1) -> (java.util.function.Function<Object, Object>) (array_2) -> null /* TODO: unknown syntax PrimEffect */;
public static final Object pushAll = ((java.util.function.Function<Object, Object>) (Data_Array_ST_Iterator.pushWhile)).apply((java.util.function.Function<Object, Object>) (v_0) -> new Boolean(true));
public static final Object iterator = (java.util.function.Function<Object, Object>) (f_0) -> { Object __local_var_1 = ((java.util.function.Function<Object, Object>) (Data_Array_ST_Iterator.Iterator)).apply(f_0); return null /* TODO: unknown syntax PrimEffect */; };
public static final Object iterate = (java.util.function.Function<Object, Object>) (iter_0) -> (java.util.function.Function<Object, Object>) (f_1) -> null /* TODO: unknown syntax PrimEffect */;
public static final Object exhausted = (java.util.function.Function<Object, Object>) (x_0) -> { Object __local_var_1 = (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_1 = (((Data_Array_ST_Iterator.Iterator) x_0).value1); return null /* TODO: unknown syntax PrimEffect */; } }).get(); return __local_var_1; };
}

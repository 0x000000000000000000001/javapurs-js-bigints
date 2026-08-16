public class Debug {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object _debugger = FFI_STUB;
    public static Object _debugger(Object... args) { return null; }
    public static Object _spy = FFI_STUB;
    public static Object _spy(Object... args) { return null; }
    public static Object _trace = FFI_STUB;
    public static Object _trace(Object... args) { return null; }
    public static Object _traceTime = FFI_STUB;
    public static Object _traceTime(Object... args) { return null; }

public static final Object warn = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>();  return __map; } }).get();
public static final Object traceTime = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> (java.util.function.Function<Object, Object>) (__local_var_1) -> (java.util.function.Function<Object, Object>) (__local_var_2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Debug._traceTime)).apply(__local_var_1))).apply(__local_var_2);
public static final Object trace = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> (java.util.function.Function<Object, Object>) (a_1) -> (java.util.function.Function<Object, Object>) (k_2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Debug._trace)).apply(a_1))).apply(k_2);
public static final Object traceM = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> (java.util.function.Function<Object, Object>) (dictMonad_1) -> { Object Bind1_2 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictMonad_1).get("Bind1"))).apply(null /* TODO: PrimUndefined */); Object Applicative0_3 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictMonad_1).get("Applicative0"))).apply(null /* TODO: PrimUndefined */); return (java.util.function.Function<Object, Object>) (s_4) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Bind1_2).get("bind"))).apply(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Applicative0_3).get("pure"))).apply(Data_Unit.unit)))).apply((java.util.function.Function<Object, Object>) (_dollar___unused_5) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Debug._trace)).apply(s_4))).apply((java.util.function.Function<Object, Object>) (v_6) -> ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Applicative0_3).get("pure"))).apply(Data_Unit.unit))); };
public static final Object spy = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> (java.util.function.Function<Object, Object>) (tag_1) -> (java.util.function.Function<Object, Object>) (a_2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Debug._spy)).apply(tag_1))).apply(a_2);
public static final Object spyWith = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> (java.util.function.Function<Object, Object>) (msg_1) -> (java.util.function.Function<Object, Object>) (f_2) -> (java.util.function.Function<Object, Object>) (a_3) -> a_3;
public static final Object debugger = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> (java.util.function.Function<Object, Object>) (f_1) -> ((java.util.function.Function<Object, Object>) (Debug._debugger)).apply(f_1);
}

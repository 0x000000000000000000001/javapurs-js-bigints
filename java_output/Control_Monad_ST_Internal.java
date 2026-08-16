public class Control_Monad_ST_Internal {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object bind_ = FFI_STUB;
    public static Object bind_(Object... args) { return null; }
    public static Object $for = FFI_STUB;
    public static Object $for(Object... args) { return null; }
    public static Object foreach = FFI_STUB;
    public static Object foreach(Object... args) { return null; }
    public static Object map_ = FFI_STUB;
    public static Object map_(Object... args) { return null; }
    public static Object modifyImpl = FFI_STUB;
    public static Object modifyImpl(Object... args) { return null; }
    public static Object $new = FFI_STUB;
    public static Object $new(Object... args) { return null; }
    public static Object pure_ = FFI_STUB;
    public static Object pure_(Object... args) { return null; }
    public static Object read = FFI_STUB;
    public static Object read(Object... args) { return null; }
    public static Object run = FFI_STUB;
    public static Object run(Object... args) { return null; }
    public static Object $while = FFI_STUB;
    public static Object $while(Object... args) { return null; }
    public static Object write = FFI_STUB;
    public static Object write(Object... args) { return null; }

public static final Object modifyprime = Control_Monad_ST_Internal.modifyImpl;
public static final Object modify = (java.util.function.Function<Object, Object>) (f_0) -> ((java.util.function.Function<Object, Object>) (Control_Monad_ST_Internal.modifyImpl)).apply((java.util.function.Function<Object, Object>) (s_1) -> { Object s_prime__2 = ((java.util.function.Function<Object, Object>) (f_0)).apply(s_1); return (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("state", s_prime__2); __map.put("value", s_prime__2);  return __map; } }).get(); });
public static final Object functorST = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("map", Control_Monad_ST_Internal.map_);  return __map; } }).get();
public static final Object monadST = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("Applicative0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Control_Monad_ST_Internal.applicativeST); __map.put("Bind1", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Control_Monad_ST_Internal.bindST);  return __map; } }).get();
public static final Object bindST = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("bind", Control_Monad_ST_Internal.bind_); __map.put("Apply0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Control_Monad_ST_Internal.applyST);  return __map; } }).get();
public static final Object applyST = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("apply", (java.util.function.Function<Object, Object>) (f_0) -> (java.util.function.Function<Object, Object>) (a_1) -> f_0); __map.put("Functor0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Control_Monad_ST_Internal.functorST);  return __map; } }).get();
public static final Object applicativeST = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("pure", Control_Monad_ST_Internal.pure_); __map.put("Apply0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Control_Monad_ST_Internal.applyST);  return __map; } }).get();
public static final Object semigroupST = (java.util.function.Function<Object, Object>) (dictSemigroup_0) -> (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("append", (java.util.function.Function<Object, Object>) (a_1) -> (java.util.function.Function<Object, Object>) (b_2) -> a_1);  return __map; } }).get();
public static final Object monadRecST = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("tailRecM", (java.util.function.Function<Object, Object>) (f_0) -> (java.util.function.Function<Object, Object>) (a_1) -> { Object __local_var_2 = ((java.util.function.Function<Object, Object>) (f_0)).apply(a_1); return __local_var_2; }); __map.put("Monad0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Control_Monad_ST_Internal.monadST);  return __map; } }).get();
public static final Object monoidST = (java.util.function.Function<Object, Object>) (dictMonoid_0) -> { Object semigroupST1_1 = (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_1 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictMonoid_0).get("Semigroup0"))).apply(null /* TODO: PrimUndefined */); return (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("append", (java.util.function.Function<Object, Object>) (a_2) -> (java.util.function.Function<Object, Object>) (b_3) -> a_2);  return __map; } }).get(); } }).get(); return (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("mempty", (new java.util.function.Supplier<Object>() { public Object get() { Object __local_var_2 = ((java.util.LinkedHashMap<String, Object>) dictMonoid_0).get("mempty"); return __local_var_2; } }).get()); __map.put("Semigroup0", (java.util.function.Function<Object, Object>) (_dollar___unused_2) -> semigroupST1_1);  return __map; } }).get(); };
}

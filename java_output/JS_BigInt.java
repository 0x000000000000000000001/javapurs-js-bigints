public class JS_BigInt {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object and = FFI_STUB;
    public static Object and(Object... args) { return null; }
    public static Object asIntN = FFI_STUB;
    public static Object asIntN(Object... args) { return null; }
    public static Object asUintN = FFI_STUB;
    public static Object asUintN(Object... args) { return null; }
    public static Object biAdd = FFI_STUB;
    public static Object biAdd(Object... args) { return null; }
    public static Object biCompare = FFI_STUB;
    public static Object biCompare(Object... args) { return null; }
    public static Object biDegree = FFI_STUB;
    public static Object biDegree(Object... args) { return null; }
    public static Object biDiv = FFI_STUB;
    public static Object biDiv(Object... args) { return null; }
    public static Object biEquals = FFI_STUB;
    public static Object biEquals(Object... args) { return null; }
    public static Object biMod = FFI_STUB;
    public static Object biMod(Object... args) { return null; }
    public static Object biMul = FFI_STUB;
    public static Object biMul(Object... args) { return null; }
    public static Object biOne = FFI_STUB;
    public static Object biOne(Object... args) { return null; }
    public static Object biSub = FFI_STUB;
    public static Object biSub(Object... args) { return null; }
    public static Object biZero = FFI_STUB;
    public static Object biZero(Object... args) { return null; }
    public static Object fromInt = FFI_STUB;
    public static Object fromInt(Object... args) { return null; }
    public static Object fromNumberImpl = FFI_STUB;
    public static Object fromNumberImpl(Object... args) { return null; }
    public static Object fromStringAsImpl = FFI_STUB;
    public static Object fromStringAsImpl(Object... args) { return null; }
    public static Object fromStringImpl = FFI_STUB;
    public static Object fromStringImpl(Object... args) { return null; }
    public static Object fromTypeLevelInt = FFI_STUB;
    public static Object fromTypeLevelInt(Object... args) { return null; }
    public static Object not = FFI_STUB;
    public static Object not(Object... args) { return null; }
    public static Object or = FFI_STUB;
    public static Object or(Object... args) { return null; }
    public static Object pow = FFI_STUB;
    public static Object pow(Object... args) { return null; }
    public static Object shl = FFI_STUB;
    public static Object shl(Object... args) { return null; }
    public static Object shr = FFI_STUB;
    public static Object shr(Object... args) { return null; }
    public static Object toNumber = FFI_STUB;
    public static Object toNumber(Object... args) { return null; }
    public static Object toString = FFI_STUB;
    public static Object toString(Object... args) { return null; }
    public static Object toStringAs = FFI_STUB;
    public static Object toStringAs(Object... args) { return null; }
    public static Object xor = FFI_STUB;
    public static Object xor(Object... args) { return null; }

public static final Object showBigInt = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("show", JS_BigInt.toString);  return __map; } }).get();
public static final Object semiringBigInt = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("add", JS_BigInt.biAdd); __map.put("zero", JS_BigInt.biZero); __map.put("mul", JS_BigInt.biMul); __map.put("one", JS_BigInt.biOne);  return __map; } }).get();
public static final Object ringBigInt = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("sub", JS_BigInt.biSub); __map.put("Semiring0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> JS_BigInt.semiringBigInt);  return __map; } }).get();
public static final Object eqBigInt = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("eq", JS_BigInt.biEquals);  return __map; } }).get();
public static final Object ordBigInt = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("compare", (java.util.function.Function<Object, Object>) (x_0) -> (java.util.function.Function<Object, Object>) (y_1) -> { Object v_2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (JS_BigInt.biCompare)).apply(x_0))).apply(y_1); return ( ((Boolean) ((((Integer) (v_2)) == ((Integer) (new Integer(1)))))) ? new Data_Ordering.GT() : ( ((Boolean) ((((Integer) (v_2)) == ((Integer) (new Integer(0)))))) ? new Data_Ordering.EQ() : new Data_Ordering.LT())); }); __map.put("Eq0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> JS_BigInt.eqBigInt);  return __map; } }).get();
public static final Object commutativeRingBigInt = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("Ring0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> JS_BigInt.ringBigInt);  return __map; } }).get();
public static final Object euclideanRingBigInt = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("degree", JS_BigInt.biDegree); __map.put("div", JS_BigInt.biDiv); __map.put("mod", JS_BigInt.biMod); __map.put("CommutativeRing0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> JS_BigInt.commutativeRingBigInt);  return __map; } }).get();
public static final Object toInt = (java.util.function.Function<Object, Object>) (x_0) -> ((java.util.function.Function<Object, Object>) (Data_Int.fromNumber)).apply(((java.util.function.Function<Object, Object>) (JS_BigInt.toNumber)).apply(x_0));
public static final Object odd = (java.util.function.Function<Object, Object>) (x_0) -> !(((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (JS_BigInt.biEquals)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (JS_BigInt.and)).apply(x_0))).apply(JS_BigInt.biOne)))).apply(JS_BigInt.biZero))));
public static final Object fromTLInt = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> (java.util.function.Function<Object, Object>) (dictReflectable_1) -> (java.util.function.Function<Object, Object>) (v_2) -> ((java.util.function.Function<Object, Object>) (JS_BigInt.fromTypeLevelInt)).apply(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictReflectable_1).get("reflectType"))).apply(new Type_Proxy.Proxy()));
public static final Object fromStringAs = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (JS_BigInt.fromStringAsImpl)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object fromString = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (JS_BigInt.fromStringImpl)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object fromNumber = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (JS_BigInt.fromNumberImpl)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object even = (java.util.function.Function<Object, Object>) (x_0) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (JS_BigInt.biEquals)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (JS_BigInt.and)).apply(x_0))).apply(JS_BigInt.biOne)))).apply(JS_BigInt.biZero);
public static final Object parity = (java.util.function.Function<Object, Object>) (n_0) -> ( ((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (JS_BigInt.biEquals)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (JS_BigInt.and)).apply(n_0))).apply(JS_BigInt.biOne)))).apply(JS_BigInt.biZero))) ? new Data_Int.Even() : new Data_Int.Odd());
}

public class Test_QuickCheck_Laws_Data_Ord {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object checkOrdGen = (java.util.function.Function<Object, Object>) (dictOrd_0) -> { Object Eq0_1 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictOrd_0).get("Eq0"))).apply(null /* TODO: PrimUndefined */); return (java.util.function.Function<Object, Object>) (gen_2) -> { Object __local_var_3 = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply("Checking 'Reflexivity' law for Ord"); return __local_var_3; }; };
public static final Object checkOrd = (java.util.function.Function<Object, Object>) (dictArbitrary_0) -> { Object arbitrary_1 = ((java.util.LinkedHashMap<String, Object>) dictArbitrary_0).get("arbitrary"); return (java.util.function.Function<Object, Object>) (dictOrd_2) -> (java.util.function.Function<Object, Object>) (v_3) -> { Object Eq0_4 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictOrd_2).get("Eq0"))).apply(null /* TODO: PrimUndefined */); Object __local_var_5 = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply("Checking 'Reflexivity' law for Ord"); return __local_var_5; }; };
}

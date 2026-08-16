public class Test_QuickCheck_Laws_Data_Eq {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object checkEqGen = (java.util.function.Function<Object, Object>) (dictEq_0) -> (java.util.function.Function<Object, Object>) (gen_1) -> { Object __local_var_2 = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply("Checking 'Reflexivity' law for Eq"); return __local_var_2; };
public static final Object checkEq = (java.util.function.Function<Object, Object>) (dictArbitrary_0) -> { Object arbitrary_1 = ((java.util.LinkedHashMap<String, Object>) dictArbitrary_0).get("arbitrary"); return (java.util.function.Function<Object, Object>) (dictEq_2) -> (java.util.function.Function<Object, Object>) (v_3) -> { Object __local_var_4 = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply("Checking 'Reflexivity' law for Eq"); return __local_var_4; }; };
}

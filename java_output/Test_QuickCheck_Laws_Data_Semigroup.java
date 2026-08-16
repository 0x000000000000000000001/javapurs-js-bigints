public class Test_QuickCheck_Laws_Data_Semigroup {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object checkSemigroupGen = (java.util.function.Function<Object, Object>) (dictSemigroup_0) -> (java.util.function.Function<Object, Object>) (dictEq_1) -> (java.util.function.Function<Object, Object>) (gen_2) -> { Object __local_var_3 = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply("Checking 'Associativity' law for Semigroup"); return __local_var_3; };
public static final Object checkSemigroup = (java.util.function.Function<Object, Object>) (dictSemigroup_0) -> (java.util.function.Function<Object, Object>) (dictArbitrary_1) -> { Object arbitrary_2 = ((java.util.LinkedHashMap<String, Object>) dictArbitrary_1).get("arbitrary"); return (java.util.function.Function<Object, Object>) (dictEq_3) -> (java.util.function.Function<Object, Object>) (v_4) -> { Object __local_var_5 = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply("Checking 'Associativity' law for Semigroup"); return __local_var_5; }; };
}

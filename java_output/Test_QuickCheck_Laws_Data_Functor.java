public class Test_QuickCheck_Laws_Data_Functor {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object checkFunctorGen = (java.util.function.Function<Object, Object>) (dictFunctor_0) -> (java.util.function.Function<Object, Object>) (dictEq_1) -> (java.util.function.Function<Object, Object>) (gen_2) -> { Object __local_var_3 = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply("Checking 'Identity' law for Functor"); return __local_var_3; };
public static final Object checkFunctor = (java.util.function.Function<Object, Object>) (dictFunctor_0) -> (java.util.function.Function<Object, Object>) (dictArbitrary_1) -> (java.util.function.Function<Object, Object>) (dictEq_2) -> (java.util.function.Function<Object, Object>) (v_3) -> { Object __local_var_4 = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply("Checking 'Identity' law for Functor"); return __local_var_4; };
}

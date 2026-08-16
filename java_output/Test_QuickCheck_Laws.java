public class Test_QuickCheck_Laws {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object E = (java.util.function.Function<Object, Object>) (x_0) -> x_0;
public static final Object D = (java.util.function.Function<Object, Object>) (x_0) -> x_0;
public static final Object C = (java.util.function.Function<Object, Object>) (x_0) -> x_0;
public static final Object B = (java.util.function.Function<Object, Object>) (x_0) -> x_0;
public static final Object A = (java.util.function.Function<Object, Object>) (x_0) -> x_0;
public static final Object semigroupE = Data_Ordering.semigroupOrdering;
public static final Object semigroupD = Data_Ordering.semigroupOrdering;
public static final Object semigroupC = Data_Ordering.semigroupOrdering;
public static final Object semigroupB = Data_Ordering.semigroupOrdering;
public static final Object semigroupA = Data_Ordering.semigroupOrdering;
public static final Object ordE = Data_Ord.ordOrdering;
public static final Object ordD = Data_Ord.ordOrdering;
public static final Object ordC = Data_Ord.ordOrdering;
public static final Object ordB = Data_Ord.ordOrdering;
public static final Object ordA = Data_Ord.ordOrdering;
public static final Object monoidE = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("mempty", new Data_Ordering.EQ()); __map.put("Semigroup0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Ordering.semigroupOrdering);  return __map; } }).get();
public static final Object monoidD = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("mempty", new Data_Ordering.EQ()); __map.put("Semigroup0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Ordering.semigroupOrdering);  return __map; } }).get();
public static final Object monoidC = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("mempty", new Data_Ordering.EQ()); __map.put("Semigroup0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Ordering.semigroupOrdering);  return __map; } }).get();
public static final Object monoidB = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("mempty", new Data_Ordering.EQ()); __map.put("Semigroup0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Ordering.semigroupOrdering);  return __map; } }).get();
public static final Object monoidA = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("mempty", new Data_Ordering.EQ()); __map.put("Semigroup0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Ordering.semigroupOrdering);  return __map; } }).get();
public static final Object eqE = Data_Ordering.eqOrdering;
public static final Object eqD = Data_Ordering.eqOrdering;
public static final Object eqC = Data_Ordering.eqOrdering;
public static final Object eqB = Data_Ordering.eqOrdering;
public static final Object eqA = Data_Ordering.eqOrdering;
public static final Object enumE = Data_Enum.enumOrdering;
public static final Object enumD = Data_Enum.enumOrdering;
public static final Object enumC = Data_Enum.enumOrdering;
public static final Object enumB = Data_Enum.enumOrdering;
public static final Object enumA = Data_Enum.enumOrdering;
public static final Object coarbitraryE = Test_QuickCheck_Arbitrary.coarbOrdering;
public static final Object coarbitraryD = Test_QuickCheck_Arbitrary.coarbOrdering;
public static final Object coarbitraryC = Test_QuickCheck_Arbitrary.coarbOrdering;
public static final Object coarbitraryB = Test_QuickCheck_Arbitrary.coarbOrdering;
public static final Object coarbitraryA = Test_QuickCheck_Arbitrary.coarbOrdering;
public static final Object checkLaws = (java.util.function.Function<Object, Object>) (typeName_0) -> (java.util.function.Function<Object, Object>) (laws_1) -> { Object __local_var_2 = ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply((((String) ((((String) ("\n\nChecking laws of ")) + ((String) (typeName_0))))) + ((String) (" instances...\n")))); return __local_var_2; };
public static final Object boundedEnumE = Data_Enum.boundedEnumOrdering;
public static final Object boundedEnumD = Data_Enum.boundedEnumOrdering;
public static final Object boundedEnumC = Data_Enum.boundedEnumOrdering;
public static final Object boundedEnumB = Data_Enum.boundedEnumOrdering;
public static final Object boundedEnumA = Data_Enum.boundedEnumOrdering;
public static final Object boundedE = Data_Bounded.boundedOrdering;
public static final Object boundedD = Data_Bounded.boundedOrdering;
public static final Object boundedC = Data_Bounded.boundedOrdering;
public static final Object boundedB = Data_Bounded.boundedOrdering;
public static final Object boundedA = Data_Bounded.boundedOrdering;
public static final Object arbitraryE = Test_QuickCheck_Arbitrary.arbOrdering;
public static final Object arbitraryD = Test_QuickCheck_Arbitrary.arbOrdering;
public static final Object arbitraryC = Test_QuickCheck_Arbitrary.arbOrdering;
public static final Object arbitraryB = Test_QuickCheck_Arbitrary.arbOrdering;
public static final Object arbitraryA = Test_QuickCheck_Arbitrary.arbOrdering;
}

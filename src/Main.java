import java.util.ArrayList;
import java.util.List;

public class Main {

    public class genericMethods {
        static Character[] charArray = {'g', '1', '-', 'B'};
        static Integer[] intArray = {1, 6, -10, -29};
        static Boolean[] boolArray = {true, false, false, true};

        /**
         * The T represents a parameterized type meaning we allow the method caller
         * to decide what the type of data based on a parameter representing that type
         * @param array
         * @param list
         * @return
         * @param <T>
         */
        public static <T> List<T> arrayToList(T[] array, List<T> list){
            for (T o: array){
                list.add(o);
            }

            return list;
        }

        /**
         * The ... represents varargs or a variable length argument. It is supported by
         * forming an array of all items passed into printItems function of type String
         * @param items
         */
        public static void printItems(String... items){
            for (String s : items){
                System.out.println(s);
            }
        }

        /**
         * Even though it is asking for a type liskovSubstitutionParent it can still
         * accept subtypes of that type and should function properly
         * @param lsp
         */
        public static void liskovMethod1(liskovSubstitutionParent lsp){
            System.out.println(lsp);
        }

        /**
         * Here is an example of Java wildcards that allows you to express
         * wanting a type to include all subtypes
         * The extends is usually used with in variables or passing data in
         * to operate on
         * @param lsps
         */
        public static void liskovMethod2(List<? extends liskovSubstitutionParent> lsps){
            for(liskovSubstitutionParent lsp : lsps){
                System.out.println(lsp);
            }
        }

        /**
         * Here is another example of Java wildcards that allows you to express
         * wanting a type to include all supertypes
         * The super is usually used with out varaibles or passing data in to
         * operate and return
         * @param lscs
         */
        public static void liskovMethod3(List<? super liskovSubstitutionChild> lscs){
            for(Object lsc : lscs){
                System.out.println(lsc);
            }
        }

    }



    public static void main(String[] args) {
        genericMethods.printItems();
        genericMethods.printItems("Hello");
        genericMethods.printItems("Hello", "World");
        genericMethods.printItems(new String[]{"Hello", "World", "!"});
        liskovSubstitutionParent lsp = new liskovSubstitutionChild();
        genericMethods.liskovMethod1(lsp);

        List<liskovSubstitutionChild> lscl = new ArrayList<>();

        genericMethods.liskovMethod2(lscl);
    }
}

class liskovSubstitutionParent {

}
class liskovSubstitutionChild extends liskovSubstitutionParent {

}
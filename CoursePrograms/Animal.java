package CoursePrograms;

public class Animal {
  private int id;

  Animal(int id) {
    this.id = id;
  }

  public static void main(String[] args) {
    Animal dog = new Animal(12);
    Animal cat = new Animal(15);

    /*
     * Reference type:
     * Class name "Animal" is called as Reference Type.
     * Example: String, Animal, BigDecimal etc all are reference types
     * referenceType: The object "dog" is called as reference variable
     * 
     * These are called as "Reference" because they hold the address of an object
     * not the value.
     * 
     * These are similar to Primitive type and Primitive variable but differ in
     * memory allocation
     * 
     * Example:
     * int i = 10;
     * 
     * Here i is -> Primitive variable
     * int -> Primitive type
     * 
     * In primitive type and variable, they hold the actual value
     */

    /*
     * Memory allocation of Reference type and Primitive type
     * 
     * Heap Memory: It's a globally shared memory and can be accessed by any
     * programs. All the new objects are created in Heap memory
     * Stack Memory: Every method will have a separate stack memory
     * 
     * When we create an object,
     * Example:
     * 
     * Animal dog = new Animal(12);
     * Animal cat = new Animal(15);
     * 
     * Under the heap memory,Animal(12) gets stored in 1111111A location and at
     * 1111111C location, Animal(15) gets stored
     * Location | Object
     * -------------------
     * 1111111A | Animal(12)
     * 1111111C | Animal(15)
     * 
     * In stack memory,
     * 
     * For the primitive type and variable, variable (i) gets stored
     * in one of the memory location in "variable" column and value (5) gets stored
     * in "value" column which corresponds to same variable name
     * 
     * But for the "Reference" types and variables, variable (dog) gets stored in
     * "variable" column in one of the memory location and "1111111A" gets stored
     * under the "value" column which corresponds to dog variable
     * 
     * Similarly for cat as well
     * variable (cat) gets stored in "variable" column in one of the memory location
     * and "1111111C" gets stored under the "value" column which corresponds to cat
     * variable
     * 
     * Basically,
     * 
     * 1. Value of the object gets stored in "Object" column in Heap memory
     * 2. Object name gets stored in Stack memory under Variable-name column
     * 3. Value column of Stack memory for Reference types holds the memory location
     * of an object where it is stored
     * 4. Value column of Stack memory for Primitive types holds the value stored by
     * variable
     * 5. Variable-name column of Stack memory for Primitive types holds the
     * variable name
     * 
     * Location | variable | value
     * -------------------------
     * 0000000A | dog | 1111111A
     * 0000000C | cat| 1111111C
     * 0000000F | i | 5
     * 
     * 0000000F | nothing | 1111111C
     * 
     * 
     */
    // If we create an object without any value
    Animal nothing;

    // Object name "nothing" will get stored in "Variable-name" column under stack
    // memory and "Value" column will have null value as it doesn't have any value
    // (null here refers to Doesn't have memory location)

    // Copy cat into nothing
    nothing = cat;

    // When we do this, cat address gets copied into nothing.

    /*
     * In stack memory, under "Variable-name", it will have "nothing" and now column
     * "Value" gets updated from null to 1111111C as cat has 1111111C same memory
     * location
     */

    nothing.id = 20;

    // As nothing is pointing to 1111111C location, the value in heap memory where
    // 1111111C is present will get updated from Animal(15) to Animal(20)

    System.out.println(nothing.id);
    System.out.println(cat.id);

    // As nothing and cat are pointing to same location, cat.id will give same
    // result as nothing.id
    // This is because, they are pointing to same memory locations

    /*
     * When we try to copy one object to another, only memory location gets copied.
     * If both are pointing to same memory location and if we update any one of
     * their value, by default other value will also gets updated.
     */

    /*
     * Note: In primitive variables, when we copy from one variable to another,
     * value gets copied
     */
    int i = 5;
    int j = i;
    System.out.println(j);

    /*
     * Comparison of reference types and variable
     */

    // Commented out as these are already created
    // Animal dog = new Animal(12);
    // Animal cat = new Animal(15);
    Animal ref = cat;
    Animal dog2 = new Animal(12);

    // Lets compare
    System.out.println(dog == cat); // false as they are two different objects

    System.out.println(ref == cat); // true as cat is copied into ref

    System.out.println(dog == dog2); // false -> Even though values are same, differ
    // in memory locations. dog2 might be created in some other memory location.
    // Example: 1111111D
    // and dog has 1111111A location. So, both doesn't match

    // Note for ==
    // Primitive variables: compares values
    // Reference variables: compares memory locations
  }
}

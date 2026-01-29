package CourseProblems;

public class AnimalReferenceVariable {
  private int id;

  public AnimalReferenceVariable(int id) {
    this.id = id;
  }

  public static void main(String[] args) {
    AnimalReferenceVariable dog = new AnimalReferenceVariable(10); // 10 gets stored for dog. It gets stored in heap but
                                                                   // objct name dog is stored in stack referencing
                                                                   // memory location of Animal10
    AnimalReferenceVariable cat = new AnimalReferenceVariable(12); // 12 gets stored for cat. It gets stored in heap but
                                                                   // objct name cat is stored in stack referencing
                                                                   // memory location of Animal12
    AnimalReferenceVariable ref = cat;
    AnimalReferenceVariable dog2 = new AnimalReferenceVariable(10);

    // new instance
    AnimalReferenceVariable nothing; // It will get stored in stack as nothing for variable but for value, it will be
                                     // null as no value specified

    // Assign cat to nothing
    nothing = cat;
    nothing.id = 10; // new value

    // Both will print same as they are referencing to same memory location. This
    // will get updated in heap
    System.out.println(nothing.id); // prints 10
    System.out.println(cat.id); // prints 10

    // Note: Primitive variables stores values where as referece variables store
    // memory location of the object where its actually created in heap

    // Compare
    System.out.println(dog == cat); // false
    System.out.println(cat == ref); // true as they are pointing to same object
    System.out.println(dog == dog2); // false. Even though values are same, memory locations are different

  }

}

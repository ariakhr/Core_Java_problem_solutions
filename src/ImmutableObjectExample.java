
/*To create an immutable class in java, you have to do following steps.

        Declare the class as final so it can’t be extended.
        Make all fields private so that direct access is not allowed.
        Don’t provide setter methods for variables
        Make all mutable fields final so that it’s value can be assigned only once.
        Initialize all the fields via a constructor performing deep copy.
        Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.*/

final class ImmutableObject {

    private final int id;

    public ImmutableObject(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class ImmutableObjectExample {

    //Once the object is constructed,we cannot modify the fields/values
    ImmutableObject example = new ImmutableObject(11);
    ImmutableObject example1 = new ImmutableObject(11);
}

public class AccessModifiers {

    /*
The 'public' keyword is an access modifier, meaning that it is used to set the access level for classes, attributes,
methods and constructors. We divide modifiers into two groups:
1) Access Modifiers - controls the access level
2) Non-Access Modifiers - do not control access level, but provides other functionality
     */

    // ad 1)
    /* For Classes:
    Modifier         Description
    public	            The class is accessible by any other class
    default	            The class is only accessible by classes in the same package.
                        This is used when you don't specify a modifier. */

    /* For Attributes, Methods and Constructors:
    Modifier        Description
    Public          The code is accessible for all classes
    Private         The code is only accessible within the declared class
    Default         The code is only accessible in the same package. (This is used when you don't specify a modifier.)
    Protected       The code is accessible in the same package and subclasses. */

    // ad 2)

    /*For Classes:
    final           The class cannot be inherited by other classes
    abstract        The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.) */

    /* For Attributes and Methods:
    final           Attributes and methods cannot be overridden/modified
    static          Attributes and methods belongs to the class, rather than an object
    abstract        Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();.
                    The body is provided by the subclass (inherited from).
    transient       Attributes and methods are skipped when serializing the object containing them
    synchronized    Methods can only be accessed by one thread at a time
    volatile        The value of an attribute is not cached thread-locally, and is always read from the "main memory"


     */

}
package userfuncs.binaryfuncs;

public interface BinaryFunc {
    // Obtain the name of the function.
    public String getName();

    // This is the function to perform. It will be
    // provided by specific implementations.
    public int func(int a, int b);
}
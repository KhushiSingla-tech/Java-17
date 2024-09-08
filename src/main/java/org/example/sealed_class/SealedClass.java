package org.example.sealed_class;

// Permitted classes should extend parent class
// Child classes should either be final, sealed, non-sealed
// With non-sealed anyone can extend the class
// sealed always comes with permits
sealed class A extends Thread implements Cloneable permits B,C{}
non-sealed class B extends A {}
final class C extends A{}
class D extends B{}

// Permitted interfaces should implement parent interface
// Child interfaces should either be sealed, non-sealed
//sealed interface I permits J,K{}
sealed interface I permits J{}
non-sealed interface J extends I{}
//sealed interface K extends I{} // throws error as sealed always comes with permit

public class SealedClass {
    public static void main(String args[]) {

    }
}

package org.example.Corejava.Garbage_Collection;

// 👉 Garbage Collector (GC) is a feature of Java that automatically deletes unused objects
// from memory and frees space in the heap.



class Demo{

    protected void finalize() {
        System.out.println("Garbage Collection");
    }
}




public class GarbageCollection {
    static void main() {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1 = null;

        d2 = null;

        System.gc();    // requesting the jvm to run GC

    }
}

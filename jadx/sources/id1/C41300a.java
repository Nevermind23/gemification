package id1;

import yd1.C43364i;

/* renamed from: id1.a */
public abstract class C41300a {
    /* renamed from: a */
    public static RuntimeException m119660a(Throwable th) {
        throw C43364i.m124412e(th);
    }

    /* renamed from: b */
    public static void m119661b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}

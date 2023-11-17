package yd1;

import androidx.lifecycle.C1612n;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: yd1.i */
public abstract class C43364i {

    /* renamed from: a */
    public static final Throwable f101206a = new C43365a();

    /* renamed from: yd1.i$a */
    static final class C43365a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        C43365a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static boolean m124408a(AtomicReference atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f101206a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!C1612n.m5659a(atomicReference, th2, th3));
        return true;
    }

    /* renamed from: b */
    public static Throwable m124409b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f101206a;
        if (th != th2) {
            return (Throwable) atomicReference.getAndSet(th2);
        }
        return th;
    }

    /* renamed from: c */
    public static Exception m124410c(Throwable th) {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: d */
    public static String m124411d(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    /* renamed from: e */
    public static RuntimeException m124412e(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }
}

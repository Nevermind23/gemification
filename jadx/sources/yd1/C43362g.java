package yd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import ld1.C41692b;
import p469io.reactivex.exceptions.ProtocolViolationException;
import uh1.C43108c;
import xd1.C43259d;

/* renamed from: yd1.g */
public abstract class C43362g {
    /* renamed from: a */
    public static String m124404a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: b */
    public static void m124405b(Class cls) {
        C40293a.m116722s(new ProtocolViolationException(m124404a(cls.getName())));
    }

    /* renamed from: c */
    public static boolean m124406c(AtomicReference atomicReference, C41205b bVar, Class cls) {
        C41692b.m120934e(bVar, "next is null");
        if (C1612n.m5659a(atomicReference, (Object) null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == C41498c.DISPOSED) {
            return false;
        }
        m124405b(cls);
        return false;
    }

    /* renamed from: d */
    public static boolean m124407d(AtomicReference atomicReference, C43108c cVar, Class cls) {
        C41692b.m120934e(cVar, "next is null");
        if (C1612n.m5659a(atomicReference, (Object) null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == C43259d.CANCELLED) {
            return false;
        }
        m124405b(cls);
        return false;
    }
}

package dg1;

import androidx.lifecycle.C1612n;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.v */
public final class C40703v {

    /* renamed from: a */
    public static final C40703v f96378a = new C40703v();

    /* renamed from: b */
    private static final int f96379b = 65536;

    /* renamed from: c */
    private static final C40701u f96380c = new C40701u(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    private static final int f96381d;

    /* renamed from: e */
    private static final AtomicReference[] f96382e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f96381d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f96382e = atomicReferenceArr;
    }

    private C40703v() {
    }

    /* renamed from: a */
    private final AtomicReference m117850a() {
        return f96382e[(int) (Thread.currentThread().getId() & (((long) f96381d) - 1))];
    }

    /* renamed from: b */
    public static final void m117851b(C40701u uVar) {
        boolean z;
        int i;
        C41536l.m120489i(uVar, "segment");
        if (uVar.f96376f == null && uVar.f96377g == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!uVar.f96374d) {
            AtomicReference a = f96378a.m117850a();
            C40701u uVar2 = (C40701u) a.get();
            if (uVar2 != f96380c) {
                if (uVar2 == null) {
                    i = 0;
                } else {
                    i = uVar2.f96373c;
                }
                if (i < f96379b) {
                    uVar.f96376f = uVar2;
                    uVar.f96372b = 0;
                    uVar.f96373c = i + 8192;
                    if (!C1612n.m5659a(a, uVar2, uVar)) {
                        uVar.f96376f = null;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static final C40701u m117852c() {
        AtomicReference a = f96378a.m117850a();
        C40701u uVar = f96380c;
        C40701u uVar2 = (C40701u) a.getAndSet(uVar);
        if (uVar2 == uVar) {
            return new C40701u();
        }
        if (uVar2 == null) {
            a.set((Object) null);
            return new C40701u();
        }
        a.set(uVar2.f96376f);
        uVar2.f96376f = null;
        uVar2.f96373c = 0;
        return uVar2;
    }
}

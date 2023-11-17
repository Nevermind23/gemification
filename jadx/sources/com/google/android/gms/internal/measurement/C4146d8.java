package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.d8 */
public abstract class C4146d8 implements C4386ra {
    protected int zzb = 0;

    /* renamed from: f */
    protected static void m15688f(Iterable iterable, List list) {
        byte[] bArr = C4470w9.f13784d;
        iterable.getClass();
        if (iterable instanceof C4518z9) {
            List u = ((C4518z9) iterable).mo13372u();
            C4518z9 z9Var = (C4518z9) list;
            int size = list.size();
            for (Object next : u) {
                if (next == null) {
                    String str = "Element at index " + (z9Var.size() - size) + " is null.";
                    int size2 = z9Var.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            z9Var.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof C4418t8) {
                    z9Var.mo13365F0((C4418t8) next);
                } else {
                    z9Var.add((String) next);
                }
            }
        } else if (!(iterable instanceof C4503ya)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw new NullPointerException(str2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo13040e(C4132cb cbVar);

    /* renamed from: g */
    public final byte[] mo13041g() {
        try {
            int a = mo13465a();
            byte[] bArr = new byte[a];
            C4096a9 A = C4096a9.m15478A(bArr, 0, a);
            mo13467c(A);
            A.mo12845a();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.k8 */
final class C4265k8 implements Comparator {
    C4265k8() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C4418t8 t8Var = (C4418t8) obj;
        C4418t8 t8Var2 = (C4418t8) obj2;
        C4248j8 j8Var = new C4248j8(t8Var);
        C4248j8 j8Var2 = new C4248j8(t8Var2);
        while (j8Var.hasNext() && j8Var2.hasNext()) {
            int compareTo = Integer.valueOf(j8Var.mo13287a() & 255).compareTo(Integer.valueOf(j8Var2.mo13287a() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(t8Var.mo13355g()).compareTo(Integer.valueOf(t8Var2.mo13355g()));
    }
}

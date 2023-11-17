package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.j8 */
final class C4248j8 extends C4282l8 {

    /* renamed from: d */
    private int f13366d = 0;

    /* renamed from: e */
    private final int f13367e;

    /* renamed from: f */
    final /* synthetic */ C4418t8 f13368f;

    C4248j8(C4418t8 t8Var) {
        this.f13368f = t8Var;
        this.f13367e = t8Var.mo13355g();
    }

    /* renamed from: a */
    public final byte mo13287a() {
        int i = this.f13366d;
        if (i < this.f13367e) {
            this.f13366d = i + 1;
            return this.f13368f.mo13354c(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f13366d < this.f13367e;
    }
}

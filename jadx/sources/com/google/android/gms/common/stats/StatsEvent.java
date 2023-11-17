package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public final String toString() {
        long w = mo12378w();
        int v = mo12377v();
        String x = mo12379x();
        return w + "\t" + v + "\t-1" + x;
    }

    /* renamed from: v */
    public abstract int mo12377v();

    /* renamed from: w */
    public abstract long mo12378w();

    /* renamed from: x */
    public abstract String mo12379x();
}

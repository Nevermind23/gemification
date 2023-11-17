package androidx.work.impl;

import androidx.work.C2073m;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.work.impl.b0 */
public abstract class C1970b0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5959a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String[] f5960b = {"-journal", "-shm", "-wal"};

    static {
        String i = C2073m.m8073i("WrkDbPathHelper");
        C41536l.m120488h(i, "tagWithPrefix(\"WrkDbPathHelper\")");
        f5959a = i;
    }
}

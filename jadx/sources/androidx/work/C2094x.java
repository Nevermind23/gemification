package androidx.work;

import android.content.Context;
import androidx.work.impl.C2007e0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: androidx.work.x */
public abstract class C2094x {

    /* renamed from: androidx.work.x$a */
    public enum C2095a {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    protected C2094x() {
    }

    /* renamed from: g */
    public static C2094x m8110g(Context context) {
        return C2007e0.m7860n(context);
    }

    /* renamed from: h */
    public static void m8111h(Context context, C1950b bVar) {
        C2007e0.m7858h(context, bVar);
    }

    /* renamed from: a */
    public abstract C2079p mo6815a(String str);

    /* renamed from: b */
    public abstract C2079p mo6816b(String str);

    /* renamed from: c */
    public abstract C2079p mo6817c(UUID uuid);

    /* renamed from: d */
    public final C2079p mo6981d(C2096y yVar) {
        return mo6818e(Collections.singletonList(yVar));
    }

    /* renamed from: e */
    public abstract C2079p mo6818e(List list);

    /* renamed from: f */
    public abstract C2079p mo6819f(String str, C1961f fVar, C2086r rVar);
}

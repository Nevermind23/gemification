package p272u5;

import android.content.Context;
import ge1.C41084a;
import p194o5.C7458b;
import p194o5.C7460d;

/* renamed from: u5.h */
public final class C8597h implements C7458b {

    /* renamed from: a */
    private final C41084a f24347a;

    public C8597h(C41084a aVar) {
        this.f24347a = aVar;
    }

    /* renamed from: a */
    public static C8597h m32117a(C41084a aVar) {
        return new C8597h(aVar);
    }

    /* renamed from: c */
    public static String m32118c(Context context) {
        return (String) C7460d.m28361c(C8592f.m32109b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return m32118c((Context) this.f24347a.get());
    }
}

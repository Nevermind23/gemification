package p181n5;

import android.content.Context;
import ge1.C41084a;
import p194o5.C7458b;

/* renamed from: n5.l */
public final class C7243l implements C7458b {

    /* renamed from: a */
    private final C41084a f21431a;

    /* renamed from: b */
    private final C41084a f21432b;

    public C7243l(C41084a aVar, C41084a aVar2) {
        this.f21431a = aVar;
        this.f21432b = aVar2;
    }

    /* renamed from: a */
    public static C7243l m27846a(C41084a aVar, C41084a aVar2) {
        return new C7243l(aVar, aVar2);
    }

    /* renamed from: c */
    public static C7241k m27847c(Context context, Object obj) {
        return new C7241k(context, (C7239i) obj);
    }

    /* renamed from: b */
    public C7241k get() {
        return m27847c((Context) this.f21431a.get(), this.f21432b.get());
    }
}

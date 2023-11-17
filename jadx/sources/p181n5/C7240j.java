package p181n5;

import android.content.Context;
import ge1.C41084a;
import p194o5.C7458b;
import p298w5.C8850a;

/* renamed from: n5.j */
public final class C7240j implements C7458b {

    /* renamed from: a */
    private final C41084a f21423a;

    /* renamed from: b */
    private final C41084a f21424b;

    /* renamed from: c */
    private final C41084a f21425c;

    public C7240j(C41084a aVar, C41084a aVar2, C41084a aVar3) {
        this.f21423a = aVar;
        this.f21424b = aVar2;
        this.f21425c = aVar3;
    }

    /* renamed from: a */
    public static C7240j m27838a(C41084a aVar, C41084a aVar2, C41084a aVar3) {
        return new C7240j(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C7239i m27839c(Context context, C8850a aVar, C8850a aVar2) {
        return new C7239i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C7239i get() {
        return m27839c((Context) this.f21423a.get(), (C8850a) this.f21424b.get(), (C8850a) this.f21425c.get());
    }
}

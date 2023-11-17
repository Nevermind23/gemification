package p272u5;

import android.content.Context;
import ge1.C41084a;
import p194o5.C7458b;

/* renamed from: u5.u0 */
public final class C8631u0 implements C7458b {

    /* renamed from: a */
    private final C41084a f24397a;

    /* renamed from: b */
    private final C41084a f24398b;

    /* renamed from: c */
    private final C41084a f24399c;

    public C8631u0(C41084a aVar, C41084a aVar2, C41084a aVar3) {
        this.f24397a = aVar;
        this.f24398b = aVar2;
        this.f24399c = aVar3;
    }

    /* renamed from: a */
    public static C8631u0 m32240a(C41084a aVar, C41084a aVar2, C41084a aVar3) {
        return new C8631u0(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C8628t0 m32241c(Context context, String str, int i) {
        return new C8628t0(context, str, i);
    }

    /* renamed from: b */
    public C8628t0 get() {
        return m32241c((Context) this.f24397a.get(), (String) this.f24398b.get(), ((Integer) this.f24399c.get()).intValue());
    }
}

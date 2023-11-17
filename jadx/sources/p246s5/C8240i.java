package p246s5;

import android.content.Context;
import ge1.C41084a;
import p194o5.C7458b;
import p194o5.C7460d;
import p259t5.C8376f;
import p259t5.C8398x;
import p272u5.C8587d;
import p298w5.C8850a;

/* renamed from: s5.i */
public final class C8240i implements C7458b {

    /* renamed from: a */
    private final C41084a f23442a;

    /* renamed from: b */
    private final C41084a f23443b;

    /* renamed from: c */
    private final C41084a f23444c;

    /* renamed from: d */
    private final C41084a f23445d;

    public C8240i(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4) {
        this.f23442a = aVar;
        this.f23443b = aVar2;
        this.f23444c = aVar3;
        this.f23445d = aVar4;
    }

    /* renamed from: a */
    public static C8240i m31040a(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4) {
        return new C8240i(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C8398x m31041c(Context context, C8587d dVar, C8376f fVar, C8850a aVar) {
        return (C8398x) C7460d.m28361c(C8239h.m31039a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C8398x get() {
        return m31041c((Context) this.f23442a.get(), (C8587d) this.f23443b.get(), (C8376f) this.f23444c.get(), (C8850a) this.f23445d.get());
    }
}

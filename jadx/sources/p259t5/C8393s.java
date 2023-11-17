package p259t5;

import android.content.Context;
import ge1.C41084a;
import java.util.concurrent.Executor;
import p181n5.C7233e;
import p194o5.C7458b;
import p272u5.C8585c;
import p272u5.C8587d;
import p285v5.C8702a;
import p298w5.C8850a;

/* renamed from: t5.s */
public final class C8393s implements C7458b {

    /* renamed from: a */
    private final C41084a f23831a;

    /* renamed from: b */
    private final C41084a f23832b;

    /* renamed from: c */
    private final C41084a f23833c;

    /* renamed from: d */
    private final C41084a f23834d;

    /* renamed from: e */
    private final C41084a f23835e;

    /* renamed from: f */
    private final C41084a f23836f;

    /* renamed from: g */
    private final C41084a f23837g;

    /* renamed from: h */
    private final C41084a f23838h;

    /* renamed from: i */
    private final C41084a f23839i;

    public C8393s(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5, C41084a aVar6, C41084a aVar7, C41084a aVar8, C41084a aVar9) {
        this.f23831a = aVar;
        this.f23832b = aVar2;
        this.f23833c = aVar3;
        this.f23834d = aVar4;
        this.f23835e = aVar5;
        this.f23836f = aVar6;
        this.f23837g = aVar7;
        this.f23838h = aVar8;
        this.f23839i = aVar9;
    }

    /* renamed from: a */
    public static C8393s m31509a(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5, C41084a aVar6, C41084a aVar7, C41084a aVar8, C41084a aVar9) {
        return new C8393s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    /* renamed from: c */
    public static C8392r m31510c(Context context, C7233e eVar, C8587d dVar, C8398x xVar, Executor executor, C8702a aVar, C8850a aVar2, C8850a aVar3, C8585c cVar) {
        return new C8392r(context, eVar, dVar, xVar, executor, aVar, aVar2, aVar3, cVar);
    }

    /* renamed from: b */
    public C8392r get() {
        return m31510c((Context) this.f23831a.get(), (C7233e) this.f23832b.get(), (C8587d) this.f23833c.get(), (C8398x) this.f23834d.get(), (Executor) this.f23835e.get(), (C8702a) this.f23836f.get(), (C8850a) this.f23837g.get(), (C8850a) this.f23838h.get(), (C8585c) this.f23839i.get());
    }
}

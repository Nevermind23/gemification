package k61;

import e61.C31675e;
import h61.C36154a;
import j51.C36735g;
import kotlin.jvm.internal.C41536l;
import m51.C37228a;

/* renamed from: k61.a */
public final class C36876a implements C31675e {

    /* renamed from: a */
    private final C36154a f88978a;

    /* renamed from: b */
    private final C36735g f88979b;

    public C36876a(C36154a aVar, C36735g gVar) {
        C41536l.m120489i(aVar, "storiesPreferencesManager");
        C41536l.m120489i(gVar, "getLoginInfoUseCase");
        this.f88978a = aVar;
        this.f88979b = gVar;
    }

    /* renamed from: a */
    public boolean mo72095a(long j) {
        C36154a aVar = this.f88978a;
        C37228a a = this.f88979b.mo89562a();
        return aVar.mo88912b(j, a != null ? a.mo90305b() : -1);
    }
}

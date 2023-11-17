package k61;

import e61.C31678h;
import h61.C36154a;
import j51.C36735g;
import kotlin.jvm.internal.C41536l;
import m51.C37228a;

/* renamed from: k61.b */
public final class C36877b implements C31678h {

    /* renamed from: a */
    private final C36154a f88980a;

    /* renamed from: b */
    private final C36735g f88981b;

    public C36877b(C36154a aVar, C36735g gVar) {
        C41536l.m120489i(aVar, "storiesPreferencesManager");
        C41536l.m120489i(gVar, "getLoginInfoUseCase");
        this.f88980a = aVar;
        this.f88981b = gVar;
    }

    /* renamed from: a */
    public void mo72098a(long j) {
        C36154a aVar = this.f88980a;
        C37228a a = this.f88981b.mo89562a();
        if (a != null) {
            aVar.mo88911a(j, a.mo90305b());
        }
    }
}

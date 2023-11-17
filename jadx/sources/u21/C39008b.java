package u21;

import j51.C36735g;
import k31.C36868b;
import kotlin.jvm.internal.C41536l;
import m31.C37222a;
import m51.C37228a;

/* renamed from: u21.b */
public final class C39008b implements C36868b {

    /* renamed from: a */
    private final C37222a f93127a;

    /* renamed from: b */
    private final C36735g f93128b;

    public C39008b(C37222a aVar, C36735g gVar) {
        C41536l.m120489i(aVar, "commonPopupPreferenceManager");
        C41536l.m120489i(gVar, "getLoginInfoUseCase");
        this.f93127a = aVar;
        this.f93128b = gVar;
    }

    /* renamed from: a */
    public void mo89792a(String str) {
        C41536l.m120489i(str, "popupType");
        C37222a aVar = this.f93127a;
        C37228a a = this.f93128b.mo89562a();
        if (a != null) {
            aVar.mo90294a(a.mo90305b(), str);
        }
    }
}

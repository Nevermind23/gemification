package z50;

import android.widget.CompoundButton;
import g60.C20742c;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p90.C27350k6;
import ue1.C43075l;
import y50.C29923a;

/* renamed from: z50.e */
public final class C30222e extends C20742c {

    /* renamed from: d */
    private final C27350k6 f76110d;

    /* renamed from: e */
    private C43075l f76111e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30222e(C27350k6 k6Var) {
        super((C6201a) k6Var);
        C41536l.m120489i(k6Var, "binding");
        this.f76110d = k6Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m91305j(C30222e eVar, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(eVar, "this$0");
        C43075l lVar = eVar.f76111e;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
    }

    /* renamed from: i */
    public void onBind(C29923a aVar) {
        C41536l.m120489i(aVar, "data");
        this.f76110d.f69174e.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f76110d.f69174e.setChecked(((C29923a.C29927d) aVar).mo70232b());
        this.f76110d.f69174e.setOnCheckedChangeListener(new C30221d(this));
    }

    /* renamed from: k */
    public final void mo70552k(C43075l lVar) {
        this.f76111e = lVar;
    }
}

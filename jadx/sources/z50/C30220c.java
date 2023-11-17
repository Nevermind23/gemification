package z50;

import android.content.Context;
import android.view.View;
import g60.C20742c;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p366bk.C10328q;
import p90.C27340j6;
import ue1.C43064a;
import y50.C29923a;

/* renamed from: z50.c */
public final class C30220c extends C20742c {

    /* renamed from: d */
    private final C27340j6 f76106d;

    /* renamed from: e */
    private C43064a f76107e;

    /* renamed from: f */
    private C43064a f76108f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30220c(C27340j6 j6Var) {
        super((C6201a) j6Var);
        C41536l.m120489i(j6Var, "binding");
        this.f76106d = j6Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m91299k(C30220c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C43064a aVar = cVar.f76107e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m91300l(C30220c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C43064a aVar = cVar.f76108f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: j */
    public void onBind(C29923a aVar) {
        C41536l.m120489i(aVar, "data");
        Context context = this.f76106d.f69089h.getContext();
        this.f76106d.f69090i.setOnClickListener(new C30218a(this));
        this.f76106d.f69086e.setOnClickListener(new C30219b(this));
        if (C36546y.m108285N().mo89313K().getUserInfo().isSolo()) {
            this.f76106d.f69087f.setText(context.getString(C10328q.transfer_money_to_trusted_contacts_easily_solo));
        } else {
            this.f76106d.f69087f.setText(context.getString(C10328q.transfer_money_to_trusted_contacts_easily_retail));
        }
    }

    /* renamed from: m */
    public final void mo70548m(C43064a aVar) {
        this.f76108f = aVar;
    }

    /* renamed from: n */
    public final void mo70549n(C43064a aVar) {
        this.f76107e = aVar;
    }
}

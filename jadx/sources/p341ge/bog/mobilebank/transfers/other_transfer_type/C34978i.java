package p341ge.bog.mobilebank.transfers.other_transfer_type;

import android.view.View;
import b71.C31137c;
import b71.C31146l;
import b71.C31147m;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.transfers.other_transfer_type.C34951c;
import p90.C27422s6;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.i */
public final class C34978i extends C31137c {

    /* renamed from: d */
    private final C27422s6 f84439d;

    /* renamed from: e */
    private C34951c.C34952a.C34958f f84440e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C34978i(p90.C27422s6 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f84439d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transfers.other_transfer_type.C34978i.<init>(p90.s6):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m102842k(C43075l lVar, C34978i iVar, View view) {
        C41536l.m120489i(lVar, "$transferWithinBogListClickedCallback");
        C41536l.m120489i(iVar, "this$0");
        C34951c.C34952a.C34958f fVar = iVar.f84440e;
        if (fVar == null) {
            C41536l.m120506z("transferWithinBogItem");
            fVar = null;
        }
        lVar.invoke(fVar.mo85492d());
    }

    /* renamed from: i */
    public void mo85517i(C34951c.C34952a aVar) {
        int i;
        C41536l.m120489i(aVar, "item");
        C34951c.C34952a.C34958f fVar = (C34951c.C34952a.C34958f) aVar;
        this.f84440e = fVar;
        C27422s6 s6Var = this.f84439d;
        s6Var.f69799g.setImageResource(fVar.mo85490b());
        s6Var.f69798f.setText(fVar.mo85491c());
        View view = s6Var.f69797e;
        if (fVar.mo85492d() == C31146l.BOG_PIN) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: j */
    public void mo85518j(C43075l lVar) {
        C41536l.m120489i(lVar, "transferWithinBogListClickedCallback");
        this.f84439d.mo3946b().setOnClickListener(new C31147m(lVar, this));
    }
}

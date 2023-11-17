package p341ge.bog.mobilebank.transfers.other_transfer_type;

import android.view.ViewGroup;
import b71.C31137c;
import b71.C31145k;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.transfers.other_transfer_type.C34951c;
import p90.C27413r6;

/* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.h */
public final class C34977h extends C31137c {

    /* renamed from: d */
    private final C27413r6 f84438d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C34977h(p90.C27413r6 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f84438d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transfers.other_transfer_type.C34977h.<init>(p90.r6):void");
    }

    /* renamed from: h */
    public void mo85516h(C34951c.C34952a aVar) {
        C41536l.m120489i(aVar, "item");
        C34951c.C34952a.C34957e eVar = (C34951c.C34952a.C34957e) aVar;
        C27413r6 r6Var = this.f84438d;
        if (eVar.mo85489c() == C31145k.TRANSFER_EXTERNAL) {
            ViewGroup.LayoutParams layoutParams = r6Var.mo3946b().getLayoutParams();
            C41536l.m120487g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C32343x.m95394I(12);
            r6Var.mo3946b().setLayoutParams(marginLayoutParams);
        }
        r6Var.f69694e.setTitle(eVar.mo85488b());
    }
}

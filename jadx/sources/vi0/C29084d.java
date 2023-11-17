package vi0;

import android.view.View;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import mj0.C26237a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24246a;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24254d;
import th0.C28434x;

/* renamed from: vi0.d */
public final class C29084d extends C26237a {

    /* renamed from: d */
    private final C28434x f74093d;

    /* renamed from: e */
    private final C24246a.C24249c f74094e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29084d(th0.C28434x r3, p341ge.bog.mobilebank.giftcards.presentation.filtered.C24246a.C24249c r4) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "uiEventListener"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f74093d = r3
            r2.f74094e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vi0.C29084d.<init>(th0.x, ge.bog.mobilebank.giftcards.presentation.filtered.a$c):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m88965l(C29084d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.f74094e.mo61882G();
    }

    /* renamed from: k */
    public void mo65239h(C24254d dVar) {
        C41536l.m120489i(dVar, "item");
        C28434x xVar = this.f74093d;
        C24254d.C24259e eVar = (C24254d.C24259e) dVar;
        boolean z = false;
        xVar.f72231g.setText(C32343x.m95388F("giftcard.categories.filter.description", new Object[0]));
        xVar.f72230f.setButtonText(C32343x.m95388F("giftcard.merchant.list.categories.filter", new Object[0]));
        xVar.f72230f.setButtonBadgeCount(Integer.valueOf(eVar.mo61918e()));
        Button button = xVar.f72230f;
        if (eVar.mo61918e() > 0) {
            z = true;
        }
        button.setButtonBadgeVisible(z);
        xVar.f72230f.setOnClickListener(new C29083c(this));
    }
}

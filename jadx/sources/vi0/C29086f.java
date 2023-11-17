package vi0;

import android.view.View;
import kj0.C25740a;
import kotlin.jvm.internal.C41536l;
import mj0.C26237a;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24246a;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24254d;
import p631uj.C18174a;
import th0.C28425s0;

/* renamed from: vi0.f */
public final class C29086f extends C26237a {

    /* renamed from: d */
    private final C28425s0 f74097d;

    /* renamed from: e */
    private final C24246a.C24249c f74098e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29086f(th0.C28425s0 r3, p341ge.bog.mobilebank.giftcards.presentation.filtered.C24246a.C24249c r4) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "uiEventListener"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            ge.bog.designsystem.components.textimagecard.TextImageCardView r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f74097d = r3
            r2.f74098e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vi0.C29086f.<init>(th0.s0, ge.bog.mobilebank.giftcards.presentation.filtered.a$c):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m88969l(C29086f fVar, C24254d dVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(dVar, "$item");
        C24254d.C24260f fVar2 = (C24254d.C24260f) dVar;
        fVar.f74098e.mo61884N(fVar2.mo61922e().mo64313a(), fVar2.mo61922e().mo64319f());
    }

    /* renamed from: k */
    public void mo65239h(C24254d dVar) {
        C41536l.m120489i(dVar, "item");
        TextImageCardView textImageCardView = this.f74097d.f72207e;
        C25740a e = ((C24254d.C24260f) dVar).mo61922e();
        textImageCardView.setImage(e.mo64314b());
        textImageCardView.setDescription(e.mo64315c());
        textImageCardView.mo36861d(C18174a.INVISIBLE, "");
        textImageCardView.setOnClickListener(new C29085e(this, dVar));
    }
}

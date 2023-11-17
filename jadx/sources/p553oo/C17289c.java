package p553oo;

import android.content.Context;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import q31.C38122f;
import q31.C38125h;

/* renamed from: oo.c */
public final class C17289c extends C13310d {
    public C17289c() {
        mo35647a2(C13310d.C13312b.TITLE_CLOSE_TWO_BUTTON);
        mo35648c2(C32343x.m95388F("packages.application.I.email.new.popup.header", new Object[0]));
        mo35639Q1(C32343x.m95388F("packages.application.I.email.new.popup.explanatory", new Object[0]));
        mo35646Z1(C32343x.m95388F("packages.application.I.email.new.popup.main.button", new Object[0]));
        mo35642U1(C32343x.m95388F("packages.application.I.email.new.popup.secondary.button", new Object[0]));
        mo35645Y1(new C17287a(this));
        mo35641T1(new C17288b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m60623h2(C17289c cVar, Button button) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(button, "it");
        Context requireContext = cVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        Context requireContext2 = cVar.requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        c.mo91542C(requireContext2);
        cVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m60624i2(C17289c cVar, Button button) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(button, "it");
        cVar.mo4577k1();
    }
}

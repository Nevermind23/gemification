package ub1;

import android.content.Context;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10220y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.sso_client.onboarding.OnBoardingActivity;

/* renamed from: ub1.c */
public final class C39052c {

    /* renamed from: a */
    public static final C39053a f93195a = new C39053a((DefaultConstructorMarker) null);

    /* renamed from: ub1.c$a */
    public static final class C39053a {
        private C39053a() {
        }

        public /* synthetic */ C39053a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m114012f(C13310d dVar, Context context, Button button) {
        C41536l.m120489i(dVar, "$dialogView");
        C41536l.m120489i(context, "$context");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        ((OnBoardingActivity) context).finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m114013g(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$dialogView");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: c */
    public final C13310d mo92742c(C13310d.C13312b bVar, String str, String str2, Integer num, Integer num2, String str3, String str4) {
        C41536l.m120489i(bVar, "state");
        C13310d dVar = new C13310d();
        dVar.mo35648c2(str);
        dVar.mo35639Q1(str2);
        if (num != null) {
            dVar.mo35637O1(num);
        }
        if (!(num == null || num2 == null)) {
            dVar.mo35638P1(num2);
        }
        dVar.mo35647a2(bVar);
        if (str4 == null) {
            dVar.mo35644X1(str3);
        } else {
            dVar.mo35642U1(str3);
            dVar.mo35646Z1(str4);
        }
        return dVar;
    }

    /* renamed from: d */
    public final C13310d mo92743d(C13310d.C13312b bVar, String str, String str2, String str3) {
        C41536l.m120489i(bVar, "state");
        C13310d dVar = new C13310d();
        dVar.mo35648c2(str);
        dVar.mo35639Q1(str2);
        dVar.mo35647a2(bVar);
        dVar.mo35644X1(str3);
        return dVar;
    }

    /* renamed from: e */
    public final C13310d mo92744e(Context context, C10146d0.C10172e eVar) {
        String str;
        String str2;
        String str3;
        String str4;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(eVar, "config");
        C13310d.C13312b bVar = C13310d.C13312b.TITLE_TWO_BUTTON;
        C10195g0 g = eVar.mo26716g();
        if (g == null || (str = g.mo26763a("text.quit.process.popup.header", new Object[0])) == null) {
            str = context.getString(C10220y.onboarding_sys_back_dialog_title);
            C41536l.m120488h(str, "context.getString(R.stri…ng_sys_back_dialog_title)");
        }
        String str5 = str;
        C10195g0 g2 = eVar.mo26716g();
        if (g2 == null || (str2 = g2.mo26763a("text.quit.process.popup.message", new Object[0])) == null) {
            str2 = context.getString(C10220y.onboarding_sys_back_dialog_text);
            C41536l.m120488h(str2, "context.getString(R.stri…ing_sys_back_dialog_text)");
        }
        String str6 = str2;
        C10195g0 g3 = eVar.mo26716g();
        if (g3 == null || (str3 = g3.mo26763a("text.quit.process.popup.ok", new Object[0])) == null) {
            str3 = context.getString(C10220y.onboarding_sys_back_dialog_yes_button_text);
            C41536l.m120488h(str3, "context.getString(R.stri…k_dialog_yes_button_text)");
        }
        String str7 = str3;
        C10195g0 g4 = eVar.mo26716g();
        if (g4 == null || (str4 = g4.mo26763a("text.quit.process.popup.cancel", new Object[0])) == null) {
            str4 = context.getString(C10220y.onboarding_sys_back_dialog_no_button_text);
            C41536l.m120488h(str4, "context.getString(R.stri…ck_dialog_no_button_text)");
        }
        C13310d c = mo92742c(bVar, str5, str6, (Integer) null, (Integer) null, str7, str4);
        c.mo35641T1(new C39050a(c, context));
        c.mo35645Y1(new C39051b(c));
        return c;
    }
}

package nf0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import ie0.C25190j;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p017b.C2106d;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import q31.C38125h;
import ue0.C28721e;

/* renamed from: nf0.g */
public final class C26476g extends C26481j {

    /* renamed from: J */
    public static final C26477a f67056J = new C26477a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C28721e f67057G;

    /* renamed from: H */
    private C26478b f67058H;

    /* renamed from: I */
    private final C0173b f67059I;

    /* renamed from: nf0.g$a */
    public static final class C26477a {
        private C26477a() {
        }

        public /* synthetic */ C26477a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C26476g mo65767a() {
            return new C26476g();
        }
    }

    /* renamed from: nf0.g$b */
    public interface C26478b {
        /* renamed from: V */
        void mo60237V();
    }

    public C26476g() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C26475f(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…      dismiss()\n        }");
        this.f67059I = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m82779f2(C26476g gVar, ActivityResult activityResult) {
        C41536l.m120489i(gVar, "this$0");
        C26478b bVar = gVar.f67058H;
        if (bVar != null) {
            bVar.mo60237V();
        }
        gVar.mo4577k1();
    }

    /* renamed from: g2 */
    private final C28721e m82780g2() {
        C28721e eVar = this.f67057G;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* renamed from: h2 */
    private final void m82781h2() {
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C25190j.gt_account_selector_empty_header));
        m82780g2().f73178e.setOnClickListener(new C26474e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m82782i2(C26476g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        Context requireContext = gVar.requireContext();
        C41536l.m120488h(requireContext, "this.requireContext()");
        C38125h.m112238c(requireContext).mo91571Q0(requireContext, gVar.f67059I, (String) null, (List) null);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f67057G = C28721e.m88003d(layoutInflater, viewGroup, true);
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (context instanceof C26478b) {
            this.f67058H = (C26478b) context;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m82781h2();
    }
}

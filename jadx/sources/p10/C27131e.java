package p10;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p349ah.C9860d;
import p366bk.C10328q;
import p90.C27454w2;
import ue1.C43064a;

/* renamed from: p10.e */
public final class C27131e extends C9860d {

    /* renamed from: F */
    public static final C27133b f68116F = new C27133b((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C27454w2 f68117B;

    /* renamed from: C */
    private final C41217g f68118C = C41219i.m119470b(new C27136e(this));

    /* renamed from: D */
    private final C41217g f68119D = C41219i.m119470b(new C27135d(this));

    /* renamed from: E */
    private C27134c f68120E;

    /* renamed from: p10.e$a */
    public enum C27132a {
        ActionEdit,
        ActionDelete,
        ActionVerify,
        ActionRemoveVerification
    }

    /* renamed from: p10.e$b */
    public static final class C27133b {
        private C27133b() {
        }

        public /* synthetic */ C27133b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C27131e mo66432a(boolean z, boolean z2) {
            C27131e eVar = new C27131e();
            Bundle bundle = new Bundle();
            bundle.putBoolean("IS_TRUSTED", z);
            bundle.putBoolean("CAN_TRUST", z2);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    /* renamed from: p10.e$c */
    public interface C27134c {
        /* renamed from: J */
        void mo53863J(C27132a aVar);
    }

    /* renamed from: p10.e$d */
    static final class C27135d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27131e f68126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27135d(C27131e eVar) {
            super(0);
            this.f68126d = eVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f68126d.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("CAN_TRUST") : false);
        }
    }

    /* renamed from: p10.e$e */
    static final class C27136e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27131e f68127d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27136e(C27131e eVar) {
            super(0);
            this.f68127d = eVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f68127d.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("IS_TRUSTED") : false);
        }
    }

    /* renamed from: h2 */
    private final C27454w2 m84081h2() {
        C27454w2 w2Var = this.f68117B;
        C41536l.m120486f(w2Var);
        return w2Var;
    }

    /* renamed from: i2 */
    private final boolean m84082i2() {
        return ((Boolean) this.f68119D.getValue()).booleanValue();
    }

    /* renamed from: j2 */
    private final boolean m84083j2() {
        return ((Boolean) this.f68118C.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m84084k2(C27131e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C27134c cVar = eVar.f68120E;
        if (cVar != null) {
            cVar.mo53863J(C27132a.ActionDelete);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m84085l2(C27131e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C27134c cVar = eVar.f68120E;
        if (cVar != null) {
            cVar.mo53863J(C27132a.ActionEdit);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m84086m2(C27131e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C27134c cVar = eVar.f68120E;
        if (cVar != null) {
            cVar.mo53863J(C27132a.ActionVerify);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m84087n2(C27131e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C27134c cVar = eVar.f68120E;
        if (cVar != null) {
            cVar.mo53863J(C27132a.ActionRemoveVerification);
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f68117B = C27454w2.m85124d(layoutInflater, viewGroup, true);
    }

    public void onAttach(Context context) {
        C27134c cVar;
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (context instanceof C27134c) {
            this.f68120E = (C27134c) context;
        } else if (getParentFragment() instanceof C27134c) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof C27134c) {
                cVar = (C27134c) parentFragment;
            } else {
                cVar = null;
            }
            this.f68120E = cVar;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C10328q.trusted_contact));
        if (!m84082i2()) {
            LinearLayout linearLayout = m84081h2().f70160h;
            C41536l.m120488h(linearLayout, "binding.verifyBtn");
            C32343x.m95401L0(linearLayout);
            LinearLayout linearLayout2 = m84081h2().f70159g;
            C41536l.m120488h(linearLayout2, "binding.removeVerificationButton");
            C32343x.m95401L0(linearLayout2);
        } else if (m84083j2()) {
            LinearLayout linearLayout3 = m84081h2().f70160h;
            C41536l.m120488h(linearLayout3, "binding.verifyBtn");
            C32343x.m95401L0(linearLayout3);
            LinearLayout linearLayout4 = m84081h2().f70159g;
            C41536l.m120488h(linearLayout4, "binding.removeVerificationButton");
            C32343x.m95407O0(linearLayout4);
        } else {
            LinearLayout linearLayout5 = m84081h2().f70160h;
            C41536l.m120488h(linearLayout5, "binding.verifyBtn");
            C32343x.m95407O0(linearLayout5);
            LinearLayout linearLayout6 = m84081h2().f70159g;
            C41536l.m120488h(linearLayout6, "binding.removeVerificationButton");
            C32343x.m95401L0(linearLayout6);
        }
        m84081h2().f70157e.setOnClickListener(new C27127a(this));
        m84081h2().f70158f.setOnClickListener(new C27128b(this));
        m84081h2().f70160h.setOnClickListener(new C27129c(this));
        m84081h2().f70159g.setOnClickListener(new C27130d(this));
    }
}

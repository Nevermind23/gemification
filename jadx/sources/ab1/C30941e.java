package ab1;

import ah1.C40314b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10220y;
import cb1.C31359a;
import eb1.C31705i;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.sso_client.models.C35947l;
import p349ah.C9860d;
import ua1.C28666o;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: ab1.e */
public final class C30941e extends C9860d {

    /* renamed from: H */
    public static final C30942a f77070H = new C30942a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28666o f77071B;

    /* renamed from: C */
    private C30943b f77072C;

    /* renamed from: D */
    private final C41217g f77073D = C41219i.m119469a(C41222k.NONE, new C30948g(this, (C41806a) null, (C43064a) null, new C30947f(this), (C43064a) null));

    /* renamed from: E */
    private final C41217g f77074E = C41219i.m119470b(new C30944c(this));

    /* renamed from: F */
    private final C41217g f77075F = C41219i.m119470b(new C30949h(this));

    /* renamed from: G */
    private final C41217g f77076G = C41219i.m119470b(new C30945d(this));

    /* renamed from: ab1.e$a */
    public static final class C30942a {
        private C30942a() {
        }

        public /* synthetic */ C30942a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C30941e mo71159a(String str, String str2, String str3, C30943b bVar) {
            C41536l.m120489i(str, "contactId");
            C41536l.m120489i(str2, "tmxFlagKey");
            C41536l.m120489i(str3, "contactType");
            C41536l.m120489i(bVar, "callback");
            C30941e eVar = new C30941e();
            eVar.mo71158o2(bVar);
            Bundle bundle = new Bundle();
            bundle.putString("KEY_CONTACT", str);
            bundle.putString("TMX_FLAG_KEY", str2);
            bundle.putString("KEY_CONTACT_TYPE", str3);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    /* renamed from: ab1.e$b */
    public interface C30943b {
        /* renamed from: J0 */
        void mo71160J0();
    }

    /* renamed from: ab1.e$c */
    static final class C30944c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30941e f77077d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30944c(C30941e eVar) {
            super(0);
            this.f77077d = eVar;
        }

        public final String invoke() {
            return this.f77077d.requireArguments().getString("KEY_CONTACT", "");
        }
    }

    /* renamed from: ab1.e$d */
    static final class C30945d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30941e f77078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30945d(C30941e eVar) {
            super(0);
            this.f77078d = eVar;
        }

        public final String invoke() {
            return this.f77078d.requireArguments().getString("KEY_CONTACT_TYPE", "");
        }
    }

    /* renamed from: ab1.e$e */
    public static final class C30946e implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C28666o f77079d;

        public C30946e(C28666o oVar) {
            this.f77079d = oVar;
        }

        public void afterTextChanged(Editable editable) {
            Button button = this.f77079d.f72868e;
            boolean z = false;
            if ((editable != null ? editable.length() : 0) > 0) {
                z = true;
            }
            button.setEnabled(z);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ab1.e$f */
    public static final class C30947f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30947f(Fragment fragment) {
            super(0);
            this.f77080d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f77080d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f77080d.requireActivity());
        }
    }

    /* renamed from: ab1.e$g */
    public static final class C30948g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77081d;

        /* renamed from: e */
        final /* synthetic */ C41806a f77082e;

        /* renamed from: f */
        final /* synthetic */ C43064a f77083f;

        /* renamed from: g */
        final /* synthetic */ C43064a f77084g;

        /* renamed from: h */
        final /* synthetic */ C43064a f77085h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30948g(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f77081d = fragment;
            this.f77082e = aVar;
            this.f77083f = aVar2;
            this.f77084g = aVar3;
            this.f77085h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f77081d, this.f77082e, this.f77083f, this.f77084g, C41520a0.m120436b(C31705i.class), this.f77085h);
        }
    }

    /* renamed from: ab1.e$h */
    static final class C30949h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30941e f77086d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30949h(C30941e eVar) {
            super(0);
            this.f77086d = eVar;
        }

        public final String invoke() {
            return this.f77086d.requireArguments().getString("TMX_FLAG_KEY", "");
        }
    }

    /* renamed from: h2 */
    private final String m92189h2() {
        Object value = this.f77074E.getValue();
        C41536l.m120488h(value, "<get-contactID>(...)");
        return (String) value;
    }

    /* renamed from: i2 */
    private final String m92190i2() {
        Object value = this.f77076G.getValue();
        C41536l.m120488h(value, "<get-contactType>(...)");
        return (String) value;
    }

    /* renamed from: j2 */
    private final String m92191j2() {
        Object value = this.f77075F.getValue();
        C41536l.m120488h(value, "<get-tmxFlagKey>(...)");
        return (String) value;
    }

    /* renamed from: k2 */
    private final C31705i m92192k2() {
        return (C31705i) this.f77073D.getValue();
    }

    /* renamed from: l2 */
    private final void m92193l2() {
        C28666o oVar = this.f77071B;
        C41536l.m120486f(oVar);
        m92192k2().mo72122Ew().mo4819k(getViewLifecycleOwner(), new C30937a(oVar, this));
        m92192k2().mo72137ww().mo4819k(getViewLifecycleOwner(), new C30938b(this, oVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m92194m2(C28666o oVar, C30941e eVar, C35947l lVar) {
        C41536l.m120489i(oVar, "$binding");
        C41536l.m120489i(eVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            oVar.f72869f.mo36273o();
            oVar.f72868e.setLoading(false);
        } else if (lVar instanceof C35947l.C35950c) {
            oVar.f72869f.mo36276r();
            oVar.f72868e.setLoading(true);
        } else if (lVar instanceof C35947l.C35949b) {
            C31359a aVar = (C31359a) eVar.getActivity();
            if (aVar != null) {
                C41536l.m120488h(lVar, "result");
                aVar.mo55692F((C35947l.C35949b) lVar);
            }
            oVar.f72869f.mo36275p();
            oVar.f72868e.setLoading(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m92195n2(C30941e eVar, C28666o oVar, C35947l lVar) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(oVar, "$binding");
        if (lVar instanceof C35947l.C35951d) {
            C30943b bVar = eVar.f77072C;
            if (bVar != null) {
                bVar.mo71160J0();
            }
            eVar.mo4577k1();
        } else if (lVar instanceof C35947l.C35950c) {
            oVar.f72869f.mo36276r();
            oVar.f72868e.setLoading(true);
        } else if (lVar instanceof C35947l.C35949b) {
            oVar.f72869f.mo36272n();
            oVar.f72868e.setLoading(false);
        }
    }

    /* renamed from: p2 */
    private final void m92196p2() {
        C28666o oVar = this.f77071B;
        C41536l.m120486f(oVar);
        oVar.f72869f.setResendButtonClickListener(new C30939c(this));
        oVar.f72868e.setOnClickListener(new C30940d(oVar, this));
        oVar.f72868e.setEnabled(false);
        oVar.f72869f.getBinding().f27107e.getTextInput().addTextChangedListener(new C30946e(oVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m92197q2(C30941e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m92192k2().mo72125Hw(eVar.m92189h2(), true, eVar.m92191j2(), eVar.m92190i2());
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m92198r2(C28666o oVar, C30941e eVar, View view) {
        boolean z;
        C41536l.m120489i(oVar, "$binding");
        C41536l.m120489i(eVar, "this$0");
        if (oVar.f72869f.getBinding().f27107e.getInputText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            oVar.f72868e.setLoading(true);
            eVar.m92192k2().mo72136tw(eVar.m92189h2(), oVar.f72869f.getBinding().f27107e.getInputText());
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f77071B = C28666o.m87777d(layoutInflater, viewGroup, true);
        mo26370a2(getString(C10220y.sca_verification_confirm));
        m92196p2();
        m92193l2();
    }

    /* renamed from: o2 */
    public final void mo71158o2(C30943b bVar) {
        this.f77072C = bVar;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77071B = null;
    }
}

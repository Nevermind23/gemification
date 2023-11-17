package hz0;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g91.C32286a1;
import g91.C32290b1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import hz0.C36301i;
import hz0.C36313r;
import iy0.C36581b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.products.domain.model.CheckChildMBankActiveModel;
import p670xi.C18766c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: hz0.f */
public final class C36282f extends C36332w {

    /* renamed from: P */
    public static final C36283a f87596P = new C36283a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C36581b f87597K;

    /* renamed from: L */
    public C36313r.C36314a f87598L;

    /* renamed from: M */
    private final C41217g f87599M;

    /* renamed from: N */
    private final C41217g f87600N = C41219i.m119470b(new C36289g(this));

    /* renamed from: O */
    private final C41217g f87601O = C41219i.m119470b(new C36290h(this));

    /* renamed from: hz0.f$a */
    public static final class C36283a {
        private C36283a() {
        }

        public /* synthetic */ C36283a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36282f mo89004a(String str, String str2, CheckChildMBankActiveModel checkChildMBankActiveModel) {
            C41536l.m120489i(str, "requestCode");
            C41536l.m120489i(str2, "resultCode");
            C41536l.m120489i(checkChildMBankActiveModel, "childClientInfo");
            C36282f fVar = new C36282f();
            Bundle bundle = new Bundle();
            bundle.putString("REQUEST_KEY", str);
            bundle.putString("RESULT_KEY", str2);
            bundle.putParcelable("CHILD_CLIENT_INFO_KEY", checkChildMBankActiveModel);
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    /* renamed from: hz0.f$b */
    static final class C36284b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36282f f87602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36284b(C36282f fVar) {
            super(1);
            this.f87602d = fVar;
        }

        /* renamed from: a */
        public final void mo89005a(C36301i iVar) {
            if (C41536l.m120484d(iVar, C36301i.C36302a.f87618a)) {
                this.f87602d.m107711H2();
            } else if (iVar instanceof C36301i.C36303b) {
                this.f87602d.m107712I2(((C36301i.C36303b) iVar).mo89016a());
            } else if (C41536l.m120484d(iVar, C36301i.C36304c.f87620a)) {
                this.f87602d.m107713J2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89005a((C36301i) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hz0.f$c */
    static final class C36285c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36282f f87603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36285c(C36282f fVar) {
            super(1);
            this.f87603d = fVar;
        }

        /* renamed from: a */
        public final void mo89006a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f87603d.m107728s2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89006a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hz0.f$d */
    static final class C36286d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36282f f87604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36286d(C36282f fVar) {
            super(1);
            this.f87604d = fVar;
        }

        /* renamed from: a */
        public final void mo89007a(C31128a aVar) {
            if (aVar instanceof C31128a.C31129a) {
                this.f87604d.m107733y2(false);
                this.f87604d.m107729t2().f88150l.mo36272n();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f87604d.m107733y2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f87604d.m107733y2(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89007a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hz0.f$e */
    static final class C36287e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36282f f87605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36287e(C36282f fVar) {
            super(1);
            this.f87605d = fVar;
        }

        /* renamed from: a */
        public final void mo89008a(C31128a aVar) {
            if (aVar instanceof C31128a.C31129a) {
                this.f87605d.m107733y2(false);
                this.f87605d.m107729t2().f88150l.mo36272n();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f87605d.m107733y2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f87605d.m107733y2(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89008a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hz0.f$f */
    static final class C36288f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36282f f87606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36288f(C36282f fVar) {
            super(1);
            this.f87606d = fVar;
        }

        /* renamed from: a */
        public final void mo89009a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f87606d.m107734z2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89009a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hz0.f$g */
    static final class C36289g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36282f f87607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36289g(C36282f fVar) {
            super(0);
            this.f87607d = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getString("REQUEST_KEY");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                hz0.f r0 = r2.f87607d
                android.os.Bundle r0 = r0.getArguments()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "REQUEST_KEY"
                java.lang.String r0 = r0.getString(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hz0.C36282f.C36289g.invoke():java.lang.String");
        }
    }

    /* renamed from: hz0.f$h */
    static final class C36290h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36282f f87608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36290h(C36282f fVar) {
            super(0);
            this.f87608d = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getString("RESULT_KEY");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                hz0.f r0 = r2.f87608d
                android.os.Bundle r0 = r0.getArguments()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "RESULT_KEY"
                java.lang.String r0 = r0.getString(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hz0.C36282f.C36290h.invoke():java.lang.String");
        }
    }

    /* renamed from: hz0.f$i */
    static final class C36291i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f87609a;

        C36291i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f87609a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f87609a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f87609a.invoke(obj);
        }
    }

    /* renamed from: hz0.f$j */
    public static final class C36292j implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C36581b f87610d;

        public C36292j(C36581b bVar) {
            this.f87610d = bVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f87610d.f88149k.setInfoText((CharSequence) null);
            this.f87610d.f88149k.mo35919b();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: hz0.f$k */
    public static final class C36293k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f87611d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36293k(Fragment fragment) {
            super(0);
            this.f87611d = fragment;
        }

        public final Fragment invoke() {
            return this.f87611d;
        }
    }

    /* renamed from: hz0.f$l */
    public static final class C36294l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f87612d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36294l(C43064a aVar) {
            super(0);
            this.f87612d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f87612d.invoke();
        }
    }

    /* renamed from: hz0.f$m */
    public static final class C36295m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f87613d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36295m(C41217g gVar) {
            super(0);
            this.f87613d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f87613d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: hz0.f$n */
    public static final class C36296n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f87614d;

        /* renamed from: e */
        final /* synthetic */ C41217g f87615e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36296n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f87614d = aVar;
            this.f87615e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f87614d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f87615e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: hz0.f$o */
    static final class C36297o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36282f f87616d;

        /* renamed from: hz0.f$o$a */
        static final class C36298a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C36282f f87617d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36298a(C36282f fVar) {
                super(0);
                this.f87617d = fVar;
            }

            /* renamed from: b */
            public final C36313r invoke() {
                C36313r.C36314a u2 = this.f87617d.mo89003u2();
                Bundle arguments = this.f87617d.getArguments();
                CheckChildMBankActiveModel checkChildMBankActiveModel = arguments != null ? (CheckChildMBankActiveModel) arguments.getParcelable("CHILD_CLIENT_INFO_KEY") : null;
                C41536l.m120486f(checkChildMBankActiveModel);
                return u2.mo32780a(checkChildMBankActiveModel);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36297o(C36282f fVar) {
            super(0);
            this.f87616d = fVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C36298a(this.f87616d));
        }
    }

    public C36282f() {
        C36297o oVar = new C36297o(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C36294l(new C36293k(this)));
        this.f87599M = C1514j0.m5374c(this, C41520a0.m120436b(C36313r.class), new C36295m(a), new C36296n((C43064a) null, a), oVar);
    }

    /* renamed from: A2 */
    private final void m107705A2() {
        C36581b t2 = m107729t2();
        t2.f88151m.setText(C32343x.m95388F("texts.child.mbank.add.phone.main.text", new Object[0]));
        t2.f88149k.setHintText((CharSequence) C32343x.m95388F("texts.child.mbank.add.phone.field.header", new Object[0]));
        t2.f88143e.setButtonText(C32343x.m95388F("texts.child.mbank.add.phone.button.label", new Object[0]));
        t2.f88146h.setButtonText(C32343x.m95388F("text.child.mbank.child.confirmation.next.button", new Object[0]));
        t2.f88145g.setButtonText(C32343x.m95388F("text.child.mbank.child.confirmation.other.number", new Object[0]));
        t2.f88148j.setButtonText(C32343x.m95388F("text.child.mbank.child.success.button.label", new Object[0]));
        t2.f88154p.setTitleText(C32343x.m95388F("text.child.mbank.child.success.main.text", new Object[0]));
        t2.f88149k.setPhonePrefixText("+995");
        t2.f88143e.setOnClickListener(new C36277a(this, t2));
        t2.f88146h.setOnClickListener(new C36278b(this, t2));
        t2.f88145g.setOnClickListener(new C36279c(this));
        t2.f88149k.getTextInput().addTextChangedListener(new C36292j(t2));
        t2.f88150l.setResendButtonClickListener(new C36280d(this, t2));
        t2.f88148j.setOnClickListener(new C36281e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static final void m107706B2(C36282f fVar, C36581b bVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(bVar, "$this_with");
        fVar.m107732x2().mo89030ww().mo89021dq(bVar.f88149k.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public static final void m107707C2(C36282f fVar, C36581b bVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(bVar, "$this_with");
        if (fVar.m107729t2().f88150l.getOtpState() != C18766c.WAITING) {
            fVar.m107732x2().mo89030ww().mo89020au(bVar.f88150l.getCodeText());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m107708D2(C36282f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m107732x2().mo89030ww().mo89017Jo();
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m107709E2(C36282f fVar, C36581b bVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(bVar, "$this_with");
        fVar.m107732x2().mo89030ww().mo89018Qi();
        bVar.f88150l.mo36276r();
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m107710F2(C36282f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m107732x2().mo89030ww().mo89019am();
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public final void m107711H2() {
        mo26370a2(C32343x.m95388F("texts.child.mbank.add.phone.header", new Object[0]));
        LinearLayout linearLayout = m107729t2().f88147i;
        C41536l.m120488h(linearLayout, "binding.confirmNumberLayout");
        C32343x.m95455i0(linearLayout);
        LinearLayout linearLayout2 = m107729t2().f88153o;
        C41536l.m120488h(linearLayout2, "binding.successLayout");
        C32343x.m95455i0(linearLayout2);
        LinearLayout linearLayout3 = m107729t2().f88144f;
        C41536l.m120488h(linearLayout3, "binding.addNumberLayout");
        C32343x.m95447f1(linearLayout3);
        m107727r2();
        m107729t2().f88149k.requestFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final void m107712I2(String str) {
        mo26370a2(C32343x.m95388F("text.child.mbank.child.confirmation.header", new Object[0]));
        C36581b t2 = m107729t2();
        LinearLayout linearLayout = t2.f88144f;
        C41536l.m120488h(linearLayout, "addNumberLayout");
        C32343x.m95455i0(linearLayout);
        LinearLayout linearLayout2 = t2.f88153o;
        C41536l.m120488h(linearLayout2, "successLayout");
        C32343x.m95455i0(linearLayout2);
        LinearLayout linearLayout3 = t2.f88147i;
        C41536l.m120488h(linearLayout3, "confirmNumberLayout");
        C32343x.m95447f1(linearLayout3);
        t2.f88150l.setPhoneNumber(str);
        t2.f88150l.mo36291v();
        t2.f88150l.mo36271m();
        t2.f88150l.requestFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final void m107713J2() {
        mo26370a2(C32343x.m95388F("text.child.mbank.child.confirmation.header", new Object[0]));
        m107726q2();
        C36581b t2 = m107729t2();
        LinearLayout linearLayout = t2.f88144f;
        C41536l.m120488h(linearLayout, "addNumberLayout");
        C32343x.m95455i0(linearLayout);
        LinearLayout linearLayout2 = t2.f88147i;
        C41536l.m120488h(linearLayout2, "confirmNumberLayout");
        C32343x.m95455i0(linearLayout2);
        LinearLayout linearLayout3 = t2.f88153o;
        C41536l.m120488h(linearLayout3, "successLayout");
        C32343x.m95447f1(linearLayout3);
    }

    private final void observeData() {
        m107732x2().mo89031xw().mo89026ia().mo4819k(getViewLifecycleOwner(), new C36291i(new C36284b(this)));
        m107732x2().mo89031xw().mo89024fl().mo4819k(getViewLifecycleOwner(), new C36291i(new C36285c(this)));
        m107732x2().mo89031xw().mo89023Sv().mo4819k(getViewLifecycleOwner(), new C36291i(new C36286d(this)));
        m107732x2().mo89031xw().mo89025gn().mo4819k(getViewLifecycleOwner(), new C36291i(new C36287e(this)));
        m107732x2().mo89031xw().mo89022Me().mo4819k(getViewLifecycleOwner(), new C36291i(new C36288f(this)));
    }

    /* renamed from: q2 */
    private final void m107726q2() {
        m107729t2().f88149k.clearFocus();
        m107729t2().f88150l.clearFocus();
        C32290b1.m95128r(requireContext());
    }

    /* renamed from: r2 */
    private final void m107727r2() {
        m107729t2().f88149k.setInputText("");
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m107728s2() {
        C1533o.m5445b(this, m107730v2(), C0908e.m3336b(C41233s.m119492a(m107731w2(), Boolean.TRUE)));
        mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final C36581b m107729t2() {
        C36581b bVar = this.f87597K;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: v2 */
    private final String m107730v2() {
        return (String) this.f87600N.getValue();
    }

    /* renamed from: w2 */
    private final String m107731w2() {
        return (String) this.f87601O.getValue();
    }

    /* renamed from: x2 */
    private final C36313r m107732x2() {
        return (C36313r) this.f87599M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public final void m107733y2(boolean z) {
        m107729t2().f88152n.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public final void m107734z2() {
        m107729t2().f88149k.mo35920c();
        m107729t2().f88149k.setInfoText(C32343x.m95388F("text.child.mbank.child.phone.is.same.as.parents", new Object[0]));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f87597K = C36581b.m108450d(layoutInflater, viewGroup, true);
        m107705A2();
        observeData();
    }

    public void onDestroy() {
        m107726q2();
        super.onDestroy();
        this.f87597K = null;
    }

    /* renamed from: u2 */
    public final C36313r.C36314a mo89003u2() {
        C36313r.C36314a aVar = this.f87598L;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}

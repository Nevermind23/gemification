package r50;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import g91.C32303f;
import g91.C32343x;
import he1.C41217g;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p366bk.C10324m;
import p366bk.C10328q;
import p366bk.C10329r;
import p420fh.C12902d;
import p420fh.C12910e;
import p893sw.C28279b;
import p90.C27318h4;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: r50.g */
public final class C27931g extends C35651n1 {

    /* renamed from: g */
    public static final C27932a f71130g = new C27932a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C27318h4 f71131d;

    /* renamed from: e */
    private final C41217g f71132e = C1514j0.m5374c(this, C41520a0.m120436b(ReferalsViewModel.class), new C27937f(this), new C27938g((C43064a) null, this), new C27939h(this));

    /* renamed from: f */
    private boolean f71133f = true;

    /* renamed from: r50.g$a */
    public static final class C27932a {
        private C27932a() {
        }

        public /* synthetic */ C27932a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C27931g mo67503a() {
            return new C27931g();
        }
    }

    /* renamed from: r50.g$b */
    static final class C27933b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27931g f71134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27933b(C27931g gVar) {
            super(1);
            this.f71134d = gVar;
        }

        /* renamed from: a */
        public final void mo67504a(C28279b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f71134d.m86250z1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67504a((C28279b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: r50.g$c */
    static final class C27934c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27931g f71135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27934c(C27931g gVar) {
            super(1);
            this.f71135d = gVar;
        }

        /* renamed from: a */
        public final void mo67505a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f71135d.handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67505a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: r50.g$d */
    static final class C27935d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27931g f71136d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27935d(C27931g gVar) {
            super(1);
            this.f71136d = gVar;
        }

        /* renamed from: a */
        public final void mo67506a(C28279b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f71136d.m86250z1(bVar);
            this.f71136d.m86233D1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67506a((C28279b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: r50.g$e */
    static final class C27936e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27931g f71137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27936e(C27931g gVar) {
            super(1);
            this.f71137d = gVar;
        }

        /* renamed from: a */
        public final void mo67507a(boolean z) {
            this.f71137d.m86231B1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67507a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: r50.g$f */
    public static final class C27937f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f71138d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27937f(Fragment fragment) {
            super(0);
            this.f71138d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f71138d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: r50.g$g */
    public static final class C27938g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f71139d;

        /* renamed from: e */
        final /* synthetic */ Fragment f71140e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27938g(C43064a aVar, Fragment fragment) {
            super(0);
            this.f71139d = aVar;
            this.f71140e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f71139d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f71140e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: r50.g$h */
    public static final class C27939h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f71141d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27939h(Fragment fragment) {
            super(0);
            this.f71141d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f71141d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: A1 */
    private final void m86230A1(boolean z) {
        if (this.f71133f) {
            m86245t1().f68880g.setEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m86231B1(boolean z) {
        if (this.f71133f) {
            m86245t1().f68880g.setLoading(z);
        }
    }

    /* renamed from: C1 */
    private final void m86232C1() {
        C27318h4 t1 = m86245t1();
        t1.f68878e.setFormatText(false);
        BigInputView bigInputView = t1.f68878e;
        String string = getString(C10328q.referrals_promo_code);
        C41536l.m120488h(string, "getString(R.string.referrals_promo_code)");
        bigInputView.setInfoText(string);
        BigInputView bigInputView2 = t1.f68878e;
        String string2 = getString(C10328q.referrals_enter_promo_code);
        C41536l.m120488h(string2, "getString(R.string.referrals_enter_promo_code)");
        bigInputView2.setHint(string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final void m86233D1() {
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        String string = getString(C10328q.promo_code_activation_success);
        C41536l.m120488h(string, "getString(R.string.promo_code_activation_success)");
        C12910e.m48797o(requireActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: o1 */
    private final void m86240o1() {
        m86245t1().f68878e.setTextChangeListener(new C27928d(this));
        m86245t1().f68880g.setOnClickListener(new C27929e(this));
        m86245t1().f68878e.setDoneButtonListener(new C27930f(this));
    }

    private final void observeData() {
        C21484c.m69412d(m86248x1().mo55293pw(), this, new C27933b(this), (C43075l) null, new C27934c(this), 4, (Object) null);
        C21484c.m69412d(m86248x1().mo55294qw(), this, new C27935d(this), new C27936e(this), (C43075l) null, 8, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m86241p1(C27931g gVar, String str) {
        boolean z;
        C41536l.m120489i(gVar, "this$0");
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        gVar.m86230A1(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m86242q1(C27931g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m86248x1().mo55292lw(gVar.m86245t1().f68878e.getText());
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m86243r1(C27931g gVar) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m86248x1().mo55292lw(gVar.m86245t1().f68878e.getText());
    }

    /* renamed from: s1 */
    private final String m86244s1(C28279b bVar) {
        BigDecimal c = bVar.mo67902c();
        if (c == null) {
            c = BigDecimal.ZERO;
        }
        String bigInteger = c.toBigInteger().toString();
        String e = bVar.mo67904e();
        if (e == null) {
            e = "GEL";
        }
        String h = C32303f.m95197h(e);
        return bigInteger + " " + h;
    }

    /* renamed from: t1 */
    private final C27318h4 m86245t1() {
        C27318h4 h4Var = this.f71131d;
        C41536l.m120486f(h4Var);
        return h4Var;
    }

    /* renamed from: u1 */
    private final SpannableStringBuilder m86246u1(String str, String str2, String str3) {
        String str4 = str + str2 + str3;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str4);
        Context requireContext = requireContext();
        int i = C10329r.f28975s;
        valueOf.setSpan(new TextAppearanceSpan(requireContext, i), 0, str.length(), 33);
        String str5 = str4;
        String str6 = str2;
        valueOf.setSpan(new TextAppearanceSpan(requireContext(), C10329r.f28974r), C40440x.m117156X(str5, str6, 0, false, 6, (Object) null), C40440x.m117156X(str5, str6, 0, false, 6, (Object) null) + str2.length(), 33);
        valueOf.setSpan(new TextAppearanceSpan(requireContext(), i), C40440x.m117156X(str4, str3, 0, false, 6, (Object) null), str4.length(), 33);
        C41536l.m120488h(valueOf, "valueOf(combinedText).ap…E\n            )\n        }");
        return valueOf;
    }

    /* renamed from: v1 */
    private final String m86247v1(C28279b bVar) {
        BigDecimal c = bVar.mo67902c();
        if (c == null) {
            c = BigDecimal.ZERO;
        }
        String bigInteger = c.toBigInteger().toString();
        String e = bVar.mo67904e();
        if (e == null) {
            e = "GEL";
        }
        String str = bigInteger + " " + C32303f.m95197h(e);
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format(C32343x.m95388F(bVar.mo67914m(), new Object[0]), Arrays.copyOf(new Object[]{str}, 1));
        C41536l.m120488h(format, "format(format, *args)");
        return format;
    }

    /* renamed from: x1 */
    private final ReferalsViewModel m86248x1() {
        return (ReferalsViewModel) this.f71132e.getValue();
    }

    /* renamed from: y1 */
    private final void m86249y1(C28279b bVar) {
        C27318h4 t1 = m86245t1();
        PageState pageState = t1.f68883j;
        C41536l.m120488h(pageState, "successState");
        C32343x.m95483r1(pageState, true, false, 2, (Object) null);
        LinearLayout linearLayout = t1.f68884k;
        C41536l.m120488h(linearLayout, "textsLayout");
        C32343x.m95483r1(linearLayout, false, false, 2, (Object) null);
        t1.f68883j.setTitleText(m86247v1(bVar));
        t1.f68878e.mo34891i(false);
        BigInputView bigInputView = t1.f68878e;
        String i = bVar.mo67910i();
        if (i == null) {
            i = "";
        }
        bigInputView.setText(i);
        this.f71133f = false;
        t1.f68880g.setLoading(false);
        t1.f68880g.setEnabled(false);
        t1.f68880g.setButtonText(getString(C10328q.referrals_promo_code_active));
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public final void m86250z1(C28279b bVar) {
        if (bVar.mo67910i() != null) {
            m86249y1(bVar);
        }
        List x0 = C40440x.m117182x0(C32343x.m95388F(bVar.mo67913l(), new Object[0]), new String[]{"%s"}, false, 0, 6, (Object) null);
        if (x0.size() == 2) {
            m86245t1().f68881h.setText(m86246u1((String) x0.get(0), m86244s1(bVar), (String) x0.get(1)));
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_referals_passive;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f71131d = C27318h4.m84581d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m86245t1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f71131d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m86232C1();
        observeData();
        m86240o1();
    }
}

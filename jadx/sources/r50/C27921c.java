package r50;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import g91.C32297d;
import g91.C32303f;
import g91.C32343x;
import g91.C32359z0;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
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
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p366bk.C10324m;
import p366bk.C10328q;
import p366bk.C10329r;
import p380ck.C10464h;
import p893sw.C28279b;
import p90.C27308g4;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: r50.c */
public final class C27921c extends C35651n1 {

    /* renamed from: f */
    public static final C27922a f71118f = new C27922a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C27308g4 f71119d;

    /* renamed from: e */
    private final C41217g f71120e = C1514j0.m5374c(this, C41520a0.m120436b(ReferalsViewModel.class), new C27925d(this), new C27926e((C43064a) null, this), new C27927f(this));

    /* renamed from: r50.c$a */
    public static final class C27922a {
        private C27922a() {
        }

        public /* synthetic */ C27922a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C27921c mo67499a() {
            return new C27921c();
        }
    }

    /* renamed from: r50.c$b */
    static final class C27923b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27921c f71121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27923b(C27921c cVar) {
            super(1);
            this.f71121d = cVar;
        }

        /* renamed from: a */
        public final void mo67500a(C28279b bVar) {
            C41536l.m120489i(bVar, "userInfo");
            this.f71121d.m86222s1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67500a((C28279b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: r50.c$c */
    static final class C27924c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27921c f71122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27924c(C27921c cVar) {
            super(1);
            this.f71122d = cVar;
        }

        /* renamed from: a */
        public final void mo67501a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "error");
            this.f71122d.handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67501a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: r50.c$d */
    public static final class C27925d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f71123d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27925d(Fragment fragment) {
            super(0);
            this.f71123d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f71123d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: r50.c$e */
    public static final class C27926e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f71124d;

        /* renamed from: e */
        final /* synthetic */ Fragment f71125e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27926e(C43064a aVar, Fragment fragment) {
            super(0);
            this.f71124d = aVar;
            this.f71125e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f71124d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f71125e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: r50.c$f */
    public static final class C27927f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f71126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27927f(Fragment fragment) {
            super(0);
            this.f71126d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f71126d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: l1 */
    private final void m86215l1() {
        m86218o1().f68816f.setTextClickListener(new C27919a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m86216m1(C27921c cVar, String str) {
        C41536l.m120489i(cVar, "this$0");
        C32359z0.m95596x(cVar.m86218o1().f68816f.getText());
        C32297d.m95157e(cVar.getActivity(), cVar.getString(C10328q.common_text_promo_code_copied));
        C36546y.m108282F().mo27137H("promo_code", "copy_own_promo_code", "", (Bundle) null, C10464h.C10465a.FIREBASE);
    }

    /* renamed from: n1 */
    private final String m86217n1(C28279b bVar) {
        BigDecimal d = bVar.mo67903d();
        if (d == null) {
            d = BigDecimal.ZERO;
        }
        String bigInteger = d.toBigInteger().toString();
        String f = bVar.mo67906f();
        if (f == null) {
            f = "GEL";
        }
        String h = C32303f.m95197h(f);
        return bigInteger + " " + h;
    }

    /* renamed from: o1 */
    private final C27308g4 m86218o1() {
        C27308g4 g4Var = this.f71119d;
        C41536l.m120486f(g4Var);
        return g4Var;
    }

    private final void observeData() {
        C21484c.m69412d(m86221r1().mo55293pw(), this, new C27923b(this), (C43075l) null, new C27924c(this), 4, (Object) null);
    }

    /* renamed from: p1 */
    private final String m86219p1(C28279b bVar) {
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format(C32343x.m95388F("text.referral.promo.code.share.description", new Object[0]), Arrays.copyOf(new Object[]{bVar.mo67911j()}, 1));
        C41536l.m120488h(format, "format(format, *args)");
        return format;
    }

    /* renamed from: q1 */
    private final SpannableStringBuilder m86220q1(String str, String str2, String str3) {
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

    /* renamed from: r1 */
    private final ReferalsViewModel m86221r1() {
        return (ReferalsViewModel) this.f71120e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m86222s1(C28279b bVar) {
        C27308g4 o1 = m86218o1();
        BigInputView bigInputView = o1.f68816f;
        String j = bVar.mo67911j();
        if (j == null) {
            j = "";
        }
        bigInputView.setText(j);
        o1.f68817g.setOnClickListener(new C27920b(this, bVar));
        List x0 = C40440x.m117182x0(C32343x.m95388F(bVar.mo67915n(), new Object[0]), new String[]{"%s"}, false, 0, 6, (Object) null);
        if (x0.size() == 2) {
            m86218o1().f68815e.setText(m86220q1((String) x0.get(0), m86217n1(bVar), (String) x0.get(1)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m86223t1(C27921c cVar, C28279b bVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(bVar, "$userInfo");
        C32359z0.m95583n0(cVar.getActivity(), cVar.m86219p1(bVar), cVar.getString(C10328q.promo_code_share_text));
        C36546y.m108282F().mo27137H("promo_code", "share_own_promo_code", "", (Bundle) null, C10464h.C10465a.FIREBASE);
    }

    /* renamed from: u1 */
    private final void m86224u1() {
        C27308g4 o1 = m86218o1();
        o1.f68816f.mo34891i(false);
        o1.f68816f.setFormatText(false);
        BigInputView bigInputView = o1.f68816f;
        String string = getString(C10328q.referrals_promo_code);
        C41536l.m120488h(string, "getString(R.string.referrals_promo_code)");
        bigInputView.setInfoText(string);
        BigInputView bigInputView2 = o1.f68816f;
        String string2 = getString(C10328q.referrals_enter_promo_code);
        C41536l.m120488h(string2, "getString(R.string.referrals_enter_promo_code)");
        bigInputView2.setHint(string2);
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_referals_active;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f71119d = C27308g4.m84542d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m86218o1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f71119d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m86224u1();
        observeData();
        m86215l1();
    }
}

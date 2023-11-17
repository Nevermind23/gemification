package p341ge.bog.mobilebank.cleanarch.installment.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import g91.C32297d;
import g91.C32343x;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p341ge.bog.mobilebank.cleanarch.installment.presentation.InstallmentReversalResultActivity;
import p341ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel.InstallmentReversalViewModel;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p90.C27253b;
import p938wx.C29584a;
import p938wx.C29585b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b */
public final class C21092b extends C21091a {

    /* renamed from: N */
    public static final C21093a f56630N = new C21093a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private final C41217g f56631K;

    /* renamed from: L */
    private C27253b f56632L;

    /* renamed from: M */
    private String f56633M = C32343x.m95388F("online.inst.reversal.application.dialog.text", new Object[0]);

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$a */
    public static final class C21093a {
        private C21093a() {
        }

        public /* synthetic */ C21093a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C21092b mo52321a(String str, long j) {
            C41536l.m120489i(str, "productType");
            C21092b bVar = new C21092b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_PRODUCT_TYPE", str), C41233s.m119492a("EXTRA_LOAN_KEY", Long.valueOf(j))));
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$b */
    /* synthetic */ class C21094b extends C41535k implements C43075l {
        C21094b(Object obj) {
            super(1, obj, C21092b.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo52322b(boolean z) {
            ((C21092b) this.receiver).m68263o2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52322b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$c */
    /* synthetic */ class C21095c extends C41535k implements C43075l {
        C21095c(Object obj) {
            super(1, obj, C21092b.class, "drawReasons", "drawReasons(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo52323b(List list) {
            C41536l.m120489i(list, "p0");
            ((C21092b) this.receiver).m68258j2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52323b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$d */
    static final class C21096d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C21092b f56634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21096d(C21092b bVar) {
            super(1);
            this.f56634d = bVar;
        }

        /* renamed from: a */
        public final void mo52324a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "error");
            this.f56634d.m68259k2().f68341k.setVisibility(0);
            this.f56634d.handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52324a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$e */
    /* synthetic */ class C21097e extends C41535k implements C43075l {
        C21097e(Object obj) {
            super(1, obj, C21092b.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo52325b(boolean z) {
            ((C21092b) this.receiver).m68263o2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52325b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$f */
    /* synthetic */ class C21098f extends C41535k implements C43075l {
        C21098f(Object obj) {
            super(1, obj, C21092b.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo52326b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C21092b) this.receiver).handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52326b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$g */
    static final class C21099g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C21092b f56635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21099g(C21092b bVar) {
            super(1);
            this.f56635d = bVar;
        }

        /* renamed from: a */
        public final void mo52327a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f56635d.mo4577k1();
            InstallmentReversalResultActivity.C21090a aVar = InstallmentReversalResultActivity.f56625G;
            Context requireContext = this.f56635d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            aVar.mo52320a(requireContext);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52327a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$h */
    public static final class C21100h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f56636d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21100h(Fragment fragment) {
            super(0);
            this.f56636d = fragment;
        }

        public final Fragment invoke() {
            return this.f56636d;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$i */
    public static final class C21101i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f56637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21101i(C43064a aVar) {
            super(0);
            this.f56637d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f56637d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$j */
    public static final class C21102j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f56638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21102j(C41217g gVar) {
            super(0);
            this.f56638d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f56638d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$k */
    public static final class C21103k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f56639d;

        /* renamed from: e */
        final /* synthetic */ C41217g f56640e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21103k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f56639d = aVar;
            this.f56640e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f56639d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f56640e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.installment.presentation.b$l */
    public static final class C21104l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f56641d;

        /* renamed from: e */
        final /* synthetic */ C41217g f56642e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21104l(Fragment fragment, C41217g gVar) {
            super(0);
            this.f56641d = fragment;
            this.f56642e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f56642e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f56641d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C21092b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C21101i(new C21100h(this)));
        this.f56631K = C1514j0.m5374c(this, C41520a0.m120436b(InstallmentReversalViewModel.class), new C21102j(a), new C21103k((C43064a) null, a), new C21104l(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m68258j2(List list) {
        m68259k2().f68339i.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LookupUiModel lookupUiModel = (LookupUiModel) it.next();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            RadioButtonView radioButtonView = new RadioButtonView(requireContext, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            radioButtonView.setId(View.generateViewId());
            radioButtonView.setTag(lookupUiModel.mo52393d());
            radioButtonView.setText(C32343x.m95388F(lookupUiModel.mo52391a(), new Object[0]));
            radioButtonView.setMinHeight(C32343x.m95394I(51));
            radioButtonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            m68259k2().f68339i.addView(radioButtonView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C27253b m68259k2() {
        C27253b bVar = this.f56632L;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: l2 */
    private final String m68260l2() {
        Object tag;
        RadioGroup radioGroup = m68259k2().f68339i;
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        if (radioButton == null || (tag = radioButton.getTag()) == null) {
            return null;
        }
        return tag.toString();
    }

    /* renamed from: m2 */
    private final InstallmentReversalViewModel m68261m2() {
        return (InstallmentReversalViewModel) this.f56631K.getValue();
    }

    /* renamed from: n2 */
    public static final C21092b m68262n2(String str, long j) {
        return f56630N.mo52321a(str, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m68263o2(boolean z) {
        m68259k2().f68338h.setVisibility(z ? 0 : 8);
    }

    private final void observeData() {
        C21484c.m69411c(m68261m2().mo52329qw(), this, new C21095c(this), new C21094b(this), new C21096d(this));
        C21484c.m69411c(m68261m2().mo52330rw(), this, new C21099g(this), new C21097e(this), new C21098f(this));
    }

    /* renamed from: p2 */
    private final void m68264p2() {
        C41238w wVar;
        String l2 = m68260l2();
        if (l2 != null) {
            m68261m2().mo52333uw(l2);
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            C32297d.m95156d(this, C32343x.m95388F("online.inst.reversal.application.reason.not.selected", new Object[0]));
        }
    }

    /* renamed from: q2 */
    private final void m68265q2() {
        C27253b k2 = m68259k2();
        k2.f68335e.setText(C32343x.m95388F("online.inst.reversal.application.dialog.primary.button", new Object[0]));
        k2.f68337g.setTitleText(C32343x.m95388F("online.inst.reversal.application.dialog.info.text", new Object[0]));
        k2.f68335e.setOnClickListener(new C29584a(this));
        k2.f68340j.mo3946b().setOnClickListener(new C29585b(k2, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m68266r2(C21092b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m68264p2();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m68267s2(C27253b bVar, C21092b bVar2, View view) {
        C41536l.m120489i(bVar, "$this_with");
        C41536l.m120489i(bVar2, "this$0");
        bVar.f68341k.setVisibility(8);
        bVar2.m68261m2().mo52332tw();
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f56633M;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f56632L = C27253b.m84310d(layoutInflater, viewGroup, true);
        observeData();
        m68265q2();
        InstallmentReversalViewModel m2 = m68261m2();
        String string = requireArguments().getString("EXTRA_PRODUCT_TYPE", "");
        C41536l.m120488h(string, "requireArguments().getSt…g(EXTRA_PRODUCT_TYPE, \"\")");
        m2.mo52331sw(string, requireArguments().getLong("EXTRA_LOAN_KEY"));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f56632L = null;
    }
}

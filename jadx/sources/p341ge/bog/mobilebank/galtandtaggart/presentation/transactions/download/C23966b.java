package p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.download;

import android.content.Context;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import c10.C19443b;
import c10.C19447e;
import c10.C19454j;
import g91.C32303f;
import g91.C32335t0;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import ie0.C25182b;
import ie0.C25183c;
import ie0.C25190j;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p420fh.C12902d;
import p420fh.C12910e;
import rg0.C28023a;
import rg0.C28024b;
import rg0.C28025c;
import rg0.C28026d;
import ue0.C28734k;
import ue1.C43064a;
import ue1.C43075l;
import xe0.C29743a;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b */
public final class C23966b extends C23965a {

    /* renamed from: R */
    public static final C23967a f62235R = new C23967a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C28734k f62236K;

    /* renamed from: L */
    private final C41217g f62237L;

    /* renamed from: M */
    private final long f62238M;

    /* renamed from: N */
    private final long f62239N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public long f62240O;

    /* renamed from: P */
    private boolean f62241P = true;

    /* renamed from: Q */
    private final C23968b f62242Q = new C23968b(this);

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$a */
    public static final class C23967a {
        private C23967a() {
        }

        public /* synthetic */ C23967a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m77344b(long j, boolean z) {
            SimpleDateFormat simpleDateFormat;
            Date date = new Date(j);
            if (z) {
                simpleDateFormat = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());
            } else {
                simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
            }
            String format = simpleDateFormat.format(date);
            C41536l.m120488h(format, "when {\n                w…           }.format(date)");
            return format;
        }

        /* renamed from: c */
        public final C23966b mo60938c() {
            return new C23966b();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$b */
    public static final class C23968b implements C19454j {

        /* renamed from: a */
        final /* synthetic */ C23966b f62243a;

        C23968b(C23966b bVar) {
            this.f62243a = bVar;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            this.f62243a.f62240O = j;
            this.f62243a.m77341x2();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$c */
    static final class C23969c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23966b f62244d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$c$a */
        static final class C23970a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C23966b f62245d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23970a(C23966b bVar) {
                super(1);
                this.f62245d = bVar;
            }

            /* renamed from: a */
            public final void mo60940a(C29743a aVar) {
                C41536l.m120489i(aVar, "it");
                this.f62245d.m77333p2().f73332l.setLoading(false);
                this.f62245d.m77332o2(aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60940a((C29743a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$c$b */
        static final class C23971b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C23966b f62246d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23971b(C23966b bVar) {
                super(1);
                this.f62246d = bVar;
            }

            /* renamed from: a */
            public final void mo60941a(C29743a aVar) {
                this.f62246d.m77333p2().f73332l.setLoading(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60941a((C29743a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$c$c */
        static final class C23972c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C23966b f62247d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23972c(C23966b bVar) {
                super(1);
                this.f62247d = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f62247d.m77333p2().f73332l.setLoading(false);
                this.f62247d.handleError(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23969c(C23966b bVar) {
            super(1);
            this.f62244d = bVar;
        }

        /* renamed from: a */
        public final void mo60939a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23970a(this.f62244d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23971b(this.f62244d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23972c(this.f62244d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60939a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$d */
    static final class C23973d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62248a;

        C23973d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62248a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62248a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62248a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$e */
    public static final class C23974e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62249d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23974e(Fragment fragment) {
            super(0);
            this.f62249d = fragment;
        }

        public final Fragment invoke() {
            return this.f62249d;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$f */
    public static final class C23975f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23975f(C43064a aVar) {
            super(0);
            this.f62250d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62250d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$g */
    public static final class C23976g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62251d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23976g(C41217g gVar) {
            super(0);
            this.f62251d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62251d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$h */
    public static final class C23977h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62252d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62253e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23977h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62252d = aVar;
            this.f62253e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62252d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62253e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.b$i */
    public static final class C23978i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62254d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62255e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23978i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f62254d = fragment;
            this.f62255e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f62255e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f62254d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C23966b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C23975f(new C23974e(this)));
        this.f62237L = C1514j0.m5374c(this, C41520a0.m120436b(TransactionHistoryDownloadViewModel$ViewModel.class), new C23976g(a), new C23977h((C43064a) null, a), new C23978i(this, a));
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        this.f62238M = instance.getTimeInMillis() - ((long) 86400000);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date());
        instance2.add(2, -1);
        long timeInMillis = instance2.getTimeInMillis();
        this.f62239N = timeInMillis;
        this.f62240O = timeInMillis;
    }

    /* renamed from: W1 */
    private final void m77321W1() {
        C28734k p2 = m77333p2();
        p2.f73333m.setOnClickListener(new C28023a(this));
        p2.f73326f.setOnClickListener(new C28024b(this));
        p2.f73330j.setOnClickListener(new C28025c(this));
        p2.f73332l.setOnClickListener(new C28026d(this));
    }

    /* renamed from: m2 */
    private final void m77330m2() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        new C19443b(requireContext, this.f62240O, 0, this.f62238M, this.f62242Q).mo47662d();
    }

    /* renamed from: n2 */
    private final void m77331n2() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        new C19447e(requireContext, this.f62240O, 0, this.f62239N, (Boolean) null, this.f62242Q).mo47662d();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m77332o2(C29743a aVar) {
        boolean z;
        if (Patterns.WEB_URL.matcher(aVar.mo69753b()).matches()) {
            if (aVar.mo69752a().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String b = aVar.mo69753b();
                C1505h requireActivity = requireActivity();
                String a = aVar.mo69752a();
                C32303f.m95195f(b, requireActivity, a + ".pdf", "application/pdf");
                mo4577k1();
                return;
            }
        }
        String string = getString(C25190j.gt_history_download_not_found);
        C41536l.m120488h(string, "getString(R.string.gt_history_download_not_found)");
        C12910e.m48792j(this, string, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    private final void observeData() {
        m77334q2().mo60932kw().mo60935xk().mo4819k(this, new C23973d(new C23969c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final C28734k m77333p2() {
        C28734k kVar = this.f62236K;
        C41536l.m120486f(kVar);
        return kVar;
    }

    /* renamed from: q2 */
    private final TransactionHistoryDownloadViewModel$ViewModel m77334q2() {
        return (TransactionHistoryDownloadViewModel$ViewModel) this.f62237L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m77335r2(C23966b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        long j = bVar.f62240O;
        if (j < 0 || j > bVar.f62239N) {
            bVar.f62240O = bVar.f62239N;
            bVar.m77341x2();
        }
        bVar.f62241P = true;
        bVar.m77339v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m77336s2(C23966b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        long j = bVar.f62240O;
        if (j < 0 || j == bVar.f62239N) {
            bVar.f62240O = bVar.f62238M;
            bVar.m77341x2();
        }
        bVar.f62241P = false;
        bVar.m77339v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m77337t2(C23966b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        boolean z = bVar.f62241P;
        if (z) {
            bVar.m77331n2();
        } else if (!z) {
            bVar.m77330m2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m77338u2(C23966b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m77334q2().mo60931jw().mo60929Dg(bVar.f62240O, bVar.f62241P);
    }

    /* renamed from: v2 */
    private final void m77339v2() {
        TextView textView;
        TextView textView2;
        int i;
        C28734k p2 = m77333p2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        if (this.f62241P) {
            textView = p2.f73334n;
        } else {
            textView = p2.f73327g;
        }
        C41536l.m120488h(textView, "if (monthlySelected) monthlyText else dailyText");
        if (!this.f62241P) {
            textView2 = p2.f73334n;
        } else {
            textView2 = p2.f73327g;
        }
        C41536l.m120488h(textView2, "if (!monthlySelected) monthlyText else dailyText");
        textView.setBackgroundResource(C32335t0.m95360e(requireContext, C25182b.f64639a, true));
        textView.setTextColor(C0767a.m2893c(requireContext, C25183c.f64653o));
        textView2.setBackgroundResource(C25183c.f64643e);
        textView2.setTextColor(C0767a.m2893c(requireContext, C25183c.f64642d));
        TextView textView3 = p2.f73329i;
        if (this.f62241P) {
            i = m77334q2().mo60931jw().mo60930Rh();
        } else {
            i = m77334q2().mo60931jw().mo60933lk();
        }
        textView3.setText(i);
        m77341x2();
    }

    /* renamed from: w2 */
    private final void m77340w2() {
        m77339v2();
        m77341x2();
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public final void m77341x2() {
        m77333p2().f73331k.setText(f62235R.m77344b(this.f62240O, this.f62241P));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f62236K = C28734k.m88061d(layoutInflater, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C25190j.gt_history_download_title_action_sheet));
        m77340w2();
        m77321W1();
        observeData();
    }
}

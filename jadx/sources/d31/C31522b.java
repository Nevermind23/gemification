package d31;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import e31.C31653b;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.shared.dictionary.presentation.viewmodel.ForcedDictionaryUpdateViewModel$ViewModel;
import p420fh.C12902d;
import p420fh.C12910e;
import p90.C27243a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: d31.b */
public final class C31522b extends C31536d {

    /* renamed from: M */
    public static final C31523a f78084M = new C31523a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C27243a f78085K;

    /* renamed from: L */
    private final C41217g f78086L;

    /* renamed from: d31.b$a */
    public static final class C31523a {
        private C31523a() {
        }

        public /* synthetic */ C31523a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31522b mo71930a() {
            return new C31522b();
        }
    }

    /* renamed from: d31.b$b */
    static final class C31524b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31522b f78087d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31524b(C31522b bVar) {
            super(1);
            this.f78087d = bVar;
        }

        /* renamed from: a */
        public final void mo71931a(Long l) {
            PageDescriptionView pageDescriptionView = this.f78087d.m93606k2().f68261f;
            pageDescriptionView.setText("მიმდინარე დიქშენარის ვერსიის hashCode: " + l);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71931a((Long) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: d31.b$c */
    /* synthetic */ class C31525c extends C41535k implements C43075l {
        C31525c(Object obj) {
            super(1, obj, C31522b.class, "onDictionaryUpateResult", "onDictionaryUpateResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo71932b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C31522b) this.receiver).m93608m2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71932b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: d31.b$d */
    static final class C31526d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31522b f78088d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31526d(C31522b bVar) {
            super(1);
            this.f78088d = bVar;
        }

        /* renamed from: a */
        public final void mo71933a(C41238w wVar) {
            this.f78088d.m93606k2().f68260e.setLoading(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71933a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: d31.b$e */
    static final class C31527e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31522b f78089d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31527e(C31522b bVar) {
            super(1);
            this.f78089d = bVar;
        }

        /* renamed from: a */
        public final void mo71934a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f78089d.m93606k2().f68260e.setLoading(false);
            C12910e.m48798p(this.f78089d, "დიქშენარი წარმატებით განახლდა", (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71934a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: d31.b$f */
    static final class C31528f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31522b f78090d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31528f(C31522b bVar) {
            super(1);
            this.f78090d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f78090d.m93606k2().f68260e.setLoading(false);
            this.f78090d.handleError(th);
        }
    }

    /* renamed from: d31.b$g */
    static final class C31529g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f78091a;

        C31529g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f78091a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f78091a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f78091a.invoke(obj);
        }
    }

    /* renamed from: d31.b$h */
    public static final class C31530h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f78092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31530h(Fragment fragment) {
            super(0);
            this.f78092d = fragment;
        }

        public final Fragment invoke() {
            return this.f78092d;
        }
    }

    /* renamed from: d31.b$i */
    public static final class C31531i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f78093d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31531i(C43064a aVar) {
            super(0);
            this.f78093d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f78093d.invoke();
        }
    }

    /* renamed from: d31.b$j */
    public static final class C31532j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f78094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31532j(C41217g gVar) {
            super(0);
            this.f78094d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f78094d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: d31.b$k */
    public static final class C31533k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f78095d;

        /* renamed from: e */
        final /* synthetic */ C41217g f78096e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31533k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f78095d = aVar;
            this.f78096e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f78095d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f78096e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: d31.b$l */
    public static final class C31534l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f78097d;

        /* renamed from: e */
        final /* synthetic */ C41217g f78098e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31534l(Fragment fragment, C41217g gVar) {
            super(0);
            this.f78097d = fragment;
            this.f78098e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f78098e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f78097d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C31522b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C31531i(new C31530h(this)));
        this.f78086L = C1514j0.m5374c(this, C41520a0.m120436b(ForcedDictionaryUpdateViewModel$ViewModel.class), new C31532j(a), new C31533k((C43064a) null, a), new C31534l(this, a));
    }

    /* renamed from: h2 */
    private final void m93603h2() {
        m93606k2().f68260e.setOnClickListener(new C31521a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m93604i2(C31522b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m93607l2().mo84369hw().mo72080Wi();
    }

    /* renamed from: j2 */
    private final void m93605j2() {
        C31653b iw = m93607l2().mo84370iw();
        iw.mo72081Xd().mo4819k(getViewLifecycleOwner(), new C31529g(new C31524b(this)));
        iw.mo72082xr().mo4819k(getViewLifecycleOwner(), new C31529g(new C31525c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C27243a m93606k2() {
        C27243a aVar = this.f78085K;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: l2 */
    private final ForcedDictionaryUpdateViewModel$ViewModel m93607l2() {
        return (ForcedDictionaryUpdateViewModel$ViewModel) this.f78086L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m93608m2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C31526d(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C31527e(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C31528f(this), 1, (Object) null);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f78085K = C27243a.m84277d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f78085K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2("Forced Dictionary Update");
        m93603h2();
        m93605j2();
    }
}

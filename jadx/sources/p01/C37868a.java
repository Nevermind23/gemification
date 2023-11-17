package p01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import i01.C36333a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p01.C37885h;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.cardchooser.model.CardChooserData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel;
import q01.C38098a;
import q01.C38099b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: p01.a */
public final class C37868a extends C37891k {

    /* renamed from: J */
    public static final C37869a f90931J = new C37869a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C36333a f90932G;

    /* renamed from: H */
    public C37885h.C37886a f90933H;

    /* renamed from: I */
    private final C41217g f90934I;

    /* renamed from: p01.a$a */
    public static final class C37869a {
        private C37869a() {
        }

        public /* synthetic */ C37869a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37868a mo91219a(CardChooserData cardChooserData) {
            C41536l.m120489i(cardChooserData, "data");
            C37868a aVar = new C37868a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_CARD_CHOOSER_DATA", cardChooserData)));
            return aVar;
        }
    }

    /* renamed from: p01.a$b */
    static final class C37870b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37868a f90935d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37870b(C37868a aVar) {
            super(1);
            this.f90935d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m111350c(C37868a aVar, CardUiModel cardUiModel) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cardUiModel, "it");
            aVar.m111345g2().mo91230dw().mo91227x9(cardUiModel);
        }

        /* renamed from: b */
        public final void mo91220b(C38099b bVar) {
            boolean z;
            String str;
            String c;
            RecyclerView recyclerView = this.f90935d.m111344f2().f87669f;
            C37888j jVar = new C37888j(new C37879b(this.f90935d));
            jVar.mo6029i(bVar.mo91522a());
            recyclerView.setAdapter(jVar);
            InlineFeedback2 inlineFeedback2 = this.f90935d.m111344f2().f87668e;
            C41536l.m120488h(inlineFeedback2, "invoke$lambda$2");
            if (bVar.mo91523b() != null) {
                z = true;
            } else {
                z = false;
            }
            String str2 = null;
            C32343x.m95483r1(inlineFeedback2, z, false, 2, (Object) null);
            C38098a b = bVar.mo91523b();
            if (b == null || (c = b.mo91521c()) == null) {
                str = null;
            } else {
                str = C32343x.m95388F(c, new Object[0]);
            }
            inlineFeedback2.setTitle(str);
            C38098a b2 = bVar.mo91523b();
            if (b2 != null) {
                str2 = b2.mo91520b();
            }
            inlineFeedback2.setDescription(C32343x.m95388F(str2, new Object[0]));
            inlineFeedback2.setStatus(InlineFeedback2.C13350a.NEGATIVE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91220b((C38099b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p01.a$c */
    static final class C37871c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37868a f90936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37871c(C37868a aVar) {
            super(1);
            this.f90936d = aVar;
        }

        /* renamed from: a */
        public final void mo91221a(CardUiModel cardUiModel) {
            C41536l.m120489i(cardUiModel, "it");
            C1533o.m5445b(this.f90936d, "RESULT_CARD_SELECTED", C0908e.m3336b(C41233s.m119492a("RESULT_CARD_SELECTED", cardUiModel)));
            this.f90936d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91221a((CardUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p01.a$d */
    static final class C37872d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f90937a;

        C37872d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f90937a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f90937a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f90937a.invoke(obj);
        }
    }

    /* renamed from: p01.a$e */
    public static final class C37873e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f90938d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37873e(Fragment fragment) {
            super(0);
            this.f90938d = fragment;
        }

        public final Fragment invoke() {
            return this.f90938d;
        }
    }

    /* renamed from: p01.a$f */
    public static final class C37874f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f90939d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37874f(C43064a aVar) {
            super(0);
            this.f90939d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f90939d.invoke();
        }
    }

    /* renamed from: p01.a$g */
    public static final class C37875g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f90940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37875g(C41217g gVar) {
            super(0);
            this.f90940d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f90940d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: p01.a$h */
    public static final class C37876h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f90941d;

        /* renamed from: e */
        final /* synthetic */ C41217g f90942e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37876h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f90941d = aVar;
            this.f90942e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f90941d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f90942e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: p01.a$i */
    static final class C37877i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C37868a f90943d;

        /* renamed from: p01.a$i$a */
        static final class C37878a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C37868a f90944d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37878a(C37868a aVar) {
                super(0);
                this.f90944d = aVar;
            }

            /* renamed from: b */
            public final C37885h invoke() {
                CardChooserData cardChooserData;
                C37885h.C37886a h2 = this.f90944d.mo91218h2();
                Bundle arguments = this.f90944d.getArguments();
                if (arguments != null) {
                    cardChooserData = (CardChooserData) arguments.getParcelable("EXTRA_CARD_CHOOSER_DATA");
                } else {
                    cardChooserData = null;
                }
                C41536l.m120486f(cardChooserData);
                return h2.mo32803a(cardChooserData);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37877i(C37868a aVar) {
            super(0);
            this.f90943d = aVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C37878a(this.f90943d));
        }
    }

    public C37868a() {
        C37877i iVar = new C37877i(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C37874f(new C37873e(this)));
        this.f90934I = C1514j0.m5374c(this, C41520a0.m120436b(C37885h.class), new C37875g(a), new C37876h((C43064a) null, a), iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public final C36333a m111344f2() {
        C36333a aVar = this.f90932G;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C37885h m111345g2() {
        return (C37885h) this.f90934I.getValue();
    }

    private final void observeData() {
        m111345g2().mo91231ew().mo91228a().mo4819k(getViewLifecycleOwner(), new C37872d(new C37870b(this)));
        LiveData r6 = m111345g2().mo91231ew().mo91229r6();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(r6, viewLifecycleOwner, new C37871c(this));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f90932G = C36333a.m107822d(layoutInflater, viewGroup, true);
    }

    /* renamed from: h2 */
    public final C37885h.C37886a mo91218h2() {
        C37885h.C37886a aVar = this.f90933H;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("qr.atm.withdrawal.page.select.card.AS.header", new Object[0]));
        observeData();
    }
}

package p341ge.bog.mobilebank.transportcard.presentation.choosecard;

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
import g71.C32111d;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m71.C37245m;
import n71.C37362b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.transportcard.presentation.choosecard.C34994b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment */
public final class ChooseCardDialogFragment extends C37245m {

    /* renamed from: L */
    public static final C34981a f84447L = new C34981a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C34994b.C35003i f84448G;

    /* renamed from: H */
    private C32111d f84449H;

    /* renamed from: I */
    private final C41217g f84450I = C41219i.m119470b(new C34984c(this));

    /* renamed from: J */
    private final C41217g f84451J;

    /* renamed from: K */
    private final C41217g f84452K;

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$a */
    public static final class C34981a {
        private C34981a() {
        }

        public /* synthetic */ C34981a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$b */
    static final class C34982b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ChooseCardDialogFragment f84453d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$b$a */
        static final class C34983a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ChooseCardDialogFragment f84454d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34983a(ChooseCardDialogFragment chooseCardDialogFragment) {
                super(1);
                this.f84454d = chooseCardDialogFragment;
            }

            /* renamed from: a */
            public final void mo85817a(int i) {
                this.f84454d.m102863i2().mo85828tw().mo85825Z2(i);
                this.f84454d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo85817a(((Number) obj).intValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34982b(ChooseCardDialogFragment chooseCardDialogFragment) {
            super(0);
            this.f84453d = chooseCardDialogFragment;
        }

        /* renamed from: b */
        public final C37362b invoke() {
            return new C37362b(new C34983a(this.f84453d));
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$c */
    static final class C34984c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ChooseCardDialogFragment f84455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34984c(ChooseCardDialogFragment chooseCardDialogFragment) {
            super(0);
            this.f84455d = chooseCardDialogFragment;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f84455d.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("IS_PAYMENT_CARDS", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$d */
    static final class C34985d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ChooseCardDialogFragment f84456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34985d(ChooseCardDialogFragment chooseCardDialogFragment) {
            super(1);
            this.f84456d = chooseCardDialogFragment;
        }

        /* renamed from: a */
        public final void mo85819a(List list) {
            this.f84456d.m102861g2().mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85819a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$e */
    static final class C34986e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84457a;

        C34986e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84457a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84457a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84457a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$f */
    public static final class C34987f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34987f(Fragment fragment) {
            super(0);
            this.f84458d = fragment;
        }

        public final Fragment invoke() {
            return this.f84458d;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$g */
    public static final class C34988g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34988g(C43064a aVar) {
            super(0);
            this.f84459d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f84459d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$h */
    public static final class C34989h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f84460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34989h(C41217g gVar) {
            super(0);
            this.f84460d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f84460d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$i */
    public static final class C34990i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84461d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84462e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34990i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f84461d = aVar;
            this.f84462e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84461d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f84462e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$j */
    static final class C34991j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ChooseCardDialogFragment f84463d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment$j$a */
        static final class C34992a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ ChooseCardDialogFragment f84464d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34992a(ChooseCardDialogFragment chooseCardDialogFragment) {
                super(0);
                this.f84464d = chooseCardDialogFragment;
            }

            /* renamed from: b */
            public final C34994b invoke() {
                return this.f84464d.mo85815j2().mo32840a(this.f84464d.m102864k2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34991j(ChooseCardDialogFragment chooseCardDialogFragment) {
            super(0);
            this.f84463d = chooseCardDialogFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C34992a(this.f84463d));
        }
    }

    public ChooseCardDialogFragment() {
        C34991j jVar = new C34991j(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C34988g(new C34987f(this)));
        this.f84451J = C1514j0.m5374c(this, C41520a0.m120436b(C34994b.class), new C34989h(a), new C34990i((C43064a) null, a), jVar);
        this.f84452K = C41219i.m119470b(new C34982b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C37362b m102861g2() {
        return (C37362b) this.f84452K.getValue();
    }

    /* renamed from: h2 */
    private final C32111d m102862h2() {
        C32111d dVar = this.f84449H;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final C34994b m102863i2() {
        return (C34994b) this.f84451J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final boolean m102864k2() {
        return ((Boolean) this.f84450I.getValue()).booleanValue();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f84449H = C32111d.m94578d(layoutInflater, viewGroup, true);
    }

    /* renamed from: j2 */
    public final C34994b.C35003i mo85815j2() {
        C34994b.C35003i iVar = this.f84448G;
        if (iVar != null) {
            return iVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f84449H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("tcc.permit.details.page.choose.card", new Object[0]));
        m102862h2().f78973f.setText(C32343x.m95388F("tcc.permit.details.page.choose.card.not.chosen", new Object[0]));
        m102862h2().f78972e.setAdapter(m102861g2());
        PageDescriptionView pageDescriptionView = m102862h2().f78973f;
        C41536l.m120488h(pageDescriptionView, "binding.tcChooseCardDescription");
        C32343x.m95483r1(pageDescriptionView, !m102864k2(), false, 2, (Object) null);
        m102863i2().mo85829uw().mo85826s().mo4819k(getViewLifecycleOwner(), new C34986e(new C34985d(this)));
    }
}

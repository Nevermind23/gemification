package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet;
import pt0.C37996r;
import ue1.C43064a;
import vs0.C39450i;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.d */
public final class C33055d extends C33066k {

    /* renamed from: i */
    public static final C33056a f80950i = new C33056a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C39450i f80951g;

    /* renamed from: h */
    private final C41217g f80952h = C1514j0.m5374c(this, C41520a0.m120436b(C37996r.class), new C33057b(this), new C33058c((C43064a) null, this), new C33059d(this));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.d$a */
    public static final class C33056a {
        private C33056a() {
        }

        public /* synthetic */ C33056a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C33055d mo74955a(boolean z) {
            C33055d dVar = new C33055d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_PAUSE", Boolean.valueOf(z))));
            return dVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.d$b */
    public static final class C33057b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80953d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33057b(Fragment fragment) {
            super(0);
            this.f80953d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80953d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.d$c */
    public static final class C33058c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80954d;

        /* renamed from: e */
        final /* synthetic */ Fragment f80955e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33058c(C43064a aVar, Fragment fragment) {
            super(0);
            this.f80954d = aVar;
            this.f80955e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80954d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80955e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.d$d */
    public static final class C33059d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80956d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33059d(Fragment fragment) {
            super(0);
            this.f80956d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80956d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: l1 */
    private final void m97449l1() {
        m97453p1().f93780g.setOnClickListener(new C33052a(this));
        m97453p1().f93785l.setOnClickListener(new C33053b(this));
        m97453p1().f93782i.setOnClickListener(new C33054c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m97450m1(C33055d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m97455r1(ClosePiggyBankActionSheet.C32778a.CHANGE_AMOUNT);
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m97451n1(C33055d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m97455r1(ClosePiggyBankActionSheet.C32778a.PAUSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m97452o1(C33055d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m97454q1().mo91370Jw();
        dVar.m97455r1(ClosePiggyBankActionSheet.C32778a.DEACTIVATE);
    }

    /* renamed from: p1 */
    private final C39450i m97453p1() {
        C39450i iVar = this.f80951g;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* renamed from: q1 */
    private final C37996r m97454q1() {
        return (C37996r) this.f80952h.getValue();
    }

    /* renamed from: r1 */
    private final void m97455r1(ClosePiggyBankActionSheet.C32778a aVar) {
        C1533o.m5445b(this, "REQUEST_KEY_CHANGE_DESTINATION", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_DESTINATION", aVar)));
    }

    /* renamed from: s1 */
    private final void m97456s1() {
        boolean z;
        m97453p1().f93778e.setTitle(C32343x.m95388F("cas.deactivate.actionsheet.message", new Object[0]));
        m97453p1().f93786m.setText(C32343x.m95388F("cas.deactivate.actionsheet.pause", new Object[0]));
        m97453p1().f93779f.setText(C32343x.m95388F("cas.deactivate.actionsheet.change.amount", new Object[0]));
        m97453p1().f93783j.setText(C32343x.m95388F("cas.deactivate.actionsheet.deactivate", new Object[0]));
        ListItem listItem = m97453p1().f93785l;
        C41536l.m120488h(listItem, "binding.pauseItem");
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getBoolean("ARG_PAUSE", false)) {
            z = false;
        } else {
            z = true;
        }
        C32343x.m95483r1(listItem, !z, false, 2, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80951g = C39450i.m114656d(layoutInflater, viewGroup, false);
        m97456s1();
        m97449l1();
        LinearLayoutCompat c = m97453p1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80951g = null;
    }
}

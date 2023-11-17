package ct0;

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
import g91.C32286a1;
import g91.C32343x;
import gt0.C36073b;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.C32793b;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountActionSheetData;
import pt0.C37978a;
import pt0.C37980c;
import pt0.C37981d;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39463v;

/* renamed from: ct0.f */
public final class C31414f extends C32793b {

    /* renamed from: P */
    public static final C31415a f77961P = new C31415a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C39463v f77962K;

    /* renamed from: L */
    private final C41217g f77963L = C41219i.m119470b(new C31420f(this));

    /* renamed from: M */
    public C37978a f77964M;

    /* renamed from: N */
    private final C41217g f77965N;

    /* renamed from: O */
    private final C41217g f77966O;

    /* renamed from: ct0.f$a */
    public static final class C31415a {
        private C31415a() {
        }

        public /* synthetic */ C31415a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C31414f m93354b(C31415a aVar, List list, String str, String str2, String str3, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = C32343x.m95388F("cas.service.open.choose.accounts", new Object[0]);
            }
            if ((i & 8) != 0) {
                str3 = C32343x.m95388F("cas.service.open.choose.accounts.button", new Object[0]);
            }
            return aVar.mo71776a(list, str, str2, str3);
        }

        /* renamed from: a */
        public final C31414f mo71776a(List list, String str, String str2, String str3) {
            C41536l.m120489i(list, "accounts");
            C41536l.m120489i(str2, "title");
            C41536l.m120489i(str3, "buttonText");
            C31414f fVar = new C31414f();
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_ACTION_SHEET_DATA", new PiggyBankAccountActionSheetData(list, str2, str, str3))));
            return fVar;
        }
    }

    /* renamed from: ct0.f$b */
    static final class C31416b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31414f f77967d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31416b(C31414f fVar) {
            super(0);
            this.f77967d = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m93357c(C31414f fVar, CasAccountUiModel casAccountUiModel, int i, boolean z) {
            C41536l.m120489i(fVar, "this$0");
            C41536l.m120489i(casAccountUiModel, "account");
            fVar.m93349o2().mo91337ew().mo91333m8(casAccountUiModel, z);
        }

        /* renamed from: b */
        public final C36073b invoke() {
            return new C36073b(new C31428g(this.f77967d));
        }
    }

    /* renamed from: ct0.f$c */
    /* synthetic */ class C31417c extends C41535k implements C43075l {
        C31417c(Object obj) {
            super(1, obj, C36073b.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo71778b(List list) {
            ((C36073b) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71778b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ct0.f$d */
    /* synthetic */ class C31418d extends C41535k implements C43075l {
        C31418d(Object obj) {
            super(1, obj, Button.class, "setEnabled", "setEnabled(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo71779b(boolean z) {
            ((Button) this.receiver).setEnabled(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71779b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ct0.f$e */
    static final class C31419e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31414f f77968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31419e(C31414f fVar) {
            super(1);
            this.f77968d = fVar;
        }

        /* renamed from: a */
        public final void mo71780a(C37223a aVar) {
            List list = (List) aVar.mo90296a();
            if (list != null) {
                this.f77968d.m93345j2(list);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71780a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ct0.f$f */
    static final class C31420f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31414f f77969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31420f(C31414f fVar) {
            super(0);
            this.f77969d = fVar;
        }

        /* renamed from: b */
        public final PiggyBankAccountActionSheetData invoke() {
            Bundle arguments = this.f77969d.getArguments();
            if (arguments != null) {
                return (PiggyBankAccountActionSheetData) arguments.getParcelable("ARG_ACTION_SHEET_DATA");
            }
            return null;
        }
    }

    /* renamed from: ct0.f$g */
    static final class C31421g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f77970a;

        C31421g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f77970a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f77970a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f77970a.invoke(obj);
        }
    }

    /* renamed from: ct0.f$h */
    public static final class C31422h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77971d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31422h(Fragment fragment) {
            super(0);
            this.f77971d = fragment;
        }

        public final Fragment invoke() {
            return this.f77971d;
        }
    }

    /* renamed from: ct0.f$i */
    public static final class C31423i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f77972d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31423i(C43064a aVar) {
            super(0);
            this.f77972d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f77972d.invoke();
        }
    }

    /* renamed from: ct0.f$j */
    public static final class C31424j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f77973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31424j(C41217g gVar) {
            super(0);
            this.f77973d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f77973d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ct0.f$k */
    public static final class C31425k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f77974d;

        /* renamed from: e */
        final /* synthetic */ C41217g f77975e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31425k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f77974d = aVar;
            this.f77975e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f77974d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f77975e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ct0.f$l */
    static final class C31426l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31414f f77976d;

        /* renamed from: ct0.f$l$a */
        static final class C31427a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C31414f f77977d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31427a(C31414f fVar) {
                super(0);
                this.f77977d = fVar;
            }

            /* renamed from: b */
            public final C37981d invoke() {
                C37978a n2 = this.f77977d.mo71775n2();
                PiggyBankAccountActionSheetData g2 = this.f77977d.m93348m2();
                C41536l.m120486f(g2);
                return n2.mo32836a(g2.mo75144a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31426l(C31414f fVar) {
            super(0);
            this.f77976d = fVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C31427a(this.f77976d));
        }
    }

    public C31414f() {
        C31426l lVar = new C31426l(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C31423i(new C31422h(this)));
        this.f77965N = C1514j0.m5374c(this, C41520a0.m120436b(C37981d.class), new C31424j(a), new C31425k((C43064a) null, a), lVar);
        this.f77966O = C41219i.m119470b(new C31416b(this));
    }

    /* renamed from: i2 */
    private final void m93344i2() {
        C37980c fw = m93349o2().mo91338fw();
        fw.mo91335g().mo4819k(getViewLifecycleOwner(), new C31421g(new C31417c(m93346k2())));
        LiveData D3 = fw.mo91334D3();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        Button button = m93347l2().f93854f;
        C41536l.m120488h(button, "binding.chooseButton");
        D3.mo4819k(viewLifecycleOwner, new C31421g(new C31418d(button)));
        fw.mo91336lp().mo4819k(getViewLifecycleOwner(), new C31421g(new C31419e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m93345j2(List list) {
        C1533o.m5445b(this, "REQUEST_KEY_PIGGY_BANK_ACCOUNTS", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_PIGGY_BANK_SELECTED_ACCOUNTS", list)));
        mo4577k1();
    }

    /* renamed from: k2 */
    private final C36073b m93346k2() {
        return (C36073b) this.f77966O.getValue();
    }

    /* renamed from: l2 */
    private final C39463v m93347l2() {
        C39463v vVar = this.f77962K;
        C41536l.m120486f(vVar);
        return vVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final PiggyBankAccountActionSheetData m93348m2() {
        return (PiggyBankAccountActionSheetData) this.f77963L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final C37981d m93349o2() {
        return (C37981d) this.f77965N.getValue();
    }

    /* renamed from: p2 */
    private final void m93350p2(PiggyBankAccountActionSheetData piggyBankAccountActionSheetData) {
        boolean z;
        mo26370a2(piggyBankAccountActionSheetData.mo75148e());
        m93347l2().f93853e.setAdapter(m93346k2());
        m93347l2().f93854f.setOnClickListener(new C31413e(this));
        m93347l2().f93854f.setButtonText(piggyBankAccountActionSheetData.mo75145b());
        PageDescriptionView pageDescriptionView = m93347l2().f93855g;
        C41536l.m120488h(pageDescriptionView, "binding.description");
        String d = piggyBankAccountActionSheetData.mo75146d();
        if (d == null || C40439w.m117118v(d)) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(pageDescriptionView, !z, false, 2, (Object) null);
        m93347l2().f93855g.setText(piggyBankAccountActionSheetData.mo75146d());
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m93351q2(C31414f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m93349o2().mo91337ew().mo91332Ol();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f77962K = C39463v.m114708d(layoutInflater, viewGroup, true);
    }

    /* renamed from: n2 */
    public final C37978a mo71775n2() {
        C37978a aVar = this.f77964M;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m93348m2() == null) {
            mo4577k1();
            C41238w wVar = C41238w.f97225a;
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77962K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        PiggyBankAccountActionSheetData m2 = m93348m2();
        if (m2 != null) {
            m93350p2(m2);
        }
        m93344i2();
        super.onViewCreated(view, bundle);
    }
}

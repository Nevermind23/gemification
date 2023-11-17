package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity;

import a30.C19152b;
import a30.C19158c;
import a30.C19159d;
import a81.C30772sa;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.C0209a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import n20.C26360b;
import o20.C26704q;
import o20.C26705r;
import o20.C26706s;
import o20.C26707t;
import o20.C26708u;
import o20.C26709v;
import p163m0.C7047a;
import p20.C27152h;
import p20.C27156j;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.InfoMessageView;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.C21810a;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhoneActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10313b;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10464h;
import p90.C27480z1;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity */
public final class SelectContactActivity extends C30772sa implements C21810a.C21811a {

    /* renamed from: M */
    public static final C21795a f58167M = new C21795a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C27480z1 f58168F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C27152h f58169G = new C27152h();
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C27156j f58170H = new C27156j();

    /* renamed from: I */
    private final C41217g f58171I = new C1617p0(C41520a0.m120436b(MoneyRequestSelectContactViewModel.class), new C21808m(this), new C21807l(this), new C21809n((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f58172J = C41219i.m119470b(new C21798d(this));

    /* renamed from: K */
    private final C41217g f58173K = C41219i.m119470b(new C21796b(this));

    /* renamed from: L */
    private final C41217g f58174L = C41219i.m119470b(new C21797c(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$a */
    public static final class C21795a {
        private C21795a() {
        }

        public /* synthetic */ C21795a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$b */
    static final class C21796b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SelectContactActivity f58175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21796b(SelectContactActivity selectContactActivity) {
            super(0);
            this.f58175d = selectContactActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f58175d.getIntent().getBooleanExtra("EXTRA_IS_BILL_SPLIT_ENTRY_POINT", false));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$c */
    static final class C21797c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SelectContactActivity f58176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21797c(SelectContactActivity selectContactActivity) {
            super(0);
            this.f58176d = selectContactActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f58176d.getIntent().getBooleanExtra("EXTRA_IS_BILL_SPLIT_PROCESS", false));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$d */
    static final class C21798d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SelectContactActivity f58177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21798d(SelectContactActivity selectContactActivity) {
            super(0);
            this.f58177d = selectContactActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f58177d.getIntent().getBooleanExtra("EXTRA_IS_EDIT_MODE", false));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$e */
    static final class C21799e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectContactActivity f58178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21799e(SelectContactActivity selectContactActivity) {
            super(1);
            this.f58178d = selectContactActivity;
        }

        /* renamed from: a */
        public final void mo54381a(C19152b bVar) {
            boolean z;
            String str;
            C27480z1 K2 = this.f58178d.f58168F;
            C27480z1 z1Var = null;
            if (K2 == null) {
                C41536l.m120506z("binding");
                K2 = null;
            }
            StateView stateView = K2.f70329g.f68400f;
            C41536l.m120488h(stateView, "binding.contactListLayout.contactsStateView");
            if (bVar instanceof C19152b.C19157e) {
                stateView.mo53595c();
                this.f58178d.f58169G.mo66452o(((C19152b.C19157e) bVar).mo47364a());
            } else if (C41536l.m120484d(bVar, C19152b.C19154b.f53341a)) {
                stateView.mo53597e();
            } else if (C41536l.m120484d(bVar, C19152b.C19153a.f53340a)) {
                stateView.mo53596d();
            } else {
                C19152b.C19156d dVar = C19152b.C19156d.f53343a;
                if (C41536l.m120484d(bVar, dVar)) {
                    z = true;
                } else {
                    z = C41536l.m120484d(bVar, C19152b.C19155c.f53342a);
                }
                if (z) {
                    stateView.mo53598f();
                    C27480z1 K22 = this.f58178d.f58168F;
                    if (K22 == null) {
                        C41536l.m120506z("binding");
                    } else {
                        z1Var = K22;
                    }
                    InfoMessageView infoMessageView = z1Var.f70329g.f68402h;
                    if (C41536l.m120484d(bVar, dVar)) {
                        str = this.f58178d.getString(C10328q.money_request_select_contact_msg_info_contact_not_found);
                    } else {
                        str = this.f58178d.getString(C10328q.money_request_select_contact_msg_info_no_contacts);
                    }
                    C41536l.m120488h(str, "if (it == ContactSearchR…                        }");
                    infoMessageView.setMessage(str);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54381a((C19152b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$f */
    static final class C21800f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectContactActivity f58179d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21800f(SelectContactActivity selectContactActivity) {
            super(1);
            this.f58179d = selectContactActivity;
        }

        /* renamed from: a */
        public final void mo54382a(List list) {
            C27480z1 K2 = this.f58179d.f58168F;
            if (K2 == null) {
                C41536l.m120506z("binding");
                K2 = null;
            }
            Button button = K2.f70331i;
            C41536l.m120488h(button, "binding.nextButton");
            C41536l.m120488h(list, "it");
            C32343x.m95483r1(button, !list.isEmpty(), false, 2, (Object) null);
            C27480z1 K22 = this.f58179d.f58168F;
            if (K22 == null) {
                C41536l.m120506z("binding");
                K22 = null;
            }
            RecyclerView recyclerView = K22.f70332j.f68895f;
            C41536l.m120488h(recyclerView, "binding.receiversLayout.moneyRequestReceiverList");
            C32343x.m95483r1(recyclerView, !list.isEmpty(), false, 2, (Object) null);
            C27480z1 K23 = this.f58179d.f58168F;
            if (K23 == null) {
                C41536l.m120506z("binding");
                K23 = null;
            }
            LinearLayout linearLayout = K23.f70332j.f68894e;
            C41536l.m120488h(linearLayout, "binding.receiversLayout.addNewContactLayout");
            C32343x.m95483r1(linearLayout, list.isEmpty(), false, 2, (Object) null);
            this.f58179d.f58170H.mo66464j(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54382a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$g */
    static final class C21801g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectContactActivity f58180d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21801g(SelectContactActivity selectContactActivity) {
            super(1);
            this.f58180d = selectContactActivity;
        }

        /* renamed from: a */
        public final void mo54383a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                SelectContactActivity selectContactActivity = this.f58180d;
                long longValue = l.longValue();
                new C21810a().mo4576A1(selectContactActivity.getSupportFragmentManager(), "tag");
                selectContactActivity.f58169G.mo66447j(longValue);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54383a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$h */
    public static final class C21802h implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ SelectContactActivity f58181d;

        C21802h(SelectContactActivity selectContactActivity) {
            this.f58181d = selectContactActivity;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            MoneyRequestSelectContactViewModel N2 = this.f58181d.m70648O2();
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            N2.mo54580Y2(str);
            C27480z1 K2 = this.f58181d.f58168F;
            if (K2 == null) {
                C41536l.m120506z("binding");
                K2 = null;
            }
            ImageButton imageButton = K2.f70333k.f70100e;
            C41536l.m120488h(imageButton, "binding.searchLayout.clearSearchButton");
            if (editable == null || editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(imageButton, !z, false, 2, (Object) null);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$i */
    static final class C21803i extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ SelectContactActivity f58182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21803i(SelectContactActivity selectContactActivity) {
            super(2);
            this.f58182d = selectContactActivity;
        }

        /* renamed from: a */
        public final void mo54387a(C19158c cVar, boolean z) {
            C41536l.m120489i(cVar, "contactModel");
            this.f58182d.m70648O2().mo54571Kw(cVar.mo47371d());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo54387a((C19158c) obj, ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$j */
    static final class C21804j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectContactActivity f58183d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$j$a */
        public /* synthetic */ class C21805a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f58184a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    a30.f[] r0 = a30.C19166f.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    a30.f r1 = a30.C19166f.ADD_NEW_RECEIVER     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    a30.f r1 = a30.C19166f.CONTACT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    a30.f r1 = a30.C19166f.PHONE_NUMBER     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f58184a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity.C21804j.C21805a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21804j(SelectContactActivity selectContactActivity) {
            super(1);
            this.f58183d = selectContactActivity;
        }

        /* renamed from: a */
        public final void mo54388a(C19159d dVar) {
            C41536l.m120489i(dVar, "it");
            int i = C21805a.f58184a[dVar.mo47385h().ordinal()];
            if (i == 1) {
                this.f58183d.mo86447x2(AddWithPhoneActivity.class);
            } else if (i == 2) {
                MoneyRequestSelectContactViewModel N2 = this.f58183d.m70648O2();
                Long a = dVar.mo47377a();
                C41536l.m120486f(a);
                N2.mo54571Kw(a.longValue());
            } else if (i == 3) {
                this.f58183d.m70648O2().mo54576Tw(dVar.mo47379c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54388a((C19159d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$k */
    static final class C21806k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58185a;

        C21806k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58185a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58185a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58185a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$l */
    public static final class C21807l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58186d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21807l(ComponentActivity componentActivity) {
            super(0);
            this.f58186d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58186d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$m */
    public static final class C21808m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58187d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21808m(ComponentActivity componentActivity) {
            super(0);
            this.f58187d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58187d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectContactActivity$n */
    public static final class C21809n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58188d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58189e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21809n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58188d = aVar;
            this.f58189e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58188d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58189e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final MoneyRequestSelectContactViewModel m70648O2() {
        return (MoneyRequestSelectContactViewModel) this.f58171I.getValue();
    }

    /* renamed from: P2 */
    private final boolean m70649P2() {
        return ((Boolean) this.f58173K.getValue()).booleanValue();
    }

    /* renamed from: Q2 */
    private final boolean m70650Q2() {
        return ((Boolean) this.f58174L.getValue()).booleanValue();
    }

    /* renamed from: S2 */
    private final void m70651S2() {
        m70648O2().mo54573Qw().mo4819k(this, new C21806k(new C21799e(this)));
        m70648O2().mo54574Rw().mo4819k(this, new C21806k(new C21800f(this)));
        m70648O2().mo54575Sw().mo4819k(this, new C21806k(new C21801g(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m70652T2(SelectContactActivity selectContactActivity, View view, boolean z) {
        C41536l.m120489i(selectContactActivity, "this$0");
        C27480z1 z1Var = selectContactActivity.f58168F;
        if (z1Var == null) {
            C41536l.m120506z("binding");
            z1Var = null;
        }
        z1Var.f70327e.post(new C26709v(selectContactActivity, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m70653U2(SelectContactActivity selectContactActivity, boolean z) {
        C41536l.m120489i(selectContactActivity, "this$0");
        C27480z1 z1Var = selectContactActivity.f58168F;
        if (z1Var == null) {
            C41536l.m120506z("binding");
            z1Var = null;
        }
        z1Var.f70327e.setExpanded(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m70654V2(SelectContactActivity selectContactActivity, View view) {
        C41536l.m120489i(selectContactActivity, "this$0");
        C27480z1 z1Var = selectContactActivity.f58168F;
        if (z1Var == null) {
            C41536l.m120506z("binding");
            z1Var = null;
        }
        z1Var.f70333k.f70101f.setText("");
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m70655W2(SelectContactActivity selectContactActivity, View view) {
        C41536l.m120489i(selectContactActivity, "this$0");
        selectContactActivity.m70648O2().mo54577Vw();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m70656X2(SelectContactActivity selectContactActivity, View view) {
        C41536l.m120489i(selectContactActivity, "this$0");
        selectContactActivity.mo86447x2(AddWithPhoneActivity.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m70657Y2(SelectContactActivity selectContactActivity, View view) {
        C41536l.m120489i(selectContactActivity, "this$0");
        if (!selectContactActivity.m70650Q2()) {
            selectContactActivity.m70658Z2("money_request_type_request_contact_next_click", false);
        } else {
            selectContactActivity.m70658Z2("money_request_type_split_contact_next_click", false);
        }
        C26360b.f66777a.mo65553d(selectContactActivity);
    }

    /* renamed from: Z2 */
    private final void m70658Z2(String str, boolean z) {
        C36546y.m108282F().mo27152s("money_request", "", str);
        if (z) {
            C36546y.m108282F().mo27137H("money_request", str, "", (Bundle) null, C10464h.C10465a.FACEBOOK);
        }
    }

    /* renamed from: a3 */
    static /* synthetic */ void m70659a3(SelectContactActivity selectContactActivity, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        selectContactActivity.m70658Z2(str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_select_contact;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m70648O2().mo54579Xw(!mo54376R2());
        m70648O2().mo54578Ww(m70649P2());
        if (mo54376R2()) {
            overridePendingTransition(C10313b.slide_up, C10313b.no_change);
            C0209a supportActionBar = getSupportActionBar();
            C41536l.m120486f(supportActionBar);
            supportActionBar.mo569w(C10320i.ic_wizard_close);
        }
        C27480z1 a = C27480z1.m85226a(findViewById(C10322k.f28887r9));
        C41536l.m120488h(a, "bind(findViewById(R.id.content_layout))");
        this.f58168F = a;
        C27480z1 z1Var = null;
        if (a == null) {
            C41536l.m120506z("binding");
            a = null;
        }
        a.f70333k.f70101f.setOnFocusChangeListener(new C26704q(this));
        C27480z1 z1Var2 = this.f58168F;
        if (z1Var2 == null) {
            C41536l.m120506z("binding");
            z1Var2 = null;
        }
        z1Var2.f70333k.f70101f.addTextChangedListener(new C21802h(this));
        C27480z1 z1Var3 = this.f58168F;
        if (z1Var3 == null) {
            C41536l.m120506z("binding");
            z1Var3 = null;
        }
        z1Var3.f70333k.f70100e.setOnClickListener(new C26705r(this));
        C27480z1 z1Var4 = this.f58168F;
        if (z1Var4 == null) {
            C41536l.m120506z("binding");
            z1Var4 = null;
        }
        z1Var4.f70329g.f68404j.setOnClickListener(new C26706s(this));
        C27480z1 z1Var5 = this.f58168F;
        if (z1Var5 == null) {
            C41536l.m120506z("binding");
            z1Var5 = null;
        }
        z1Var5.f70329g.f68399e.setAdapter(this.f58169G);
        C27480z1 z1Var6 = this.f58168F;
        if (z1Var6 == null) {
            C41536l.m120506z("binding");
            z1Var6 = null;
        }
        z1Var6.f70332j.f68895f.setAdapter(this.f58170H);
        C27480z1 z1Var7 = this.f58168F;
        if (z1Var7 == null) {
            C41536l.m120506z("binding");
            z1Var7 = null;
        }
        z1Var7.f70332j.f68894e.setOnClickListener(new C26707t(this));
        this.f58169G.mo66451n(new C21803i(this));
        this.f58170H.mo66465k(new C21804j(this));
        C27480z1 z1Var8 = this.f58168F;
        if (z1Var8 == null) {
            C41536l.m120506z("binding");
        } else {
            z1Var = z1Var8;
        }
        z1Var.f70331i.setOnClickListener(new C26708u(this));
        m70651S2();
    }

    /* renamed from: R2 */
    public final boolean mo54376R2() {
        return ((Boolean) this.f58172J.getValue()).booleanValue();
    }

    public void finish() {
        super.finish();
        if (mo54376R2()) {
            overridePendingTransition(C10313b.no_change, C10313b.slide_down);
        }
    }

    /* renamed from: k0 */
    public void mo53864k0() {
        C35893a.m106783a(this).mo88137d(AdvancedWizardActivity.class).mo88134a(new WizardObject().setInputStyle(3).setInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE).setInputTitle(getString(C10328q.edit_contact_hint_phone_number)).setMobileNumberInputContactPermissionTextId(C10328q.money_request_msg_info_contacts_permission).setShowMobileNumberIndexPrefix(Boolean.FALSE)).mo88139f(new BaseWizardPlugin()).mo88138e(9901).mo88142i();
    }

    /* renamed from: l */
    public void mo53865l() {
        this.f58169G.mo66446i();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        ArrayList<String> stringArrayListExtra;
        if (i == 9901) {
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("WIZARD_NEXT_BTN_CLICKED", false);
            }
            if (z) {
                if (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra(BaseWizardPlugin.WIZARD_DATA)) == null) {
                    str = null;
                } else {
                    str = (String) C41358y.m120009Y(stringArrayListExtra);
                }
                m70648O2().mo54572Pw(str);
            }
        } else if (i != 50005) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!m70650Q2()) {
            m70659a3(this, "money_request_type_request_page_view", false, 2, (Object) null);
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.money_request_search_header);
        C41536l.m120488h(string, "getString(R.string.money_request_search_header)");
        return string;
    }
}

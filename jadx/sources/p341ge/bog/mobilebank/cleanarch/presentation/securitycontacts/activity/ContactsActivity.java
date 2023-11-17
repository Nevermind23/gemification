package p341ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity;

import a81.C30772sa;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.C11398b;
import g91.C32297d;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import iu0.C36546y;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p420fh.C12902d;
import p420fh.C12910e;
import p891su.C28269e;
import p90.C27281d7;
import p90.C27291e7;
import p90.C27301f7;
import p90.C27460x;
import r30.C27895b;
import ue1.C43064a;
import ue1.C43075l;
import v50.C28992a;
import v50.C28993b;
import v50.C28994c;
import v50.C28995d;
import v50.C28996e;
import v50.C28997f;
import w50.C29227a;
import y50.C29923a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity */
public final class ContactsActivity extends C30772sa implements C41185v.C41186a {

    /* renamed from: O */
    public static final C22407a f59333O = new C22407a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f59334F = new C1617p0(C41520a0.m120436b(ContactsActivityViewModel.class), new C22427u(this), new C22426t(this), new C22428v((C43064a) null, this));

    /* renamed from: G */
    private C27460x f59335G;

    /* renamed from: H */
    private C27281d7 f59336H;

    /* renamed from: I */
    private C27291e7 f59337I;

    /* renamed from: J */
    private C27301f7 f59338J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public String f59339K = "";

    /* renamed from: L */
    private boolean f59340L;

    /* renamed from: M */
    private C29227a f59341M = new C29227a(new C22408b(this), new C22409c(this), new C22410d(this), new C22411e(this), new C22412f(this), new C22413g(this), new C22414h(this), new C22415i(this));

    /* renamed from: N */
    private final C22423q f59342N = new C22423q(this);

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$a */
    public static final class C22407a {
        private C22407a() {
        }

        public /* synthetic */ C22407a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m72695b(C22407a aVar, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            aVar.mo55380a(context, z);
        }

        /* renamed from: a */
        public final void mo55380a(Context context, boolean z) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, ContactsActivity.class);
            intent.putExtra("SELECTION_ENABLED", z);
            context.startActivity(intent);
        }

        /* renamed from: c */
        public final void mo55381c(Activity activity, boolean z) {
            C41536l.m120489i(activity, "activity");
            Intent intent = new Intent(activity, ContactsActivity.class);
            intent.putExtra("SELECTION_ENABLED", z);
            activity.startActivityForResult(intent, 1012);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$b */
    static final class C22408b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59343d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22408b(ContactsActivity contactsActivity) {
            super(1);
            this.f59343d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55382a(C29923a.C29925b bVar) {
            C41536l.m120489i(bVar, "it");
            if (bVar.mo70225c()) {
                this.f59343d.m72680c3().mo55410Xw(bVar, true ^ bVar.mo70224b().mo70238d());
                return;
            }
            C36546y.m108282F().mo27152s("contacts", "", "contact_click");
            ContactDetailsActivity.C21547a.m69761c(ContactDetailsActivity.f57629O, this.f59343d, ((C27895b) bVar.mo70224b().mo70237c()).mo67439g(), 0, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55382a((C29923a.C29925b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$c */
    static final class C22409c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22409c(ContactsActivity contactsActivity) {
            super(1);
            this.f59344d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55383a(C29923a.C29925b bVar) {
            String str;
            C41536l.m120489i(bVar, "it");
            TransferForm.C34932I contactId = TransferForm.startWith((Activity) this.f59344d, "TRANSFER", TransferForm.OPERATION_VIEW).setContactId(((C27895b) bVar.mo70224b().mo70237c()).mo67439g());
            if (((C27895b) bVar.mo70224b().mo70237c()).mo67438f() == C28269e.BUDGET) {
                str = TransferForm.TRANSFER_FORM_BUDGET;
            } else {
                str = TransferForm.TRANSFER_FORM_OTHER;
            }
            contactId.setTransferForm(str).setSrcAcctKey(-1).start();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55383a((C29923a.C29925b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$d */
    static final class C22410d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59345d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22410d(ContactsActivity contactsActivity) {
            super(0);
            this.f59345d = contactsActivity;
        }

        public final void invoke() {
            ContactsActivity.f59333O.mo55381c(this.f59345d, true);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$e */
    static final class C22411e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22411e(ContactsActivity contactsActivity) {
            super(1);
            this.f59346d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55384a(boolean z) {
            if (z) {
                this.f59346d.m72680c3().mo55408Uw();
            } else {
                this.f59346d.m72680c3().mo55398Ew();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55384a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$f */
    static final class C22412f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59347d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22412f(ContactsActivity contactsActivity) {
            super(1);
            this.f59347d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55385a(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            this.f59347d.m72680c3().mo55410Xw((C29923a.C29925b) mVar.mo95678e(), ((Boolean) mVar.mo95680f()).booleanValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55385a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$g */
    static final class C22413g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22413g(ContactsActivity contactsActivity) {
            super(0);
            this.f59348d = contactsActivity;
        }

        public final void invoke() {
            this.f59348d.m72680c3().mo55405Nw();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$h */
    static final class C22414h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22414h(ContactsActivity contactsActivity) {
            super(1);
            this.f59349d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55386a(C29923a.C29925b bVar) {
            C41536l.m120489i(bVar, "it");
            EditContactActivity.f57737J.mo53954a(this.f59349d, ((C27895b) bVar.mo70224b().mo70237c()).mo67439g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55386a((C29923a.C29925b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$i */
    static final class C22415i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22415i(ContactsActivity contactsActivity) {
            super(1);
            this.f59350d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55387a(C29923a.C29925b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f59350d.m72672U2(((C27895b) bVar.mo70224b().mo70237c()).mo67439g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55387a((C29923a.C29925b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$j */
    static final class C22416j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22416j(ContactsActivity contactsActivity) {
            super(1);
            this.f59351d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55388a(List list) {
            C41536l.m120489i(list, "data");
            this.f59351d.m72682e3(list);
            this.f59351d.m72687j3();
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C29923a) it.next()) instanceof C29923a.C29925b) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                this.f59351d.m72675X2().f70188g.mo53595c();
                return;
            }
            this.f59351d.m72675X2().f70188g.mo53598f();
            this.f59351d.f59339K.length();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55388a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$k */
    static final class C22417k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59352d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22417k(ContactsActivity contactsActivity) {
            super(1);
            this.f59352d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55389a(boolean z) {
            if (z) {
                this.f59352d.mo86441o2();
            } else {
                this.f59352d.mo86425J1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55389a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$l */
    static final class C22418l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22418l(ContactsActivity contactsActivity) {
            super(1);
            this.f59353d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55390a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59353d.m72675X2().f70188g.mo53596d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55390a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$m */
    static final class C22419m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22419m(ContactsActivity contactsActivity) {
            super(1);
            this.f59354d = contactsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "it");
            if (bool.booleanValue()) {
                ContactsActivity contactsActivity = this.f59354d;
                contactsActivity.mo86429X1(contactsActivity.getString(C10328q.choose_trusted_contacts));
                this.f59354d.m72676Y2().f68560e.setVisibility(0);
                this.f59354d.m72678a3().f68737e.setText(this.f59354d.getString(C10328q.cant_find_this_contact_security_process));
                return;
            }
            ContactsActivity contactsActivity2 = this.f59354d;
            contactsActivity2.mo86429X1(contactsActivity2.getString(C10328q.header_text_contacts));
            this.f59354d.m72676Y2().f68560e.setVisibility(8);
            this.f59354d.m72678a3().f68737e.setText(this.f59354d.getString(C10328q.cant_find_this_contact_contacts_page));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$n */
    static final class C22420n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59355d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22420n(ContactsActivity contactsActivity) {
            super(1);
            this.f59355d = contactsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f59355d.m72676Y2().f68560e;
            C41536l.m120488h(bool, "it");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$o */
    static final class C22421o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22421o(ContactsActivity contactsActivity) {
            super(1);
            this.f59356d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55393a(C37223a aVar) {
            C21503d dVar = (C21503d) aVar.mo90296a();
            if (dVar != null) {
                ContactsActivity contactsActivity = this.f59356d;
                if (dVar instanceof C21503d.C21504a) {
                    contactsActivity.mo52674G1((C21503d.C21504a) dVar);
                } else if (dVar instanceof C21503d.C21506c) {
                    C32297d.m95160h(contactsActivity, contactsActivity.getString(C10328q.contact_delete_success));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55393a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$p */
    static final class C22422p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59357d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22422p(ContactsActivity contactsActivity) {
            super(1);
            this.f59357d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55394a(C37223a aVar) {
            C41185v O2;
            C21503d dVar = (C21503d) aVar.mo90296a();
            if (dVar != null) {
                ContactsActivity contactsActivity = this.f59357d;
                if (dVar instanceof C21503d.C21506c) {
                    C41185v O22 = contactsActivity.m72679b3();
                    if (O22 != null) {
                        O22.mo4577k1();
                    }
                    contactsActivity.setResult(1);
                    contactsActivity.finish();
                } else if (dVar instanceof C21503d.C21504a) {
                    C21503d.C21504a aVar2 = (C21503d.C21504a) dVar;
                    if (aVar2.mo53708h()) {
                        C41185v O23 = contactsActivity.m72679b3();
                        if (O23 != null) {
                            O23.mo95634K2(C32343x.m95388F(aVar2.mo53705e(), new Object[0]));
                            return;
                        }
                        return;
                    }
                    C41185v O24 = contactsActivity.m72679b3();
                    if (O24 != null) {
                        O24.mo4577k1();
                    }
                    contactsActivity.mo52674G1(aVar2);
                } else if ((dVar instanceof C21503d.C21505b) && (O2 = contactsActivity.m72679b3()) != null) {
                    O2.mo95635L2(true);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55394a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$q */
    public static final class C22423q extends RecyclerView.C1756u {

        /* renamed from: a */
        final /* synthetic */ ContactsActivity f59358a;

        C22423q(ContactsActivity contactsActivity) {
            this.f59358a = contactsActivity;
        }

        /* renamed from: d */
        public void mo5739d(RecyclerView recyclerView, int i) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5739d(recyclerView, i);
            if (!recyclerView.canScrollVertically(1) && i == 0) {
                ContactsActivityViewModel.m72717Pw(this.f59358a.m72680c3(), (String) null, false, 3, (Object) null);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$r */
    static final class C22424r implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f59359a;

        C22424r(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f59359a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f59359a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f59359a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$s */
    static final class C22425s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivity f59360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22425s(ContactsActivity contactsActivity) {
            super(1);
            this.f59360d = contactsActivity;
        }

        /* renamed from: a */
        public final void mo55397a(String str) {
            C41536l.m120489i(str, "it");
            this.f59360d.f59339K = str;
            this.f59360d.m72680c3().mo55406Ow(this.f59360d.f59339K, false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55397a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$t */
    public static final class C22426t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59361d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22426t(ComponentActivity componentActivity) {
            super(0);
            this.f59361d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59361d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$u */
    public static final class C22427u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22427u(ComponentActivity componentActivity) {
            super(0);
            this.f59362d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59362d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity$v */
    public static final class C22428v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59363d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59364e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22428v(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59363d = aVar;
            this.f59364e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59363d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59364e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m72672U2(long j) {
        C35388f2.m105072l2(this, getString(C10328q.contact_delete_title), getString(C10328q.contact_delete_alert_msg), getString(C10328q.f28966r2), getString(C10328q.f28951b2), new C28992a(this, j), new C28993b(), true, true, "Alert", (View.OnClickListener) null, C11398b.f33140s, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m72673V2(ContactsActivity contactsActivity, long j, View view) {
        C41536l.m120489i(contactsActivity, "this$0");
        contactsActivity.m72680c3().mo55407Qw(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m72674W2(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final C27460x m72675X2() {
        C27460x xVar = this.f59335G;
        C41536l.m120486f(xVar);
        return xVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final C27281d7 m72676Y2() {
        C27281d7 d7Var = this.f59336H;
        C41536l.m120486f(d7Var);
        return d7Var;
    }

    /* renamed from: Z2 */
    private final C27291e7 m72677Z2() {
        C27291e7 e7Var = this.f59337I;
        C41536l.m120486f(e7Var);
        return e7Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final C27301f7 m72678a3() {
        C27301f7 f7Var = this.f59338J;
        C41536l.m120486f(f7Var);
        return f7Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final C41185v m72679b3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final ContactsActivityViewModel m72680c3() {
        return (ContactsActivityViewModel) this.f59334F.getValue();
    }

    /* renamed from: d3 */
    private final void m72681d3() {
        ContactsActivityViewModel c3 = m72680c3();
        C21484c.m69411c(c3.mo55412q(), this, new C22416j(this), new C22417k(this), new C22418l(this));
        c3.mo55402Kw().mo4819k(this, new C22424r(new C22419m(this)));
        c3.mo55400Iw().mo4819k(this, new C22424r(new C22420n(this)));
        c3.mo55399Fw().mo4819k(this, new C22424r(new C22421o(this)));
        c3.mo55403Lw().mo4819k(this, new C22424r(new C22422p(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m72682e3(List list) {
        m72676Y2().f68562g.setRefreshing(false);
        this.f59341M.mo6029i(list);
    }

    /* renamed from: f3 */
    private final void m72683f3() {
        m72676Y2().f68562g.setOnRefreshListener(new C28994c(this));
        m72676Y2().f68560e.setOnClickListener(new C28995d(this));
        m72677Z2().f68656e.setOnClickListener(new C28996e(this));
        m72675X2().f70187f.setOnTextChangeListener(new C22425s(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m72684g3(ContactsActivity contactsActivity) {
        C41536l.m120489i(contactsActivity, "this$0");
        contactsActivity.m72680c3().mo55406Ow(contactsActivity.f59339K, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m72685h3(ContactsActivity contactsActivity, View view) {
        C41536l.m120489i(contactsActivity, "this$0");
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, BankApi.SERVICE_CLIENTS_TRUST_OR_UNTRUST_CONNECTION, contactsActivity.m72680c3().mo55401Jw(contactsActivity.m72680c3().mo55404Mw((String) null, (String) null, (String) null)), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = contactsActivity.getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m72686i3(ContactsActivity contactsActivity, View view) {
        C41536l.m120489i(contactsActivity, "this$0");
        contactsActivity.m72680c3().mo55406Ow(contactsActivity.f59339K, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final void m72687j3() {
        m72676Y2().f68561f.post(new C28997f(this));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.ViewGroup$LayoutParams] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m72688k3(p341ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity r6) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            p90.d7 r0 = r6.m72676Y2()
            ge.bog.designsystem.components.buttons.Button r0 = r0.f68560e
            int r0 = r0.getVisibility()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L_0x001e
            p90.d7 r6 = r6.m72676Y2()
            androidx.recyclerview.widget.RecyclerView r6 = r6.f68561f
            r6.setPadding(r2, r2, r2, r2)
            return
        L_0x001e:
            p90.d7 r0 = r6.m72676Y2()
            ge.bog.designsystem.components.buttons.Button r0 = r0.f68560e
            int r0 = r0.getHeight()
            p90.d7 r1 = r6.m72676Y2()
            ge.bog.designsystem.components.buttons.Button r1 = r1.f68560e
            java.lang.String r3 = "contentBinding.nextBtn"
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r4 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r5 = 0
            if (r4 == 0) goto L_0x003f
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x0040
        L_0x003f:
            r1 = r5
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            int r1 = r1.topMargin
            goto L_0x0046
        L_0x0045:
            r1 = r2
        L_0x0046:
            p90.d7 r4 = r6.m72676Y2()
            ge.bog.designsystem.components.buttons.Button r4 = r4.f68560e
            kotlin.jvm.internal.C41536l.m120488h(r4, r3)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x005a
            r5 = r3
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
        L_0x005a:
            if (r5 == 0) goto L_0x005f
            int r3 = r5.bottomMargin
            goto L_0x0060
        L_0x005f:
            r3 = r2
        L_0x0060:
            int r1 = r1 + r3
            p90.d7 r6 = r6.m72676Y2()
            androidx.recyclerview.widget.RecyclerView r6 = r6.f68561f
            int r0 = r0 + r1
            r6.setPadding(r2, r2, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity.m72688k3(ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_contacts_select_for_secutiry;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m72680c3().mo55411Yw(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        this.f59335G = C27460x.m85146a(findViewById(C10322k.f28887r9));
        View contentView = m72675X2().f70188g.getContentView();
        C41536l.m120486f(contentView);
        this.f59336H = C27281d7.m84425a(contentView);
        View errorView = m72675X2().f70188g.getErrorView();
        C41536l.m120486f(errorView);
        this.f59337I = C27291e7.m84465a(errorView);
        View noDataView = m72675X2().f70188g.getNoDataView();
        C41536l.m120486f(noDataView);
        this.f59338J = C27301f7.m84509a(noDataView);
        boolean booleanExtra = getIntent().getBooleanExtra("SELECTION_ENABLED", false);
        this.f59340L = booleanExtra;
        if (booleanExtra) {
            mo86429X1(getString(C10328q.choose_trusted_contacts));
        } else {
            mo86429X1(getString(C10328q.header_text_contacts));
        }
        m72680c3().mo55409Vw(this.f59340L);
        m72687j3();
        m72676Y2().f68562g.setDistanceToTriggerSync(((int) (((float) 64) * getResources().getDisplayMetrics().density)) * 3);
        m72676Y2().f68561f.setLayoutManager(new LinearLayoutManager(this, 1, false));
        m72676Y2().f68561f.setAdapter(this.f59341M);
        m72676Y2().f68561f.mo5363n(this.f59342N);
        m72681d3();
        m72683f3();
        ContactsActivityViewModel.m72717Pw(m72680c3(), (String) null, false, 3, (Object) null);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12910e.m48790h(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            mo86441o2();
        } else {
            mo86425J1();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1012 && i2 == 1) {
            C12910e.m48797o(this, C32343x.m95388F("text.client.connections.trust.contact.success", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.contact_search_header);
        C41536l.m120488h(string, "getString(R.string.contact_search_header)");
        return string;
    }
}

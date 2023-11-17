package p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b50.C19333a;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.UrlHandler;
import g91.C32297d;
import g91.C32319m;
import g91.C32343x;
import g91.C32359z0;
import hc1.C41143c;
import hc1.C41185v;
import hd1.C41205b;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import j10.C25287a;
import j10.C25288b;
import j10.C25289c;
import j10.C25290d;
import j10.C25291e;
import j10.C25292f;
import j10.C25293g;
import j10.C25294h;
import j10.C25295i;
import j10.C25296j;
import j10.C25297k;
import j10.C25298l;
import j10.C25299m;
import j10.C25300n;
import j10.C25301o;
import j10.C25302p;
import j10.C25303q;
import j10.C25304r;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k10.C25546a;
import k10.C25566i;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l10.C25799a;
import m41.C37223a;
import n20.C26360b;
import p10.C27131e;
import p163m0.C7047a;
import p30.C27165f;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.C21810a;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p420fh.C12902d;
import p420fh.C12910e;
import p812kv.C25778a;
import q31.C38122f;
import q31.C38125h;
import t10.C28296a;
import t10.C28297b;
import t10.C28298c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import x50.C29649b;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity */
public final class ContactDetailsActivity extends C21585a implements C41185v.C41186a, C27131e.C27134c, C29649b.C29651b, C21810a.C21811a {

    /* renamed from: O */
    public static final C21547a f57629O = new C21547a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public Client f57630G;

    /* renamed from: H */
    private final C41217g f57631H = C41219i.m119470b(new C21574p(this));

    /* renamed from: I */
    private final C41217g f57632I = C41219i.m119470b(new C21557f(this));
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C25546a f57633J;

    /* renamed from: K */
    private final C41217g f57634K = new C1617p0(C41520a0.m120436b(ContactDetailsViewModel.class), new C21568k0(this), new C21566j0(this), new C21570l0((C43064a) null, this));

    /* renamed from: L */
    private long f57635L = -1;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public int f57636M = 6;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f57637N;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$a */
    public static final class C21547a {
        private C21547a() {
        }

        public /* synthetic */ C21547a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ void m69761c(C21547a aVar, Context context, long j, long j2, int i, Object obj) {
            if ((i & 4) != 0) {
                j2 = -1;
            }
            aVar.mo53869b(context, j, j2);
        }

        /* renamed from: a */
        public final void mo53868a(Context context, long j) {
            C41536l.m120489i(context, "context");
            m69761c(this, context, j, 0, 4, (Object) null);
        }

        /* renamed from: b */
        public final void mo53869b(Context context, long j, long j2) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, ContactDetailsActivity.class);
            intent.putExtra("CONTACT_ID", j);
            intent.putExtra("SOURCE_ACCOUNT_KEY", j2);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$a0 */
    static final class C21548a0 extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21548a0(ContactDetailsActivity contactDetailsActivity) {
            super(2);
            this.f57638d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53870a(boolean z, boolean z2) {
            C36546y.m108282F().mo27156w("accounts", "", "contact_detail_account_operation_type_filter_click", this.f57638d.m69746w3().mo53924nx());
            C25546a b3 = this.f57638d.f57633J;
            if (b3 == null) {
                C41536l.m120506z("recyclerAdapter");
                b3 = null;
            }
            b3.mo64112m0(z, z2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo53870a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$b */
    public /* synthetic */ class C21549b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57639a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                p10.e$a[] r0 = p10.C27131e.C27132a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p10.e$a r1 = p10.C27131e.C27132a.ActionVerify     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p10.e$a r1 = p10.C27131e.C27132a.ActionRemoveVerification     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                p10.e$a r1 = p10.C27131e.C27132a.ActionEdit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                p10.e$a r1 = p10.C27131e.C27132a.ActionDelete     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f57639a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity.C21549b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$b0 */
    static final class C21550b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21550b0(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57640d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53871a(String str) {
            C41536l.m120489i(str, "it");
            C36546y.m108282F().mo27156w("accounts", "", "contact_detail_account_default_click", this.f57640d.m69746w3().mo53924nx());
            this.f57640d.m69746w3().mo53918gy(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53871a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$c */
    static final class C21551c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21551c(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57641d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53872a(C25799a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f57641d.m69747x3().mo53595c();
            this.f57641d.m69717S3(aVar);
            this.f57641d.m69713Q3();
            this.f57641d.m69683A3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53872a((C25799a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$c0 */
    static final class C21552c0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21552c0(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57642d = contactDetailsActivity;
        }

        public final void invoke() {
            C38122f c = C38125h.m112238c(this.f57642d);
            Long valueOf = Long.valueOf(this.f57642d.m69746w3().mo53922lx().mo53804d());
            Long a = this.f57642d.m69746w3().mo53922lx().mo53802a();
            Integer valueOf2 = Integer.valueOf(this.f57642d.f57636M);
            FragmentManager supportFragmentManager = this.f57642d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            c.mo91640y(valueOf, a, valueOf2, supportFragmentManager);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$d */
    static final class C21553d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21553d(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57643d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53873a(boolean z) {
            if (z) {
                this.f57643d.m69747x3().mo53597e();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53873a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$d0 */
    static final class C21554d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21554d0(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57644d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53874a(String str) {
            C41536l.m120489i(str, "it");
            C36546y.m108282F().mo27156w("accounts", "", "contact_detail_account_click", this.f57644d.m69746w3().mo53924nx());
            C32359z0.m95596x(str);
            ContactDetailsActivity contactDetailsActivity = this.f57644d;
            String string = contactDetailsActivity.getString(C10328q.text_account_number_copied);
            C41536l.m120488h(string, "getString(R.string.text_account_number_copied)");
            C12910e.m48785c(contactDetailsActivity, string, (C12902d.C12905b) null, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53874a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$e */
    static final class C21555e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21555e(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57645d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53875a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f57645d.m69747x3().mo53596d();
            this.f57645d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53875a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$e0 */
    static final class C21556e0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21556e0(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57646d = contactDetailsActivity;
        }

        public final void invoke() {
            C36546y.m108282F().mo27156w("accounts", "", "contact_detail_transfer_click", this.f57646d.m69746w3().mo53924nx());
            ContactDetailsActivity.m69711P3(this.f57646d, (String) null, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$f */
    static final class C21557f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21557f(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57647d = contactDetailsActivity;
        }

        /* renamed from: b */
        public final StateView invoke() {
            return (StateView) this.f57647d.findViewById(C10322k.f28746Hv);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$f0 */
    static final class C21558f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57648d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21558f0(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57648d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53877a(String str) {
            C41536l.m120489i(str, "acctNo");
            C36546y.m108282F().mo27156w("accounts", "", "contact_detail_account_delete_click", this.f57648d.m69746w3().mo53924nx());
            ContactDetailsActivity contactDetailsActivity = this.f57648d;
            contactDetailsActivity.m69734j3(str, contactDetailsActivity.m69746w3().mo53905Px());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53877a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$g */
    static final class C21559g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57649d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21559g(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57649d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53878a(String str) {
            C25546a b3 = this.f57649d.f57633J;
            if (b3 == null) {
                C41536l.m120506z("recyclerAdapter");
                b3 = null;
            }
            C41536l.m120488h(str, "it");
            b3.mo64087M(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53878a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$g0 */
    static final class C21560g0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57650d;

        /* renamed from: e */
        final /* synthetic */ ContactDetailsActivity f57651e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21560g0(ContactDetailsActivity contactDetailsActivity, ContactDetailsActivity contactDetailsActivity2) {
            super(1);
            this.f57650d = contactDetailsActivity;
            this.f57651e = contactDetailsActivity2;
        }

        /* renamed from: a */
        public final void mo53879a(String str) {
            C41536l.m120489i(str, "it");
            C32359z0.m95583n0(this.f57650d, str, this.f57651e.getString(C10328q.f28961m2));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53879a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$h */
    static final class C21561h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57652d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21561h(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57652d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53880a(C28296a aVar) {
            C25546a b3 = this.f57652d.f57633J;
            if (b3 == null) {
                C41536l.m120506z("recyclerAdapter");
                b3 = null;
            }
            C41536l.m120488h(aVar, "it");
            b3.mo64118s0(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53880a((C28296a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$h0 */
    static final class C21562h0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21562h0(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57653d = contactDetailsActivity;
        }

        public final void invoke() {
            this.f57653d.m69744t3();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$i */
    static final class C21563i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21563i(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57654d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53881a(List list) {
            C25546a b3 = this.f57654d.f57633J;
            if (b3 == null) {
                C41536l.m120506z("recyclerAdapter");
                b3 = null;
            }
            C41536l.m120488h(list, "it");
            b3.mo64100a0(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53881a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$i0 */
    static final class C21564i0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21564i0(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57655d = contactDetailsActivity;
        }

        public final void invoke() {
            this.f57655d.m69743s3();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$j */
    static final class C21565j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21565j(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57656d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53882a(C37223a aVar) {
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                ContactDetailsActivity contactDetailsActivity = this.f57656d;
                if (bool.booleanValue()) {
                    C26360b.f66777a.mo65554f(contactDetailsActivity);
                } else {
                    C26360b.f66777a.mo65556h(contactDetailsActivity);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53882a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$j0 */
    public static final class C21566j0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21566j0(ComponentActivity componentActivity) {
            super(0);
            this.f57657d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f57657d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$k */
    static final class C21567k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21567k(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57658d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53883a(C37223a aVar) {
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                ContactDetailsActivity contactDetailsActivity = this.f57658d;
                contactDetailsActivity.f57637N = bool.booleanValue();
                new C21810a().mo4576A1(contactDetailsActivity.getSupportFragmentManager(), "tag");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53883a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$k0 */
    public static final class C21568k0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21568k0(ComponentActivity componentActivity) {
            super(0);
            this.f57659d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57659d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$l */
    static final class C21569l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21569l(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57660d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53884a(List list) {
            C41536l.m120489i(list, "it");
            C25546a b3 = this.f57660d.f57633J;
            if (b3 == null) {
                C41536l.m120506z("recyclerAdapter");
                b3 = null;
            }
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C19333a.m64785d((AccountOperation) it.next()));
            }
            b3.mo64121v0(arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53884a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$l0 */
    public static final class C21570l0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57661d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f57662e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21570l0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f57661d = aVar;
            this.f57662e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57661d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57662e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$m */
    static final class C21571m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21571m(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57663d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53885a(boolean z) {
            C25546a b3 = this.f57663d.f57633J;
            if (b3 == null) {
                C41536l.m120506z("recyclerAdapter");
                b3 = null;
            }
            b3.mo64116q0(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53885a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$n */
    static final class C21572n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21572n(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57664d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53886a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            C25546a b3 = this.f57664d.f57633J;
            if (b3 == null) {
                C41536l.m120506z("recyclerAdapter");
                b3 = null;
            }
            b3.mo64095V();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53886a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$o */
    static final class C21573o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21573o(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57665d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53887a(C28296a aVar) {
            C25546a b3 = this.f57665d.f57633J;
            if (b3 == null) {
                C41536l.m120506z("recyclerAdapter");
                b3 = null;
            }
            C41536l.m120488h(aVar, "it");
            b3.mo64086K(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53887a((C28296a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$p */
    static final class C21574p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21574p(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57666d = contactDetailsActivity;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f57666d.findViewById(C10322k.f28712Br);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$q */
    static final class C21575q implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f57667a;

        C21575q(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f57667a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f57667a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f57667a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$r */
    /* synthetic */ class C21576r implements C25566i.C25567a, C41532h {
        C21576r() {
        }

        /* renamed from: a */
        public final void mo53891a(C25778a aVar) {
            C41536l.m120489i(aVar, "p0");
            ContactDetailsActivity.this.m69705M3(aVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C25566i.C25567a) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(1, ContactDetailsActivity.this, ContactDetailsActivity.class, "onMoneyRequestClicked", "onMoneyRequestClicked(Lge/bog/mobilebank/cleanarch/domain/moneyrequest/getrequest/model/ContactMoneyRequest;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$s */
    static final class C21577s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57669d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21577s(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57669d = contactDetailsActivity;
        }

        public final void invoke() {
            this.f57669d.m69746w3().mo53908Sx();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$t */
    static final class C21578t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57670d;

        /* renamed from: e */
        final /* synthetic */ C25546a f57671e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21578t(ContactDetailsActivity contactDetailsActivity, C25546a aVar) {
            super(0);
            this.f57670d = contactDetailsActivity;
            this.f57671e = aVar;
        }

        public final void invoke() {
            this.f57670d.m69746w3().mo53909Wx();
            this.f57671e.mo64097X(this.f57670d.m69746w3().mo53922lx());
            this.f57670d.m69746w3().mo53908Sx();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$u */
    static final class C21579u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21579u(ContactDetailsActivity contactDetailsActivity) {
            super(1);
            this.f57672d = contactDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53894a(View view) {
            C41536l.m120489i(view, "view");
            C36546y.m108282F().mo27156w("accounts", "", "contact_detail_account_add_click", this.f57672d.m69746w3().mo53924nx());
            ContactDetailsActivity contactDetailsActivity = this.f57672d;
            contactDetailsActivity.m69707N3(view, contactDetailsActivity.m69746w3().mo53905Px());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53894a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$v */
    static final class C21580v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57673d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21580v(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57673d = contactDetailsActivity;
        }

        public final void invoke() {
            C36546y.m108282F().mo27156w("accounts", "", "contact_detail_accounts_tab_click", this.f57673d.m69746w3().mo53924nx());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$w */
    static final class C21581w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57674d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21581w(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57674d = contactDetailsActivity;
        }

        public final void invoke() {
            C36546y.m108282F().mo27156w("accounts", "", "contact_detail_operations_tab_click", this.f57674d.m69746w3().mo53924nx());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$x */
    static final class C21582x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57675d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21582x(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57675d = contactDetailsActivity;
        }

        public final void invoke() {
            C36546y.m108282F().mo27156w("accounts", "", "contact_detail_options_click", this.f57675d.m69746w3().mo53924nx());
            C27131e.f68116F.mo66432a(this.f57675d.m69746w3().mo53907Rx().get(), this.f57675d.m69746w3().mo53923mx().get()).mo4576A1(this.f57675d.getSupportFragmentManager(), "contact_detail_settings_dialog_fragment");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$y */
    static final class C21583y extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57676d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21583y(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57676d = contactDetailsActivity;
        }

        public final void invoke() {
            C36546y.m108282F().mo27152s("money_request", "", "money_request_initiate_contact_money_request_click");
            this.f57676d.m69746w3().mo53904Lx(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$z */
    static final class C21584z extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ContactDetailsActivity f57677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21584z(ContactDetailsActivity contactDetailsActivity) {
            super(0);
            this.f57677d = contactDetailsActivity;
        }

        public final void invoke() {
            C36546y.m108282F().mo27152s("money_request", "", "money_request_initiate_contact_bill_split_click");
            this.f57677d.m69746w3().mo53904Lx(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public final void m69683A3() {
        m69746w3().mo53895Ax().mo4819k(this, new C21575q(new C21565j(this)));
        m69746w3().mo53899Ex().mo4819k(this, new C21575q(new C21567k(this)));
        C21484c.m69411c(m69746w3().mo53900Fx(), this, new C21569l(this), new C21571m(this), new C21572n(this));
        m69746w3().mo53931yx().mo4819k(this, new C25287a(this));
        m69746w3().mo53898Dx().mo4819k(this, new C25297k(this));
        C41205b F0 = m69746w3().mo53920jx().mo94981F0(new C25298l(new C21573o(this)));
        C41536l.m120488h(F0, "private fun observeDataC…       }\n        })\n    }");
        mo86438k1(F0);
        m69746w3().mo53896Bx().mo4819k(this, new C25299m(this));
        C41205b F02 = m69746w3().mo53929wx().mo94981F0(new C25300n(new C21559g(this)));
        C41536l.m120488h(F02, "private fun observeDataC…       }\n        })\n    }");
        mo86438k1(F02);
        C41205b F03 = m69746w3().mo53919ix().mo94981F0(new C25301o(new C21561h(this)));
        C41536l.m120488h(F03, "private fun observeDataC…       }\n        })\n    }");
        mo86438k1(F03);
        m69746w3().mo53927ux().mo4819k(this, new C25302p(this));
        m69746w3().mo53928vx().mo4819k(this, new C25303q(this));
        m69746w3().mo53930xx().mo4819k(this, new C25304r(this));
        m69746w3().mo53906Qx().mo4819k(this, new C25288b(this));
        m69746w3().mo53932zx().mo4819k(this, new C21575q(new C21563i(this)));
        m69746w3().mo53901Ix().mo4819k(this, new C25296j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m69684B3(ContactDetailsActivity contactDetailsActivity, BigDecimal bigDecimal) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C25546a aVar = contactDetailsActivity.f57633J;
        if (aVar == null) {
            C41536l.m120506z("recyclerAdapter");
            aVar = null;
        }
        C41536l.m120488h(bigDecimal, "it");
        aVar.mo64099Z(C32343x.m95408P(bigDecimal, "GEL"));
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m69685C3(ContactDetailsActivity contactDetailsActivity, C37223a aVar) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C21503d dVar = (C21503d) aVar.mo90296a();
        if (dVar == null) {
            return;
        }
        if (dVar instanceof C21503d.C21506c) {
            contactDetailsActivity.finish();
        } else if (dVar instanceof C21503d.C21504a) {
            contactDetailsActivity.mo52674G1((C21503d.C21504a) dVar);
        }
    }

    /* renamed from: D0 */
    private final void m69686D0() {
        C21484c.m69411c(m69746w3().mo53926tx(), this, new C21551c(this), new C21553d(this), new C21555e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m69687D3(ContactDetailsActivity contactDetailsActivity, Boolean bool) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C25546a aVar = contactDetailsActivity.f57633J;
        if (aVar == null) {
            C41536l.m120506z("recyclerAdapter");
            aVar = null;
        }
        C41536l.m120488h(bool, "it");
        aVar.mo64119t0(bool.booleanValue());
        contactDetailsActivity.m69746w3().mo53908Sx();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m69689E3(ContactDetailsActivity contactDetailsActivity, C37223a aVar) {
        C41185v z3;
        String str;
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C21503d dVar = (C21503d) aVar.mo90296a();
        if (dVar == null) {
            return;
        }
        if (dVar instanceof C21503d.C21506c) {
            C41185v z32 = contactDetailsActivity.m69749z3();
            if (z32 != null) {
                z32.mo4577k1();
            }
            C27131e v3 = contactDetailsActivity.m69745v3();
            if (v3 != null) {
                v3.mo4577k1();
            }
            C25546a aVar2 = contactDetailsActivity.f57633J;
            if (aVar2 == null) {
                C41536l.m120506z("recyclerAdapter");
                aVar2 = null;
            }
            aVar2.mo64117r0();
            C25546a aVar3 = contactDetailsActivity.f57633J;
            if (aVar3 == null) {
                C41536l.m120506z("recyclerAdapter");
                aVar3 = null;
            }
            if (aVar3.mo64091R()) {
                str = "text.client.connections.trust.contact.success";
            } else {
                str = "text.client.connections.untrust.contact.success";
            }
            C12910e.m48794l(contactDetailsActivity, C32343x.m95388F(str, new Object[0]), (C12902d.C12905b) null, true);
        } else if (dVar instanceof C21503d.C21504a) {
            C21503d.C21504a aVar4 = (C21503d.C21504a) dVar;
            if (aVar4.mo53708h()) {
                C41185v z33 = contactDetailsActivity.m69749z3();
                if (z33 != null) {
                    z33.mo95634K2(C32343x.m95388F(aVar4.mo53705e(), new Object[0]));
                    return;
                }
                return;
            }
            C41185v z34 = contactDetailsActivity.m69749z3();
            if (z34 != null) {
                z34.mo4577k1();
            }
            contactDetailsActivity.mo52674G1(aVar4);
        } else if ((dVar instanceof C21503d.C21505b) && (z3 = contactDetailsActivity.m69749z3()) != null) {
            z3.mo95635L2(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static final void m69691F3(ContactDetailsActivity contactDetailsActivity, BigDecimal bigDecimal) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C25546a aVar = contactDetailsActivity.f57633J;
        if (aVar == null) {
            C41536l.m120506z("recyclerAdapter");
            aVar = null;
        }
        C41536l.m120488h(bigDecimal, "it");
        aVar.mo64111l0(C32343x.m95408P(bigDecimal, "GEL"));
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public static final void m69693G3(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public static final void m69695H3(ContactDetailsActivity contactDetailsActivity, C37223a aVar) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C21503d dVar = (C21503d) aVar.mo90296a();
        if (dVar == null) {
            return;
        }
        if (dVar instanceof C21503d.C21506c) {
            Object a = dVar.mo53701a();
            C41536l.m120486f(a);
            C32297d.m95160h(contactDetailsActivity, contactDetailsActivity.getString(((Number) a).intValue()));
        } else if (dVar instanceof C21503d.C21504a) {
            contactDetailsActivity.mo52674G1((C21503d.C21504a) dVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static final void m69697I3(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public static final void m69699J3(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public static final void m69701K3(ContactDetailsActivity contactDetailsActivity, C28297b bVar) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C25546a aVar = contactDetailsActivity.f57633J;
        if (aVar == null) {
            C41536l.m120506z("recyclerAdapter");
            aVar = null;
        }
        C41536l.m120488h(bVar, "it");
        aVar.mo64120u0(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static final void m69703L3(ContactDetailsActivity contactDetailsActivity, C28298c cVar) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C25546a aVar = contactDetailsActivity.f57633J;
        if (aVar == null) {
            C41536l.m120506z("recyclerAdapter");
            aVar = null;
        }
        C41536l.m120488h(cVar, "it");
        aVar.mo64122w0(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public final void m69705M3(C25778a aVar) {
        if (aVar.mo64378g()) {
            C27165f.C27166a.m84164b(C27165f.f68169N, aVar.mo64374d(), false, 2, (Object) null).mo4576A1(getSupportFragmentManager(), "MONEY_REQUEST_BOTTOM_SHEET");
        } else {
            MoneyRequestDetailsActivity.f58221M.mo54420a(this, aVar.mo64374d());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public final void m69707N3(View view, boolean z) {
        WizardObject wizardObject;
        C35893a.C35894a a = C35893a.m106783a(this);
        if (z) {
            WizardObject inputType = new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_NUM_DIGIT);
            Resources resources = getResources();
            int i = C10328q.contact_treasury_wizard_title;
            wizardObject = inputType.setInputTitle(resources.getString(i)).setPageTitle(getResources().getString(i)).setValidatePattern("([0-9]{9})");
        } else {
            WizardObject inputType2 = new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
            Resources resources2 = getResources();
            int i2 = C10328q.f28961m2;
            wizardObject = inputType2.setInputTitle(resources2.getString(i2)).setPageTitle(getResources().getString(i2)).setValidatePattern("([a-zA-Z0-9]{6,})");
        }
        a.mo88134a(wizardObject).mo88136c(view).mo88138e(10031).mo88142i();
    }

    /* renamed from: O3 */
    private final void m69709O3(String str) {
        String str2;
        TransferForm.C34932I contactId = TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setContactId(m69746w3().mo53925ox());
        if (m69746w3().mo53905Px()) {
            str2 = TransferForm.TRANSFER_FORM_BUDGET;
        } else {
            str2 = TransferForm.TRANSFER_FORM_OTHER;
        }
        TransferForm.C34932I srcAcctKey = contactId.setTransferForm(str2).setSrcAcctKey(this.f57635L);
        if (str != null) {
            srcAcctKey.setDestinationAcctNo(str);
        }
        srcAcctKey.start();
    }

    /* renamed from: P3 */
    static /* synthetic */ void m69711P3(ContactDetailsActivity contactDetailsActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        contactDetailsActivity.m69709O3(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public final void m69713Q3() {
        getSupportFragmentManager().mo4367F1("REQUEST_DATES", this, new C25293g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public static final void m69715R3(ContactDetailsActivity contactDetailsActivity, String str, Bundle bundle) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        contactDetailsActivity.m69746w3().mo53911Yx(new FilterValue.Calendar(bundle.getLong("PARAM_KEY_START_DATE", -1), Long.valueOf(bundle.getLong("PARAM_KEY_END_DATE", -1)), (Long) null, Long.valueOf(C32319m.m95305l())));
        contactDetailsActivity.f57636M = bundle.getInt("PARAM_KEY_MONTHS", -1);
        C25546a aVar = contactDetailsActivity.f57633J;
        if (aVar == null) {
            C41536l.m120506z("recyclerAdapter");
            aVar = null;
        }
        aVar.mo64097X(contactDetailsActivity.m69746w3().mo53922lx());
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public final void m69717S3(C25799a aVar) {
        C25546a aVar2 = new C25546a(aVar.mo64420a(), aVar.mo64423d(), aVar.mo64424e(), aVar.mo64426f(), aVar.mo64422c(), aVar.mo64427g(), aVar.mo64421b(), new C21576r());
        aVar2.mo64106g0(new C21548a0(this));
        aVar2.mo64114o0(new C21550b0(this));
        aVar2.mo64102c0(new C21552c0(this));
        aVar2.mo64096W(new C21554d0(this));
        aVar2.mo64094U(new C21556e0(this));
        aVar2.mo64098Y(new C21558f0(this));
        aVar2.mo64113n0(new C21560g0(this, this));
        aVar2.mo64104e0(new C21562h0(this));
        aVar2.mo64103d0(new C21564i0(this));
        aVar2.mo64097X(m69746w3().mo53921kx());
        aVar2.mo64109j0(new C21577s(this));
        aVar2.mo64110k0(new C21578t(this, aVar2));
        aVar2.mo64107h0(new C21579u(this));
        aVar2.mo64101b0(new C21580v(this));
        aVar2.mo64105f0(new C21581w(this));
        aVar2.mo64108i0(new C21582x(this));
        aVar2.mo64093T(new C21583y(this));
        aVar2.mo64092S(new C21584z(this));
        this.f57633J = aVar2;
        RecyclerView y3 = m69748y3();
        C25546a aVar3 = this.f57633J;
        if (aVar3 == null) {
            C41536l.m120506z("recyclerAdapter");
            aVar3 = null;
        }
        y3.setAdapter(aVar3);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final void m69734j3(String str, boolean z) {
        C41224m mVar;
        if (z) {
            mVar = C41233s.m119492a(getString(C10328q.contact_treasury_code_delete_popup), getString(C10328q.contact_treasury_code_delete_confirm));
        } else {
            mVar = C41233s.m119492a(getString(C10328q.contact_account_delete_title), getString(C10328q.contact_account_delete_alert_msg));
        }
        String str2 = str;
        C35388f2.m105072l2(this, (String) mVar.mo95675a(), (String) mVar.mo95676b(), getString(C10328q.f28966r2), getString(C10328q.f28951b2), new C25289c(this, str), new C25290d(), true, true, "Alert", (View.OnClickListener) null, C11398b.f33140s, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m69735k3(ContactDetailsActivity contactDetailsActivity, String str, View view) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C41536l.m120489i(str, "$acctNo");
        contactDetailsActivity.m69746w3().mo53915cx(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m69736l3(View view) {
    }

    /* renamed from: m3 */
    private final void m69737m3() {
        C35388f2.m105072l2(this, getString(C10328q.contact_delete_title), getString(C10328q.contact_delete_alert_msg), getString(C10328q.f28966r2), getString(C10328q.f28951b2), new C25291e(this), new C25292f(), true, true, "Alert", (View.OnClickListener) null, C11398b.f33140s, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m69738n3(ContactDetailsActivity contactDetailsActivity, View view) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        contactDetailsActivity.m69746w3().mo53917fx();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m69739o3(View view) {
    }

    /* renamed from: p3 */
    private final void m69740p3() {
        String str;
        String string = getString(C10328q.remove_contact_verification);
        if (mo53867u3().getUserInfo().isSolo()) {
            str = getString(C10328q.contact_remove_verification_confirm_solo);
        } else {
            str = getString(C10328q.contact_remove_verification_confirm_retail);
        }
        C35388f2.m105072l2(this, string, str, getString(C10328q.f28966r2), getString(C10328q.f28951b2), new C25294h(this), new C25295i(), true, true, "Alert", (View.OnClickListener) null, C11398b.f33140s, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m69741q3(ContactDetailsActivity contactDetailsActivity, View view) {
        C41536l.m120489i(contactDetailsActivity, "this$0");
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, BankApi.SERVICE_CLIENTS_TRUST_OR_UNTRUST_CONNECTION, contactDetailsActivity.m69746w3().mo53897Cx(contactDetailsActivity.m69746w3().mo53902Jx((String) null, (String) null, (String) null)), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = contactDetailsActivity.getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m69742r3(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final void m69743s3() {
        C36546y.m108282F().mo27156w("accounts", "", "contact_detail_options_delete_click", m69746w3().mo53924nx());
        m69737m3();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final void m69744t3() {
        C36546y.m108282F().mo27156w("accounts", "", "contact_detail_options_edit_click", m69746w3().mo53924nx());
        EditContactActivity.f57737J.mo53954a(this, m69746w3().mo53925ox());
    }

    /* renamed from: v3 */
    private final C27131e m69745v3() {
        Fragment k0 = getSupportFragmentManager().mo4418k0("contact_detail_settings_dialog_fragment");
        if (k0 instanceof C27131e) {
            return (C27131e) k0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final ContactDetailsViewModel m69746w3() {
        return (ContactDetailsViewModel) this.f57634K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final StateView m69747x3() {
        Object value = this.f57632I.getValue();
        C41536l.m120488h(value, "<get-loadingView>(...)");
        return (StateView) value;
    }

    /* renamed from: y3 */
    private final RecyclerView m69748y3() {
        Object value = this.f57631H.getValue();
        C41536l.m120488h(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: z3 */
    private final C41185v m69749z3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: J */
    public void mo53863J(C27131e.C27132a aVar) {
        int i;
        C41536l.m120489i(aVar, UrlHandler.ACTION);
        int i2 = C21549b.f57639a[aVar.ordinal()];
        if (i2 == 1) {
            C29649b.C29650a aVar2 = C29649b.f74819G;
            int i3 = C10328q.trusted_contact;
            if (mo53867u3().getUserInfo().isSolo()) {
                i = C10328q.security_dialog_description_on_contact_detail_solo;
            } else {
                i = C10328q.security_dialog_description_on_contact_detail_retail;
            }
            aVar2.mo69571a(i3, i, C10328q.contact_verification).mo4576A1(getSupportFragmentManager(), (String) null);
        } else if (i2 == 2) {
            m69740p3();
        } else if (i2 == 3) {
            m69744t3();
        } else if (i2 == 4) {
            m69743s3();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.layout_contact_details;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m69746w3().mo53916cy(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        long longExtra = getIntent().getLongExtra("CONTACT_ID", -1);
        this.f57635L = getIntent().getLongExtra("SOURCE_ACCOUNT_KEY", -1);
        m69748y3().setLayoutManager(new LinearLayoutManager(this));
        m69686D0();
        m69746w3().mo53913Zx(longExtra);
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

    /* renamed from: k0 */
    public void mo53864k0() {
        int i;
        C35893a.C35894a f = C35893a.m106783a(this).mo88137d(AdvancedWizardActivity.class).mo88134a(new WizardObject().setInputStyle(3).setInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE).setInputTitle(getString(C10328q.edit_contact_hint_phone_number)).setMobileNumberInputContactPermissionTextId(C10328q.money_request_msg_info_contacts_permission).setShowMobileNumberIndexPrefix(Boolean.FALSE)).mo88139f(new BaseWizardPlugin());
        if (this.f57637N) {
            i = 1314;
        } else {
            i = 1313;
        }
        f.mo88138e(i).mo88142i();
        this.f57637N = false;
    }

    /* renamed from: l */
    public void mo53865l() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            r6 = 1
            r0 = 0
            if (r7 == 0) goto L_0x0011
            java.lang.String r1 = "WIZARD_NEXT_BTN_CLICKED"
            boolean r1 = r7.getBooleanExtra(r1, r0)
            if (r1 != r6) goto L_0x0011
            r1 = r6
            goto L_0x0012
        L_0x0011:
            r1 = r0
        L_0x0012:
            if (r1 == 0) goto L_0x0053
            r1 = 1313(0x521, float:1.84E-42)
            r2 = 0
            r3 = 1314(0x522, float:1.841E-42)
            if (r5 == r1) goto L_0x0039
            if (r5 == r3) goto L_0x0039
            r6 = 10031(0x272f, float:1.4056E-41)
            if (r5 == r6) goto L_0x0022
            goto L_0x0053
        L_0x0022:
            ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel r5 = r4.m69746w3()
            java.lang.String r6 = "WIZARD_COLLECTED_VALUES"
            java.util.ArrayList r6 = r7.getStringArrayListExtra(r6)
            if (r6 == 0) goto L_0x0035
            java.lang.Object r6 = r6.get(r0)
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
        L_0x0035:
            r5.mo53912Zw(r2)
            goto L_0x0053
        L_0x0039:
            if (r5 != r3) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r6 = r0
        L_0x003d:
            java.lang.String r5 = "WIZARD_DATA"
            java.util.ArrayList r5 = r7.getStringArrayListExtra(r5)
            if (r5 == 0) goto L_0x004c
            java.lang.Object r5 = ie1.C41358y.m120009Y(r5)
            r2 = r5
            java.lang.String r2 = (java.lang.String) r2
        L_0x004c:
            ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel r5 = r4.m69746w3()
            r5.mo53903Kx(r2, r6)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* renamed from: t0 */
    public void mo53866t0() {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, BankApi.SERVICE_CLIENTS_TRUST_OR_UNTRUST_CONNECTION, m69746w3().mo53897Cx(m69746w3().mo53902Jx((String) null, (String) null, (String) null)), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: u3 */
    public final Client mo53867u3() {
        Client client = this.f57630G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.contact_search_header);
        C41536l.m120488h(string, "getString(R.string.contact_search_header)");
        return string;
    }
}

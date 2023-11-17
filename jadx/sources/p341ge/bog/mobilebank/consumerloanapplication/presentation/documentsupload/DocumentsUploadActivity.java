package p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b90.C19343a;
import b90.C19344b;
import b90.C19345c;
import b90.C19346d;
import b90.C19347e;
import b90.C19356n;
import g91.C32319m;
import g91.C32343x;
import g91.C32358z;
import h80.C24905l;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.model.CreditAppLoanDetails;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.domain.prepareapplication.model.ApplicationDetails;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.C22633b;
import p341ge.bog.mobilebank.model.Application;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity */
public final class DocumentsUploadActivity extends C22642c {

    /* renamed from: N */
    public static final C22617a f59725N = new C22617a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C22633b.C22638d f59726G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C24905l f59727H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C19356n f59728I;

    /* renamed from: J */
    private final C41217g f59729J = C41219i.m119470b(new C22618b(this));

    /* renamed from: K */
    private final C41217g f59730K = C41219i.m119470b(new C22620d(this));

    /* renamed from: L */
    private final C41217g f59731L = new C1617p0(C41520a0.m120436b(C22633b.class), new C22628l(this), new C22630n(this), new C22629m((C43064a) null, this));

    /* renamed from: M */
    private final C0173b f59732M;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$a */
    public static final class C22617a {
        private C22617a() {
        }

        public /* synthetic */ C22617a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56021a(Context context, Application application, boolean z) {
            String str;
            C41536l.m120489i(context, "context");
            C41536l.m120489i(application, "application");
            Intent intent = new Intent(context, DocumentsUploadActivity.class);
            long appId = application.getAppId();
            long createDate = application.getCreateDate();
            CreditAppLoanDetails loanDetails = application.getLoanDetails();
            if (loanDetails != null) {
                str = loanDetails.mo53431b();
            } else {
                str = null;
            }
            intent.putExtra("EXTRA_APPLICATION", new ApplicationDetails(appId, createDate, str));
            intent.putExtra("EXTRA_CLA", z);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$b */
    static final class C22618b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DocumentsUploadActivity f59733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22618b(DocumentsUploadActivity documentsUploadActivity) {
            super(0);
            this.f59733d = documentsUploadActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getExtras();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p341ge.bog.mobilebank.consumerloanapplication.domain.prepareapplication.model.ApplicationDetails invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity r0 = r2.f59733d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0017
                android.os.Bundle r0 = r0.getExtras()
                if (r0 == 0) goto L_0x0017
                java.lang.String r1 = "EXTRA_APPLICATION"
                android.os.Parcelable r0 = r0.getParcelable(r1)
                ge.bog.mobilebank.consumerloanapplication.domain.prepareapplication.model.ApplicationDetails r0 = (p341ge.bog.mobilebank.consumerloanapplication.domain.prepareapplication.model.ApplicationDetails) r0
                goto L_0x0018
            L_0x0017:
                r0 = 0
            L_0x0018:
                kotlin.jvm.internal.C41536l.m120486f(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity.C22618b.invoke():ge.bog.mobilebank.consumerloanapplication.domain.prepareapplication.model.ApplicationDetails");
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$c */
    static final class C22619c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DocumentsUploadActivity f59734d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22619c(DocumentsUploadActivity documentsUploadActivity) {
            super(1);
            this.f59734d = documentsUploadActivity;
        }

        /* renamed from: a */
        public final void mo56023a(int i) {
            this.f59734d.m73306V2().mo56043yw().mo47551Ch(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56023a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$d */
    static final class C22620d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DocumentsUploadActivity f59735d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22620d(DocumentsUploadActivity documentsUploadActivity) {
            super(0);
            this.f59735d = documentsUploadActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getExtras();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity r0 = r2.f59735d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0015
                android.os.Bundle r0 = r0.getExtras()
                if (r0 == 0) goto L_0x0015
                java.lang.String r1 = "EXTRA_CLA"
                boolean r0 = r0.getBoolean(r1)
                goto L_0x0016
            L_0x0015:
                r0 = 1
            L_0x0016:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity.C22620d.invoke():java.lang.Boolean");
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$e */
    static final class C22621e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DocumentsUploadActivity f59736d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22621e(DocumentsUploadActivity documentsUploadActivity) {
            super(1);
            this.f59736d = documentsUploadActivity;
        }

        /* renamed from: a */
        public final void mo56025a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f59736d.m73313c3(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f59736d.m73313c3(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f59736d.m73313c3(false);
                C24905l L2 = this.f59736d.f59727H;
                if (L2 == null) {
                    C41536l.m120506z("binding");
                    L2 = null;
                }
                CardView cardView = L2.f64014m;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f59736d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56025a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$f */
    static final class C22622f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DocumentsUploadActivity f59737d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22622f(DocumentsUploadActivity documentsUploadActivity) {
            super(1);
            this.f59737d = documentsUploadActivity;
        }

        /* renamed from: a */
        public final void mo56026a(ApplicationDetails applicationDetails) {
            DocumentsUploadActivity documentsUploadActivity = this.f59737d;
            C41536l.m120488h(applicationDetails, "applicationDetails");
            documentsUploadActivity.m73316f3(applicationDetails);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56026a((ApplicationDetails) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$g */
    static final class C22623g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DocumentsUploadActivity f59738d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22623g(DocumentsUploadActivity documentsUploadActivity) {
            super(1);
            this.f59738d = documentsUploadActivity;
        }

        /* renamed from: a */
        public final void mo56027a(C31128a aVar) {
            C24905l lVar = null;
            if (aVar instanceof C31128a.C31130b) {
                C24905l L2 = this.f59738d.f59727H;
                if (L2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    lVar = L2;
                }
                FrameLayout frameLayout = lVar.f64012k;
                C41536l.m120488h(frameLayout, "binding.progressBar");
                C32343x.m95447f1(frameLayout);
            } else if (aVar instanceof C31128a.C31131c) {
                C24905l L22 = this.f59738d.f59727H;
                if (L22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    lVar = L22;
                }
                FrameLayout frameLayout2 = lVar.f64012k;
                C41536l.m120488h(frameLayout2, "binding.progressBar");
                C32343x.m95455i0(frameLayout2);
                this.f59738d.m73317g3();
            } else if (aVar instanceof C31128a.C31129a) {
                C24905l L23 = this.f59738d.f59727H;
                if (L23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    lVar = L23;
                }
                FrameLayout frameLayout3 = lVar.f64012k;
                C41536l.m120488h(frameLayout3, "binding.progressBar");
                C32343x.m95455i0(frameLayout3);
                this.f59738d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56027a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$h */
    static final class C22624h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DocumentsUploadActivity f59739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22624h(DocumentsUploadActivity documentsUploadActivity) {
            super(1);
            this.f59739d = documentsUploadActivity;
        }

        /* renamed from: a */
        public final void mo56028a(List list) {
            C24905l L2 = this.f59739d.f59727H;
            C19356n nVar = null;
            if (L2 == null) {
                C41536l.m120506z("binding");
                L2 = null;
            }
            Button button = L2.f64015n;
            C41536l.m120488h(list, "attachedFiles");
            button.setEnabled(!list.isEmpty());
            C24905l L22 = this.f59739d.f59727H;
            if (L22 == null) {
                C41536l.m120506z("binding");
                L22 = null;
            }
            PageDescriptionView pageDescriptionView = L22.f64007f;
            C41536l.m120488h(pageDescriptionView, "binding.documentsEmptyDescription");
            C32343x.m95483r1(pageDescriptionView, list.isEmpty(), false, 2, (Object) null);
            C24905l L23 = this.f59739d.f59727H;
            if (L23 == null) {
                C41536l.m120506z("binding");
                L23 = null;
            }
            PageDescriptionView pageDescriptionView2 = L23.f64006e;
            C41536l.m120488h(pageDescriptionView2, "binding.description");
            C32343x.m95483r1(pageDescriptionView2, !list.isEmpty(), false, 2, (Object) null);
            C24905l L24 = this.f59739d.f59727H;
            if (L24 == null) {
                C41536l.m120506z("binding");
                L24 = null;
            }
            BogTextView bogTextView = L24.f64022u;
            C41536l.m120488h(bogTextView, "binding.uploadDate");
            C32343x.m95483r1(bogTextView, list.isEmpty(), false, 2, (Object) null);
            C24905l L25 = this.f59739d.f59727H;
            if (L25 == null) {
                C41536l.m120506z("binding");
                L25 = null;
            }
            BogTextView bogTextView2 = L25.f64010i;
            C41536l.m120488h(bogTextView2, "binding.filesSizeError");
            C32343x.m95455i0(bogTextView2);
            C19356n J2 = this.f59739d.f59728I;
            if (J2 == null) {
                C41536l.m120506z("adapter");
            } else {
                nVar = J2;
            }
            nVar.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56028a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$i */
    static final class C22625i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DocumentsUploadActivity f59740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22625i(DocumentsUploadActivity documentsUploadActivity) {
            super(1);
            this.f59740d = documentsUploadActivity;
        }

        /* renamed from: a */
        public final void mo56029a(String str) {
            C41536l.m120489i(str, "message");
            C24905l L2 = this.f59740d.f59727H;
            C24905l lVar = null;
            if (L2 == null) {
                C41536l.m120506z("binding");
                L2 = null;
            }
            L2.f64010i.setText(str);
            C24905l L22 = this.f59740d.f59727H;
            if (L22 == null) {
                C41536l.m120506z("binding");
            } else {
                lVar = L22;
            }
            BogTextView bogTextView = lVar.f64010i;
            C41536l.m120488h(bogTextView, "binding.filesSizeError");
            C32343x.m95447f1(bogTextView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56029a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$j */
    static final class C22626j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DocumentsUploadActivity f59741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22626j(DocumentsUploadActivity documentsUploadActivity) {
            super(1);
            this.f59741d = documentsUploadActivity;
        }

        /* renamed from: a */
        public final void mo56030a(String str) {
            C41536l.m120489i(str, "message");
            C12910e.m48790h(this.f59741d, str, (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56030a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$k */
    static final class C22627k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f59742a;

        C22627k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f59742a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f59742a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f59742a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$l */
    public static final class C22628l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22628l(ComponentActivity componentActivity) {
            super(0);
            this.f59743d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59743d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$m */
    public static final class C22629m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59744d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59745e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22629m(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59744d = aVar;
            this.f59745e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59744d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59745e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$n */
    static final class C22630n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DocumentsUploadActivity f59746d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity$n$a */
        static final class C22631a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ DocumentsUploadActivity f59747d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22631a(DocumentsUploadActivity documentsUploadActivity) {
                super(0);
                this.f59747d = documentsUploadActivity;
            }

            /* renamed from: b */
            public final C22633b invoke() {
                return this.f59747d.mo56020U2().mo32540a(this.f59747d.m73305T2(), this.f59747d.m73311a3());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22630n(DocumentsUploadActivity documentsUploadActivity) {
            super(0);
            this.f59746d = documentsUploadActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C22631a(this.f59746d));
        }
    }

    public DocumentsUploadActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C19343a(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…}\n            }\n        }");
        this.f59732M = registerForActivityResult;
    }

    /* renamed from: D0 */
    private final void m73289D0() {
        String str;
        C24905l lVar = this.f59727H;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        m73315e3();
        if (m73311a3()) {
            str = "CLA.result.C.delete.doc";
        } else {
            str = "CML.result.C.delete.doc";
        }
        C19356n nVar = new C19356n(str, new C22619c(this));
        this.f59728I = nVar;
        lVar.f64009h.setAdapter(nVar);
        lVar.f64013l.mo3946b().setOnClickListener(new C19344b(this));
        lVar.f64021t.setOnClickListener(new C19345c(this));
        lVar.f64015n.setOnClickListener(new C19346d(this));
        lVar.f64011j.setOnClickListener(new C19347e(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        se1.C42550b.m123187a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        throw r1;
     */
    /* renamed from: R2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String[] m73303R2(android.net.Uri r8) {
        /*
            r7 = this;
            android.content.ContentResolver r0 = r7.getContentResolver()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r8
            android.database.Cursor r8 = r0.query(r1, r2, r3, r4, r5, r6)
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L_0x0040
            boolean r2 = r8.moveToFirst()     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0040
            java.lang.String r2 = "_display_name"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "_size"
            int r3 = r8.getColumnIndex(r3)     // Catch:{ all -> 0x0048 }
            boolean r4 = r8.isNull(r3)     // Catch:{ all -> 0x0048 }
            if (r4 != 0) goto L_0x0033
            java.lang.String r3 = r8.getString(r3)     // Catch:{ all -> 0x0048 }
            goto L_0x0034
        L_0x0033:
            r3 = r1
        L_0x0034:
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0048 }
            r4[r0] = r2     // Catch:{ all -> 0x0048 }
            r0 = 1
            r4[r0] = r3     // Catch:{ all -> 0x0048 }
            se1.C42550b.m123187a(r8, r1)
            return r4
        L_0x0040:
            he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x0048 }
            se1.C42550b.m123187a(r8, r1)
            java.lang.String[] r8 = new java.lang.String[r0]
            return r8
        L_0x0048:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            se1.C42550b.m123187a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity.m73303R2(android.net.Uri):java.lang.String[]");
    }

    /* renamed from: S2 */
    private final void m73304S2() {
        Intent intent = new Intent();
        intent.putExtra("FROM_CANCEL_ORDER", false);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final ApplicationDetails m73305T2() {
        return (ApplicationDetails) this.f59729J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final C22633b m73306V2() {
        return (C22633b) this.f59731L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m73307W2(DocumentsUploadActivity documentsUploadActivity, View view) {
        C41536l.m120489i(documentsUploadActivity, "this$0");
        C21481a.onRefresh$default(documentsUploadActivity.m73306V2(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m73308X2(DocumentsUploadActivity documentsUploadActivity, View view) {
        C41536l.m120489i(documentsUploadActivity, "this$0");
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.MIME_TYPES", documentsUploadActivity.m73306V2().mo56043yw().mo47552U6());
        intent.setType("*/*");
        documentsUploadActivity.f59732M.mo404a(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m73309Y2(DocumentsUploadActivity documentsUploadActivity, View view) {
        C41536l.m120489i(documentsUploadActivity, "this$0");
        documentsUploadActivity.m73306V2().mo56043yw().mo47550Ao();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m73310Z2(DocumentsUploadActivity documentsUploadActivity, View view) {
        C41536l.m120489i(documentsUploadActivity, "this$0");
        documentsUploadActivity.m73304S2();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final boolean m73311a3() {
        return ((Boolean) this.f59730K.getValue()).booleanValue();
    }

    /* renamed from: b3 */
    private final void m73312b3() {
        m73306V2().mo56044zw().mo47554Cj().mo4819k(this, new C22627k(new C22621e(this)));
        m73306V2().mo56044zw().mo47555K6().mo4819k(this, new C22627k(new C22622f(this)));
        m73306V2().mo56044zw().mo47556Tb().mo4819k(this, new C22627k(new C22623g(this)));
        m73306V2().mo56044zw().mo47558Zd().mo4819k(this, new C22627k(new C22624h(this)));
        C37224b.m109963b(m73306V2().mo56044zw().mo47557U4(), this, new C22625i(this));
        C37224b.m109963b(m73306V2().mo56044zw().mo47559nu(), this, new C22626j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m73313c3(boolean z) {
        C24905l lVar = this.f59727H;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        CardView cardView = lVar.f64014m;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        C24905l lVar2 = this.f59727H;
        if (lVar2 == null) {
            C41536l.m120506z("binding");
            lVar2 = null;
        }
        FrameLayout frameLayout = lVar2.f64012k;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m73314d3(DocumentsUploadActivity documentsUploadActivity, ActivityResult activityResult) {
        Intent a;
        Uri data;
        C41536l.m120489i(documentsUploadActivity, "this$0");
        if (activityResult.mo371b() == -1 && (a = activityResult.mo370a()) != null && (data = a.getData()) != null) {
            documentsUploadActivity.m73306V2().mo56043yw().mo47553sk(data, documentsUploadActivity.getContentResolver().getType(data), documentsUploadActivity.m73303R2(data), C32358z.f79794a.mo72861b(documentsUploadActivity, data));
        }
    }

    /* renamed from: e3 */
    private final void m73315e3() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C24905l lVar = this.f59727H;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        PageState pageState = lVar.f64018q;
        if (m73311a3()) {
            str = "CLA.result.C.result.main.text";
        } else {
            str = "CML.result.C.result.main.text";
        }
        pageState.setTitleText(C32343x.m95388F(str, new Object[0]));
        PageDescriptionView pageDescriptionView = lVar.f64016o;
        if (m73311a3()) {
            str2 = "CLA.result.C.result.explanatory.text";
        } else {
            str2 = "CML.result.C.result.explanatory.text";
        }
        pageDescriptionView.setTitle(C32343x.m95388F(str2, new Object[0]));
        Button button = lVar.f64011j;
        if (m73311a3()) {
            str3 = "CLA.result.C.result.check.appl.button";
        } else {
            str3 = "CML.result.C.result.check.appl.button";
        }
        button.setButtonText(C32343x.m95388F(str3, new Object[0]));
        if (m73311a3()) {
            str4 = "CLA.result.C.main.text";
        } else {
            str4 = "CML.result.C.main.text";
        }
        String F = C32343x.m95388F(str4, new Object[0]);
        lVar.f64007f.setTitle(F);
        lVar.f64006e.setTitle(F);
        Button button2 = lVar.f64021t;
        if (m73311a3()) {
            str5 = "CLA.result.C.upload.button";
        } else {
            str5 = "CML.result.C.upload.button";
        }
        button2.setButtonText(C32343x.m95388F(str5, new Object[0]));
        Button button3 = lVar.f64015n;
        if (m73311a3()) {
            str6 = "CLA.result.C.confirm.button";
        } else {
            str6 = "CML.result.C.confirm.button";
        }
        button3.setButtonText(C32343x.m95388F(str6, new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m73316f3(ApplicationDetails applicationDetails) {
        String str;
        String str2;
        String str3;
        long millis = TimeUnit.DAYS.toMillis(Long.parseLong(C32343x.m95388F("applications.credit.application.details.conditional.days.to.upload", new Object[0]))) + applicationDetails.mo55947d();
        C24905l lVar = this.f59727H;
        C24905l lVar2 = null;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        BogTextView bogTextView = lVar.f64022u;
        C41524c0 c0Var = C41524c0.f97701a;
        Object[] objArr = new Object[2];
        if (m73311a3()) {
            str = "CLA.result.C.doc.upload.exp.date";
        } else {
            str = "CML.result.C.doc.upload.exp.date";
        }
        objArr[0] = C32343x.m95388F(str, new Object[0]);
        objArr[1] = C32319m.m95314u(millis);
        String format = String.format("%s %s", Arrays.copyOf(objArr, 2));
        C41536l.m120488h(format, "format(format, *args)");
        bogTextView.setText(format);
        String b = applicationDetails.mo55946b();
        if (b != null) {
            if (m73311a3()) {
                str3 = "CLA.result.C.explanatory.text";
            } else {
                str3 = "CML.result.C.explanatory.text";
            }
            str2 = C32343x.m95388F(str3, new Object[0]) + b;
        } else {
            str2 = null;
        }
        C24905l lVar3 = this.f59727H;
        if (lVar3 == null) {
            C41536l.m120506z("binding");
            lVar3 = null;
        }
        lVar3.f64006e.setText(str2);
        C24905l lVar4 = this.f59727H;
        if (lVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            lVar2 = lVar4;
        }
        lVar2.f64007f.setText(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m73317g3() {
        C24905l lVar = this.f59727H;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        LinearLayout linearLayout = lVar.f64023v;
        C41536l.m120488h(linearLayout, "uploadLayout");
        C32343x.m95455i0(linearLayout);
        LinearLayout linearLayout2 = lVar.f64017p;
        C41536l.m120488h(linearLayout2, "successLayout");
        C32343x.m95447f1(linearLayout2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C24905l d = C24905l.m79604d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f59727H = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m73289D0();
        m73312b3();
    }

    /* renamed from: U2 */
    public final C22633b.C22638d mo56020U2() {
        C22633b.C22638d dVar = this.f59726G;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F(m73311a3() ? "CLA.main.header" : "CML.main.header", new Object[0]);
    }
}

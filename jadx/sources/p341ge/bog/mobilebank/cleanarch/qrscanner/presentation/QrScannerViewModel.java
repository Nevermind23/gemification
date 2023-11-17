package p341ge.bog.mobilebank.cleanarch.qrscanner.presentation;

import android.net.Uri;
import android.util.Patterns;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.google.gson.Gson;
import d70.C19926a;
import e70.C20182a;
import g70.C20771e;
import g70.C20772f;
import g70.C20773g;
import g70.C20774h;
import g70.C20775i;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import h70.C24889a;
import hd0.C24978b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n41.C37353c;
import p198o9.C7493a;
import p198o9.C7494b;
import p316xa.C8982a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.model.QrUiModel;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.p975ui.model.qrpay.QrId;
import p341ge.bog.mobilebank.p975ui.model.qrpay.QrPayData;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p416fd.C12844b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel */
public final class QrScannerViewModel extends C21481a {

    /* renamed from: n */
    public static final C22527a f59573n = new C22527a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C19926a f59574d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C24889a f59575e;

    /* renamed from: f */
    private final PreferencesApiManager f59576f;

    /* renamed from: g */
    private String f59577g;

    /* renamed from: h */
    private QrId f59578h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f59579i = new C1644x();

    /* renamed from: j */
    private final C1644x f59580j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f59581k = new C1644x();

    /* renamed from: l */
    private final C1644x f59582l = new C1644x();

    /* renamed from: m */
    private final C1644x f59583m = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel$a */
    public static final class C22527a {
        private C22527a() {
        }

        public /* synthetic */ C22527a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel$b */
    static final class C22528b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrScannerViewModel f59584d;

        /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel$b$a */
        public static final class C22529a extends C8982a<ArrayList<KeyValue>> {
            C22529a() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22528b(QrScannerViewModel qrScannerViewModel) {
            super(1);
            this.f59584d = qrScannerViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo55672a(p198o9.C7494b r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x0057
                android.net.Uri r4 = r4.mo21929a()
                if (r4 == 0) goto L_0x0057
                java.lang.String r0 = "type"
                java.lang.String r0 = r4.getQueryParameter(r0)
                if (r0 == 0) goto L_0x0057
                java.lang.String r1 = "parameters"
                java.lang.String r4 = r4.getQueryParameter(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                boolean r2 = android.text.TextUtils.isEmpty(r4)
                if (r2 != 0) goto L_0x003b
                com.google.gson.Gson r1 = new com.google.gson.Gson
                r1.<init>()
                ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel$b$a r2 = new ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel$b$a
                r2.<init>()
                java.lang.reflect.Type r2 = r2.getType()
                java.lang.Object r4 = r1.mo18171m(r4, r2)
                java.lang.String r1 = "gson.fromJson(\n         …                        )"
                kotlin.jvm.internal.C41536l.m120488h(r4, r1)
                r1 = r4
                java.util.ArrayList r1 = (java.util.ArrayList) r1
            L_0x003b:
                boolean r4 = cf1.C40439w.m117118v(r0)
                if (r4 != 0) goto L_0x0057
                boolean r4 = r1.isEmpty()
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x0057
                ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel r4 = r3.f59584d
                androidx.lifecycle.x r4 = r4.f59581k
                he1.m r2 = new he1.m
                r2.<init>(r0, r1)
                p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c.m69418j(r4, r2)
            L_0x0057:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel.C22528b.mo55672a(o9.b):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55672a((C7494b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel$c */
    static final class C22530c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrScannerViewModel f59585d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22530c(QrScannerViewModel qrScannerViewModel) {
            super(1);
            this.f59585d = qrScannerViewModel;
        }

        /* renamed from: a */
        public final void mo55673a(C41205b bVar) {
            C21484c.m69417i(this.f59585d.f59579i, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55673a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel$d */
    static final class C22531d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrScannerViewModel f59586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22531d(QrScannerViewModel qrScannerViewModel) {
            super(1);
            this.f59586d = qrScannerViewModel;
        }

        /* renamed from: a */
        public final void mo55674a(C20182a aVar) {
            C1644x kw = this.f59586d.f59579i;
            C24889a iw = this.f59586d.f59575e;
            C41536l.m120488h(aVar, "it");
            C21484c.m69418j(kw, iw.mo63300a(aVar));
            this.f59586d.m73035Aw(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55674a((C20182a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel$e */
    static final class C22532e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrScannerViewModel f59587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22532e(QrScannerViewModel qrScannerViewModel) {
            super(1);
            this.f59587d = qrScannerViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59587d.f59579i, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QrScannerViewModel(C19926a aVar, C24889a aVar2, PreferencesApiManager preferencesApiManager) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getMerchantInfoUseCase");
        C41536l.m120489i(aVar2, "mapper");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f59574d = aVar;
        this.f59575e = aVar2;
        this.f59576f = preferencesApiManager;
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public final void m73035Aw(C20182a aVar) {
        String str;
        if (aVar.mo48593d() == C24978b.YES) {
            C37353c language = this.f59576f.getLanguage();
            C41536l.m120488h(language, "preferencesApiManager.getLanguage()");
            if (language == C37353c.EN) {
                str = aVar.mo48592c();
            } else {
                str = aVar.mo48591b();
            }
            QrId qrId = this.f59578h;
            String str2 = null;
            if (qrId == null) {
                C41536l.m120506z("emvcoQr");
                qrId = null;
            }
            QrPayData create = QrPayData.create(qrId, str, aVar.mo48590a());
            String str3 = this.f59577g;
            if (str3 == null) {
                C41536l.m120506z("qrStandard");
            } else {
                str2 = str3;
            }
            create.setQrStandard(str2);
            this.f59582l.mo4823o(C32343x.m95466m(create));
        }
    }

    /* renamed from: mw */
    private final void m73045mw(Uri uri) {
        C7493a.m28459c().mo21928b(uri).mo24864i(new C20771e(new C22528b(this))).mo24861f(new C20772f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m73046nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m73047ow(QrScannerViewModel qrScannerViewModel, Exception exc) {
        C41536l.m120489i(qrScannerViewModel, "this$0");
        C21484c.m69415g(qrScannerViewModel.f59581k, exc, (Object) null, 2, (Object) null);
    }

    /* renamed from: qw */
    private final void m73048qw(QrId qrId, String str) {
        C19926a aVar = this.f59574d;
        String id = qrId.getId();
        if (id == null) {
            id = "";
        }
        String version = qrId.getVersion();
        if (version == null) {
            version = "";
        }
        String type = qrId.getType();
        if (type == null) {
            type = "";
        }
        C41205b I = aVar.mo48305a(id, version, type, "PAYMENT", str).mo95063B(C40992a.m118827a()).mo95083l(new C20773g(new C22530c(this))).mo95070I(new C20774h(new C22531d(this)), new C20775i(new C22532e(this)));
        C41536l.m120488h(I, "private fun getMerchantI…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m73049rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final void m73050sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m73051tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: yw */
    private final void m73052yw(String str) {
        this.f59583m.mo4823o(Uri.parse(str));
    }

    /* renamed from: pw */
    public final LiveData mo55666pw() {
        return this.f59581k;
    }

    /* renamed from: uw */
    public final LiveData mo55667uw() {
        return this.f59579i;
    }

    /* renamed from: vw */
    public final LiveData mo55668vw() {
        return this.f59582l;
    }

    /* renamed from: ww */
    public final LiveData mo55669ww() {
        return this.f59580j;
    }

    /* renamed from: xw */
    public final LiveData mo55670xw() {
        return this.f59583m;
    }

    /* renamed from: zw */
    public final void mo55671zw(C12844b bVar) {
        QrUiModel qrUiModel;
        String str;
        C41536l.m120489i(bVar, "result");
        this.f59580j.mo4823o(C32343x.m95466m(C41238w.f97225a));
        Uri parse = Uri.parse(bVar.mo33502e());
        String str2 = null;
        try {
            qrUiModel = (QrUiModel) new Gson().mo18170l(bVar.mo33502e(), QrUiModel.class);
        } catch (Throwable unused) {
            qrUiModel = null;
        }
        this.f59578h = new QrId();
        if (qrUiModel != null) {
            str = qrUiModel.getType();
        } else {
            str = null;
        }
        if (C41536l.m120484d(str, "QR_ATM")) {
            C21484c.m69418j(this.f59581k, new C41224m(TMXFlags.TMX_FLAG_QR_WITHDRAWAL, C41341q.m119903f(new KeyValue("ed", qrUiModel.getEd()), new KeyValue("AID", qrUiModel.getAID()))));
            return;
        }
        Pattern pattern = Patterns.WEB_URL;
        String e = bVar.mo33502e();
        String str3 = "";
        if (e == null) {
            e = str3;
        }
        if (pattern.matcher(e).matches()) {
            String e2 = bVar.mo33502e();
            if (e2 != null) {
                str3 = e2;
            }
            m73052yw(str3);
        } else if (C40439w.m117116t(parse.getAuthority(), "mbank.bog.ge", false, 2, (Object) null)) {
            C41536l.m120488h(parse, "uri");
            m73045mw(parse);
        } else if (C32359z0.m95579l0(bVar.mo33502e()) == null) {
            this.f59577g = "EMVCO_STANDARD";
            QrId qrId = this.f59578h;
            if (qrId == null) {
                C41536l.m120506z("emvcoQr");
                qrId = null;
            }
            qrId.setId(bVar.mo33502e());
            QrId qrId2 = this.f59578h;
            if (qrId2 == null) {
                C41536l.m120506z("emvcoQr");
                qrId2 = null;
            }
            String str4 = this.f59577g;
            if (str4 == null) {
                C41536l.m120506z("qrStandard");
            } else {
                str2 = str4;
            }
            m73048qw(qrId2, str2);
        } else {
            C32343x.m95501z0(this, "qr_pay", str3, "scan_success");
            this.f59577g = "BOG_STANDARD";
            QrId qrId3 = this.f59578h;
            if (qrId3 == null) {
                C41536l.m120506z("emvcoQr");
                qrId3 = null;
            }
            String str5 = this.f59577g;
            if (str5 == null) {
                C41536l.m120506z("qrStandard");
            } else {
                str2 = str5;
            }
            m73048qw(qrId3, str2);
        }
    }
}

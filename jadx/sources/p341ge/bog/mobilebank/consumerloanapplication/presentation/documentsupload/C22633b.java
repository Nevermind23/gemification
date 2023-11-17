package p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import b90.C19349g;
import b90.C19350h;
import b90.C19351i;
import b90.C19352j;
import b90.C19353k;
import b90.C19354l;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import g91.C32359z0;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m80.C26158a;
import m80.C26159b;
import n80.C26377a;
import n80.C26378b;
import n80.C26379c;
import n80.C26380d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.domain.prepareapplication.model.ApplicationDetails;
import p366bk.C10328q;
import p380ck.C10464h;
import p897tp.C28474a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.b */
public final class C22633b extends C21481a implements C19349g, C19350h {

    /* renamed from: x */
    public static final C22637c f59748x = new C22637c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ApplicationDetails f59749d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean f59750e;

    /* renamed from: f */
    private final Application f59751f;

    /* renamed from: g */
    private final C26158a f59752g;

    /* renamed from: h */
    private final C26159b f59753h;

    /* renamed from: i */
    private final C28474a f59754i;

    /* renamed from: j */
    private final C19349g f59755j = this;

    /* renamed from: k */
    private final C19350h f59756k = this;

    /* renamed from: l */
    private final C1644x f59757l = new C1644x();

    /* renamed from: m */
    private final C1644x f59758m = new C1644x();

    /* renamed from: n */
    private final C1644x f59759n = new C1644x();

    /* renamed from: o */
    private final C1644x f59760o = new C1644x(C41341q.m119907j());

    /* renamed from: p */
    private final C1644x f59761p = new C1644x();

    /* renamed from: q */
    private final C1644x f59762q = new C1644x();

    /* renamed from: r */
    private final C40767b f59763r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C26378b f59764s;

    /* renamed from: t */
    private final List f59765t;

    /* renamed from: u */
    private String f59766u;

    /* renamed from: v */
    private MimeTypeMap f59767v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final List f59768w;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.b$a */
    static final class C22634a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22633b f59769d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22634a(C22633b bVar) {
            super(1);
            this.f59769d = bVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            String str;
            C41536l.m120489i(num, "it");
            C26158a xw = this.f59769d.mo56042xw();
            if (this.f59769d.f59750e) {
                str = "CREDIT_APPLICATION";
            } else {
                str = "CREDIT_LIMIT_APP";
            }
            C40749p O = xw.mo65198a(str).mo95075O();
            C41536l.m120488h(O, "getAttachmentInfo(if (is…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.b$b */
    static final class C22635b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22633b f59770d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.b$b$a */
        static final class C22636a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C22633b f59771d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22636a(C22633b bVar) {
                super(1);
                this.f59771d = bVar;
            }

            /* renamed from: a */
            public final void mo56047a(C26378b bVar) {
                this.f59771d.f59764s = bVar;
                this.f59771d.mo47555K6().mo4823o(this.f59771d.f59749d);
                this.f59771d.m73335Ew();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo56047a((C26378b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22635b(C22633b bVar) {
            super(1);
            this.f59770d = bVar;
        }

        /* renamed from: a */
        public final void mo56046a(C31128a aVar) {
            this.f59770d.mo47554Cj().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C22636a(this.f59770d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56046a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.b$c */
    public static final class C22637c {
        private C22637c() {
        }

        public /* synthetic */ C22637c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.b$d */
    public interface C22638d {
        /* renamed from: a */
        C22633b mo32540a(ApplicationDetails applicationDetails, boolean z);
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.b$e */
    static final class C22639e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22633b f59772d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22639e(C22633b bVar) {
            super(1);
            this.f59772d = bVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92878g(this.f59772d.mo56035Bw().mo65199a(this.f59772d.f59749d.mo55945a(), this.f59772d.f59768w), 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.b$f */
    static final class C22640f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22633b f59773d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.b$f$a */
        static final class C22641a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C22633b f59774d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22641a(C22633b bVar) {
                super(1);
                this.f59774d = bVar;
            }

            /* renamed from: a */
            public final void mo56050a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f59774d.m73334Dw();
                this.f59774d.mo56037sw().mo68096b();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo56050a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22640f(C22633b bVar) {
            super(1);
            this.f59773d = bVar;
        }

        /* renamed from: a */
        public final void mo56049a(C31128a aVar) {
            this.f59773d.mo47556Tb().mo4823o(aVar);
            C41536l.m120488h(aVar, "data");
            C31132b.m92648j(aVar, (int[]) null, new C22641a(this.f59773d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56049a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22633b(ApplicationDetails applicationDetails, boolean z, Application application, C26158a aVar, C26159b bVar, C28474a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(applicationDetails, "applicationDetails");
        C41536l.m120489i(application, "application");
        C41536l.m120489i(aVar, "getAttachmentInfo");
        C41536l.m120489i(bVar, "uploadApplicationFiles");
        C41536l.m120489i(aVar2, "applicationEventPoster");
        this.f59749d = applicationDetails;
        this.f59750e = z;
        this.f59751f = application;
        this.f59752g = aVar;
        this.f59753h = bVar;
        this.f59754i = aVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f59763r = h1;
        this.f59765t = new ArrayList();
        this.f59766u = "";
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        C41536l.m120488h(singleton, "getSingleton()");
        this.f59767v = singleton;
        this.f59768w = new ArrayList();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C19353k(new C22634a(this)));
        C41536l.m120488h(L0, "merge(\n                o…le(RC_INIT)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C19354l(new C22635b(this)));
        C41536l.m120488h(F0, "merge(\n                o…      }\n                }");
        bindToLifecycle(F0);
        m73336Fw();
    }

    /* renamed from: Cw */
    private final void m73333Cw() {
        C26378b bVar = this.f59764s;
        C41536l.m120486f(bVar);
        mo47557U4().mo4823o(C32343x.m95466m(C40439w.m117103B(C32343x.m95388F("cla.warning.max.file.size", new Object[0]), "X", String.valueOf(bVar.mo65591b().mo65595a()), false, 4, (Object) null)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public final void m73334Dw() {
        if (this.f59750e) {
            C36546y.m108282F().mo27137H("applications_CL_E2E", "CONSUMER_LOAN_E2E_UPLOAD_DOCS", (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public final void m73335Ew() {
        List<C26377a> a;
        StringBuilder sb = new StringBuilder();
        C26378b bVar = this.f59764s;
        if (!(bVar == null || (a = bVar.mo65590a()) == null)) {
            for (C26377a a2 : a) {
                String a3 = a2.mo65586a();
                if (a3 != null) {
                    Locale locale = Locale.getDefault();
                    C41536l.m120488h(locale, "getDefault()");
                    String lowerCase = a3.toLowerCase(locale);
                    C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase != null) {
                        sb.append(lowerCase);
                        sb.append(" ");
                        String mimeTypeFromExtension = this.f59767v.getMimeTypeFromExtension(lowerCase);
                        if (mimeTypeFromExtension != null) {
                            List list = this.f59765t;
                            C41536l.m120488h(mimeTypeFromExtension, "mimeType");
                            list.add(mimeTypeFromExtension);
                        }
                    }
                }
            }
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "supportedExtensions.toString()");
        this.f59766u = sb2;
    }

    /* renamed from: Fw */
    private final void m73336Fw() {
        C40749p L0 = this.f59763r.mo94989L0(new C19351i(new C22639e(this)));
        C41536l.m120488h(L0, "private fun subscribeToU…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C19352j(new C22640f(this)));
        C41536l.m120488h(F0, "private fun subscribeToU…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final C40754t m73337Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m73338Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m73343hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m73344iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: pw */
    private final void m73351pw(String str, String str2) {
        this.f59768w.add(new C26380d(str, str2));
        mo47558Zd().mo4823o(C41358y.m120036z0(this.f59768w));
    }

    /* renamed from: qw */
    private final boolean m73352qw(long j) {
        C26378b bVar = this.f59764s;
        if (bVar == null) {
            return false;
        }
        C41536l.m120486f(bVar);
        C26379c b = bVar.mo65591b();
        if (j < b.mo65596b() || j > b.mo65595a()) {
            return false;
        }
        return true;
    }

    /* renamed from: Ao */
    public void mo47550Ao() {
        if (!this.f59768w.isEmpty()) {
            this.f59763r.onNext(C41238w.f97225a);
        }
    }

    /* renamed from: Aw */
    public C1644x mo47559nu() {
        return this.f59762q;
    }

    /* renamed from: Bw */
    public final C26159b mo56035Bw() {
        return this.f59753h;
    }

    /* renamed from: Ch */
    public void mo47551Ch(int i) {
        this.f59768w.remove(i);
        mo47558Zd().mo4823o(C41358y.m120036z0(this.f59768w));
    }

    /* renamed from: U6 */
    public String[] mo47552U6() {
        if (this.f59764s == null) {
            return null;
        }
        List<String> list = this.f59765t;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (String add : list) {
            arrayList.add(add);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: rw */
    public C1644x mo47555K6() {
        return this.f59759n;
    }

    /* renamed from: sk */
    public void mo47553sk(Uri uri, String str, String[] strArr, byte[] bArr) {
        boolean z;
        long j;
        C41536l.m120489i(uri, "uri");
        C41536l.m120489i(strArr, "metadata");
        C41536l.m120489i(bArr, "content");
        String[] U6 = mo47552U6();
        if (U6 == null || !C41333m.m119794s(U6, str)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            mo47559nu().mo4823o(C32343x.m95466m(this.f59751f.getString(C10328q.unsported_file_extension_error, new Object[]{this.f59766u})));
        } else if (strArr.length == 2) {
            String str2 = strArr[0];
            if (str2 == null) {
                str2 = "";
            }
            String str3 = strArr[1];
            if (str3 != null) {
                j = Long.parseLong(str3);
            } else {
                j = (long) bArr.length;
            }
            if (m73352qw(j)) {
                String y = C32359z0.m95597y(bArr);
                C41536l.m120488h(y, "attachmentBase64");
                m73351pw(str2, y);
                return;
            }
            m73333Cw();
        } else {
            mo47559nu().mo4823o(C32343x.m95466m(this.f59751f.getString(C10328q.cant_upload_file)));
        }
    }

    /* renamed from: sw */
    public final C28474a mo56037sw() {
        return this.f59754i;
    }

    /* renamed from: tw */
    public C1644x mo47554Cj() {
        return this.f59757l;
    }

    /* renamed from: uw */
    public C1644x mo47558Zd() {
        return this.f59760o;
    }

    /* renamed from: vw */
    public C1644x mo47557U4() {
        return this.f59761p;
    }

    /* renamed from: ww */
    public C1644x mo47556Tb() {
        return this.f59758m;
    }

    /* renamed from: xw */
    public final C26158a mo56042xw() {
        return this.f59752g;
    }

    /* renamed from: yw */
    public final C19349g mo56043yw() {
        return this.f59755j;
    }

    /* renamed from: zw */
    public final C19350h mo56044zw() {
        return this.f59756k;
    }
}

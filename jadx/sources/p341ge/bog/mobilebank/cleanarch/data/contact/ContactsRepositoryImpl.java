package p341ge.bog.mobilebank.cleanarch.data.contact;

import androidx.annotation.Keep;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40767b;
import he1.C41238w;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41872c0;
import of1.C41937x;
import of1.C41939y;
import p341ge.bog.mobilebank.cleanarch.data.contact.entity.ContactAccountApiModel;
import p341ge.bog.mobilebank.cleanarch.data.contact.entity.ContactApiModel;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p736ds.C20051a;
import p736ds.C20055c;
import p736ds.C20056d;
import p736ds.C20057e;
import p736ds.C20058f;
import p736ds.C20059g;
import p736ds.C20060h;
import p736ds.C20061i;
import p736ds.C20062j;
import p736ds.C20063k;
import p736ds.C20064l;
import p736ds.C20065m;
import p736ds.C20066n;
import p736ds.C20069q;
import p736ds.C20070r;
import p746es.C20289a;
import p881ru.C28094c;
import p891su.C28261a;
import p891su.C28262b;
import p891su.C28263c;
import p891su.C28267d;
import p891su.C28269e;
import p891su.C28271f;
import pc0.C27494a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl */
public final class ContactsRepositoryImpl implements C28094c {

    /* renamed from: k */
    public static final C20973a f56403k = new C20973a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f56404d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C20289a f56405e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20051a f56406f;

    /* renamed from: g */
    private final C27494a f56407g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C40767b f56408h;

    /* renamed from: i */
    private C40767b f56409i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f56410j;

    @Keep
    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$TrustUntrustContactParams */
    public static final class TrustUntrustContactParams extends OtpParams {
        private final List<Long> linkIdes;
        private final String operationId;
        private final String operationReference;
        private final String scaAuthCode;
        private final String serviceId;
        private final int trustConnection;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TrustUntrustContactParams(List<Long> list, int i, String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
            C41536l.m120489i(list, "linkIdes");
            C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
            this.linkIdes = list;
            this.trustConnection = i;
            this.serviceId = str;
            this.operationId = str2;
            this.operationReference = str3;
            this.scaAuthCode = str4;
        }

        public static /* synthetic */ TrustUntrustContactParams copy$default(TrustUntrustContactParams trustUntrustContactParams, List<Long> list, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = trustUntrustContactParams.linkIdes;
            }
            if ((i2 & 2) != 0) {
                i = trustUntrustContactParams.trustConnection;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                str = trustUntrustContactParams.serviceId;
            }
            String str5 = str;
            if ((i2 & 8) != 0) {
                str2 = trustUntrustContactParams.operationId;
            }
            String str6 = str2;
            if ((i2 & 16) != 0) {
                str3 = trustUntrustContactParams.operationReference;
            }
            String str7 = str3;
            if ((i2 & 32) != 0) {
                str4 = trustUntrustContactParams.scaAuthCode;
            }
            return trustUntrustContactParams.copy(list, i3, str5, str6, str7, str4);
        }

        public final List<Long> component1() {
            return this.linkIdes;
        }

        public final int component2() {
            return this.trustConnection;
        }

        public final String component3() {
            return this.serviceId;
        }

        public final String component4() {
            return this.operationId;
        }

        public final String component5() {
            return this.operationReference;
        }

        public final String component6() {
            return this.scaAuthCode;
        }

        public final TrustUntrustContactParams copy(List<Long> list, int i, String str, String str2, String str3, String str4) {
            C41536l.m120489i(list, "linkIdes");
            C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
            return new TrustUntrustContactParams(list, i, str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrustUntrustContactParams)) {
                return false;
            }
            TrustUntrustContactParams trustUntrustContactParams = (TrustUntrustContactParams) obj;
            return C41536l.m120484d(this.linkIdes, trustUntrustContactParams.linkIdes) && this.trustConnection == trustUntrustContactParams.trustConnection && C41536l.m120484d(this.serviceId, trustUntrustContactParams.serviceId) && C41536l.m120484d(this.operationId, trustUntrustContactParams.operationId) && C41536l.m120484d(this.operationReference, trustUntrustContactParams.operationReference) && C41536l.m120484d(this.scaAuthCode, trustUntrustContactParams.scaAuthCode);
        }

        public final List<Long> getLinkIdes() {
            return this.linkIdes;
        }

        public String getOperationId() {
            return this.operationId;
        }

        public String getOperationReference() {
            return this.operationReference;
        }

        public String getScaAuthCode() {
            return this.scaAuthCode;
        }

        public String getServiceId() {
            return this.serviceId;
        }

        public final int getTrustConnection() {
            return this.trustConnection;
        }

        public int hashCode() {
            int hashCode = ((((this.linkIdes.hashCode() * 31) + this.trustConnection) * 31) + this.serviceId.hashCode()) * 31;
            String str = this.operationId;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.operationReference;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.scaAuthCode;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            List<Long> list = this.linkIdes;
            int i = this.trustConnection;
            String str = this.serviceId;
            String str2 = this.operationId;
            String str3 = this.operationReference;
            String str4 = this.scaAuthCode;
            return "TrustUntrustContactParams(linkIdes=" + list + ", trustConnection=" + i + ", serviceId=" + str + ", operationId=" + str2 + ", operationReference=" + str3 + ", scaAuthCode=" + str4 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$a */
    public static final class C20973a {
        private C20973a() {
        }

        public /* synthetic */ C20973a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$b */
    static final class C20974b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20974b(ContactsRepositoryImpl contactsRepositoryImpl) {
            super(1);
            this.f56411d = contactsRepositoryImpl;
        }

        /* renamed from: a */
        public final C28262b invoke(ContactAccountApiModel contactAccountApiModel) {
            C41536l.m120489i(contactAccountApiModel, "it");
            return this.f56411d.f56405e.mo48769c(contactAccountApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$c */
    static final class C20975c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56412d;

        /* renamed from: e */
        final /* synthetic */ long f56413e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20975c(ContactsRepositoryImpl contactsRepositoryImpl, long j) {
            super(1);
            this.f56412d = contactsRepositoryImpl;
            this.f56413e = j;
        }

        /* renamed from: a */
        public final void mo50104a(C28262b bVar) {
            ContactsRepositoryImpl contactsRepositoryImpl = this.f56412d;
            long j = this.f56413e;
            C41536l.m120488h(bVar, "it");
            contactsRepositoryImpl.m67951y4(j, bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50104a((C28262b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$d */
    static final class C20976d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56414d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20976d(ContactsRepositoryImpl contactsRepositoryImpl) {
            super(1);
            this.f56414d = contactsRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo50105a(C28261a aVar) {
            C40767b u4 = this.f56414d.f56408h;
            C41536l.m120488h(aVar, "it");
            u4.onNext(new C28271f.C28274c(aVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50105a((C28261a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$e */
    static final class C20977e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56415d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20977e(ContactsRepositoryImpl contactsRepositoryImpl) {
            super(1);
            this.f56415d = contactsRepositoryImpl;
        }

        /* renamed from: a */
        public final C28261a invoke(ContactApiModel contactApiModel) {
            C41536l.m120489i(contactApiModel, "it");
            return this.f56415d.f56405e.mo48768b(contactApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$f */
    static final class C20978f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f56416d;

        /* renamed from: e */
        final /* synthetic */ ContactsRepositoryImpl f56417e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20978f(boolean z, ContactsRepositoryImpl contactsRepositoryImpl) {
            super(1);
            this.f56416d = z;
            this.f56417e = contactsRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo50107a(C28261a aVar) {
            if (!this.f56416d) {
                ContactsRepositoryImpl contactsRepositoryImpl = this.f56417e;
                C41536l.m120488h(aVar, "it");
                contactsRepositoryImpl.m67909D4(aVar);
                return;
            }
            ContactsRepositoryImpl contactsRepositoryImpl2 = this.f56417e;
            C41536l.m120488h(aVar, "it");
            contactsRepositoryImpl2.m67908C4(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50107a((C28261a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$g */
    static final class C20979g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56418d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20979g(ContactsRepositoryImpl contactsRepositoryImpl) {
            super(1);
            this.f56418d = contactsRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo50108a(C28261a aVar) {
            C40767b u4 = this.f56418d.f56408h;
            C41536l.m120488h(aVar, "it");
            u4.onNext(new C28271f.C28273b(aVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50108a((C28261a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$h */
    static final class C20980h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56419d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20980h(ContactsRepositoryImpl contactsRepositoryImpl) {
            super(1);
            this.f56419d = contactsRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo50109a(C28261a aVar) {
            C40767b u4 = this.f56419d.f56408h;
            C41536l.m120488h(aVar, "it");
            u4.onNext(new C28271f.C28273b(aVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50109a((C28261a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$i */
    static final class C20981i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20981i(ContactsRepositoryImpl contactsRepositoryImpl) {
            super(1);
            this.f56420d = contactsRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo50110a(C28261a aVar) {
            C40767b u4 = this.f56420d.f56408h;
            C41536l.m120488h(aVar, "it");
            u4.onNext(new C28271f.C28273b(aVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50110a((C28261a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$j */
    static final class C20982j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f56421d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20982j(long j) {
            super(1);
            this.f56421d = j;
        }

        /* renamed from: a */
        public final Boolean invoke(C28263c cVar) {
            boolean z;
            C41536l.m120489i(cVar, "it");
            if (cVar.mo67876a() == this.f56421d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$k */
    static final class C20983k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56422d;

        /* renamed from: e */
        final /* synthetic */ boolean f56423e;

        /* renamed from: f */
        final /* synthetic */ Long f56424f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20983k(ContactsRepositoryImpl contactsRepositoryImpl, boolean z, Long l) {
            super(1);
            this.f56422d = contactsRepositoryImpl;
            this.f56423e = z;
            this.f56424f = l;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            boolean z = true;
            this.f56422d.f56406f.mo48468i0(this.f56422d.f56405e.mo48767a(list), !this.f56423e);
            ContactsRepositoryImpl contactsRepositoryImpl = this.f56422d;
            if (this.f56424f != null) {
                long size = (long) list.size();
                Long l = this.f56424f;
                if (l != null && size == l.longValue()) {
                    z = false;
                }
            }
            contactsRepositoryImpl.f56410j = z;
            return this.f56422d.f56406f.mo48463K3();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$l */
    static final class C20984l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20984l(ContactsRepositoryImpl contactsRepositoryImpl) {
            super(1);
            this.f56425d = contactsRepositoryImpl;
        }

        /* renamed from: a */
        public final C28262b invoke(ContactAccountApiModel contactAccountApiModel) {
            C41536l.m120489i(contactAccountApiModel, "it");
            return this.f56425d.f56405e.mo48769c(contactAccountApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$m */
    static final class C20985m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56426d;

        /* renamed from: e */
        final /* synthetic */ long f56427e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20985m(ContactsRepositoryImpl contactsRepositoryImpl, long j) {
            super(1);
            this.f56426d = contactsRepositoryImpl;
            this.f56427e = j;
        }

        /* renamed from: a */
        public final void mo50114a(C28262b bVar) {
            ContactsRepositoryImpl contactsRepositoryImpl = this.f56426d;
            long j = this.f56427e;
            C41536l.m120488h(bVar, "it");
            contactsRepositoryImpl.m67919N4(j, bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50114a((C28262b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$n */
    static final class C20986n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20986n(ContactsRepositoryImpl contactsRepositoryImpl) {
            super(1);
            this.f56428d = contactsRepositoryImpl;
        }

        /* renamed from: a */
        public final C28261a invoke(ContactApiModel contactApiModel) {
            C41536l.m120489i(contactApiModel, "it");
            return this.f56428d.f56405e.mo48768b(contactApiModel);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$o */
    static final class C20987o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsRepositoryImpl f56429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20987o(ContactsRepositoryImpl contactsRepositoryImpl) {
            super(1);
            this.f56429d = contactsRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo50116a(C28261a aVar) {
            ContactsRepositoryImpl contactsRepositoryImpl = this.f56429d;
            C41536l.m120488h(aVar, "it");
            contactsRepositoryImpl.m67909D4(aVar);
            this.f56429d.f56408h.onNext(new C28271f.C28274c(aVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50116a((C28261a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$p */
    static final class C20988p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f56430d;

        /* renamed from: e */
        final /* synthetic */ ContactsRepositoryImpl f56431e;

        /* renamed from: f */
        final /* synthetic */ int f56432f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20988p(List list, ContactsRepositoryImpl contactsRepositoryImpl, int i) {
            super(1);
            this.f56430d = list;
            this.f56431e = contactsRepositoryImpl;
            this.f56432f = i;
        }

        /* renamed from: a */
        public final void mo50117a(BankApiResponse bankApiResponse) {
            boolean z;
            for (Number longValue : this.f56430d) {
                C28261a R3 = this.f56431e.f56406f.mo48466R3(longValue.longValue());
                if (R3 != null) {
                    ContactsRepositoryImpl contactsRepositoryImpl = this.f56431e;
                    if (this.f56432f == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    contactsRepositoryImpl.m67909D4(C28261a.m86864b(R3, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (C28267d) null, (List) null, (C28269e) null, 0, false, false, z, false, (String) null, false, false, 126975, (Object) null));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50117a((BankApiResponse) obj);
            return C41238w.f97225a;
        }
    }

    public ContactsRepositoryImpl(IRetrofitService iRetrofitService, C20289a aVar, C20051a aVar2, C27494a aVar3) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(aVar2, "contactsCache");
        C41536l.m120489i(aVar3, "otpParamsMapBuilder");
        this.f56404d = iRetrofitService;
        this.f56405e = aVar;
        this.f56406f = aVar2;
        this.f56407g = aVar3;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ContactEvent>()");
        this.f56408h = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<ContactAccountEvent>()");
        this.f56409i = h12;
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public static final void m67906A4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: B4 */
    public static final C28262b m67907B4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28262b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public final void m67908C4(C28261a aVar) {
        this.f56406f.mo48465R2(aVar);
        this.f56408h.onNext(new C28271f.C28272a(aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public final void m67909D4(C28261a aVar) {
        this.f56406f.mo48469j0(aVar);
        this.f56408h.onNext(new C28271f.C28275d(aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public static final void m67910E4(ContactsRepositoryImpl contactsRepositoryImpl, long j, String str) {
        C41536l.m120489i(contactsRepositoryImpl, "this$0");
        C41536l.m120489i(str, "$accountNumber");
        contactsRepositoryImpl.m67952z4(j, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: F4 */
    public static final void m67911F4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        if (r6 != false) goto L_0x0036;
     */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final ed1.C40762x m67912G4(long r14, java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            r0 = r13
            r12 = r19
            ge.bog.mobilebank.rest.service.IRetrofitService r1 = r0.f56404d
            java.lang.String r2 = "CLIENTS_EDIT_CONNECTION"
            r3 = 0
            if (r12 == 0) goto L_0x000e
            java.lang.String r4 = "N"
            r8 = r4
            goto L_0x000f
        L_0x000e:
            r8 = r3
        L_0x000f:
            r4 = 1
            if (r20 == 0) goto L_0x0018
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r9 = r5
            goto L_0x0019
        L_0x0018:
            r9 = r3
        L_0x0019:
            r5 = 0
            if (r17 == 0) goto L_0x0025
            int r6 = r17.length()
            if (r6 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r6 = r5
            goto L_0x0026
        L_0x0025:
            r6 = r4
        L_0x0026:
            if (r6 != 0) goto L_0x0036
            if (r17 == 0) goto L_0x0033
            boolean r6 = cf1.C40439w.m117118v(r17)
            if (r6 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r6 = r5
            goto L_0x0034
        L_0x0033:
            r6 = r4
        L_0x0034:
            if (r6 == 0) goto L_0x0037
        L_0x0036:
            r5 = r4
        L_0x0037:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            if (r21 == 0) goto L_0x0041
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L_0x0041:
            r11 = r3
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            ed1.x r1 = r1.editContact(r2, r3, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r2 = "service.editContact(\n   …er) 1 else null\n        )"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            ed1.x r1 = p707as.C19273c.m64722h(r1)
            ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$e r2 = new ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$e
            r2.<init>(r13)
            ds.o r3 = new ds.o
            r3.<init>(r2)
            ed1.x r1 = r1.mo95062A(r3)
            ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$f r2 = new ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl$f
            r2.<init>(r12, r13)
            ds.p r3 = new ds.p
            r3.<init>(r2)
            ed1.x r1 = r1.mo95084m(r3)
            java.lang.String r2 = "private fun editContact(…        }\n        }\n    }"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl.m67912G4(long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):ed1.x");
    }

    /* renamed from: H4 */
    static /* synthetic */ C40762x m67913H4(ContactsRepositoryImpl contactsRepositoryImpl, long j, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        return contactsRepositoryImpl.m67912G4(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3);
    }

    /* access modifiers changed from: private */
    /* renamed from: I4 */
    public static final C28261a m67914I4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28261a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: J4 */
    public static final void m67915J4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: K4 */
    public static final void m67916K4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: L4 */
    public static final void m67917L4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: M4 */
    public static final void m67918M4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: N4 */
    public final void m67919N4(long j, C28262b bVar) {
        C28262b L0 = this.f56406f.mo48464L0(j, bVar);
        this.f56409i.onNext(new C28263c.C28266c(j, bVar));
        if (L0 != null) {
            this.f56409i.onNext(new C28263c.C28266c(j, L0));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O4 */
    public static final boolean m67920O4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P4 */
    public static final List m67921P4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q4 */
    public static final C28262b m67922Q4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28262b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: R4 */
    public static final void m67923R4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: S4 */
    public static final C28261a m67924S4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28261a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: T4 */
    public static final void m67925T4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: U4 */
    public static final void m67926U4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public final void m67951y4(long j, C28262b bVar) {
        C28261a A3 = this.f56406f.mo48462A3(j, bVar);
        if (A3 != null) {
            this.f56408h.onNext(new C28271f.C28275d(A3));
        }
        this.f56409i.onNext(new C28263c.C28264a(j, bVar));
    }

    /* renamed from: z4 */
    private final void m67952z4(long j, String str) {
        C28261a f = this.f56406f.mo48467f(j, str);
        if (f != null) {
            this.f56408h.onNext(new C28271f.C28275d(f));
        }
        this.f56409i.onNext(new C28263c.C28265b(j, str));
    }

    /* renamed from: D2 */
    public C40734b mo50078D2(List list, int i, String str, String str2, String str3) {
        C41536l.m120489i(list, "contactIds");
        C40762x m = this.f56404d.useOtpForActionSingle(this.f56407g.mo66809a(new TrustUntrustContactParams(list, i, BankApi.SERVICE_CLIENTS_TRUST_OR_UNTRUST_CONNECTION, str, str2, str3))).mo95084m(new C20066n(new C20988p(list, this, i)));
        C41536l.m120488h(m, "override fun trustOrUntr…   }.ignoreResult()\n    }");
        return C19273c.m64720f(m);
    }

    /* renamed from: F2 */
    public C40734b mo50079F2(long j, File file) {
        C41536l.m120489i(file, "profilePicture");
        C41939y.C41942c.C41943a aVar = C41939y.C41942c.f98597c;
        String name = file.getName();
        C41536l.m120488h(name, "profilePicture.name");
        C40762x<BankApiResponse<ContactApiModel>> contactProfilePicture = this.f56404d.setContactProfilePicture("CLIENTS_EDIT_CONNECTION", j, aVar.mo97031b(name, file.getName(), C41872c0.f98276a.mo96710b(file, C41937x.f98573e.mo97020b("multipart/form-data"))));
        C41536l.m120488h(contactProfilePicture, "service.setContactProfil…VICE_ID, contactId, body)");
        C40734b y = C19273c.m64722h(contactProfilePicture).mo95062A(new C20063k(new C20986n(this))).mo95084m(new C20064l(new C20987o(this))).mo95092y();
        C41536l.m120488h(y, "override fun setProfileI…  }.ignoreElement()\n    }");
        return y;
    }

    /* renamed from: I0 */
    public C40734b mo50080I0(long j, String str) {
        boolean z;
        C41536l.m120489i(str, "accountNumber");
        C28262b m1 = this.f56406f.mo48470m1(j, str);
        if (m1 != null) {
            z = m1.mo67873g();
        } else {
            z = false;
        }
        C40762x<BankApiResponse<ContactAccountApiModel>> favoriteContact = this.f56404d.setFavoriteContact("CLIENTS_EDIT_CONNECTION_ACCOUNT", j, str, z ^ true ? 1 : 0);
        C41536l.m120488h(favoriteContact, "service.setFavoriteConta…orite) 1 else 0\n        )");
        C40734b y = C19273c.m64722h(favoriteContact).mo95062A(new C20069q(new C20984l(this))).mo95084m(new C20070r(new C20985m(this, j))).mo95092y();
        C41536l.m120488h(y, "override fun setFavorite…  }.ignoreElement()\n    }");
        return y;
    }

    /* renamed from: J2 */
    public C40734b mo50081J2(long j, String str) {
        C41536l.m120489i(str, "fullName");
        C40734b y = m67913H4(this, j, str, (String) null, (String) null, false, false, false, 124, (Object) null).mo95084m(new C20055c(new C20979g(this))).mo95092y();
        C41536l.m120488h(y, "override fun editContact…  }.ignoreElement()\n    }");
        return y;
    }

    /* renamed from: J3 */
    public C40749p mo50082J3() {
        return this.f56408h;
    }

    /* renamed from: Q1 */
    public C40734b mo50083Q1(long j, String str) {
        C41536l.m120489i(str, "nickname");
        C40734b y = m67913H4(this, j, (String) null, str, (String) null, false, false, false, 122, (Object) null).mo95084m(new C20060h(new C20980h(this))).mo95092y();
        C41536l.m120488h(y, "override fun editContact…  }.ignoreElement()\n    }");
        return y;
    }

    /* renamed from: S3 */
    public C40734b mo50084S3(long j, String str) {
        C41536l.m120489i(str, "accountNumber");
        C40762x<BankApiResponse<ContactAccountApiModel>> addAccountToContact = this.f56404d.addAccountToContact("CLIENTS_ADD_CONNECTION_ACCOUNT", j, str);
        C41536l.m120488h(addAccountToContact, "service.addAccountToCont…  accountNumber\n        )");
        C40734b y = C19273c.m64722h(addAccountToContact).mo95062A(new C20056d(new C20974b(this))).mo95084m(new C20057e(new C20975c(this, j))).mo95092y();
        C41536l.m120488h(y, "override fun addAccount(…  }.ignoreElement()\n    }");
        return y;
    }

    /* renamed from: U2 */
    public C40734b mo50085U2(long j, String str) {
        boolean z;
        String str2;
        boolean z2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = null;
        } else {
            str2 = str;
        }
        if (str2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40734b y = m67913H4(this, j, (String) null, (String) null, str2, false, false, z2, 54, (Object) null).mo95084m(new C20065m(new C20981i(this))).mo95092y();
        C41536l.m120488h(y, "override fun editPhoneNu…  }.ignoreElement()\n    }");
        return y;
    }

    /* renamed from: Y2 */
    public C40734b mo50086Y2(long j) {
        C40734b y = m67913H4(this, j, (String) null, (String) null, (String) null, true, false, false, 110, (Object) null).mo95092y();
        C41536l.m120488h(y, "editContact(contactId, d…e = true).ignoreElement()");
        return y;
    }

    public void clean() {
        this.f56408h.onComplete();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create()");
        this.f56408h = h1;
        this.f56409i.onComplete();
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create()");
        this.f56409i = h12;
    }

    /* renamed from: f */
    public C40734b mo50087f(long j, String str) {
        C41536l.m120489i(str, "accountNumber");
        C40762x<BankApiResponse<Map<String, String>>> deleteContactAccount = this.f56404d.deleteContactAccount("CLIENTS_DELETE_CONNECTION_ACCOUNT", j, str);
        C41536l.m120488h(deleteContactAccount, "service.deleteContactAcc…contactId, accountNumber)");
        C40734b o = C19273c.m64720f(deleteContactAccount).mo94902o(new C20058f(this, j, str));
        C41536l.m120488h(o, "service.deleteContactAcc…ountNumber)\n            }");
        return o;
    }

    /* renamed from: j1 */
    public C40762x mo50088j1(boolean z, Long l) {
        Long l2;
        Long l3;
        long j;
        if (!z && this.f56410j) {
            C40762x z2 = C40762x.m118162z(this.f56406f.mo48463K3());
            C41536l.m120488h(z2, "just(contactsCache.getContacts())");
            return z2;
        } else if (z || l == null || l.longValue() > ((long) this.f56406f.size())) {
            if (l != null) {
                if (z) {
                    j = 0;
                } else {
                    j = (long) this.f56406f.size();
                }
                l3 = Long.valueOf(Long.valueOf(j).longValue() + 1);
                l2 = l;
            } else {
                l3 = null;
                l2 = null;
            }
            C40762x<BankApiResponse<List<ContactApiModel>>> contacts = this.f56404d.getContacts("COLLECTOR_GET_CONTACTS", l3, l2);
            C41536l.m120488h(contacts, "service.getContacts(CONT…_SERVICE_ID, from, count)");
            C40762x A = C19273c.m64722h(contacts).mo95062A(new C20061i(new C20983k(this, z, l)));
            C41536l.m120488h(A, "override fun getContacts…ontacts()\n        }\n    }");
            return A;
        } else {
            C40762x z3 = C40762x.m118162z(this.f56406f.mo48463K3());
            C41536l.m120488h(z3, "just(contactsCache.getContacts())");
            return z3;
        }
    }

    /* renamed from: t3 */
    public C40749p mo50089t3(long j) {
        C40749p M = this.f56409i.mo94990M(new C20059g(new C20982j(j)));
        C41536l.m120488h(M, "contactId: Long): Observ….contactId == contactId }");
        return M;
    }

    /* renamed from: v3 */
    public C40734b mo50090v3(long j) {
        C40734b y = m67913H4(this, j, (String) null, (String) null, (String) null, false, true, false, 94, (Object) null).mo95084m(new C20062j(new C20976d(this))).mo95092y();
        C41536l.m120488h(y, "override fun deleteProfi…  }.ignoreElement()\n    }");
        return y;
    }
}

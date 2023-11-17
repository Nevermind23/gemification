package w70;

import ed1.C40734b;
import ed1.C40762x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l80.C25847a;
import p341ge.bog.mobilebank.consumerloanapplication.data.creditinfo.entity.CreditInfoStatusEntity;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import ue1.C43075l;
import v70.C29000a;
import x70.C29656a;

/* renamed from: w70.b */
public final class C29239b implements C25847a {

    /* renamed from: b */
    public static final C29240a f74306b = new C29240a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C29000a f74307a;

    /* renamed from: w70.b$a */
    public static final class C29240a {
        private C29240a() {
        }

        public /* synthetic */ C29240a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: w70.b$b */
    static final class C29241b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29241b f74308d = new C29241b();

        C29241b() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "statuses");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C29656a.m89993a((CreditInfoStatusEntity) it.next()));
            }
            return arrayList;
        }
    }

    public C29239b(C29000a aVar) {
        C41536l.m120489i(aVar, "service");
        this.f74307a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m89209d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo64633a() {
        C40762x A = this.f74307a.mo68842J("CREDIT_INFO_GET_CUSTOMER_INFO, CREDIT_INFO_GET_CUSTOMER_INFO_OFFER").mo95062A(new C29238a(C29241b.f74308d));
        C41536l.m120488h(A, "service.getCreditInfoSta…t.toCreditInoStatus() } }");
        return A;
    }

    /* renamed from: b */
    public C40734b mo64634b(String str, String str2, String str3, String str4, String str5, String str6) {
        return this.f74307a.mo68839G("CREDIT_INFO_GET_CUSTOMER_INFO", str, str2, "CREDIT_INFO_GET_CUSTOMER_INFO_OFFER", str3, "CREDIT_INFO_GET_CUSTOMER_INFO_UMTS", str5, str6, str4, PensionStatusResult.STATUS_ACTIVE, PensionStatusResult.STATUS_INACTIVE);
    }
}

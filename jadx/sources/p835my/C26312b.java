package p835my;

import ed1.C40762x;
import gd0.C20800a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p845ny.C26639a;
import ue1.C43075l;

/* renamed from: my.b */
public final class C26312b implements C20800a {

    /* renamed from: b */
    public static final C26313a f66673b = new C26313a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f66674a;

    /* renamed from: my.b$a */
    public static final class C26313a {
        private C26313a() {
        }

        public /* synthetic */ C26313a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: my.b$b */
    static final class C26314b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26314b f66675d = new C26314b();

        C26314b() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "entities");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LookupEntity lookupEntity = (LookupEntity) it.next();
                C41536l.m120488h(lookupEntity, "it");
                arrayList.add(C26639a.m83111a(lookupEntity));
            }
            return arrayList;
        }
    }

    public C26312b(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f66674a = iRetrofitService;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m82289c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo49413a(String str) {
        C41536l.m120489i(str, "lookupName");
        C40762x<BankApiResponse<List<LookupEntity>>> lookup = this.f66674a.lookup(BankApi.COMMON_GET_LOOKUP_DATA, str);
        C41536l.m120488h(lookup, "service.lookup(COMMON_GET_LOOKUP_DATA, lookupName)");
        C40762x A = C19273c.m64722h(lookup).mo95062A(new C26311a(C26314b.f66675d));
        C41536l.m120488h(A, "service.lookup(COMMON_GE…s.map { it.toLookup() } }");
        return A;
    }
}

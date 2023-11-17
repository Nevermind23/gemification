package u60;

import com.google.gson.Gson;
import ed1.C40734b;
import ed1.C40762x;
import he1.C41217g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.products.cards.mcc.data.entity.MccStateEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import ue1.C43064a;
import ue1.C43075l;
import x60.C29655a;

/* renamed from: u60.b */
public final class C28602b implements C29655a {

    /* renamed from: a */
    private final IRetrofitService f72552a;

    /* renamed from: b */
    private final C41217g f72553b = C41219i.m119470b(C28604b.f72555d);

    /* renamed from: u60.b$a */
    static final class C28603a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C28603a f72554d = new C28603a();

        C28603a() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((MccStateEntity) it.next()).toMccState());
            }
            return arrayList;
        }
    }

    /* renamed from: u60.b$b */
    static final class C28604b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C28604b f72555d = new C28604b();

        C28604b() {
            super(0);
        }

        /* renamed from: b */
        public final Gson invoke() {
            return new Gson();
        }
    }

    public C28602b(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f72552a = iRetrofitService;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m87557d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo68317a(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x<BankApiResponse<HashMap<String, String>>> useOtpForActionSingle = this.f72552a.useOtpForActionSingle(hashMap);
        C41536l.m120488h(useOtpForActionSingle, "service.useOtpForActionSingle(params)");
        return C19273c.m64720f(useOtpForActionSingle);
    }

    /* renamed from: b */
    public C40762x mo68318b(long j) {
        C40762x<BankApiResponse<List<MccStateEntity>>> mccStates = this.f72552a.getMccStates("CARDS_GET_CARD_MCC_STATE", j);
        C41536l.m120488h(mccStates, "service.getMccStates(Mcc…T_CARD_MCC_STATE, cardId)");
        C40762x A = C19273c.m64722h(mccStates).mo95062A(new C28601a(C28603a.f72554d));
        C41536l.m120488h(A, "service.getMccStates(Mcc…tateEntity::toMccState) }");
        return A;
    }
}

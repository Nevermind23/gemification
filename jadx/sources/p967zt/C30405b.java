package p967zt;

import ed1.C40762x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.p764zk.entity.UmtsCardApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.p764zk.entity.UmtsCardsApiModel;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p785hx.C25077a;
import p956yt.C30113a;
import ue1.C43075l;

/* renamed from: zt.b */
public final class C30405b implements C25077a {

    /* renamed from: c */
    public static final C30406a f76387c = new C30406a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f76388a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C30113a f76389b;

    /* renamed from: zt.b$a */
    public static final class C30406a {
        private C30406a() {
        }

        public /* synthetic */ C30406a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: zt.b$b */
    static final class C30407b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30405b f76390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30407b(C30405b bVar) {
            super(1);
            this.f76390d = bVar;
        }

        /* renamed from: a */
        public final List invoke(UmtsCardsApiModel umtsCardsApiModel) {
            C41536l.m120489i(umtsCardsApiModel, "apiModel");
            ArrayList arrayList = new ArrayList();
            for (ArrayList addAll : umtsCardsApiModel.getCards().values()) {
                arrayList.addAll(addAll);
            }
            C30113a c = this.f76390d.f76389b;
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                if (hashSet.add(((UmtsCardApiEntity) next).getId())) {
                    arrayList2.add(next);
                }
            }
            String customUrl = umtsCardsApiModel.getCustomUrl();
            if (customUrl == null) {
                customUrl = "";
            }
            return c.mo70402b(arrayList2, customUrl);
        }
    }

    public C30405b(IRetrofitService iRetrofitService, C30113a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f76388a = iRetrofitService;
        this.f76389b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m91704d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo63533a(String str) {
        C41536l.m120489i(str, "mySystemName");
        C40762x<BankApiResponse<UmtsCardsApiModel>> umtsCards = this.f76388a.getUmtsCards("CARDS_GET_UMTS_CARDS", str, 0L);
        C41536l.m120488h(umtsCards, "service.getUmtsCards(UMT…VICE_ID, mySystemName, 0)");
        C40762x A = C19273c.m64722h(umtsCards).mo95062A(new C30404a(new C30407b(this)));
        C41536l.m120488h(A, "override fun getUmtsCard…: \"\")\n            }\n    }");
        return A;
    }
}

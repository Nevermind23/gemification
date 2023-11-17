package s21;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import l31.C37066a;
import m31.C37222a;
import p21.C37894a;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.shared.commonpopup.data.model.CommonPopupApiModel;
import q21.C38115a;
import ue1.C43075l;
import v21.C39197a;

/* renamed from: s21.b */
public final class C38419b implements C39197a {

    /* renamed from: a */
    private final C38115a f92005a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C37894a f92006b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C37222a f92007c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Client f92008d;

    /* renamed from: s21.b$a */
    static final class C38420a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38419b f92009d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38420a(C38419b bVar) {
            super(1);
            this.f92009d = bVar;
        }

        /* renamed from: a */
        public final C37066a invoke(List list) {
            C41536l.m120489i(list, "list");
            C37066a a = this.f92009d.f92006b.mo91241a((CommonPopupApiModel) list.get(0));
            C37222a e = this.f92009d.f92007c;
            Long customerId = this.f92009d.f92008d.getUserInfo().getClient().getCustomerId();
            C41536l.m120488h(customerId, "client.userInfo.client.customerId");
            long b = e.mo90295b(customerId.longValue(), a.mo89993h());
            if (b != 0) {
                long j = (long) 60;
                if (System.currentTimeMillis() - b < a.mo89989e() * ((long) 24) * j * j * ((long) 1000)) {
                    throw new Exception("Not enough time has passed");
                }
            }
            return a;
        }
    }

    public C38419b(C38115a aVar, C37894a aVar2, C37222a aVar3, Client client) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "mapper");
        C41536l.m120489i(aVar3, "preferencesManager");
        C41536l.m120489i(client, "client");
        this.f92005a = aVar;
        this.f92006b = aVar2;
        this.f92007c = aVar3;
        this.f92008d = client;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C37066a m112815f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37066a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo91945a() {
        C40762x A = this.f92005a.mo91537a().mo95062A(new C38418a(new C38420a(this)));
        C41536l.m120488h(A, "override fun getPopup():…mmonPopup\n        }\n    }");
        return A;
    }
}

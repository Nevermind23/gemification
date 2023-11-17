package p468in;

import ed1.C40734b;
import ed1.C40762x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardBenefitsEntity;
import p341ge.bog.mobilebank.cardproducts.data.entity.ChildInfoApiModel;
import p440gn.C15362a;
import p454hn.C15535a;
import p467im.C15700a;
import p538nn.C17110a;
import ue1.C43075l;

/* renamed from: in.c */
public final class C15704c implements C17110a {

    /* renamed from: a */
    private final C15535a f44530a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C15362a f44531b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C15700a f44532c;

    /* renamed from: in.c$a */
    static final class C15705a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15704c f44533d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15705a(C15704c cVar) {
            super(1);
            this.f44533d = cVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "entities");
            C15704c cVar = this.f44533d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cVar.f44532c.mo43030i((CardBenefitsEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: in.c$b */
    static final class C15706b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15704c f44534d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15706b(C15704c cVar) {
            super(1);
            this.f44534d = cVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "list");
            C15704c cVar = this.f44534d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cVar.f44531b.mo42452a((ChildInfoApiModel) it.next()));
            }
            return arrayList;
        }
    }

    public C15704c(C15535a aVar, C15362a aVar2, C15700a aVar3) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "mapper");
        C41536l.m120489i(aVar3, "debitCardMapper");
        this.f44530a = aVar;
        this.f44531b = aVar2;
        this.f44532c = aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final List m56590j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final List m56591k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo43047a(long j) {
        C40762x A = this.f44530a.mo42646a(j).mo95062A(new C15703b(new C15706b(this)));
        C41536l.m120488h(A, "override fun getChildInf…        }\n        }\n    }");
        return A;
    }

    /* renamed from: b */
    public C40734b mo43048b(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        return this.f44530a.mo42647b(hashMap);
    }

    /* renamed from: c */
    public C40734b mo43049c(long j, long j2) {
        return this.f44530a.mo42648c(j, j2);
    }

    /* renamed from: d */
    public C40734b mo43050d(long j, long j2) {
        return this.f44530a.mo42649d(j, j2);
    }

    /* renamed from: e */
    public C40762x mo43051e(String str) {
        C41536l.m120489i(str, "subProductCode");
        C40762x A = this.f44530a.mo42650e(str).mo95062A(new C15702a(new C15705a(this)));
        C41536l.m120488h(A, "override fun getCardBene…        }\n        }\n    }");
        return A;
    }
}

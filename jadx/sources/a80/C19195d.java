package a80;

import b80.C19342a;
import ed1.C40762x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.ClaDataEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.LoanCalculationEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.LoanTypeEntity;
import r80.C27947a;
import r80.C27948b;
import s80.C28162a;
import ue1.C43075l;
import v70.C29000a;

/* renamed from: a80.d */
public final class C19195d implements C28162a {

    /* renamed from: a */
    private final C29000a f53399a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C19342a f53400b;

    /* renamed from: a80.d$a */
    static final class C19196a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19195d f53401d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19196a(C19195d dVar) {
            super(1);
            this.f53401d = dVar;
        }

        /* renamed from: a */
        public final C27948b invoke(LoanCalculationEntity loanCalculationEntity) {
            C41536l.m120489i(loanCalculationEntity, "it");
            return this.f53401d.f53400b.mo47544c(loanCalculationEntity);
        }
    }

    /* renamed from: a80.d$b */
    static final class C19197b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19195d f53402d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19197b(C19195d dVar) {
            super(1);
            this.f53402d = dVar;
        }

        /* renamed from: a */
        public final C27947a invoke(ClaDataEntity claDataEntity) {
            C41536l.m120489i(claDataEntity, "it");
            return this.f53402d.f53400b.mo47542a(claDataEntity);
        }
    }

    /* renamed from: a80.d$c */
    static final class C19198c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19195d f53403d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19198c(C19195d dVar) {
            super(1);
            this.f53403d = dVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C19195d dVar = this.f53403d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(dVar.f53400b.mo47545d((LoanTypeEntity) it.next()));
            }
            return arrayList;
        }
    }

    public C19195d(C29000a aVar, C19342a aVar2) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "mapper");
        this.f53399a = aVar;
        this.f53400b = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C27948b m64606h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27948b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C27947a m64607i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27947a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final List m64608j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: c */
    public C40762x mo47414c() {
        C40762x A = this.f53399a.mo68846c().mo95062A(new C19193b(new C19198c(this)));
        C41536l.m120488h(A, "override fun getLoanType…transform(loan) } }\n    }");
        return A;
    }

    /* renamed from: e */
    public C40762x mo47415e(String str, String str2) {
        C41536l.m120489i(str, "loanType");
        C41536l.m120489i(str2, "subProduct");
        C40762x A = this.f53399a.mo68848e(str, str2).mo95062A(new C19192a(new C19197b(this)));
        C41536l.m120488h(A, "override fun getLoanDeta…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: f */
    public C40762x mo47416f(String str, String str2) {
        C41536l.m120489i(str, "principalAmount");
        C41536l.m120489i(str2, "paymentCount");
        C40762x A = this.f53399a.mo68849f(str, str2).mo95062A(new C19194c(new C19196a(this)));
        C41536l.m120488h(A, "override fun calculateLo…per.transform(it) }\n    }");
        return A;
    }
}

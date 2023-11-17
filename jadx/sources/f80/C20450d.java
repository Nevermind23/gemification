package f80;

import com.google.gson.Gson;
import com.salesforce.marketingcloud.C11398b;
import ed1.C40762x;
import g80.C20778a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.ApplicationSalaryInfoEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.LoanPrepareApplicationEntity;
import ue1.C43075l;
import v70.C29000a;
import x80.C29658b;
import x80.C29660d;
import y80.C29954a;

/* renamed from: f80.d */
public final class C20450d implements C29954a {

    /* renamed from: a */
    private final C29000a f55447a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C20778a f55448b;

    /* renamed from: c */
    private final Gson f55449c;

    /* renamed from: f80.d$a */
    static final class C20451a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20450d f55450d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20451a(C20450d dVar) {
            super(1);
            this.f55450d = dVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "salaries");
            C20778a g = this.f55450d.f55448b;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g.mo49319d((ApplicationSalaryInfoEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: f80.d$b */
    /* synthetic */ class C20452b extends C41535k implements C43075l {
        C20452b(Object obj) {
            super(1, obj, C20778a.class, "transform", "transform(Lge/bog/mobilebank/consumerloanapplication/data/prepareapplication/entity/LoanPrepareApplicationEntity;)Lge/bog/mobilebank/consumerloanapplication/domain/prepareapplication/model/PrepareApplication;", 0);
        }

        /* renamed from: b */
        public final C29660d invoke(LoanPrepareApplicationEntity loanPrepareApplicationEntity) {
            C41536l.m120489i(loanPrepareApplicationEntity, "p0");
            return ((C20778a) this.receiver).mo49321f(loanPrepareApplicationEntity);
        }
    }

    /* renamed from: f80.d$c */
    /* synthetic */ class C20453c extends C41535k implements C43075l {
        C20453c(Object obj) {
            super(1, obj, C20778a.class, "transform", "transform(Lge/bog/mobilebank/consumerloanapplication/data/prepareapplication/entity/LoanPrepareApplicationEntity;)Lge/bog/mobilebank/consumerloanapplication/domain/prepareapplication/model/PrepareApplication;", 0);
        }

        /* renamed from: b */
        public final C29660d invoke(LoanPrepareApplicationEntity loanPrepareApplicationEntity) {
            C41536l.m120489i(loanPrepareApplicationEntity, "p0");
            return ((C20778a) this.receiver).mo49321f(loanPrepareApplicationEntity);
        }
    }

    public C20450d(C29000a aVar, C20778a aVar2, Gson gson) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "mapper");
        C41536l.m120489i(gson, "gson");
        this.f55447a = aVar;
        this.f55448b = aVar2;
        this.f55449c = gson;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final List m66626h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C29660d m66627i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29660d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C29660d m66628j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29660d) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo48965a(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        C41536l.m120489i(str, "applicationType");
        String str8 = str2;
        C41536l.m120489i(str8, "product");
        String str9 = str3;
        C41536l.m120489i(str9, "subProduct");
        String str10 = str4;
        C41536l.m120489i(str10, "loanAmount");
        String str11 = str5;
        C41536l.m120489i(str11, "term");
        String str12 = str6;
        C41536l.m120489i(str12, "loanCurrency");
        String str13 = str7;
        C41536l.m120489i(str13, "approveForRSCustomerInfoDocument");
        C40762x A = C29000a.C29001a.m88728a(this.f55447a, str, str8, str9, str10, str12, str11, Boolean.valueOf(z), str13, (String) null, C11398b.f33139r, (Object) null).mo95062A(new C20449c(new C20452b(this.f55448b)));
        C41536l.m120488h(A, "service.prepareApplicati… ).map(mapper::transform)");
        return A;
    }

    /* renamed from: b */
    public C40762x mo48966b(String str, String str2, String str3, C29658b bVar) {
        C41536l.m120489i(str, "applicationType");
        C41536l.m120489i(str2, "product");
        C41536l.m120489i(str3, "applicationId");
        C41536l.m120489i(bVar, "applicationData");
        C40762x A = C29000a.C29001a.m88729b(this.f55447a, str, str2, str3, this.f55449c.mo18181w(this.f55448b.mo49317b(bVar)), (String) null, 16, (Object) null).mo95062A(new C20447a(new C20453c(this.f55448b)));
        C41536l.m120488h(A, "service.updateApplicatio… ).map(mapper::transform)");
        return A;
    }

    /* renamed from: d */
    public C40762x mo48967d(String str) {
        C41536l.m120489i(str, "applicationId");
        C40762x A = this.f55447a.mo68847d(str).mo95062A(new C20448b(new C20451a(this)));
        C41536l.m120488h(A, "override fun getApplican…apper::transform) }\n    }");
        return A;
    }
}

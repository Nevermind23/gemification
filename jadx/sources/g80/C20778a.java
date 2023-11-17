package g80;

import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.ApplicationSalaryInfoEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.CLApplicationDataEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.ClLoanDetailsEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.LoanPrepareApplicationEntity;
import x80.C29657a;
import x80.C29658b;
import x80.C29659c;
import x80.C29660d;

/* renamed from: g80.a */
public final class C20778a {
    /* renamed from: a */
    public final ApplicationSalaryInfoEntity mo49316a(C29657a aVar) {
        C41536l.m120489i(aVar, "salary");
        return new ApplicationSalaryInfoEntity(aVar.mo69578d(), aVar.mo69585i(), aVar.mo69575a(), aVar.mo69577c(), aVar.mo69579e(), aVar.mo69582g(), aVar.mo69581f(), aVar.mo69583h(), aVar.mo69576b(), (String) null, C11398b.f33140s, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final CLApplicationDataEntity mo49317b(C29658b bVar) {
        C41536l.m120489i(bVar, "clApplicationData");
        return new CLApplicationDataEntity(mo49318c(bVar.mo69588a()));
    }

    /* renamed from: c */
    public final List mo49318c(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo49316a((C29657a) it.next()));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final C29657a mo49319d(ApplicationSalaryInfoEntity applicationSalaryInfoEntity) {
        C41536l.m120489i(applicationSalaryInfoEntity, "salary");
        return new C29657a(applicationSalaryInfoEntity.getId(), applicationSalaryInfoEntity.getSourceOfIncome(), applicationSalaryInfoEntity.getAmount(), applicationSalaryInfoEntity.getCurrency(), applicationSalaryInfoEntity.getOrganization(), applicationSalaryInfoEntity.getOrganizationInn(), applicationSalaryInfoEntity.getOrganizationAddress(), applicationSalaryInfoEntity.getPosition(), applicationSalaryInfoEntity.getComment(), applicationSalaryInfoEntity.getSourceOfIncomeDictionaryKey());
    }

    /* renamed from: e */
    public final C29659c mo49320e(ClLoanDetailsEntity clLoanDetailsEntity) {
        C41536l.m120489i(clLoanDetailsEntity, "loanDetails");
        return new C29659c(clLoanDetailsEntity.getAmount(), clLoanDetailsEntity.getCurrency(), clLoanDetailsEntity.getResultCodeDictionaryKey(), clLoanDetailsEntity.getApplicationStatus(), clLoanDetailsEntity.getApplicationId());
    }

    /* renamed from: f */
    public final C29660d mo49321f(LoanPrepareApplicationEntity loanPrepareApplicationEntity) {
        C41536l.m120489i(loanPrepareApplicationEntity, "prepareApp");
        return new C29660d(mo49320e(loanPrepareApplicationEntity.getLoanDetails()));
    }
}

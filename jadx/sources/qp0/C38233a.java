package qp0;

import g91.C32289b0;
import j31.C36725a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loanactivation.data.entity.LoanAccountEntity;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;
import vp0.C39436a;

/* renamed from: qp0.a */
public final class C38233a {
    /* renamed from: b */
    private final C39436a m112434b(LoanAccountEntity loanAccountEntity) {
        C36725a aVar;
        C36725a asDomainModel;
        C36725a asDomainModel2;
        String productDictionaryKey = loanAccountEntity.getProductDictionaryKey();
        String lastFour = loanAccountEntity.getLastFour();
        Long acctKey = loanAccountEntity.getAcctKey();
        String cardPan = loanAccountEntity.getCardPan();
        String acctNo = loanAccountEntity.getAcctNo();
        ExternalFileEntity externalFile = loanAccountEntity.getExternalFile();
        C36725a aVar2 = null;
        if (externalFile == null || (asDomainModel2 = externalFile.asDomainModel()) == null) {
            aVar = null;
        } else {
            aVar = C36725a.m108889b(asDomainModel2, (String) null, (String) null, (Number) null, false, C32289b0.m95091c(loanAccountEntity.getExternalFile().getFileUrl()), (String) null, 47, (Object) null);
        }
        ExternalFileEntity cardExternalFile = loanAccountEntity.getCardExternalFile();
        if (!(cardExternalFile == null || (asDomainModel = cardExternalFile.asDomainModel()) == null)) {
            aVar2 = C36725a.m108889b(asDomainModel, (String) null, (String) null, (Number) null, false, C32289b0.m95091c(loanAccountEntity.getCardExternalFile().getFileUrl()), (String) null, 47, (Object) null);
        }
        return new C39436a(productDictionaryKey, lastFour, acctKey, cardPan, acctNo, aVar2, aVar);
    }

    /* renamed from: a */
    public final List mo91763a(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m112434b((LoanAccountEntity) it.next()));
        }
        return arrayList;
    }
}

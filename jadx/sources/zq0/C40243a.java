package zq0;

import er0.C31768a;
import er0.C31769b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loanoffers.data.entity.securedloans.ExternalLoanPropertyEntity;
import p341ge.bog.mobilebank.loanoffers.data.entity.securedloans.LoanPropertyEntity;

/* renamed from: zq0.a */
public final class C40243a {
    /* renamed from: a */
    public final C31768a mo94194a(ExternalLoanPropertyEntity externalLoanPropertyEntity) {
        C41536l.m120489i(externalLoanPropertyEntity, "entity");
        return new C31768a(externalLoanPropertyEntity.getId(), externalLoanPropertyEntity.getPropertyId(), externalLoanPropertyEntity.getCadastralCode(), externalLoanPropertyEntity.getName(), externalLoanPropertyEntity.getOrganizationName(), externalLoanPropertyEntity.getAddress(), externalLoanPropertyEntity.getTaxId(), externalLoanPropertyEntity.getCountryId(), externalLoanPropertyEntity.getCountryName(), externalLoanPropertyEntity.getFirstName(), externalLoanPropertyEntity.getLastName());
    }

    /* renamed from: b */
    public final C31769b mo94195b(LoanPropertyEntity loanPropertyEntity) {
        C41536l.m120489i(loanPropertyEntity, "entity");
        return new C31769b(loanPropertyEntity.getId(), loanPropertyEntity.getReference(), loanPropertyEntity.getCadastralCode(), loanPropertyEntity.getPropertyType(), loanPropertyEntity.getRegistrationNumber(), loanPropertyEntity.getParcelFunction(), loanPropertyEntity.getAddress(), loanPropertyEntity.getLatitude(), loanPropertyEntity.getLongitude(), loanPropertyEntity.getUpdateDate(), loanPropertyEntity.getZone(), loanPropertyEntity.getZoneName(), loanPropertyEntity.getSectorName(), loanPropertyEntity.getPropertyArea(), loanPropertyEntity.getDictionaryKey(), loanPropertyEntity.getDictionaryValue());
    }
}

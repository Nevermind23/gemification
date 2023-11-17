package d80;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.consumerloanapplication.data.lookup.entity.OrganizationEntity;
import u80.C28610a;

/* renamed from: d80.a */
public abstract class C19927a {
    /* renamed from: a */
    public static final C28610a m65808a(OrganizationEntity organizationEntity) {
        C41536l.m120489i(organizationEntity, "<this>");
        return new C28610a(organizationEntity.getId(), organizationEntity.getStatId(), organizationEntity.getTaxId(), organizationEntity.getAbbreviation(), organizationEntity.getAbbreviationEn(), organizationEntity.getCustomerName(), organizationEntity.getCustomerNameEn(), organizationEntity.getAddress(), organizationEntity.getAddressEn());
    }
}

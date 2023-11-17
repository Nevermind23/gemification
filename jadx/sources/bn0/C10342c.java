package bn0;

import hn0.C15536a;
import hn0.C15537b;
import hn0.C15538c;
import hn0.C15546k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.kyc.data.network.model.KycDataApiModel;

/* renamed from: bn0.c */
public final class C10342c {
    /* renamed from: a */
    public final C15546k mo26949a(KycDataApiModel kycDataApiModel) {
        C15538c cVar;
        C15537b bVar;
        C15538c cVar2;
        C15537b bVar2;
        C15538c cVar3;
        String str;
        String str2;
        C41536l.m120489i(kycDataApiModel, "data");
        String homeAddressCountry = kycDataApiModel.getClient().getHomeAddressCountry();
        String str3 = "";
        C15538c cVar4 = null;
        if (homeAddressCountry != null) {
            String homeAddressCountryDesc = kycDataApiModel.getClient().getHomeAddressCountryDesc();
            if (homeAddressCountryDesc == null) {
                homeAddressCountryDesc = str3;
            }
            cVar = new C15538c(homeAddressCountry, homeAddressCountryDesc);
        } else {
            cVar = null;
        }
        String homeAddressRegion = kycDataApiModel.getClient().getHomeAddressRegion();
        if (homeAddressRegion != null) {
            String homeAddressRegionDesc = kycDataApiModel.getClient().getHomeAddressRegionDesc();
            if (homeAddressRegionDesc == null) {
                homeAddressRegionDesc = str3;
            }
            if (cVar != null) {
                str2 = cVar.mo42663a();
            } else {
                str2 = null;
            }
            bVar = new C15537b(homeAddressRegion, homeAddressRegionDesc, str2);
        } else {
            bVar = null;
        }
        String facAddressCountry = kycDataApiModel.getClient().getFacAddressCountry();
        if (facAddressCountry != null) {
            String facAddressCountryDesc = kycDataApiModel.getClient().getFacAddressCountryDesc();
            if (facAddressCountryDesc == null) {
                facAddressCountryDesc = str3;
            }
            cVar2 = new C15538c(facAddressCountry, facAddressCountryDesc);
        } else {
            cVar2 = null;
        }
        String facAddressRegion = kycDataApiModel.getClient().getFacAddressRegion();
        if (facAddressRegion != null) {
            String facAddressRegionDesc = kycDataApiModel.getClient().getFacAddressRegionDesc();
            if (facAddressRegionDesc == null) {
                facAddressRegionDesc = str3;
            }
            if (cVar2 != null) {
                str = cVar2.mo42663a();
            } else {
                str = null;
            }
            bVar2 = new C15537b(facAddressRegion, facAddressRegionDesc, str);
        } else {
            bVar2 = null;
        }
        String srcCountry = kycDataApiModel.getClient().getSrcCountry();
        if (srcCountry != null) {
            String srcCountryDesc = kycDataApiModel.getClient().getSrcCountryDesc();
            if (srcCountryDesc == null) {
                srcCountryDesc = str3;
            }
            cVar3 = new C15538c(srcCountry, srcCountryDesc);
        } else {
            cVar3 = null;
        }
        String srcCountry2 = kycDataApiModel.getClient().getSrcCountry2();
        if (srcCountry2 != null) {
            String srcCountry2Desc = kycDataApiModel.getClient().getSrcCountry2Desc();
            if (srcCountry2Desc != null) {
                str3 = srcCountry2Desc;
            }
            cVar4 = new C15538c(srcCountry2, str3);
        }
        return new C15546k(new C15536a(cVar2, bVar2, kycDataApiModel.getClient().getFacAddressLine()), new C15536a(cVar, bVar, kycDataApiModel.getClient().getHomeAddressLine()), cVar3, cVar4, C41536l.m120484d(kycDataApiModel.getClient().getResident(), "Y"));
    }
}

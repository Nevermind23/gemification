package k00;

import hd0.C24978b;
import jd0.C25383a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.packages.data.CrossSellPackageApiModel;

/* renamed from: k00.b */
public final class C25542b {
    /* renamed from: a */
    public final C25383a mo64082a(CrossSellPackageApiModel crossSellPackageApiModel) {
        boolean z;
        C41536l.m120489i(crossSellPackageApiModel, "data");
        String headerDictionaryKey = crossSellPackageApiModel.getHeaderDictionaryKey();
        String str = "";
        if (headerDictionaryKey == null) {
            headerDictionaryKey = str;
        }
        String detailDictionaryKey = crossSellPackageApiModel.getDetailDictionaryKey();
        if (detailDictionaryKey == null) {
            detailDictionaryKey = str;
        }
        String iconUrl = crossSellPackageApiModel.getIconUrl();
        if (iconUrl != null) {
            str = iconUrl;
        }
        C24978b showFlag = crossSellPackageApiModel.getShowFlag();
        if (showFlag != null) {
            z = showFlag.mo63390c();
        } else {
            z = false;
        }
        return new C25383a(headerDictionaryKey, detailDictionaryKey, str, z);
    }
}

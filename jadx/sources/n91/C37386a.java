package n91;

import j31.C36725a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;
import p341ge.bog.mobilebank.wishcampaign.data.entity.WishDetailsEntity;
import s91.C38462a;

/* renamed from: n91.a */
public final class C37386a {
    /* renamed from: a */
    public final C38462a mo90480a(WishDetailsEntity wishDetailsEntity) {
        C36725a aVar;
        C36725a aVar2;
        ArrayList arrayList;
        C41536l.m120489i(wishDetailsEntity, "wishDetailsEntity");
        long designId = wishDetailsEntity.getDesignId();
        String wish = wishDetailsEntity.getWish();
        ExternalFileEntity headerExternalFile = wishDetailsEntity.getHeaderExternalFile();
        if (headerExternalFile != null) {
            aVar = headerExternalFile.asDomainModel();
        } else {
            aVar = null;
        }
        ExternalFileEntity cardExternalFile = wishDetailsEntity.getCardExternalFile();
        if (cardExternalFile != null) {
            aVar2 = cardExternalFile.asDomainModel();
        } else {
            aVar2 = null;
        }
        List<ExternalFileEntity> coverExternalFiles = wishDetailsEntity.getCoverExternalFiles();
        if (coverExternalFiles != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(coverExternalFiles, 10));
            for (ExternalFileEntity asDomainModel : coverExternalFiles) {
                arrayList2.add(asDomainModel.asDomainModel());
            }
            arrayList = arrayList2;
        } else {
            arrayList = C41341q.m119907j();
        }
        return new C38462a(designId, wish, aVar, aVar2, arrayList);
    }
}

package p956yt;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.p764zk.entity.UmtsCardApiEntity;
import p794ix.C25265a;

/* renamed from: yt.a */
public final class C30113a {
    /* renamed from: a */
    public final C25265a mo70401a(UmtsCardApiEntity umtsCardApiEntity, String str) {
        C41536l.m120489i(umtsCardApiEntity, "card");
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        return new C25265a(umtsCardApiEntity.getEncryptedPackage(), umtsCardApiEntity.getId(), umtsCardApiEntity.getCardId(), umtsCardApiEntity.getAcctKey(), umtsCardApiEntity.getClientKey(), umtsCardApiEntity.getCardClass(), umtsCardApiEntity.getCardName(), umtsCardApiEntity.getCardType(), umtsCardApiEntity.getProductCode(), umtsCardApiEntity.getSubProductCode(), umtsCardApiEntity.getSubProductGroup(), umtsCardApiEntity.getStatus(), umtsCardApiEntity.getLastFour(), umtsCardApiEntity.getCardHolder(), umtsCardApiEntity.getExpDate(), umtsCardApiEntity.isCardBlocked(), umtsCardApiEntity.getCardPan(), umtsCardApiEntity.getCardForTypeDictionaryKey(), umtsCardApiEntity.getCardForTypeDictionaryValue(), umtsCardApiEntity.getSubProductGroup(), umtsCardApiEntity.isDigitalCard(), umtsCardApiEntity.getProductId(), umtsCardApiEntity.getSubProductId(), umtsCardApiEntity.isDefault(), umtsCardApiEntity.isHidden(), umtsCardApiEntity.isCardExpiring(), umtsCardApiEntity.isCardInactive(), umtsCardApiEntity.getCardMask(), umtsCardApiEntity.getAttachmentFileBase64(), umtsCardApiEntity.getNameDictionaryKey(), umtsCardApiEntity.getNameDictionaryValue(), umtsCardApiEntity.getCardInsSecEntity(), umtsCardApiEntity.isPrimary(), umtsCardApiEntity.getDescription(), umtsCardApiEntity.getPaymentNetwork(), str);
    }

    /* renamed from: b */
    public final List mo70402b(List list, String str) {
        C41536l.m120489i(list, "cards");
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo70401a((UmtsCardApiEntity) it.next(), str));
        }
        return arrayList;
    }
}

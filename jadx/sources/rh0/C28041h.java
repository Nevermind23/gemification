package rh0;

import hd0.C24978b;
import j31.C36725a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardsTransferAccountApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardsTransferAccountsApiModel;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;
import p717bs.C19401a;
import xh0.C29796l;

/* renamed from: rh0.h */
public final class C28041h {
    /* renamed from: a */
    private final C29796l m86443a(GiftCardsTransferAccountApiModel giftCardsTransferAccountApiModel) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        C24978b a;
        C24978b a2;
        long id = giftCardsTransferAccountApiModel.getId();
        String acctNo = giftCardsTransferAccountApiModel.getAcctNo();
        String attachmentId = giftCardsTransferAccountApiModel.getAttachmentId();
        String attachmentUrl = giftCardsTransferAccountApiModel.getAttachmentUrl();
        BigDecimal availableAmount = giftCardsTransferAccountApiModel.getAvailableAmount();
        C36725a c = m86444c(giftCardsTransferAccountApiModel.getCardExternalFile());
        String ccy = giftCardsTransferAccountApiModel.getCcy();
        C36725a c2 = m86444c(giftCardsTransferAccountApiModel.getExternalFile());
        C36725a c3 = m86444c(giftCardsTransferAccountApiModel.getExternalIcon());
        Boolean hasDeposit = giftCardsTransferAccountApiModel.getHasDeposit();
        if (hasDeposit != null) {
            z = hasDeposit.booleanValue();
        } else {
            z = false;
        }
        YesNoApiEntity isDefault = giftCardsTransferAccountApiModel.isDefault();
        if (isDefault == null || (a2 = C19401a.m64892a(isDefault)) == null) {
            z2 = false;
        } else {
            z2 = a2.mo63390c();
        }
        YesNoApiEntity isScoolCardAccount = giftCardsTransferAccountApiModel.isScoolCardAccount();
        if (isScoolCardAccount == null || (a = C19401a.m64892a(isScoolCardAccount)) == null) {
            z3 = false;
        } else {
            z3 = a.mo63390c();
        }
        Long mainAcctKey = giftCardsTransferAccountApiModel.getMainAcctKey();
        String name = giftCardsTransferAccountApiModel.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String productCode = giftCardsTransferAccountApiModel.getProductCode();
        String productGroup = giftCardsTransferAccountApiModel.getProductGroup();
        Long productId = giftCardsTransferAccountApiModel.getProductId();
        BigDecimal realAmount = giftCardsTransferAccountApiModel.getRealAmount();
        List<GiftCardsTransferAccountApiModel> subAccounts = giftCardsTransferAccountApiModel.getSubAccounts();
        if (subAccounts != null) {
            z4 = z3;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(subAccounts, 10));
            for (GiftCardsTransferAccountApiModel a3 : subAccounts) {
                arrayList2.add(m86443a(a3));
            }
            arrayList = arrayList2;
        } else {
            z4 = z3;
            arrayList = null;
        }
        return new C29796l(id, acctNo, attachmentId, attachmentUrl, availableAmount, c, ccy, c2, c3, z, z2, z4, mainAcctKey, str, productCode, productGroup, productId, realAmount, arrayList, giftCardsTransferAccountApiModel.getSubProductCode());
    }

    /* renamed from: c */
    private final C36725a m86444c(ExternalFileEntity externalFileEntity) {
        boolean z;
        C24978b a;
        if (externalFileEntity == null) {
            return null;
        }
        String id = externalFileEntity.getId();
        String languageCode = externalFileEntity.getLanguageCode();
        Number extFileId = externalFileEntity.getExtFileId();
        YesNoApiEntity isDark = externalFileEntity.isDark();
        if (isDark == null || (a = C19401a.m64892a(isDark)) == null) {
            z = false;
        } else {
            z = a.mo63390c();
        }
        boolean z2 = z;
        String fileUrl = externalFileEntity.getFileUrl();
        if (fileUrl == null) {
            fileUrl = "";
        }
        return new C36725a(id, languageCode, extFileId, z2, fileUrl, externalFileEntity.getFileSubType());
    }

    /* renamed from: b */
    public final List mo67583b(GiftCardsTransferAccountsApiModel giftCardsTransferAccountsApiModel) {
        ArrayList arrayList;
        C41536l.m120489i(giftCardsTransferAccountsApiModel, "apiModel");
        List<GiftCardsTransferAccountApiModel> bank = giftCardsTransferAccountsApiModel.getBank();
        if (bank != null) {
            arrayList = new ArrayList(C41343r.m119925u(bank, 10));
            for (GiftCardsTransferAccountApiModel a : bank) {
                arrayList.add(m86443a(a));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return C41341q.m119907j();
        }
        return arrayList;
    }
}

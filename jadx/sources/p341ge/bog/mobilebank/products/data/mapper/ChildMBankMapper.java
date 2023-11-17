package p341ge.bog.mobilebank.products.data.mapper;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.model.CheckChildMBankActiveApiModel;
import p341ge.bog.mobilebank.products.data.model.YesNoApiModel;
import p341ge.bog.mobilebank.products.domain.model.CheckChildMBankActiveModel;

/* renamed from: ge.bog.mobilebank.products.data.mapper.ChildMBankMapper */
public final class ChildMBankMapper {
    public final CheckChildMBankActiveModel convert(CheckChildMBankActiveApiModel checkChildMBankActiveApiModel) {
        boolean z;
        C41536l.m120489i(checkChildMBankActiveApiModel, "apiModel");
        long childClientKey = checkChildMBankActiveApiModel.getChildClientKey();
        YesNoApiModel hasActiveUser = checkChildMBankActiveApiModel.getHasActiveUser();
        YesNoApiModel yesNoApiModel = YesNoApiModel.NO;
        boolean z2 = true;
        if (hasActiveUser != yesNoApiModel) {
            z = true;
        } else {
            z = false;
        }
        if (checkChildMBankActiveApiModel.getHasActiveChannel() == yesNoApiModel) {
            z2 = false;
        }
        return new CheckChildMBankActiveModel(childClientKey, z, z2, checkChildMBankActiveApiModel.getUserId());
    }
}

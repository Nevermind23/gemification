package p341ge.bog.mobilebank.transfers.model;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.transfers.model.TransferTermsItemUiModel */
public final class TransferTermsItemUiModel {
    private final TransferTermsLanguageUiModel clickUrl;
    private final String clickableTextKey;
    private final String termsTextKey;

    public TransferTermsItemUiModel(TransferTermsLanguageUiModel transferTermsLanguageUiModel, String str, String str2) {
        C41536l.m120489i(transferTermsLanguageUiModel, "clickUrl");
        this.clickUrl = transferTermsLanguageUiModel;
        this.termsTextKey = str;
        this.clickableTextKey = str2;
    }

    public static /* synthetic */ TransferTermsItemUiModel copy$default(TransferTermsItemUiModel transferTermsItemUiModel, TransferTermsLanguageUiModel transferTermsLanguageUiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            transferTermsLanguageUiModel = transferTermsItemUiModel.clickUrl;
        }
        if ((i & 2) != 0) {
            str = transferTermsItemUiModel.termsTextKey;
        }
        if ((i & 4) != 0) {
            str2 = transferTermsItemUiModel.clickableTextKey;
        }
        return transferTermsItemUiModel.copy(transferTermsLanguageUiModel, str, str2);
    }

    public final TransferTermsLanguageUiModel component1() {
        return this.clickUrl;
    }

    public final String component2() {
        return this.termsTextKey;
    }

    public final String component3() {
        return this.clickableTextKey;
    }

    public final TransferTermsItemUiModel copy(TransferTermsLanguageUiModel transferTermsLanguageUiModel, String str, String str2) {
        C41536l.m120489i(transferTermsLanguageUiModel, "clickUrl");
        return new TransferTermsItemUiModel(transferTermsLanguageUiModel, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferTermsItemUiModel)) {
            return false;
        }
        TransferTermsItemUiModel transferTermsItemUiModel = (TransferTermsItemUiModel) obj;
        return C41536l.m120484d(this.clickUrl, transferTermsItemUiModel.clickUrl) && C41536l.m120484d(this.termsTextKey, transferTermsItemUiModel.termsTextKey) && C41536l.m120484d(this.clickableTextKey, transferTermsItemUiModel.clickableTextKey);
    }

    public final TransferTermsLanguageUiModel getClickUrl() {
        return this.clickUrl;
    }

    public final String getClickableTextKey() {
        return this.clickableTextKey;
    }

    public final String getTermsTextKey() {
        return this.termsTextKey;
    }

    public int hashCode() {
        int hashCode = this.clickUrl.hashCode() * 31;
        String str = this.termsTextKey;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clickableTextKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        TransferTermsLanguageUiModel transferTermsLanguageUiModel = this.clickUrl;
        String str = this.termsTextKey;
        String str2 = this.clickableTextKey;
        return "TransferTermsItemUiModel(clickUrl=" + transferTermsLanguageUiModel + ", termsTextKey=" + str + ", clickableTextKey=" + str2 + ")";
    }
}

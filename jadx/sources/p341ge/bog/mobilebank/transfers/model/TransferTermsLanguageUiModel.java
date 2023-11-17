package p341ge.bog.mobilebank.transfers.model;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.transfers.model.TransferTermsLanguageUiModel */
public final class TransferTermsLanguageUiModel {

    /* renamed from: EN */
    private final String f84351EN;

    /* renamed from: GE */
    private final String f84352GE;

    public TransferTermsLanguageUiModel(String str, String str2) {
        this.f84352GE = str;
        this.f84351EN = str2;
    }

    public static /* synthetic */ TransferTermsLanguageUiModel copy$default(TransferTermsLanguageUiModel transferTermsLanguageUiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferTermsLanguageUiModel.f84352GE;
        }
        if ((i & 2) != 0) {
            str2 = transferTermsLanguageUiModel.f84351EN;
        }
        return transferTermsLanguageUiModel.copy(str, str2);
    }

    public final String component1() {
        return this.f84352GE;
    }

    public final String component2() {
        return this.f84351EN;
    }

    public final TransferTermsLanguageUiModel copy(String str, String str2) {
        return new TransferTermsLanguageUiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferTermsLanguageUiModel)) {
            return false;
        }
        TransferTermsLanguageUiModel transferTermsLanguageUiModel = (TransferTermsLanguageUiModel) obj;
        return C41536l.m120484d(this.f84352GE, transferTermsLanguageUiModel.f84352GE) && C41536l.m120484d(this.f84351EN, transferTermsLanguageUiModel.f84351EN);
    }

    public final String getEN() {
        return this.f84351EN;
    }

    public final String getGE() {
        return this.f84352GE;
    }

    public int hashCode() {
        String str = this.f84352GE;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84351EN;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f84352GE;
        String str2 = this.f84351EN;
        return "TransferTermsLanguageUiModel(GE=" + str + ", EN=" + str2 + ")";
    }
}

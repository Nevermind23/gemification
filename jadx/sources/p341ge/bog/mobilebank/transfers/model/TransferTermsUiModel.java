package p341ge.bog.mobilebank.transfers.model;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.transfers.model.TransferTermsUiModel */
public final class TransferTermsUiModel {
    private final List<TransferTermsItemUiModel> termsAndConditionsParams;

    public TransferTermsUiModel(List<TransferTermsItemUiModel> list) {
        this.termsAndConditionsParams = list;
    }

    public static /* synthetic */ TransferTermsUiModel copy$default(TransferTermsUiModel transferTermsUiModel, List<TransferTermsItemUiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transferTermsUiModel.termsAndConditionsParams;
        }
        return transferTermsUiModel.copy(list);
    }

    public final List<TransferTermsItemUiModel> component1() {
        return this.termsAndConditionsParams;
    }

    public final TransferTermsUiModel copy(List<TransferTermsItemUiModel> list) {
        return new TransferTermsUiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransferTermsUiModel) && C41536l.m120484d(this.termsAndConditionsParams, ((TransferTermsUiModel) obj).termsAndConditionsParams);
    }

    public final List<TransferTermsItemUiModel> getTermsAndConditionsParams() {
        return this.termsAndConditionsParams;
    }

    public int hashCode() {
        List<TransferTermsItemUiModel> list = this.termsAndConditionsParams;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<TransferTermsItemUiModel> list = this.termsAndConditionsParams;
        return "TransferTermsUiModel(termsAndConditionsParams=" + list + ")";
    }
}

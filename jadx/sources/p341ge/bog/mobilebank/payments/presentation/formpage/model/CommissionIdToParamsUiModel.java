package p341ge.bog.mobilebank.payments.presentation.formpage.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.domain.model.KeyValue;

@Keep
/* renamed from: ge.bog.mobilebank.payments.presentation.formpage.model.CommissionIdToParamsUiModel */
public final class CommissionIdToParamsUiModel {

    /* renamed from: id */
    private final String f82238id;
    private final List<KeyValue> params;

    public CommissionIdToParamsUiModel(String str, List<KeyValue> list) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(list, "params");
        this.f82238id = str;
        this.params = list;
    }

    public static /* synthetic */ CommissionIdToParamsUiModel copy$default(CommissionIdToParamsUiModel commissionIdToParamsUiModel, String str, List<KeyValue> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commissionIdToParamsUiModel.f82238id;
        }
        if ((i & 2) != 0) {
            list = commissionIdToParamsUiModel.params;
        }
        return commissionIdToParamsUiModel.copy(str, list);
    }

    public final String component1() {
        return this.f82238id;
    }

    public final List<KeyValue> component2() {
        return this.params;
    }

    public final CommissionIdToParamsUiModel copy(String str, List<KeyValue> list) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(list, "params");
        return new CommissionIdToParamsUiModel(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissionIdToParamsUiModel)) {
            return false;
        }
        CommissionIdToParamsUiModel commissionIdToParamsUiModel = (CommissionIdToParamsUiModel) obj;
        return C41536l.m120484d(this.f82238id, commissionIdToParamsUiModel.f82238id) && C41536l.m120484d(this.params, commissionIdToParamsUiModel.params);
    }

    public final String getId() {
        return this.f82238id;
    }

    public final List<KeyValue> getParams() {
        return this.params;
    }

    public int hashCode() {
        return (this.f82238id.hashCode() * 31) + this.params.hashCode();
    }

    public String toString() {
        String str = this.f82238id;
        List<KeyValue> list = this.params;
        return "CommissionIdToParamsUiModel(id=" + str + ", params=" + list + ")";
    }
}

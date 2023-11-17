package p341ge.bog.mobilebank.ddsto.data.p767dd;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.ddsto.data.dd.DdWrapperApiModel */
public final class DdWrapperApiModel {
    private final List<DdApiModel> result;

    public DdWrapperApiModel() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DdWrapperApiModel copy$default(DdWrapperApiModel ddWrapperApiModel, List<DdApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ddWrapperApiModel.result;
        }
        return ddWrapperApiModel.copy(list);
    }

    public final List<DdApiModel> component1() {
        return this.result;
    }

    public final DdWrapperApiModel copy(List<DdApiModel> list) {
        C41536l.m120489i(list, "result");
        return new DdWrapperApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DdWrapperApiModel) && C41536l.m120484d(this.result, ((DdWrapperApiModel) obj).result);
    }

    public final List<DdApiModel> getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        List<DdApiModel> list = this.result;
        return "DdWrapperApiModel(result=" + list + ")";
    }

    public DdWrapperApiModel(List<DdApiModel> list) {
        C41536l.m120489i(list, "result");
        this.result = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DdWrapperApiModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41341q.m119907j() : list);
    }
}

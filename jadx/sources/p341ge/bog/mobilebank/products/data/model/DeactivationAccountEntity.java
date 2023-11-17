package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.DeactivationAccountEntity */
public final class DeactivationAccountEntity {
    private final String result;
    private final List<String> warningCodes;

    public DeactivationAccountEntity(String str, List<String> list) {
        this.result = str;
        this.warningCodes = list;
    }

    public static /* synthetic */ DeactivationAccountEntity copy$default(DeactivationAccountEntity deactivationAccountEntity, String str, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deactivationAccountEntity.result;
        }
        if ((i & 2) != 0) {
            list = deactivationAccountEntity.warningCodes;
        }
        return deactivationAccountEntity.copy(str, list);
    }

    public final String component1() {
        return this.result;
    }

    public final List<String> component2() {
        return this.warningCodes;
    }

    public final DeactivationAccountEntity copy(String str, List<String> list) {
        return new DeactivationAccountEntity(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeactivationAccountEntity)) {
            return false;
        }
        DeactivationAccountEntity deactivationAccountEntity = (DeactivationAccountEntity) obj;
        return C41536l.m120484d(this.result, deactivationAccountEntity.result) && C41536l.m120484d(this.warningCodes, deactivationAccountEntity.warningCodes);
    }

    public final String getResult() {
        return this.result;
    }

    public final List<String> getWarningCodes() {
        return this.warningCodes;
    }

    public int hashCode() {
        String str = this.result;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.warningCodes;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.result;
        List<String> list = this.warningCodes;
        return "DeactivationAccountEntity(result=" + str + ", warningCodes=" + list + ")";
    }
}

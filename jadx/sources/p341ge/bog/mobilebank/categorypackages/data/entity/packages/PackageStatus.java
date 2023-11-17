package p341ge.bog.mobilebank.categorypackages.data.entity.packages;

import androidx.annotation.Keep;
import p341ge.bog.mobilebank.model.PensionStatusResult;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.packages.PackageStatus */
public enum PackageStatus {
    ACTIVE(PensionStatusResult.STATUS_ACTIVE),
    PENDING("S"),
    RECOMMENDED("R");
    
    private final String value;

    private PackageStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}

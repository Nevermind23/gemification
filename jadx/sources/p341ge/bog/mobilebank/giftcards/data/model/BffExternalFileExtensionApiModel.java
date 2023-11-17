package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.BffExternalFileExtensionApiModel */
public final class BffExternalFileExtensionApiModel {
    private final List<BffExternalFileDetailApiModel> details;
    private final String type;

    public BffExternalFileExtensionApiModel(List<BffExternalFileDetailApiModel> list, String str) {
        this.details = list;
        this.type = str;
    }

    public static /* synthetic */ BffExternalFileExtensionApiModel copy$default(BffExternalFileExtensionApiModel bffExternalFileExtensionApiModel, List<BffExternalFileDetailApiModel> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bffExternalFileExtensionApiModel.details;
        }
        if ((i & 2) != 0) {
            str = bffExternalFileExtensionApiModel.type;
        }
        return bffExternalFileExtensionApiModel.copy(list, str);
    }

    public final List<BffExternalFileDetailApiModel> component1() {
        return this.details;
    }

    public final String component2() {
        return this.type;
    }

    public final BffExternalFileExtensionApiModel copy(List<BffExternalFileDetailApiModel> list, String str) {
        return new BffExternalFileExtensionApiModel(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffExternalFileExtensionApiModel)) {
            return false;
        }
        BffExternalFileExtensionApiModel bffExternalFileExtensionApiModel = (BffExternalFileExtensionApiModel) obj;
        return C41536l.m120484d(this.details, bffExternalFileExtensionApiModel.details) && C41536l.m120484d(this.type, bffExternalFileExtensionApiModel.type);
    }

    public final List<BffExternalFileDetailApiModel> getDetails() {
        return this.details;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        List<BffExternalFileDetailApiModel> list = this.details;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.type;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        List<BffExternalFileDetailApiModel> list = this.details;
        String str = this.type;
        return "BffExternalFileExtensionApiModel(details=" + list + ", type=" + str + ")";
    }
}

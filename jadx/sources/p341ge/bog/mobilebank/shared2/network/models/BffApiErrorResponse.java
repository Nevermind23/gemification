package p341ge.bog.mobilebank.shared2.network.models;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.shared2.network.models.BffApiErrorResponse */
public final class BffApiErrorResponse {
    private final String context;
    private final String key;
    private final String name;
    private final String value;

    public BffApiErrorResponse() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffApiErrorResponse copy$default(BffApiErrorResponse bffApiErrorResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffApiErrorResponse.name;
        }
        if ((i & 2) != 0) {
            str2 = bffApiErrorResponse.context;
        }
        if ((i & 4) != 0) {
            str3 = bffApiErrorResponse.value;
        }
        if ((i & 8) != 0) {
            str4 = bffApiErrorResponse.key;
        }
        return bffApiErrorResponse.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.context;
    }

    public final String component3() {
        return this.value;
    }

    public final String component4() {
        return this.key;
    }

    public final BffApiErrorResponse copy(String str, String str2, String str3, String str4) {
        return new BffApiErrorResponse(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffApiErrorResponse)) {
            return false;
        }
        BffApiErrorResponse bffApiErrorResponse = (BffApiErrorResponse) obj;
        return C41536l.m120484d(this.name, bffApiErrorResponse.name) && C41536l.m120484d(this.context, bffApiErrorResponse.context) && C41536l.m120484d(this.value, bffApiErrorResponse.value) && C41536l.m120484d(this.key, bffApiErrorResponse.key);
    }

    public final String getContext() {
        return this.context;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.context;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.key;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.context;
        String str3 = this.value;
        String str4 = this.key;
        return "BffApiErrorResponse(name=" + str + ", context=" + str2 + ", value=" + str3 + ", key=" + str4 + ")";
    }

    public BffApiErrorResponse(String str, String str2, String str3, String str4) {
        this.name = str;
        this.context = str2;
        this.value = str3;
        this.key = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffApiErrorResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}

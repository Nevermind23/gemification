package p341ge.bog.mobilebank.model;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.model.PensionAccessResult */
public final class PensionAccessResult {
    private final String message;
    private final Integer messageType;
    private final boolean result;

    public PensionAccessResult(boolean z, Integer num, String str) {
        C41536l.m120489i(num, "messageType");
        C41536l.m120489i(str, "message");
        this.result = z;
        this.messageType = num;
        this.message = str;
    }

    public static /* synthetic */ PensionAccessResult copy$default(PensionAccessResult pensionAccessResult, boolean z, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pensionAccessResult.result;
        }
        if ((i & 2) != 0) {
            num = pensionAccessResult.messageType;
        }
        if ((i & 4) != 0) {
            str = pensionAccessResult.message;
        }
        return pensionAccessResult.copy(z, num, str);
    }

    public final boolean component1() {
        return this.result;
    }

    public final Integer component2() {
        return this.messageType;
    }

    public final String component3() {
        return this.message;
    }

    public final PensionAccessResult copy(boolean z, Integer num, String str) {
        C41536l.m120489i(num, "messageType");
        C41536l.m120489i(str, "message");
        return new PensionAccessResult(z, num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PensionAccessResult)) {
            return false;
        }
        PensionAccessResult pensionAccessResult = (PensionAccessResult) obj;
        return this.result == pensionAccessResult.result && C41536l.m120484d(this.messageType, pensionAccessResult.messageType) && C41536l.m120484d(this.message, pensionAccessResult.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getMessageType() {
        return this.messageType;
    }

    public final boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        boolean z = this.result;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + this.messageType.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        boolean z = this.result;
        Integer num = this.messageType;
        String str = this.message;
        return "PensionAccessResult(result=" + z + ", messageType=" + num + ", message=" + str + ")";
    }
}

package p343;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: QrAtmUiModel */
public final class QrAtmUiModel {
    private final String AID;

    /* renamed from: ed */
    private final String f26540ed;
    private final String type;

    public QrAtmUiModel(String str, String str2, String str3) {
        C41536l.m120489i(str, "ed");
        C41536l.m120489i(str2, "type");
        C41536l.m120489i(str3, "AID");
        this.f26540ed = str;
        this.type = str2;
        this.AID = str3;
    }

    public static /* synthetic */ QrAtmUiModel copy$default(QrAtmUiModel qrAtmUiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrAtmUiModel.f26540ed;
        }
        if ((i & 2) != 0) {
            str2 = qrAtmUiModel.type;
        }
        if ((i & 4) != 0) {
            str3 = qrAtmUiModel.AID;
        }
        return qrAtmUiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f26540ed;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.AID;
    }

    public final QrAtmUiModel copy(String str, String str2, String str3) {
        C41536l.m120489i(str, "ed");
        C41536l.m120489i(str2, "type");
        C41536l.m120489i(str3, "AID");
        return new QrAtmUiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrAtmUiModel)) {
            return false;
        }
        QrAtmUiModel qrAtmUiModel = (QrAtmUiModel) obj;
        return C41536l.m120484d(this.f26540ed, qrAtmUiModel.f26540ed) && C41536l.m120484d(this.type, qrAtmUiModel.type) && C41536l.m120484d(this.AID, qrAtmUiModel.AID);
    }

    public final String getAID() {
        return this.AID;
    }

    public final String getEd() {
        return this.f26540ed;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.f26540ed.hashCode() * 31) + this.type.hashCode()) * 31) + this.AID.hashCode();
    }

    public String toString() {
        String str = this.f26540ed;
        String str2 = this.type;
        String str3 = this.AID;
        return "QrAtmUiModel(ed=" + str + ", type=" + str2 + ", AID=" + str3 + ")";
    }
}

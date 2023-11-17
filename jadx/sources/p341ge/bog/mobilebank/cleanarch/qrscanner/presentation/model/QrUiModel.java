package p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.model.QrUiModel */
public final class QrUiModel {
    private final String AID;

    /* renamed from: ed */
    private final String f59594ed;
    private final String type;

    public QrUiModel(String str, String str2, String str3) {
        C41536l.m120489i(str, "ed");
        C41536l.m120489i(str2, "type");
        C41536l.m120489i(str3, "AID");
        this.f59594ed = str;
        this.type = str2;
        this.AID = str3;
    }

    public static /* synthetic */ QrUiModel copy$default(QrUiModel qrUiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrUiModel.f59594ed;
        }
        if ((i & 2) != 0) {
            str2 = qrUiModel.type;
        }
        if ((i & 4) != 0) {
            str3 = qrUiModel.AID;
        }
        return qrUiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f59594ed;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.AID;
    }

    public final QrUiModel copy(String str, String str2, String str3) {
        C41536l.m120489i(str, "ed");
        C41536l.m120489i(str2, "type");
        C41536l.m120489i(str3, "AID");
        return new QrUiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrUiModel)) {
            return false;
        }
        QrUiModel qrUiModel = (QrUiModel) obj;
        return C41536l.m120484d(this.f59594ed, qrUiModel.f59594ed) && C41536l.m120484d(this.type, qrUiModel.type) && C41536l.m120484d(this.AID, qrUiModel.AID);
    }

    public final String getAID() {
        return this.AID;
    }

    public final String getEd() {
        return this.f59594ed;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.f59594ed.hashCode() * 31) + this.type.hashCode()) * 31) + this.AID.hashCode();
    }

    public String toString() {
        String str = this.f59594ed;
        String str2 = this.type;
        String str3 = this.AID;
        return "QrUiModel(ed=" + str + ", type=" + str2 + ", AID=" + str3 + ")";
    }
}

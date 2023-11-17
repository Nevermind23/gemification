package p341ge.bog.mobilebank.qrwithdrawal.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.qrwithdrawal.data.model.QrCashOutApiModel */
public final class QrCashOutApiModel {
    private final AtmApiModel atmData;
    private final String atmRequestTimeout;
    private final DenominationApiData denominationData;
    @C8664c("inp_date")
    private final long inpDate;
    private final String requestId;

    public QrCashOutApiModel(String str, AtmApiModel atmApiModel, String str2, long j, DenominationApiData denominationApiData) {
        C41536l.m120489i(str, "requestId");
        C41536l.m120489i(atmApiModel, "atmData");
        C41536l.m120489i(str2, "atmRequestTimeout");
        C41536l.m120489i(denominationApiData, "denominationData");
        this.requestId = str;
        this.atmData = atmApiModel;
        this.atmRequestTimeout = str2;
        this.inpDate = j;
        this.denominationData = denominationApiData;
    }

    public static /* synthetic */ QrCashOutApiModel copy$default(QrCashOutApiModel qrCashOutApiModel, String str, AtmApiModel atmApiModel, String str2, long j, DenominationApiData denominationApiData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrCashOutApiModel.requestId;
        }
        if ((i & 2) != 0) {
            atmApiModel = qrCashOutApiModel.atmData;
        }
        AtmApiModel atmApiModel2 = atmApiModel;
        if ((i & 4) != 0) {
            str2 = qrCashOutApiModel.atmRequestTimeout;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            j = qrCashOutApiModel.inpDate;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            denominationApiData = qrCashOutApiModel.denominationData;
        }
        return qrCashOutApiModel.copy(str, atmApiModel2, str3, j2, denominationApiData);
    }

    public final String component1() {
        return this.requestId;
    }

    public final AtmApiModel component2() {
        return this.atmData;
    }

    public final String component3() {
        return this.atmRequestTimeout;
    }

    public final long component4() {
        return this.inpDate;
    }

    public final DenominationApiData component5() {
        return this.denominationData;
    }

    public final QrCashOutApiModel copy(String str, AtmApiModel atmApiModel, String str2, long j, DenominationApiData denominationApiData) {
        C41536l.m120489i(str, "requestId");
        C41536l.m120489i(atmApiModel, "atmData");
        C41536l.m120489i(str2, "atmRequestTimeout");
        C41536l.m120489i(denominationApiData, "denominationData");
        return new QrCashOutApiModel(str, atmApiModel, str2, j, denominationApiData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrCashOutApiModel)) {
            return false;
        }
        QrCashOutApiModel qrCashOutApiModel = (QrCashOutApiModel) obj;
        return C41536l.m120484d(this.requestId, qrCashOutApiModel.requestId) && C41536l.m120484d(this.atmData, qrCashOutApiModel.atmData) && C41536l.m120484d(this.atmRequestTimeout, qrCashOutApiModel.atmRequestTimeout) && this.inpDate == qrCashOutApiModel.inpDate && C41536l.m120484d(this.denominationData, qrCashOutApiModel.denominationData);
    }

    public final AtmApiModel getAtmData() {
        return this.atmData;
    }

    public final String getAtmRequestTimeout() {
        return this.atmRequestTimeout;
    }

    public final DenominationApiData getDenominationData() {
        return this.denominationData;
    }

    public final long getInpDate() {
        return this.inpDate;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return (((((((this.requestId.hashCode() * 31) + this.atmData.hashCode()) * 31) + this.atmRequestTimeout.hashCode()) * 31) + C7397t.m28148a(this.inpDate)) * 31) + this.denominationData.hashCode();
    }

    public String toString() {
        String str = this.requestId;
        AtmApiModel atmApiModel = this.atmData;
        String str2 = this.atmRequestTimeout;
        long j = this.inpDate;
        DenominationApiData denominationApiData = this.denominationData;
        return "QrCashOutApiModel(requestId=" + str + ", atmData=" + atmApiModel + ", atmRequestTimeout=" + str2 + ", inpDate=" + j + ", denominationData=" + denominationApiData + ")";
    }
}

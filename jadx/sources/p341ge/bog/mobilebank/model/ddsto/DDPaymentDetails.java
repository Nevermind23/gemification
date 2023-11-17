package p341ge.bog.mobilebank.model.ddsto;

import java.math.BigDecimal;
import java.util.ArrayList;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.ddsto.DDPaymentDetails */
public class DDPaymentDetails {
    public BigDecimal amount;
    public String customerIdentification;
    public Long debitsServiceId;
    public String dictionaryKey;
    public Long endDate;
    public String isoverlimitaction;
    public Long nextSentDate;
    public String orderName;
    public ArrayList<DDPaymentAccount> paymentAccounts;
    public Long paymentId;
    public String periodType;
    public String providerCode;
    public Long providerId;
    public String providerServiceId;
    public String subServiceId;
    public BigDecimal thresholdAmount;
    public String topUp;
    public String type;

    public boolean isTopup() {
        String str = this.topUp;
        return str != null && str.equals("Y");
    }
}

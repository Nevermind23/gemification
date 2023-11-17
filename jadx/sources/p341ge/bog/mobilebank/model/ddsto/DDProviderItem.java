package p341ge.bog.mobilebank.model.ddsto;

import java.util.ArrayList;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.ddsto.DDProviderItem */
public class DDProviderItem {
    public long categoryId;
    public String channelCode;
    public ArrayList<DDDebitService> debitService;
    public String dictionaryKey;
    public String fixVar;
    public long idProvider;
    public boolean isCategory;
    public String minPayment;
    public String providerCode;
    public String providerOptionId;
    public String providerServiceId;
    public String topUpAllowed;
    public String valid;

    public boolean areBothDDTypesAllowed() {
        return "B".equals(this.fixVar);
    }

    public boolean isMinPaymentAllowed() {
        return "Y".equals(this.minPayment);
    }

    public boolean isTopupAllowed() {
        return "Y".equals(this.topUpAllowed);
    }
}

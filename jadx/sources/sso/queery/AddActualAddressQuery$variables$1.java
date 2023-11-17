package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class AddActualAddressQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ AddActualAddressQuery this$0;

    AddActualAddressQuery$variables$1(AddActualAddressQuery addActualAddressQuery) {
        this.this$0 = addActualAddressQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new AddActualAddressQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AddActualAddressQuery addActualAddressQuery = this.this$0;
        linkedHashMap.put("processReference", addActualAddressQuery.getProcessReference());
        linkedHashMap.put("country", addActualAddressQuery.getCountry());
        linkedHashMap.put("region", addActualAddressQuery.getRegion());
        linkedHashMap.put("addressLine", addActualAddressQuery.getAddressLine());
        linkedHashMap.put("copyToHome", addActualAddressQuery.getCopyToHome());
        return linkedHashMap;
    }
}

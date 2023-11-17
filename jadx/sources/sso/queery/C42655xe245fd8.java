package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetCustomerDevicesQuery;

/* renamed from: sso.queery.GetCustomerDevicesQuery$GetCustomerDevice$marshaller$$inlined$invoke$1 */
public final class C42655xe245fd8 implements C8122n {
    final /* synthetic */ GetCustomerDevicesQuery.GetCustomerDevice this$0;

    public C42655xe245fd8(GetCustomerDevicesQuery.GetCustomerDevice getCustomerDevice) {
        this.this$0 = getCustomerDevice;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[1], this.this$0.getAppVersion());
        pVar.mo23319d(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[2], this.this$0.getChannelId());
        pVar.mo23320e(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[3], this.this$0.getCurrentDevice());
        pVar.mo23319d(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[4], this.this$0.getDeviceInfo());
        pVar.mo23319d(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[5], this.this$0.getDeviceModel());
        pVar.mo23319d(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[6], this.this$0.getDeviceType());
        pVar.mo23322g((C7846k.C7848b) GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[7], this.this$0.getId());
        pVar.mo23319d(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[8], this.this$0.isTrusted());
        pVar.mo23319d(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[9], this.this$0.getLanguageCode());
        pVar.mo23322g((C7846k.C7848b) GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[10], this.this$0.getLastLoginDate());
        pVar.mo23319d(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[11], this.this$0.getRegistrationDate());
        pVar.mo23319d(GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[12], this.this$0.getStatus());
        pVar.mo23322g((C7846k.C7848b) GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[13], this.this$0.getTrustDate());
        pVar.mo23322g((C7846k.C7848b) GetCustomerDevicesQuery.GetCustomerDevice.RESPONSE_FIELDS[14], this.this$0.getUnTrustDate());
    }
}

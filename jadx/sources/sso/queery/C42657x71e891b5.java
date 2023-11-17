package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetCustomerDevicesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetCustomerDevicesQuery$DeviceManagementServices$Companion$invoke$1$getCustomerDevices$1 */
final class C42657x71e891b5 extends C41537m implements C43075l {
    public static final C42657x71e891b5 INSTANCE = new C42657x71e891b5();

    C42657x71e891b5() {
        super(1);
    }

    public final GetCustomerDevicesQuery.GetCustomerDevice invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetCustomerDevicesQuery.GetCustomerDevice) bVar.mo19033b(C426581.INSTANCE);
    }
}

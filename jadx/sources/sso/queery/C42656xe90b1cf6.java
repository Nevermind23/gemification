package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetCustomerDevicesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetCustomerDevicesQuery$Data$Companion$invoke$1$deviceManagementServices$1 */
final class C42656xe90b1cf6 extends C41537m implements C43075l {
    public static final C42656xe90b1cf6 INSTANCE = new C42656xe90b1cf6();

    C42656xe90b1cf6() {
        super(1);
    }

    public final GetCustomerDevicesQuery.DeviceManagementServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetCustomerDevicesQuery.DeviceManagementServices.Companion.invoke(oVar);
    }
}

package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetCustomerDeviceInfoQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetCustomerDeviceInfoQuery$Data$Companion$invoke$1$deviceManagementServices$1 */
final class C42650x9b60d365 extends C41537m implements C43075l {
    public static final C42650x9b60d365 INSTANCE = new C42650x9b60d365();

    C42650x9b60d365() {
        super(1);
    }

    public final GetCustomerDeviceInfoQuery.DeviceManagementServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetCustomerDeviceInfoQuery.DeviceManagementServices.Companion.invoke(oVar);
    }
}

package sso.queery;

import android.support.p013v4.media.session.C0125b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8135p;
import sso.queery.GetCustomerDevicesQuery;
import ue1.C43079p;

final class GetCustomerDevicesQuery$DeviceManagementServices$marshaller$1$1 extends C41537m implements C43079p {
    public static final GetCustomerDevicesQuery$DeviceManagementServices$marshaller$1$1 INSTANCE = new GetCustomerDevicesQuery$DeviceManagementServices$marshaller$1$1();

    GetCustomerDevicesQuery$DeviceManagementServices$marshaller$1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C0125b.m366a(obj2);
        invoke((List<GetCustomerDevicesQuery.GetCustomerDevice>) (List) obj, (C8135p.C8136a) null);
        return C41238w.f97225a;
    }

    public final void invoke(List<GetCustomerDevicesQuery.GetCustomerDevice> list, C8135p.C8136a aVar) {
        C41536l.m120489i(aVar, "listItemWriter");
        if (list != null) {
            for (GetCustomerDevicesQuery.GetCustomerDevice getCustomerDevice : list) {
                aVar.mo23324b(getCustomerDevice != null ? getCustomerDevice.marshaller() : null);
            }
        }
    }
}

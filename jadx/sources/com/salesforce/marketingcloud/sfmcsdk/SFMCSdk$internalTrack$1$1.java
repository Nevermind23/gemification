package com.salesforce.marketingcloud.sfmcsdk;

import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class SFMCSdk$internalTrack$1$1 extends C41537m implements C43064a {
    final /* synthetic */ Event[] $events;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SFMCSdk$internalTrack$1$1(Event[] eventArr) {
        super(0);
        this.$events = eventArr;
    }

    public final String invoke() {
        String str;
        String str2 = "";
        for (Event event : C41333m.m119795t(this.$events)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            if (C40439w.m117118v(str2)) {
                str = "";
            } else {
                str = ", ";
            }
            sb.append(str);
            sb.append(C41520a0.m120436b(event.getClass()).mo94325c());
            sb.append("( ");
            sb.append(event.name());
            sb.append(" )");
            str2 = sb.toString();
        }
        return C41536l.m120497q("Tracking events: ", str2);
    }
}

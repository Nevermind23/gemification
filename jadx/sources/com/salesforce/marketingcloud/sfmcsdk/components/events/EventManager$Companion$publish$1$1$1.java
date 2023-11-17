package com.salesforce.marketingcloud.sfmcsdk.components.events;

import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class EventManager$Companion$publish$1$1$1 extends C41537m implements C43064a {
    final /* synthetic */ Event[] $events;
    final /* synthetic */ EventSubscriber $subscriber;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EventManager$Companion$publish$1$1$1(Event[] eventArr, EventSubscriber eventSubscriber) {
        super(0);
        this.$events = eventArr;
        this.$subscriber = eventSubscriber;
    }

    public final String invoke() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Publishing events: ");
        String str2 = "";
        for (Event event : C41333m.m119795t(this.$events)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            if (C40439w.m117118v(str2)) {
                str = "";
            } else {
                str = ", ";
            }
            sb2.append(str);
            sb2.append(C41520a0.m120436b(event.getClass()).mo94325c());
            sb2.append("( ");
            sb2.append(event.name());
            sb2.append(" )");
            str2 = sb2.toString();
        }
        sb.append(str2);
        sb.append(" to subscriber: ");
        sb.append(this.$subscriber);
        return sb.toString();
    }
}

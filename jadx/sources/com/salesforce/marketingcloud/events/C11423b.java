package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.salesforce.marketingcloud.events.b */
public final class C11423b implements Event {

    /* renamed from: a */
    private final String f33221a;

    /* renamed from: b */
    private final Map<String, Object> f33222b;

    /* renamed from: c */
    private final Event.Producer f33223c;

    public C11423b(String str, Map<String, ? extends Object> map, Event.Producer producer) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        C41536l.m120489i(producer, "producer");
        this.f33221a = str;
        this.f33222b = map;
        this.f33223c = producer;
    }

    /* renamed from: a */
    public final Map<String, Object> mo29888a() {
        return this.f33222b;
    }

    public Map<String, Object> attributes() {
        return this.f33222b;
    }

    public Event.Producer getProducer() {
        return this.f33223c;
    }

    public String name() {
        return this.f33221a;
    }

    public /* synthetic */ void track() {
        C11442j.m41839b(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11423b(String str, Map map, Event.Producer producer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C41344r0.m119928j() : map, (i & 4) != 0 ? Event.Producer.PUSH : producer);
    }
}

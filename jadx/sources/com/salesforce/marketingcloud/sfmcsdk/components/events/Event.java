package com.salesforce.marketingcloud.sfmcsdk.components.events;

import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import he1.C41238w;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

public abstract class Event {
    private final Category category = Category.ENGAGEMENT;

    /* renamed from: id */
    public final String f34060id;
    private final Producer producer = Producer.SFMC_SDK;

    public enum Category {
        APPLICATION,
        ENGAGEMENT,
        IDENTITY,
        SYSTEM
    }

    public enum Producer {
        APP,
        SFMC_SDK,
        PUSH,
        CDP
    }

    public Event() {
        String uuid = UUID.randomUUID().toString();
        C41536l.m120488h(uuid, "randomUUID().toString()");
        this.f34060id = uuid;
    }

    public abstract Map<String, Object> attributes();

    public Category getCategory() {
        return this.category;
    }

    public Producer getProducer() {
        return this.producer;
    }

    public abstract String name();

    public final JSONObject toJson() {
        boolean z;
        boolean z2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", name());
        jSONObject.put("id", this.f34060id);
        jSONObject.put("producer", getProducer());
        jSONObject.put("category", getCategory());
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : attributes().entrySet()) {
            try {
                Object value = entry.getValue();
                if (value instanceof SFMCSdkEvent) {
                    jSONObject2.put((String) entry.getKey(), ((SFMCSdkEvent) entry.getValue()).toJson());
                } else {
                    boolean z3 = true;
                    if (value instanceof Number) {
                        z = true;
                    } else {
                        z = value instanceof String;
                    }
                    if (z) {
                        z2 = true;
                    } else {
                        z2 = value instanceof Character;
                    }
                    if (!z2) {
                        z3 = value instanceof Boolean;
                    }
                    if (z3) {
                        jSONObject2.put((String) entry.getKey(), entry.getValue());
                    } else {
                        jSONObject2.put((String) entry.getKey(), entry.getValue());
                    }
                }
            } catch (Exception unused) {
                SFMCSdkLogger sFMCSdkLogger = SFMCSdkLogger.INSTANCE;
                String name = jSONObject2.getClass().getName();
                C41536l.m120488h(name, "this::class.java.name");
                sFMCSdkLogger.mo31463w(name, new Event$toJson$1$1$1$1(entry));
            }
        }
        C41238w wVar = C41238w.f97225a;
        jSONObject.put(C11772k.C11773a.f34176h, jSONObject2);
        return jSONObject;
    }

    public final void track() {
        SFMCSdk.Companion.track(this);
    }
}

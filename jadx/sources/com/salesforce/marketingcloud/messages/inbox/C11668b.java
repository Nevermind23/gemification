package com.salesforce.marketingcloud.messages.inbox;

import com.salesforce.marketingcloud.internal.C11516m;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.messages.inbox.b */
public final class C11668b {
    /* renamed from: a */
    public static final InboxMessage.Media m42588a(JSONObject jSONObject) {
        C41536l.m120489i(jSONObject, "<this>");
        String optString = jSONObject.optString("androidUrl");
        C41536l.m120488h(optString, "optString(\"androidUrl\")");
        String b = C11516m.m42087b(optString);
        String optString2 = jSONObject.optString("alt");
        C41536l.m120488h(optString2, "optString(\"alt\")");
        String b2 = C11516m.m42087b(optString2);
        if (b == null && b2 == null) {
            return null;
        }
        if (b == null) {
            b = "";
        }
        return new InboxMessage.Media(b, b2);
    }

    /* renamed from: a */
    public static final JSONObject m42589a(InboxMessage.Media media) {
        C41536l.m120489i(media, "<this>");
        JSONObject jSONObject = new JSONObject();
        if (media.getUrl() != null) {
            jSONObject.put("androidUrl", media.getUrl());
        }
        if (media.getAltText() != null) {
            jSONObject.put("alt", media.getAltText());
        }
        return jSONObject;
    }
}

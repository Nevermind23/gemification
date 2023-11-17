package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p301w8.C8878a;
import p327y9.C9142b;
import p342j$.util.DesugarCollections;

/* renamed from: com.google.firebase.remoteconfig.internal.w */
public class C5473w {

    /* renamed from: a */
    private final C9142b f17494a;

    /* renamed from: b */
    private final Map f17495b = DesugarCollections.synchronizedMap(new HashMap());

    public C5473w(C9142b bVar) {
        this.f17494a = bVar;
    }

    /* renamed from: a */
    public void mo18161a(String str, C5447g gVar) {
        JSONObject optJSONObject;
        C8878a aVar = (C8878a) this.f17494a.get();
        if (aVar != null) {
            JSONObject h = gVar.mo18093h();
            if (h.length() >= 1) {
                JSONObject f = gVar.mo18091f();
                if (f.length() >= 1 && (optJSONObject = h.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (this.f17495b) {
                            if (!optString.equals(this.f17495b.get(str))) {
                                this.f17495b.put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", f.optString(str));
                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                aVar.mo24301a("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", optString);
                                aVar.mo24301a("fp", "_fpc", bundle2);
                            }
                        }
                    }
                }
            }
        }
    }
}

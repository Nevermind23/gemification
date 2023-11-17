package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p334z4.C9207a;

/* renamed from: com.facebook.share.internal.a */
public abstract class C2695a {

    /* renamed from: com.facebook.share.internal.a$a */
    public interface C2696a {
        /* renamed from: a */
        JSONObject mo8496a(SharePhoto sharePhoto);
    }

    /* renamed from: a */
    private static JSONArray m10477a(List list, C2696a aVar) {
        Class<C2695a> cls = C2695a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Object d : list) {
                jSONArray.put(m10480d(d, aVar));
            }
            return jSONArray;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m10478b(ShareOpenGraphAction shareOpenGraphAction, C2696a aVar) {
        Class<C2695a> cls = C2695a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphAction.mo8610e()) {
                jSONObject.put(str, m10480d(shareOpenGraphAction.mo8606a(str), aVar));
            }
            return jSONObject;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    private static JSONObject m10479c(ShareOpenGraphObject shareOpenGraphObject, C2696a aVar) {
        Class<C2695a> cls = C2695a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphObject.mo8610e()) {
                jSONObject.put(str, m10480d(shareOpenGraphObject.mo8606a(str), aVar));
            }
            return jSONObject;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static Object m10480d(Object obj, C2696a aVar) {
        Class<C2695a> cls = C2695a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        if (obj == null) {
            try {
                return JSONObject.NULL;
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
                return null;
            }
        } else {
            if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer)) {
                if (!(obj instanceof Long)) {
                    if (obj instanceof SharePhoto) {
                        if (aVar != null) {
                            return aVar.mo8496a((SharePhoto) obj);
                        }
                        return null;
                    } else if (obj instanceof ShareOpenGraphObject) {
                        return m10479c((ShareOpenGraphObject) obj, aVar);
                    } else {
                        if (obj instanceof List) {
                            return m10477a((List) obj, aVar);
                        }
                        throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
                    }
                }
            }
            return obj;
        }
    }
}

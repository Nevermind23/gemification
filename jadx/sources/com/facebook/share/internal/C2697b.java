package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.C2643i;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C2695a;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;
import p334z4.C9207a;

/* renamed from: com.facebook.share.internal.b */
public abstract class C2697b {

    /* renamed from: com.facebook.share.internal.b$a */
    static class C2698a implements C2695a.C2696a {
        C2698a() {
        }

        /* renamed from: a */
        public JSONObject mo8496a(SharePhoto sharePhoto) {
            Uri e = sharePhoto.mo8616e();
            if (C8769a0.m32646S(e)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(C11769i.C11770a.f34149l, e.toString());
                    return jSONObject;
                } catch (JSONException e2) {
                    throw new FacebookException("Unable to attach images", e2);
                }
            } else {
                throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
            }
        }
    }

    /* renamed from: a */
    public static Pair m10482a(String str) {
        String str2;
        int i;
        Class<C2697b> cls = C2697b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
                str2 = null;
            } else {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
            }
            return new Pair(str2, str);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static GraphRequest m10483b(AccessToken accessToken, Uri uri, GraphRequest.C2612e eVar) {
        Class<C2697b> cls = C2697b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            if (C8769a0.m32643P(uri)) {
                return m10484c(accessToken, new File(uri.getPath()), eVar);
            }
            if (C8769a0.m32640M(uri)) {
                GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType((Parcelable) uri, "image/png");
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("file", parcelableResourceWithMimeType);
                return new GraphRequest(accessToken, "me/staging_resources", bundle, C2643i.POST, eVar);
            }
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static GraphRequest m10484c(AccessToken accessToken, File file, GraphRequest.C2612e eVar) {
        Class<C2697b> cls = C2697b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType((Parcelable) ParcelFileDescriptor.open(file, 268435456), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, C2643i.POST, eVar);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static JSONArray m10485d(JSONArray jSONArray, boolean z) {
        Class<C2697b> cls = C2697b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = m10485d((JSONArray) obj, z);
                } else if (obj instanceof JSONObject) {
                    obj = m10486e((JSONObject) obj, z);
                }
                jSONArray2.put(obj);
            }
            return jSONArray2;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        throw new com.facebook.FacebookException("Failed to create json object from share content");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        p334z4.C9207a.m34023b(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0091 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m10486e(org.json.JSONObject r11, boolean r12) {
        /*
            java.lang.Class<com.facebook.share.internal.b> r0 = com.facebook.share.internal.C2697b.class
            boolean r1 = p334z4.C9207a.m34024c(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            if (r11 != 0) goto L_0x000d
            return r2
        L_0x000d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0091 }
            r1.<init>()     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0091 }
            r3.<init>()     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r4 = r11.names()     // Catch:{ JSONException -> 0x0091 }
            r5 = 0
        L_0x001c:
            int r6 = r4.length()     // Catch:{ JSONException -> 0x0091 }
            if (r5 >= r6) goto L_0x0083
            java.lang.String r6 = r4.getString(r5)     // Catch:{ JSONException -> 0x0091 }
            java.lang.Object r7 = r11.get(r6)     // Catch:{ JSONException -> 0x0091 }
            boolean r8 = r7 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0091 }
            r9 = 1
            if (r8 == 0) goto L_0x0036
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r7 = m10486e(r7, r9)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0040
        L_0x0036:
            boolean r8 = r7 instanceof org.json.JSONArray     // Catch:{ JSONException -> 0x0091 }
            if (r8 == 0) goto L_0x0040
            org.json.JSONArray r7 = (org.json.JSONArray) r7     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r7 = m10485d(r7, r9)     // Catch:{ JSONException -> 0x0091 }
        L_0x0040:
            android.util.Pair r8 = m10482a(r6)     // Catch:{ JSONException -> 0x0091 }
            java.lang.Object r9 = r8.first     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x0091 }
            java.lang.Object r8 = r8.second     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x0091 }
            if (r12 == 0) goto L_0x006f
            if (r9 == 0) goto L_0x005c
            java.lang.String r10 = "fbsdk"
            boolean r10 = r9.equals(r10)     // Catch:{ JSONException -> 0x0091 }
            if (r10 == 0) goto L_0x005c
            r1.put(r6, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x005c:
            if (r9 == 0) goto L_0x006b
            java.lang.String r6 = "og"
            boolean r6 = r9.equals(r6)     // Catch:{ JSONException -> 0x0091 }
            if (r6 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            r3.put(r8, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x006b:
            r1.put(r8, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x006f:
            if (r9 == 0) goto L_0x007d
            java.lang.String r10 = "fb"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0091 }
            if (r9 == 0) goto L_0x007d
            r1.put(r6, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x007d:
            r1.put(r8, r7)     // Catch:{ JSONException -> 0x0091 }
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x001c
        L_0x0083:
            int r11 = r3.length()     // Catch:{ JSONException -> 0x0091 }
            if (r11 <= 0) goto L_0x008e
            java.lang.String r11 = "data"
            r1.put(r11, r3)     // Catch:{ JSONException -> 0x0091 }
        L_0x008e:
            return r1
        L_0x008f:
            r11 = move-exception
            goto L_0x0099
        L_0x0091:
            com.facebook.FacebookException r11 = new com.facebook.FacebookException     // Catch:{ all -> 0x008f }
            java.lang.String r12 = "Failed to create json object from share content"
            r11.<init>((java.lang.String) r12)     // Catch:{ all -> 0x008f }
            throw r11     // Catch:{ all -> 0x008f }
        L_0x0099:
            p334z4.C9207a.m34023b(r11, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C2697b.m10486e(org.json.JSONObject, boolean):org.json.JSONObject");
    }

    /* renamed from: f */
    public static JSONObject m10487f(ShareOpenGraphContent shareOpenGraphContent) {
        Class<C2697b> cls = C2697b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return C2695a.m10478b(shareOpenGraphContent.mo8597e(), new C2698a());
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }
}

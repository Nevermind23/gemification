package com.facebook;

import android.util.Log;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import p297w4.C8769a0;
import p297w4.C8831r;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: com.facebook.h */
public class C2642h {

    /* renamed from: g */
    private static final String f8256g = "h";

    /* renamed from: a */
    private final HttpURLConnection f8257a;

    /* renamed from: b */
    private final JSONObject f8258b;

    /* renamed from: c */
    private final JSONArray f8259c;

    /* renamed from: d */
    private final FacebookRequestError f8260d;

    /* renamed from: e */
    private final String f8261e;

    /* renamed from: f */
    private final GraphRequest f8262f;

    public C2642h(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, (JSONArray) null, (FacebookRequestError) null);
    }

    /* renamed from: a */
    static List m10186a(List list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C2642h((GraphRequest) list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) facebookException)));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static C2642h m10187b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a = FacebookRequestError.m9994a(jSONObject, obj2, httpURLConnection);
            if (a != null) {
                Log.e(f8256g, a.toString());
                if (a.mo8160d() == 190 && C8769a0.m32641N(graphRequest.mo8186q())) {
                    if (a.mo8166i() != 493) {
                        AccessToken.m9968x((AccessToken) null);
                    } else if (!AccessToken.m9965h().mo8137w()) {
                        AccessToken.m9964f();
                    }
                }
                return new C2642h(graphRequest, httpURLConnection, a);
            }
            Object D = C8769a0.m32631D(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (D instanceof JSONObject) {
                return new C2642h(graphRequest, httpURLConnection, D.toString(), (JSONObject) D);
            }
            if (D instanceof JSONArray) {
                return new C2642h(graphRequest, httpURLConnection, D.toString(), (JSONArray) D);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new C2642h(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        throw new FacebookException("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List m10188c(java.net.HttpURLConnection r7, java.util.List r8, java.lang.Object r9) {
        /*
            int r0 = r8.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L_0x0051
            java.lang.Object r2 = r8.get(r3)
            com.facebook.GraphRequest r2 = (com.facebook.GraphRequest) r2
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r4.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            java.lang.String r5 = "body"
            r4.put(r5, r9)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            if (r7 == 0) goto L_0x0024
            int r5 = r7.getResponseCode()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0026
        L_0x0024:
            r5 = 200(0xc8, float:2.8E-43)
        L_0x0026:
            java.lang.String r6 = "code"
            r4.put(r6, r5)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.put(r4)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0052
        L_0x0034:
            r4 = move-exception
            com.facebook.h r5 = new com.facebook.h
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r4)
            r5.<init>(r2, r7, r6)
            r1.add(r5)
            goto L_0x0051
        L_0x0043:
            r4 = move-exception
            com.facebook.h r5 = new com.facebook.h
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r4)
            r5.<init>(r2, r7, r6)
            r1.add(r5)
        L_0x0051:
            r5 = r9
        L_0x0052:
            boolean r2 = r5 instanceof org.json.JSONArray
            if (r2 == 0) goto L_0x0097
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r2 = r5.length()
            if (r2 != r0) goto L_0x0097
        L_0x005e:
            int r0 = r5.length()
            if (r3 >= r0) goto L_0x0096
            java.lang.Object r0 = r8.get(r3)
            com.facebook.GraphRequest r0 = (com.facebook.GraphRequest) r0
            java.lang.Object r2 = r5.get(r3)     // Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
            com.facebook.h r2 = m10187b(r0, r7, r2, r9)     // Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
            r1.add(r2)     // Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
            goto L_0x0093
        L_0x0076:
            r2 = move-exception
            com.facebook.h r4 = new com.facebook.h
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r2)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
            goto L_0x0093
        L_0x0085:
            r2 = move-exception
            com.facebook.h r4 = new com.facebook.h
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r2)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
        L_0x0093:
            int r3 = r3 + 1
            goto L_0x005e
        L_0x0096:
            return r1
        L_0x0097:
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r8 = "Unexpected number of results"
            r7.<init>((java.lang.String) r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C2642h.m10188c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    /* renamed from: d */
    static List m10189d(InputStream inputStream, HttpURLConnection httpURLConnection, C2640g gVar) {
        String e0 = C8769a0.m32663e0(inputStream);
        C8831r.m32867h(C2645k.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(e0.length()), e0);
        return m10190e(e0, httpURLConnection, gVar);
    }

    /* renamed from: e */
    static List m10190e(String str, HttpURLConnection httpURLConnection, C2640g gVar) {
        List c = m10188c(httpURLConnection, gVar, new JSONTokener(str).nextValue());
        C8831r.m32867h(C2645k.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", gVar.mo8276w(), Integer.valueOf(str.length()), c);
        return c;
    }

    /* renamed from: f */
    static List m10191f(HttpURLConnection httpURLConnection, C2640g gVar) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            if (C2626d.m10151v()) {
                if (httpURLConnection.getResponseCode() >= 400) {
                    inputStream = httpURLConnection.getErrorStream();
                } else {
                    inputStream = httpURLConnection.getInputStream();
                }
                return m10189d(inputStream2, httpURLConnection, gVar);
            }
            Log.e(f8256g, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
            throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
        } catch (FacebookException e) {
            C8831r.m32867h(C2645k.REQUESTS, "Response", "Response <Error>: %s", e);
            return m10186a(gVar, httpURLConnection, e);
        } catch (Exception e2) {
            C8831r.m32867h(C2645k.REQUESTS, "Response", "Response <Error>: %s", e2);
            return m10186a(gVar, httpURLConnection, new FacebookException((Throwable) e2));
        } finally {
            C8769a0.m32668h(inputStream2);
        }
    }

    /* renamed from: g */
    public final FacebookRequestError mo8279g() {
        return this.f8260d;
    }

    /* renamed from: h */
    public final JSONObject mo8280h() {
        return this.f8258b;
    }

    public String toString() {
        String str;
        int i;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f8257a;
            if (httpURLConnection != null) {
                i = httpURLConnection.getResponseCode();
            } else {
                i = BogInputLayout.INPUT_NORMAL_STATE;
            }
            objArr[0] = Integer.valueOf(i);
            str = String.format(locale, "%d", objArr);
        } catch (IOException unused) {
            str = C11651j.f33767h;
        }
        return "{Response: " + " responseCode: " + str + ", graphObject: " + this.f8258b + ", error: " + this.f8260d + "}";
    }

    public C2642h(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, (JSONObject) null, jSONArray, (FacebookRequestError) null);
    }

    public C2642h(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, (String) null, (JSONObject) null, (JSONArray) null, facebookRequestError);
    }

    C2642h(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f8262f = graphRequest;
        this.f8257a = httpURLConnection;
        this.f8261e = str;
        this.f8258b = jSONObject;
        this.f8259c = jSONArray;
        this.f8260d = facebookRequestError;
    }
}

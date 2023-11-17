package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10895j0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.f6 */
class C10812f6 {

    /* renamed from: e */
    private static final int f30957e = 10;

    /* renamed from: f */
    private static final int f30958f = 2;

    /* renamed from: g */
    private static final int f30959g = 5000;

    /* renamed from: h */
    private static final int f30960h = 3;

    /* renamed from: i */
    private static final long f30961i = 3600000;

    /* renamed from: a */
    private int f30962a;

    /* renamed from: b */
    private int f30963b;

    /* renamed from: c */
    private long f30964c = 3600000;

    /* renamed from: d */
    private final ExecutorService f30965d;

    /* renamed from: com.medallia.digital.mobilesdk.f6$a */
    protected interface C10813a {
        /* renamed from: a */
        void mo28086a(C10739b6 b6Var);

        /* renamed from: a */
        void mo28087a(C11244z5 z5Var);
    }

    /* renamed from: com.medallia.digital.mobilesdk.f6$b */
    protected enum C10814b {
        String,
        BYTES
    }

    protected C10812f6(int i, int i2) {
        this.f30963b = i;
        this.f30962a = i2;
        this.f30965d = mo28315c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo28305a() {
        return this.f30963b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo28313b() {
        return this.f30964c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ExecutorService mo28315c() {
        return Executors.newFixedThreadPool(Math.min(10, Math.max(2, Runtime.getRuntime().availableProcessors())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo28317d() {
        return this.f30962a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo28306a(String str, HashMap<String, String> hashMap) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (hashMap != null && !hashMap.isEmpty()) {
            sb.append("?");
            int i = 0;
            for (Map.Entry next : hashMap.entrySet()) {
                if (!(next.getKey() == null || next.getValue() == null)) {
                    sb.append((String) next.getKey());
                    sb.append("=");
                    sb.append((String) next.getValue());
                    if (i < hashMap.size() - 1) {
                        sb.append("&");
                    }
                }
                i++;
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28314b(String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, JSONObject jSONObject, C10813a aVar) {
        m39433a(C10814b.String, C10895j0.C10899d.POST, str, hashMap2, hashMap, jSONObject, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo28316c(String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, JSONObject jSONObject, C10813a aVar) {
        m39433a(C10814b.String, C10895j0.C10899d.PUT, str, hashMap2, hashMap, jSONObject, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28307a(int i, int i2, long j) {
        if (((long) i2) > 1000) {
            this.f30962a = i2;
        }
        if (i >= 0) {
            this.f30963b = i;
        }
        this.f30964c = j;
    }

    /* renamed from: a */
    private void m39433a(C10814b bVar, C10895j0.C10899d dVar, String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, JSONObject jSONObject, C10813a aVar) {
        C10814b bVar2 = bVar;
        C10895j0.C10899d dVar2 = dVar;
        new C10722a6(this.f30965d, bVar2, dVar2, mo28306a(str, hashMap2), hashMap, jSONObject, this.f30963b, this.f30962a, aVar, this.f30964c);
    }

    /* renamed from: a */
    private void m39434a(C10814b bVar, C10895j0.C10899d dVar, String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, JSONObject jSONObject, String str2, C10813a aVar) {
        C10814b bVar2 = bVar;
        C10895j0.C10899d dVar2 = dVar;
        new C10722a6(this.f30965d, bVar2, dVar2, mo28306a(str, hashMap2), hashMap, jSONObject, str2, this.f30963b, this.f30962a, aVar, this.f30964c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28308a(String str, String str2, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, JSONObject jSONObject, C10813a aVar) {
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1335458389:
                if (lowerCase.equals("delete")) {
                    c = 0;
                    break;
                }
                break;
            case 102230:
                if (lowerCase.equals("get")) {
                    c = 1;
                    break;
                }
                break;
            case 111375:
                if (lowerCase.equals("put")) {
                    c = 2;
                    break;
                }
                break;
            case 3446944:
                if (lowerCase.equals("post")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo28311a(str2, hashMap, hashMap2, jSONObject, aVar);
                return;
            case 1:
                mo28310a(str2, hashMap, hashMap2, aVar);
                return;
            case 2:
                mo28316c(str2, hashMap, hashMap2, jSONObject, aVar);
                return;
            case 3:
                mo28314b(str2, hashMap, hashMap2, jSONObject, aVar);
                return;
            default:
                C10735b4.m39111c("Request type is undefined: " + str);
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28309a(String str, HashMap<String, String> hashMap, C10813a aVar) {
        m39433a(C10814b.BYTES, C10895j0.C10899d.GET, str, hashMap, (HashMap<String, String>) null, (JSONObject) null, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28310a(String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, C10813a aVar) {
        m39433a(C10814b.String, C10895j0.C10899d.GET, str, hashMap2, hashMap, (JSONObject) null, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28311a(String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, JSONObject jSONObject, C10813a aVar) {
        m39433a(C10814b.String, C10895j0.C10899d.DELETE, str, hashMap2, hashMap, jSONObject, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28312a(String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, JSONObject jSONObject, String str2, C10813a aVar) {
        m39434a(C10814b.String, C10895j0.C10899d.PUT, str, hashMap2, hashMap, jSONObject, str2, aVar);
    }
}

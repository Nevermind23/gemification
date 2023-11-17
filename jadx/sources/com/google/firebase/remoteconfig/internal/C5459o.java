package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
import p251sa.C8287j;
import p260t6.C8402d;

/* renamed from: com.google.firebase.remoteconfig.internal.o */
public class C5459o {

    /* renamed from: e */
    public static final Charset f17435e = Charset.forName("UTF-8");

    /* renamed from: f */
    static final Pattern f17436f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g */
    static final Pattern f17437g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    private final Set f17438a = new HashSet();

    /* renamed from: b */
    private final Executor f17439b;

    /* renamed from: c */
    private final C5444f f17440c;

    /* renamed from: d */
    private final C5444f f17441d;

    public C5459o(Executor executor, C5444f fVar, C5444f fVar2) {
        this.f17439b = executor;
        this.f17440c = fVar;
        this.f17441d = fVar2;
    }

    /* renamed from: c */
    private void m21719c(String str, C5447g gVar) {
        if (gVar != null) {
            synchronized (this.f17438a) {
                for (C8402d nVar : this.f17438a) {
                    this.f17439b.execute(new C5458n(nVar, str, gVar));
                }
            }
        }
    }

    /* renamed from: e */
    private static C5447g m21720e(C5444f fVar) {
        return fVar.mo18082f();
    }

    /* renamed from: f */
    private static Set m21721f(C5444f fVar) {
        HashSet hashSet = new HashSet();
        C5447g e = m21720e(fVar);
        if (e == null) {
            return hashSet;
        }
        Iterator<String> keys = e.mo18091f().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: g */
    private static String m21722g(C5444f fVar, String str) {
        C5447g e = m21720e(fVar);
        if (e == null) {
            return null;
        }
        try {
            return e.mo18091f().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: j */
    private static void m21724j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }

    /* renamed from: b */
    public void mo18112b(C8402d dVar) {
        synchronized (this.f17438a) {
            this.f17438a.add(dVar);
        }
    }

    /* renamed from: d */
    public Map mo18113d() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(m21721f(this.f17440c));
        hashSet.addAll(m21721f(this.f17441d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, mo18114h(str));
        }
        return hashMap;
    }

    /* renamed from: h */
    public C8287j mo18114h(String str) {
        String g = m21722g(this.f17440c, str);
        if (g != null) {
            m21719c(str, m21720e(this.f17440c));
            return new C5472v(g, 2);
        }
        String g2 = m21722g(this.f17441d, str);
        if (g2 != null) {
            return new C5472v(g2, 1);
        }
        m21724j(str, "FirebaseRemoteConfigValue");
        return new C5472v("", 0);
    }
}

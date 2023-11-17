package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.firebase.C5270e;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.internal.C5444f;
import com.google.firebase.remoteconfig.internal.C5447g;
import com.google.firebase.remoteconfig.internal.C5455m;
import com.google.firebase.remoteconfig.internal.C5459o;
import com.google.firebase.remoteconfig.internal.C5460p;
import com.google.firebase.remoteconfig.internal.C5463q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p251sa.C8279d;
import p251sa.C8280e;
import p251sa.C8281f;
import p251sa.C8282g;
import p251sa.C8283h;
import p275u8.C8648b;
import p337z7.C9231i;
import p337z7.Task;
import p338z8.C9259j;
import p339z9.C9270e;

/* renamed from: com.google.firebase.remoteconfig.a */
public class C5434a {

    /* renamed from: m */
    public static final byte[] f17326m = new byte[0];

    /* renamed from: a */
    private final Context f17327a;

    /* renamed from: b */
    private final C5270e f17328b;

    /* renamed from: c */
    private final C8648b f17329c;

    /* renamed from: d */
    private final Executor f17330d;

    /* renamed from: e */
    private final C5444f f17331e;

    /* renamed from: f */
    private final C5444f f17332f;

    /* renamed from: g */
    private final C5444f f17333g;

    /* renamed from: h */
    private final C5455m f17334h;

    /* renamed from: i */
    private final C5459o f17335i;

    /* renamed from: j */
    private final C5460p f17336j;

    /* renamed from: k */
    private final C9270e f17337k;

    /* renamed from: l */
    private final C5463q f17338l;

    C5434a(Context context, C5270e eVar, C9270e eVar2, C8648b bVar, Executor executor, C5444f fVar, C5444f fVar2, C5444f fVar3, C5455m mVar, C5459o oVar, C5460p pVar, C5463q qVar) {
        this.f17327a = context;
        this.f17328b = eVar;
        this.f17337k = eVar2;
        this.f17329c = bVar;
        this.f17330d = executor;
        this.f17331e = fVar;
        this.f17332f = fVar2;
        this.f17333g = fVar3;
        this.f17334h = mVar;
        this.f17335i = oVar;
        this.f17336j = pVar;
        this.f17338l = qVar;
    }

    /* renamed from: j */
    private static boolean m21586j(C5447g gVar, C5447g gVar2) {
        return gVar2 == null || !gVar.mo18092g().equals(gVar2.mo18092g());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Task m21587k(Task task, Task task2, Task task3) {
        if (!task.mo24873r() || task.mo24869n() == null) {
            return C9231i.m34113g(Boolean.FALSE);
        }
        C5447g gVar = (C5447g) task.mo24869n();
        if (!task2.mo24873r() || m21586j(gVar, (C5447g) task2.mo24869n())) {
            return this.f17332f.mo18084k(gVar).mo24865j(this.f17330d, new C8282g(this));
        }
        return C9231i.m34113g(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Task m21589m(Void voidR) {
        return mo18058e();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m21590n(Task task) {
        if (!task.mo24873r()) {
            return false;
        }
        this.f17331e.mo18080d();
        if (task.mo24869n() != null) {
            mo18065r(((C5447g) task.mo24869n()).mo18088d());
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    /* renamed from: q */
    static List m21591q(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* renamed from: e */
    public Task mo18058e() {
        Task e = this.f17331e.mo18081e();
        Task e2 = this.f17332f.mo18081e();
        return C9231i.m34117k(e, e2).mo24867l(this.f17330d, new C8281f(this, e, e2));
    }

    /* renamed from: f */
    public Task mo18059f() {
        return this.f17334h.mo18103i().mo24874s(C9259j.m34159a(), new C8280e());
    }

    /* renamed from: g */
    public Task mo18060g() {
        return mo18059f().mo24874s(this.f17330d, new C8279d(this));
    }

    /* renamed from: h */
    public Map mo18061h() {
        return this.f17335i.mo18113d();
    }

    /* renamed from: i */
    public C8283h mo18062i() {
        return this.f17336j.mo18117c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo18063o(boolean z) {
        this.f17338l.mo18136b(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo18064p() {
        this.f17332f.mo18081e();
        this.f17333g.mo18081e();
        this.f17331e.mo18081e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo18065r(JSONArray jSONArray) {
        if (this.f17329c != null) {
            try {
                this.f17329c.mo23984m(m21591q(jSONArray));
            } catch (JSONException e) {
                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
            } catch (AbtException e2) {
                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
            }
        }
    }
}

package p302w9;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.p016os.C0937z;
import com.google.firebase.C5270e;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p238ra.C8087i;
import p302w9.C8896j;
import p314x8.C8976a;
import p326y8.C9102b0;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9131r;
import p327y9.C9142b;
import p337z7.C9231i;
import p337z7.Task;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;

/* renamed from: w9.f */
public class C8891f implements C8895i, C8896j {

    /* renamed from: a */
    private final C9142b f24901a;

    /* renamed from: b */
    private final Context f24902b;

    /* renamed from: c */
    private final C9142b f24903c;

    /* renamed from: d */
    private final Set f24904d;

    /* renamed from: e */
    private final Executor f24905e;

    private C8891f(Context context, String str, Set set, C9142b bVar, Executor executor) {
        this((C9142b) new C8890e(context, str), set, executor, bVar, context);
    }

    /* renamed from: g */
    public static C9104c m33035g() {
        C9102b0 a = C9102b0.m33557a(C8976a.class, Executor.class);
        return C9104c.m33562d(C8891f.class, C8895i.class, C8896j.class).mo24662b(C9131r.m33671j(Context.class)).mo24662b(C9131r.m33671j(C5270e.class)).mo24662b(C9131r.m33674m(C8892g.class)).mo24662b(C9131r.m33673l(C8087i.class)).mo24662b(C9131r.m33672k(a)).mo24666f(new C8887b(a)).mo24664d();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ C8891f m33036h(C9102b0 b0Var, C9110e eVar) {
        return new C8891f((Context) eVar.mo24668a(Context.class), ((C5270e) eVar.mo24668a(C5270e.class)).mo17484o(), eVar.mo24671d(C8892g.class), eVar.mo24674g(C8087i.class), (Executor) eVar.mo24670c(b0Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m33037i() {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            C8898k kVar = (C8898k) this.f24901a.get();
            List c = kVar.mo24322c();
            kVar.mo24321b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c.size(); i++) {
                C8899l lVar = (C8899l) c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", lVar.mo24311c());
                jSONObject.put("dates", new JSONArray(lVar.mo24310b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ C8898k m33038j(Context context, String str) {
        return new C8898k(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m33039k() {
        synchronized (this) {
            ((C8898k) this.f24901a.get()).mo24327k(System.currentTimeMillis(), ((C8087i) this.f24903c.get()).mo23265a());
        }
        return null;
    }

    /* renamed from: a */
    public Task mo24317a() {
        if (!C0937z.m3386a(this.f24902b)) {
            return C9231i.m34113g("");
        }
        return C9231i.m34110d(this.f24905e, new C8888c(this));
    }

    /* renamed from: b */
    public synchronized C8896j.C8897a mo24318b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C8898k kVar = (C8898k) this.f24901a.get();
        if (kVar.mo24325i(currentTimeMillis)) {
            kVar.mo24324g();
            return C8896j.C8897a.GLOBAL;
        }
        return C8896j.C8897a.NONE;
    }

    /* renamed from: l */
    public Task mo24319l() {
        if (this.f24904d.size() <= 0) {
            return C9231i.m34113g((Object) null);
        }
        if (!C0937z.m3386a(this.f24902b)) {
            return C9231i.m34113g((Object) null);
        }
        return C9231i.m34110d(this.f24905e, new C8889d(this));
    }

    C8891f(C9142b bVar, Set set, Executor executor, C9142b bVar2, Context context) {
        this.f24901a = bVar;
        this.f24904d = set;
        this.f24905e = executor;
        this.f24903c = bVar2;
        this.f24902b = context;
    }
}

package p301w8;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4429u2;
import com.google.firebase.C5242b;
import com.google.firebase.C5270e;
import com.google.firebase.analytics.connector.internal.C5237b;
import com.google.firebase.analytics.connector.internal.C5239d;
import com.google.firebase.analytics.connector.internal.C5241f;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p182n6.C7264i;
import p235r7.C8067a;
import p248s7.C8262p;
import p248s7.C8269w;
import p289v9.C8714a;
import p289v9.C8717d;
import p301w8.C8878a;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: w8.b */
public class C8882b implements C8878a {

    /* renamed from: c */
    private static volatile C8878a f24887c;

    /* renamed from: a */
    final C8067a f24888a;

    /* renamed from: b */
    final Map f24889b = new ConcurrentHashMap();

    /* renamed from: w8.b$a */
    class C8883a implements C8878a.C8879a {

        /* renamed from: a */
        final /* synthetic */ String f24890a;

        C8883a(String str) {
            this.f24890a = str;
        }
    }

    C8882b(C8067a aVar) {
        C7264i.m27902k(aVar);
        this.f24888a = aVar;
    }

    /* renamed from: h */
    public static C8878a m33017h(C5270e eVar, Context context, C8717d dVar) {
        C7264i.m27902k(eVar);
        C7264i.m27902k(context);
        C7264i.m27902k(dVar);
        C7264i.m27902k(context.getApplicationContext());
        if (f24887c == null) {
            synchronized (C8882b.class) {
                if (f24887c == null) {
                    Bundle bundle = new Bundle(1);
                    if (eVar.mo17487u()) {
                        dVar.mo24098b(C5242b.class, C8884c.f24892d, C8885d.f24893a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", eVar.mo17485t());
                    }
                    f24887c = new C8882b(C4429u2.m16797s(context, (String) null, (String) null, (String) null, bundle).mo13671p());
                }
            }
        }
        return f24887c;
    }

    /* renamed from: i */
    static /* synthetic */ void m33018i(C8714a aVar) {
        throw null;
    }

    /* renamed from: j */
    private final boolean m33019j(String str) {
        return !str.isEmpty() && this.f24889b.containsKey(str) && this.f24889b.get(str) != null;
    }

    /* renamed from: a */
    public void mo24301a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C5237b.m20700d(str) && C5237b.m20698b(str2, bundle) && C5237b.m20697a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong(NotificationMessage.NOTIF_KEY_REQUEST_ID, 1);
            }
            this.f24888a.mo23240e(str, str2, bundle);
        }
    }

    /* renamed from: b */
    public void mo24302b(String str, String str2, Object obj) {
        if (C5237b.m20700d(str) && C5237b.m20701e(str, str2)) {
            this.f24888a.mo23243h(str, str2, obj);
        }
    }

    /* renamed from: c */
    public Map mo24303c(boolean z) {
        return this.f24888a.mo23239d((String) null, (String) null, z);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || C5237b.m20698b(str2, bundle)) {
            this.f24888a.mo23236a(str, str2, bundle);
        }
    }

    /* renamed from: d */
    public int mo24305d(String str) {
        return this.f24888a.mo23238c(str);
    }

    /* renamed from: e */
    public List mo24306e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f24888a.mo23237b(str, str2)) {
            int i = C5237b.f16797g;
            C7264i.m27902k(bundle);
            C8878a.C8881c cVar = new C8878a.C8881c();
            Class<String> cls = String.class;
            cVar.f24872a = (String) C7264i.m27902k((String) C8262p.m31092a(bundle, "origin", cls, (Object) null));
            cVar.f24873b = (String) C7264i.m27902k((String) C8262p.m31092a(bundle, "name", cls, (Object) null));
            cVar.f24874c = C8262p.m31092a(bundle, C11755a.C11756a.f34100b, Object.class, (Object) null);
            cVar.f24875d = (String) C8262p.m31092a(bundle, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            cVar.f24876e = ((Long) C8262p.m31092a(bundle, "trigger_timeout", cls2, 0L)).longValue();
            cVar.f24877f = (String) C8262p.m31092a(bundle, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            cVar.f24878g = (Bundle) C8262p.m31092a(bundle, "timed_out_event_params", cls3, (Object) null);
            cVar.f24879h = (String) C8262p.m31092a(bundle, "triggered_event_name", cls, (Object) null);
            cVar.f24880i = (Bundle) C8262p.m31092a(bundle, "triggered_event_params", cls3, (Object) null);
            cVar.f24881j = ((Long) C8262p.m31092a(bundle, "time_to_live", cls2, 0L)).longValue();
            cVar.f24882k = (String) C8262p.m31092a(bundle, "expired_event_name", cls, (Object) null);
            cVar.f24883l = (Bundle) C8262p.m31092a(bundle, "expired_event_params", cls3, (Object) null);
            cVar.f24885n = ((Boolean) C8262p.m31092a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f24884m = ((Long) C8262p.m31092a(bundle, "creation_timestamp", cls2, 0L)).longValue();
            cVar.f24886o = ((Long) C8262p.m31092a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: f */
    public void mo24307f(C8878a.C8881c cVar) {
        String str;
        int i = C5237b.f16797g;
        if (cVar != null && (str = cVar.f24872a) != null && !str.isEmpty()) {
            Object obj = cVar.f24874c;
            if ((obj == null || C8269w.m31111a(obj) != null) && C5237b.m20700d(str) && C5237b.m20701e(str, cVar.f24873b)) {
                String str2 = cVar.f24882k;
                if (str2 == null || (C5237b.m20698b(str2, cVar.f24883l) && C5237b.m20697a(str, cVar.f24882k, cVar.f24883l))) {
                    String str3 = cVar.f24879h;
                    if (str3 == null || (C5237b.m20698b(str3, cVar.f24880i) && C5237b.m20697a(str, cVar.f24879h, cVar.f24880i))) {
                        String str4 = cVar.f24877f;
                        if (str4 == null || (C5237b.m20698b(str4, cVar.f24878g) && C5237b.m20697a(str, cVar.f24877f, cVar.f24878g))) {
                            C8067a aVar = this.f24888a;
                            Bundle bundle = new Bundle();
                            String str5 = cVar.f24872a;
                            if (str5 != null) {
                                bundle.putString("origin", str5);
                            }
                            String str6 = cVar.f24873b;
                            if (str6 != null) {
                                bundle.putString("name", str6);
                            }
                            Object obj2 = cVar.f24874c;
                            if (obj2 != null) {
                                C8262p.m31093b(bundle, obj2);
                            }
                            String str7 = cVar.f24875d;
                            if (str7 != null) {
                                bundle.putString("trigger_event_name", str7);
                            }
                            bundle.putLong("trigger_timeout", cVar.f24876e);
                            String str8 = cVar.f24877f;
                            if (str8 != null) {
                                bundle.putString("timed_out_event_name", str8);
                            }
                            Bundle bundle2 = cVar.f24878g;
                            if (bundle2 != null) {
                                bundle.putBundle("timed_out_event_params", bundle2);
                            }
                            String str9 = cVar.f24879h;
                            if (str9 != null) {
                                bundle.putString("triggered_event_name", str9);
                            }
                            Bundle bundle3 = cVar.f24880i;
                            if (bundle3 != null) {
                                bundle.putBundle("triggered_event_params", bundle3);
                            }
                            bundle.putLong("time_to_live", cVar.f24881j);
                            String str10 = cVar.f24882k;
                            if (str10 != null) {
                                bundle.putString("expired_event_name", str10);
                            }
                            Bundle bundle4 = cVar.f24883l;
                            if (bundle4 != null) {
                                bundle.putBundle("expired_event_params", bundle4);
                            }
                            bundle.putLong("creation_timestamp", cVar.f24884m);
                            bundle.putBoolean("active", cVar.f24885n);
                            bundle.putLong("triggered_timestamp", cVar.f24886o);
                            aVar.mo23242g(bundle);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public C8878a.C8879a mo24308g(String str, C8878a.C8880b bVar) {
        Object obj;
        C7264i.m27902k(bVar);
        if (!C5237b.m20700d(str) || m33019j(str)) {
            return null;
        }
        C8067a aVar = this.f24888a;
        if ("fiam".equals(str)) {
            obj = new C5239d(aVar, bVar);
        } else if ("clx".equals(str)) {
            obj = new C5241f(aVar, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f24889b.put(str, obj);
        return new C8883a(str);
    }
}

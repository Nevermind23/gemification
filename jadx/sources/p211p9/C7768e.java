package p211p9;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3857b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3892h;
import com.google.firebase.C5270e;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import p156l6.C6956n;
import p182n6.C7264i;
import p195o6.C7462b;
import p198o9.C7493a;
import p198o9.C7494b;
import p211p9.C7772f;
import p301w8.C8878a;
import p327y9.C9142b;
import p337z7.C9227g;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: p9.e */
public class C7768e extends C7493a {

    /* renamed from: a */
    private final C3857b f22469a;

    /* renamed from: b */
    private final C9142b f22470b;

    /* renamed from: c */
    private final C5270e f22471c;

    /* renamed from: p9.e$a */
    static class C7769a extends C7772f.C7773a {
        C7769a() {
        }

        /* renamed from: b1 */
        public void mo22528b1(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p9.e$b */
    static class C7770b extends C7769a {

        /* renamed from: b */
        private final C9227g f22472b;

        /* renamed from: c */
        private final C9142b f22473c;

        public C7770b(C9142b bVar, C9227g gVar) {
            this.f22473c = bVar;
            this.f22472b = gVar;
        }

        /* renamed from: y0 */
        public void mo22529y0(Status status, DynamicLinkData dynamicLinkData) {
            C7494b bVar;
            Bundle bundle;
            C8878a aVar;
            if (dynamicLinkData == null) {
                bVar = null;
            } else {
                bVar = new C7494b(dynamicLinkData);
            }
            C6956n.m26961a(status, bVar, this.f22472b);
            if (dynamicLinkData != null && (bundle = dynamicLinkData.mo17451R().getBundle("scionData")) != null && bundle.keySet() != null && (aVar = (C8878a) this.f22473c.get()) != null) {
                for (String next : bundle.keySet()) {
                    aVar.mo24301a("fdl", next, bundle.getBundle(next));
                }
            }
        }
    }

    /* renamed from: p9.e$c */
    static final class C7771c extends C3892h {

        /* renamed from: d */
        private final String f22474d;

        /* renamed from: e */
        private final C9142b f22475e;

        C7771c(C9142b bVar, String str) {
            super((Feature[]) null, false, 13201);
            this.f22474d = str;
            this.f22475e = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo12073b(C7766c cVar, C9227g gVar) {
            cVar.mo22526s0(new C7770b(this.f22475e, gVar), this.f22474d);
        }
    }

    public C7768e(C5270e eVar, C9142b bVar) {
        this(new C7764b(eVar.mo17481j()), eVar, bVar);
    }

    /* renamed from: a */
    public Task mo21927a(Intent intent) {
        String str;
        C7494b e;
        if (intent != null) {
            str = intent.getDataString();
        } else {
            str = null;
        }
        Task q = this.f22469a.mo11941q(new C7771c(this.f22470b, str));
        if (intent == null || (e = mo22527e(intent)) == null) {
            return q;
        }
        return C9231i.m34113g(e);
    }

    /* renamed from: b */
    public Task mo21928b(Uri uri) {
        return this.f22469a.mo11941q(new C7771c(this.f22470b, uri.toString()));
    }

    /* renamed from: e */
    public C7494b mo22527e(Intent intent) {
        DynamicLinkData dynamicLinkData = (DynamicLinkData) C7462b.m28396b(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", DynamicLinkData.CREATOR);
        if (dynamicLinkData != null) {
            return new C7494b(dynamicLinkData);
        }
        return null;
    }

    public C7768e(C3857b bVar, C5270e eVar, C9142b bVar2) {
        this.f22469a = bVar;
        this.f22471c = (C5270e) C7264i.m27902k(eVar);
        this.f22470b = bVar2;
        if (bVar2.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }
}

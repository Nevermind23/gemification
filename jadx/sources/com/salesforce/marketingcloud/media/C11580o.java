package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import com.salesforce.marketingcloud.media.C11591u;
import com.salesforce.marketingcloud.storage.C11800j;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.o */
public class C11580o {

    /* renamed from: i */
    static final Handler f33603i = new C11581a(Looper.getMainLooper());

    /* renamed from: a */
    final Context f33604a;

    /* renamed from: b */
    final C11564h f33605b;

    /* renamed from: c */
    final C11557c f33606c;

    /* renamed from: d */
    final C11586r f33607d;

    /* renamed from: e */
    final Map<ImageView, C11563g> f33608e = new WeakHashMap();

    /* renamed from: f */
    final Map<Object, C11553a> f33609f = new WeakHashMap();

    /* renamed from: g */
    private final List<C11591u> f33610g;

    /* renamed from: h */
    public ReferenceQueue f33611h;

    /* renamed from: com.salesforce.marketingcloud.media.o$a */
    class C11581a extends Handler {
        C11581a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                C11576n nVar = (C11576n) message.obj;
                nVar.f33587a.mo30235a(nVar);
            } else if (i == 5) {
                C11561e eVar = (C11561e) message.obj;
                eVar.f33553a.mo30234a(eVar);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.media.o$b */
    public enum C11582b {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: a */
        final int f33616a;

        private C11582b(int i) {
            this.f33616a = i;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.media.o$c */
    public enum C11583c {
        NORMAL,
        HIGH
    }

    public C11580o(Context context, C11564h hVar, C11557c cVar, C11586r rVar) {
        this.f33604a = context;
        this.f33605b = hVar;
        this.f33606c = cVar;
        this.f33607d = rVar;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new C11585q(rVar));
        arrayList.add(new C11567i(context));
        this.f33610g = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public Bitmap mo30229a(String str) {
        return this.f33606c.mo30175a(str);
    }

    /* renamed from: b */
    public C11590t mo30239b(String str) {
        return new C11590t(this, Uri.parse(str));
    }

    /* renamed from: a */
    public C11555b mo30230a(List<String> list) {
        return new C11555b(this, new ArrayList(list));
    }

    /* renamed from: a */
    public static C11580o m42266a(Context context, C11800j jVar) {
        C11557c cVar = new C11557c(context);
        return new C11580o(context, new C11564h(context, new C11571m(), f33603i, cVar), cVar, new C11586r(jVar.mo31615k()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C11591u> mo30231a() {
        return this.f33610g;
    }

    /* renamed from: a */
    public void mo30232a(ImageView imageView, C11563g gVar) {
        if (this.f33608e.containsKey(imageView)) {
            mo30236a((Object) imageView);
        }
        this.f33608e.put(imageView, gVar);
    }

    /* renamed from: a */
    public void mo30233a(C11553a aVar) {
        Object f = aVar.mo30168f();
        if (!(f == null || this.f33609f.get(f) == aVar)) {
            mo30236a(f);
            this.f33609f.put(f, aVar);
        }
        this.f33605b.mo30193b(aVar);
    }

    /* renamed from: a */
    private void m42267a(C11553a aVar, C11591u.C11593b bVar, Exception exc) {
        if (!aVar.mo30169g()) {
            this.f33609f.remove(aVar.mo30168f());
            if (bVar != null) {
                aVar.mo30162a(bVar);
            } else {
                aVar.mo30163a(exc);
            }
        }
    }

    /* renamed from: a */
    public void mo30234a(C11561e eVar) {
        C11562f b = eVar.f33554b.mo30180b();
        if (b == null) {
            return;
        }
        if (eVar.mo30184b()) {
            b.mo30172a(eVar.mo30183a());
        } else {
            b.mo30170a();
        }
    }

    /* renamed from: a */
    public void mo30235a(C11576n nVar) {
        C11553a c = nVar.mo30216c();
        List<C11553a> d = nVar.mo30217d();
        boolean z = true;
        boolean z2 = d != null && !d.isEmpty();
        if (c == null && !z2) {
            z = false;
        }
        if (z) {
            Exception f = nVar.mo30219f();
            C11591u.C11593b i = nVar.mo30222i();
            if (c != null) {
                m42267a(c, i, f);
            }
            if (z2) {
                int size = d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m42267a(d.get(i2), i, f);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30236a(Object obj) {
        C11563g remove;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            C11553a remove2 = this.f33609f.remove(obj);
            if (remove2 != null) {
                remove2.mo30161a();
                this.f33605b.mo30190a(remove2);
            }
            if ((obj instanceof ImageView) && (remove = this.f33608e.remove((ImageView) obj)) != null) {
                remove.mo30186a();
            }
        }
    }

    /* renamed from: a */
    public void mo30237a(Collection<String> collection) {
        mo30238a(collection, (C11562f) null);
    }

    /* renamed from: a */
    public void mo30238a(Collection<String> collection, C11562f fVar) {
        if (collection != null && !collection.isEmpty()) {
            this.f33605b.mo30191a(new C11560d(this, new ArrayList(collection), this.f33607d, fVar));
        }
    }
}

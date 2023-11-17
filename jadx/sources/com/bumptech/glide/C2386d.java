package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.load.engine.C2457j;
import java.util.List;
import java.util.Map;
import p035c4.C2256h;
import p050d4.C5823g;
import p050d4.C5826j;
import p089g4.C6215f;
import p205p3.C7674b;

/* renamed from: com.bumptech.glide.d */
public class C2386d extends ContextWrapper {

    /* renamed from: k */
    static final C2400l f7566k = new C2378a();

    /* renamed from: a */
    private final C7674b f7567a;

    /* renamed from: b */
    private final C6215f.C6217b f7568b;

    /* renamed from: c */
    private final C5823g f7569c;

    /* renamed from: d */
    private final C2379b.C2380a f7570d;

    /* renamed from: e */
    private final List f7571e;

    /* renamed from: f */
    private final Map f7572f;

    /* renamed from: g */
    private final C2457j f7573g;

    /* renamed from: h */
    private final C2387e f7574h;

    /* renamed from: i */
    private final int f7575i;

    /* renamed from: j */
    private C2256h f7576j;

    public C2386d(Context context, C7674b bVar, C6215f.C6217b bVar2, C5823g gVar, C2379b.C2380a aVar, Map map, List list, C2457j jVar, C2387e eVar, int i) {
        super(context.getApplicationContext());
        this.f7567a = bVar;
        this.f7569c = gVar;
        this.f7570d = aVar;
        this.f7571e = list;
        this.f7572f = map;
        this.f7573g = jVar;
        this.f7574h = eVar;
        this.f7575i = i;
        this.f7568b = C6215f.m24712a(bVar2);
    }

    /* renamed from: a */
    public C5826j mo7701a(ImageView imageView, Class cls) {
        return this.f7569c.mo19049a(imageView, cls);
    }

    /* renamed from: b */
    public C7674b mo7702b() {
        return this.f7567a;
    }

    /* renamed from: c */
    public List mo7703c() {
        return this.f7571e;
    }

    /* renamed from: d */
    public synchronized C2256h mo7704d() {
        if (this.f7576j == null) {
            this.f7576j = (C2256h) this.f7570d.mo7698a().mo7211V();
        }
        return this.f7576j;
    }

    /* renamed from: e */
    public C2400l mo7705e(Class cls) {
        C2400l lVar = (C2400l) this.f7572f.get(cls);
        if (lVar == null) {
            for (Map.Entry entry : this.f7572f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (C2400l) entry.getValue();
                }
            }
        }
        if (lVar == null) {
            return f7566k;
        }
        return lVar;
    }

    /* renamed from: f */
    public C2457j mo7706f() {
        return this.f7573g;
    }

    /* renamed from: g */
    public C2387e mo7707g() {
        return this.f7574h;
    }

    /* renamed from: h */
    public int mo7708h() {
        return this.f7575i;
    }

    /* renamed from: i */
    public Registry mo7709i() {
        return (Registry) this.f7568b.get();
    }
}

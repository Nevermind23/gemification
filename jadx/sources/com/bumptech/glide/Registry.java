package com.bumptech.glide;

import androidx.core.util.C1005e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2417e;
import com.bumptech.glide.load.data.C2419f;
import com.bumptech.glide.load.engine.C2455i;
import com.bumptech.glide.load.engine.C2476q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p022b4.C2154a;
import p022b4.C2156b;
import p022b4.C2157c;
import p022b4.C2158d;
import p022b4.C2159e;
import p022b4.C2161f;
import p102h4.C6427a;
import p166m3.C7082d;
import p166m3.C7090j;
import p166m3.C7091k;
import p192o3.C7430c;
import p244s3.C8190o;
import p244s3.C8191p;
import p333z3.C9203e;
import p333z3.C9204f;

public class Registry {

    /* renamed from: a */
    private final C8191p f7526a;

    /* renamed from: b */
    private final C2154a f7527b;

    /* renamed from: c */
    private final C2159e f7528c;

    /* renamed from: d */
    private final C2161f f7529d;

    /* renamed from: e */
    private final C2419f f7530e;

    /* renamed from: f */
    private final C9204f f7531f;

    /* renamed from: g */
    private final C2156b f7532g;

    /* renamed from: h */
    private final C2158d f7533h = new C2158d();

    /* renamed from: i */
    private final C2157c f7534i = new C2157c();

    /* renamed from: j */
    private final C1005e f7535j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public NoModelLoaderAvailableException(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        C1005e e = C6427a.m25515e();
        this.f7535j = e;
        this.f7526a = new C8191p(e);
        this.f7527b = new C2154a();
        this.f7528c = new C2159e();
        this.f7529d = new C2161f();
        this.f7530e = new C2419f();
        this.f7531f = new C9204f();
        this.f7532g = new C2156b();
        mo7680r(Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: f */
    private List m9185f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f7528c.mo7039d(cls, cls2)) {
            for (Class cls5 : this.f7531f.mo24840b(cls4, cls3)) {
                arrayList.add(new C2455i(cls, cls4, cls5, this.f7528c.mo7038b(cls, cls4), this.f7531f.mo24839a(cls4, cls5), this.f7535j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public Registry mo7664a(Class cls, Class cls2, C7090j jVar) {
        mo7668e("legacy_append", cls, cls2, jVar);
        return this;
    }

    /* renamed from: b */
    public Registry mo7665b(Class cls, Class cls2, C8190o oVar) {
        this.f7526a.mo23387a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: c */
    public Registry mo7666c(Class cls, C7082d dVar) {
        this.f7527b.mo7027a(cls, dVar);
        return this;
    }

    /* renamed from: d */
    public Registry mo7667d(Class cls, C7091k kVar) {
        this.f7529d.mo7042a(cls, kVar);
        return this;
    }

    /* renamed from: e */
    public Registry mo7668e(String str, Class cls, Class cls2, C7090j jVar) {
        this.f7528c.mo7037a(str, jVar, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List mo7669g() {
        List b = this.f7532g.mo7031b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new NoImageHeaderParserException();
    }

    /* renamed from: h */
    public C2476q mo7670h(Class cls, Class cls2, Class cls3) {
        C2476q a = this.f7534i.mo7032a(cls, cls2, cls3);
        if (this.f7534i.mo7033c(a)) {
            return null;
        }
        if (a == null) {
            List f = m9185f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new C2476q(cls, cls2, cls3, f, this.f7535j);
            }
            this.f7534i.mo7034d(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: i */
    public List mo7671i(Object obj) {
        return this.f7526a.mo23389d(obj);
    }

    /* renamed from: j */
    public List mo7672j(Class cls, Class cls2, Class cls3) {
        List a = this.f7533h.mo7035a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList();
            for (Class d : this.f7526a.mo23388c(cls)) {
                for (Class cls4 : this.f7528c.mo7039d(d, cls2)) {
                    if (!this.f7531f.mo24840b(cls4, cls3).isEmpty() && !a.contains(cls4)) {
                        a.add(cls4);
                    }
                }
            }
            this.f7533h.mo7036b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: k */
    public C7091k mo7673k(C7430c cVar) {
        C7091k b = this.f7529d.mo7043b(cVar.mo7944d());
        if (b != null) {
            return b;
        }
        throw new NoResultEncoderAvailableException(cVar.mo7944d());
    }

    /* renamed from: l */
    public C2417e mo7674l(Object obj) {
        return this.f7530e.mo7799a(obj);
    }

    /* renamed from: m */
    public C7082d mo7675m(Object obj) {
        C7082d b = this.f7527b.mo7028b(obj.getClass());
        if (b != null) {
            return b;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    /* renamed from: n */
    public boolean mo7676n(C7430c cVar) {
        return this.f7529d.mo7043b(cVar.mo7944d()) != null;
    }

    /* renamed from: o */
    public Registry mo7677o(ImageHeaderParser imageHeaderParser) {
        this.f7532g.mo7030a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry mo7678p(C2417e.C2418a aVar) {
        this.f7530e.mo7800b(aVar);
        return this;
    }

    /* renamed from: q */
    public Registry mo7679q(Class cls, Class cls2, C9203e eVar) {
        this.f7531f.mo24841c(cls, cls2, eVar);
        return this;
    }

    /* renamed from: r */
    public final Registry mo7680r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f7528c.mo7040e(arrayList);
        return this;
    }
}

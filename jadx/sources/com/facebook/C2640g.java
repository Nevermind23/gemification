package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.g */
public class C2640g extends AbstractList {

    /* renamed from: j */
    private static AtomicInteger f8249j = new AtomicInteger();

    /* renamed from: d */
    private Handler f8250d;

    /* renamed from: e */
    private List f8251e = new ArrayList();

    /* renamed from: f */
    private int f8252f = 0;

    /* renamed from: g */
    private final String f8253g = Integer.valueOf(f8249j.incrementAndGet()).toString();

    /* renamed from: h */
    private List f8254h = new ArrayList();

    /* renamed from: i */
    private String f8255i;

    /* renamed from: com.facebook.g$a */
    public interface C2641a {
        /* renamed from: a */
        void mo8238a(C2640g gVar);
    }

    public C2640g(Collection collection) {
        this.f8251e = new ArrayList(collection);
    }

    /* renamed from: A */
    public final GraphRequest remove(int i) {
        return (GraphRequest) this.f8251e.remove(i);
    }

    /* renamed from: B */
    public final GraphRequest set(int i, GraphRequest graphRequest) {
        return (GraphRequest) this.f8251e.set(i, graphRequest);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo8257C(Handler handler) {
        this.f8250d = handler;
    }

    /* renamed from: b */
    public final void add(int i, GraphRequest graphRequest) {
        this.f8251e.add(i, graphRequest);
    }

    /* renamed from: c */
    public final boolean add(GraphRequest graphRequest) {
        return this.f8251e.add(graphRequest);
    }

    public final void clear() {
        this.f8251e.clear();
    }

    /* renamed from: g */
    public void mo8263g(C2641a aVar) {
        if (!this.f8254h.contains(aVar)) {
            this.f8254h.add(aVar);
        }
    }

    /* renamed from: i */
    public final List mo8265i() {
        return mo8266j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List mo8266j() {
        return GraphRequest.m10035j(this);
    }

    /* renamed from: k */
    public final C2639f mo8267k() {
        return mo8268l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C2639f mo8268l() {
        return GraphRequest.m10038m(this);
    }

    /* renamed from: n */
    public final GraphRequest get(int i) {
        return (GraphRequest) this.f8251e.get(i);
    }

    /* renamed from: o */
    public final String mo8270o() {
        return this.f8255i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Handler mo8271r() {
        return this.f8250d;
    }

    public final int size() {
        return this.f8251e.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final List mo8275v() {
        return this.f8254h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo8276w() {
        return this.f8253g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final List mo8277x() {
        return this.f8251e;
    }

    /* renamed from: z */
    public int mo8278z() {
        return this.f8252f;
    }

    public C2640g(GraphRequest... graphRequestArr) {
        this.f8251e = Arrays.asList(graphRequestArr);
    }
}

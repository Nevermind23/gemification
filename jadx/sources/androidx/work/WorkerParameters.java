package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p216q1.C7819c;

public final class WorkerParameters {

    /* renamed from: a */
    private UUID f5866a;

    /* renamed from: b */
    private C1959e f5867b;

    /* renamed from: c */
    private Set f5868c;

    /* renamed from: d */
    private C1948a f5869d;

    /* renamed from: e */
    private int f5870e;

    /* renamed from: f */
    private Executor f5871f;

    /* renamed from: g */
    private C7819c f5872g;

    /* renamed from: h */
    private C2099z f5873h;

    /* renamed from: i */
    private C2089s f5874i;

    /* renamed from: j */
    private C1964i f5875j;

    /* renamed from: k */
    private int f5876k;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1948a {

        /* renamed from: a */
        public List f5877a = Collections.emptyList();

        /* renamed from: b */
        public List f5878b = Collections.emptyList();

        /* renamed from: c */
        public Network f5879c;
    }

    public WorkerParameters(UUID uuid, C1959e eVar, Collection collection, C1948a aVar, int i, int i2, Executor executor, C7819c cVar, C2099z zVar, C2089s sVar, C1964i iVar) {
        this.f5866a = uuid;
        this.f5867b = eVar;
        this.f5868c = new HashSet(collection);
        this.f5869d = aVar;
        this.f5870e = i;
        this.f5876k = i2;
        this.f5871f = executor;
        this.f5872g = cVar;
        this.f5873h = zVar;
        this.f5874i = sVar;
        this.f5875j = iVar;
    }

    /* renamed from: a */
    public Executor mo6681a() {
        return this.f5871f;
    }

    /* renamed from: b */
    public C1964i mo6682b() {
        return this.f5875j;
    }

    /* renamed from: c */
    public UUID mo6683c() {
        return this.f5866a;
    }

    /* renamed from: d */
    public C1959e mo6684d() {
        return this.f5867b;
    }

    /* renamed from: e */
    public Network mo6685e() {
        return this.f5869d.f5879c;
    }

    /* renamed from: f */
    public C2089s mo6686f() {
        return this.f5874i;
    }

    /* renamed from: g */
    public int mo6687g() {
        return this.f5870e;
    }

    /* renamed from: h */
    public Set mo6688h() {
        return this.f5868c;
    }

    /* renamed from: i */
    public C7819c mo6689i() {
        return this.f5872g;
    }

    /* renamed from: j */
    public List mo6690j() {
        return this.f5869d.f5877a;
    }

    /* renamed from: k */
    public List mo6691k() {
        return this.f5869d.f5878b;
    }

    /* renamed from: l */
    public C2099z mo6692l() {
        return this.f5873h;
    }
}

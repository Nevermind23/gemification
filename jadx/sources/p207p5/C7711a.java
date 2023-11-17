package p207p5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p168m5.C7124m;

/* renamed from: p5.a */
public final class C7711a {

    /* renamed from: e */
    private static final C7711a f22402e = new C7712a().mo22448b();

    /* renamed from: a */
    private final C7722f f22403a;

    /* renamed from: b */
    private final List f22404b;

    /* renamed from: c */
    private final C7713b f22405c;

    /* renamed from: d */
    private final String f22406d;

    /* renamed from: p5.a$a */
    public static final class C7712a {

        /* renamed from: a */
        private C7722f f22407a = null;

        /* renamed from: b */
        private List f22408b = new ArrayList();

        /* renamed from: c */
        private C7713b f22409c = null;

        /* renamed from: d */
        private String f22410d = "";

        C7712a() {
        }

        /* renamed from: a */
        public C7712a mo22447a(C7718d dVar) {
            this.f22408b.add(dVar);
            return this;
        }

        /* renamed from: b */
        public C7711a mo22448b() {
            return new C7711a(this.f22407a, Collections.unmodifiableList(this.f22408b), this.f22409c, this.f22410d);
        }

        /* renamed from: c */
        public C7712a mo22449c(String str) {
            this.f22410d = str;
            return this;
        }

        /* renamed from: d */
        public C7712a mo22450d(C7713b bVar) {
            this.f22409c = bVar;
            return this;
        }

        /* renamed from: e */
        public C7712a mo22451e(C7722f fVar) {
            this.f22407a = fVar;
            return this;
        }
    }

    C7711a(C7722f fVar, List list, C7713b bVar, String str) {
        this.f22403a = fVar;
        this.f22404b = list;
        this.f22405c = bVar;
        this.f22406d = str;
    }

    /* renamed from: e */
    public static C7712a m29286e() {
        return new C7712a();
    }

    /* renamed from: a */
    public String mo22442a() {
        return this.f22406d;
    }

    /* renamed from: b */
    public C7713b mo22443b() {
        return this.f22405c;
    }

    /* renamed from: c */
    public List mo22444c() {
        return this.f22404b;
    }

    /* renamed from: d */
    public C7722f mo22445d() {
        return this.f22403a;
    }

    /* renamed from: f */
    public byte[] mo22446f() {
        return C7124m.m27470a(this);
    }
}

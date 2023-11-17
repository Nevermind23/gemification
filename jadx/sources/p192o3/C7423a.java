package p192o3;

import p166m3.C7079a;
import p166m3.C7081c;

/* renamed from: o3.a */
public abstract class C7423a {

    /* renamed from: a */
    public static final C7423a f21686a = new C7424a();

    /* renamed from: b */
    public static final C7423a f21687b = new C7425b();

    /* renamed from: c */
    public static final C7423a f21688c = new C7426c();

    /* renamed from: d */
    public static final C7423a f21689d = new C7427d();

    /* renamed from: e */
    public static final C7423a f21690e = new C7428e();

    /* renamed from: o3.a$a */
    class C7424a extends C7423a {
        C7424a() {
        }

        /* renamed from: a */
        public boolean mo21829a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo21830b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo21831c(C7079a aVar) {
            return aVar == C7079a.REMOTE;
        }

        /* renamed from: d */
        public boolean mo21832d(boolean z, C7079a aVar, C7081c cVar) {
            return (aVar == C7079a.RESOURCE_DISK_CACHE || aVar == C7079a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: o3.a$b */
    class C7425b extends C7423a {
        C7425b() {
        }

        /* renamed from: a */
        public boolean mo21829a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo21830b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo21831c(C7079a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo21832d(boolean z, C7079a aVar, C7081c cVar) {
            return false;
        }
    }

    /* renamed from: o3.a$c */
    class C7426c extends C7423a {
        C7426c() {
        }

        /* renamed from: a */
        public boolean mo21829a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo21830b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo21831c(C7079a aVar) {
            return (aVar == C7079a.DATA_DISK_CACHE || aVar == C7079a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public boolean mo21832d(boolean z, C7079a aVar, C7081c cVar) {
            return false;
        }
    }

    /* renamed from: o3.a$d */
    class C7427d extends C7423a {
        C7427d() {
        }

        /* renamed from: a */
        public boolean mo21829a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo21830b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo21831c(C7079a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo21832d(boolean z, C7079a aVar, C7081c cVar) {
            return (aVar == C7079a.RESOURCE_DISK_CACHE || aVar == C7079a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: o3.a$e */
    class C7428e extends C7423a {
        C7428e() {
        }

        /* renamed from: a */
        public boolean mo21829a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo21830b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo21831c(C7079a aVar) {
            return aVar == C7079a.REMOTE;
        }

        /* renamed from: d */
        public boolean mo21832d(boolean z, C7079a aVar, C7081c cVar) {
            return ((z && aVar == C7079a.DATA_DISK_CACHE) || aVar == C7079a.LOCAL) && cVar == C7081c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo21829a();

    /* renamed from: b */
    public abstract boolean mo21830b();

    /* renamed from: c */
    public abstract boolean mo21831c(C7079a aVar);

    /* renamed from: d */
    public abstract boolean mo21832d(boolean z, C7079a aVar, C7081c cVar);
}

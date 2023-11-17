package p244s3;

import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import p076f4.C6156d;
import p166m3.C7079a;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.w */
public class C8212w implements C8188n {

    /* renamed from: a */
    private static final C8212w f23385a = new C8212w();

    /* renamed from: s3.w$a */
    public static class C8213a implements C8190o {

        /* renamed from: a */
        private static final C8213a f23386a = new C8213a();

        /* renamed from: a */
        public static C8213a m30958a() {
            return f23386a;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return C8212w.m30955c();
        }
    }

    /* renamed from: s3.w$b */
    private static class C8214b implements C2415d {

        /* renamed from: d */
        private final Object f23387d;

        C8214b(Object obj) {
            this.f23387d = obj;
        }

        /* renamed from: a */
        public Class mo7781a() {
            return this.f23387d.getClass();
        }

        /* renamed from: b */
        public void mo7786b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C7079a mo7789d() {
            return C7079a.LOCAL;
        }

        /* renamed from: e */
        public void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
            aVar.mo7798f(this.f23387d);
        }
    }

    /* renamed from: c */
    public static C8212w m30955c() {
        return f23385a;
    }

    /* renamed from: a */
    public C8188n.C8189a mo23326a(Object obj, int i, int i2, C7088h hVar) {
        return new C8188n.C8189a(new C6156d(obj), new C8214b(obj));
    }

    /* renamed from: b */
    public boolean mo23327b(Object obj) {
        return true;
    }
}

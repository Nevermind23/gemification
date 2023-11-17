package bi1;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p316xa.C8982a;
import zh1.C43455h;
import zh1.C43511w;

/* renamed from: bi1.a */
public final class C40388a extends C43455h.C43456a {

    /* renamed from: a */
    private final Gson f95968a;

    private C40388a(Gson gson) {
        this.f95968a = gson;
    }

    /* renamed from: f */
    public static C40388a m116953f() {
        return m116954g(new Gson());
    }

    /* renamed from: g */
    public static C40388a m116954g(Gson gson) {
        if (gson != null) {
            return new C40388a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: c */
    public C43455h mo94448c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C43511w wVar) {
        return new C40389b(this.f95968a, this.f95968a.mo18175q(C8982a.get(type)));
    }

    /* renamed from: d */
    public C43455h mo94449d(Type type, Annotation[] annotationArr, C43511w wVar) {
        return new C40390c(this.f95968a, this.f95968a.mo18175q(C8982a.get(type)));
    }
}

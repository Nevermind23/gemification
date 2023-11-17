package zh1;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import of1.C41884e0;
import p342j$.util.Optional;
import zh1.C43455h;

/* renamed from: zh1.p */
final class C43482p extends C43455h.C43456a {

    /* renamed from: a */
    static final C43455h.C43456a f101367a = new C43482p();

    /* renamed from: zh1.p$a */
    static final class C43483a implements C43455h {

        /* renamed from: a */
        final C43455h f101368a;

        C43483a(C43455h hVar) {
            this.f101368a = hVar;
        }

        /* renamed from: b */
        public Optional mo94450a(C41884e0 e0Var) {
            return Optional.ofNullable(this.f101368a.mo94450a(e0Var));
        }
    }

    C43482p() {
    }

    /* renamed from: d */
    public C43455h mo94449d(Type type, Annotation[] annotationArr, C43511w wVar) {
        if (C43455h.C43456a.m124654b(type) != Optional.class) {
            return null;
        }
        return new C43483a(wVar.mo102227i(C43455h.C43456a.m124653a(0, (ParameterizedType) type), annotationArr));
    }
}

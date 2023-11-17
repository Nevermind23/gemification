package p207p5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: p5.d */
public final class C7718d {

    /* renamed from: c */
    private static final C7718d f22428c = new C7719a().mo22462a();

    /* renamed from: a */
    private final String f22429a;

    /* renamed from: b */
    private final List f22430b;

    /* renamed from: p5.d$a */
    public static final class C7719a {

        /* renamed from: a */
        private String f22431a = "";

        /* renamed from: b */
        private List f22432b = new ArrayList();

        C7719a() {
        }

        /* renamed from: a */
        public C7718d mo22462a() {
            return new C7718d(this.f22431a, Collections.unmodifiableList(this.f22432b));
        }

        /* renamed from: b */
        public C7719a mo22463b(List list) {
            this.f22432b = list;
            return this;
        }

        /* renamed from: c */
        public C7719a mo22464c(String str) {
            this.f22431a = str;
            return this;
        }
    }

    C7718d(String str, List list) {
        this.f22429a = str;
        this.f22430b = list;
    }

    /* renamed from: c */
    public static C7719a m29308c() {
        return new C7719a();
    }

    /* renamed from: a */
    public List mo22460a() {
        return this.f22430b;
    }

    /* renamed from: b */
    public String mo22461b() {
        return this.f22429a;
    }
}

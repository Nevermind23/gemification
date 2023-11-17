package w51;

import kotlin.jvm.internal.C41536l;
import xy0.C39934a;

/* renamed from: w51.c */
public abstract class C39527c {

    /* renamed from: a */
    private final C39531d f93976a;

    /* renamed from: w51.c$a */
    public static final class C39528a extends C39527c {
        public C39528a() {
            super(C39531d.MORE_FAILED);
        }
    }

    /* renamed from: w51.c$b */
    public static final class C39529b extends C39527c {
        public C39529b() {
            super(C39531d.MORE_LOADING);
        }
    }

    /* renamed from: w51.c$c */
    public static final class C39530c extends C39527c {

        /* renamed from: b */
        private final C39934a f93977b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39530c(C39934a aVar) {
            super(C39531d.STATEMENT);
            C41536l.m120489i(aVar, "statement");
            this.f93977b = aVar;
        }

        /* renamed from: b */
        public final C39934a mo93184b() {
            return this.f93977b;
        }
    }

    /* renamed from: w51.c$d */
    public enum C39531d {
        MORE_LOADING,
        MORE_FAILED,
        STATEMENT
    }

    public C39527c(C39531d dVar) {
        C41536l.m120489i(dVar, "viewType");
        this.f93976a = dVar;
    }

    /* renamed from: a */
    public final C39531d mo93183a() {
        return this.f93976a;
    }
}

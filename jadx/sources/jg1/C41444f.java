package jg1;

import java.io.PrintStream;
import java.util.logging.Level;
import kg1.C41512a;

/* renamed from: jg1.f */
public interface C41444f {

    /* renamed from: jg1.f$a */
    public static class C41445a {
        /* renamed from: a */
        public static C41444f m120261a() {
            if (C41512a.m120415a()) {
                return C41512a.m120416b().f97681a;
            }
            return new C41446b();
        }
    }

    /* renamed from: jg1.f$b */
    public static class C41446b implements C41444f {
        /* renamed from: a */
        public void mo96193a(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }

        /* renamed from: b */
        public void mo96194b(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }
    }

    /* renamed from: a */
    void mo96193a(Level level, String str, Throwable th);

    /* renamed from: b */
    void mo96194b(Level level, String str);
}

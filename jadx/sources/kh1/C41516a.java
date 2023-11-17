package kh1;

import java.io.PrintStream;
import kotlin.jvm.internal.C41536l;

/* renamed from: kh1.a */
public final class C41516a extends C41518c {
    public C41516a() {
        super(C41517b.NONE);
    }

    /* renamed from: g */
    public void mo96283g(C41517b bVar, String str) {
        C41536l.m120489i(bVar, "level");
        C41536l.m120489i(str, "msg");
        PrintStream printStream = System.err;
        printStream.println("should not see this - " + bVar + " - " + str);
    }
}

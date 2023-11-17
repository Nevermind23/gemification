package p212pa;

import com.google.firebase.perf.metrics.Trace;
import p134ja.C6763a;
import p147ka.C6849g;

/* renamed from: pa.j */
public abstract class C7788j {

    /* renamed from: a */
    private static final C6763a f22511a = C6763a.m26371e();

    /* renamed from: a */
    public static Trace m29498a(Trace trace, C6849g.C6850a aVar) {
        if (aVar.mo20905d() > 0) {
            trace.putMetric(C7778b.FRAMES_TOTAL.toString(), (long) aVar.mo20905d());
        }
        if (aVar.mo20904c() > 0) {
            trace.putMetric(C7778b.FRAMES_SLOW.toString(), (long) aVar.mo20904c());
        }
        if (aVar.mo20903b() > 0) {
            trace.putMetric(C7778b.FRAMES_FROZEN.toString(), (long) aVar.mo20903b());
        }
        C6763a aVar2 = f22511a;
        aVar2.mo20804a("Screen trace: " + trace.mo17793f() + " _fr_tot:" + aVar.mo20905d() + " _fr_slo:" + aVar.mo20904c() + " _fr_fzn:" + aVar.mo20903b());
        return trace;
    }
}

package p246s5;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p142k5.C6817h;
import p168m5.C7118i;
import p168m5.C7129p;
import p168m5.C7135u;
import p181n5.C7233e;
import p181n5.C7244m;
import p259t5.C8398x;
import p272u5.C8587d;
import p285v5.C8702a;

/* renamed from: s5.c */
public class C8234c implements C8236e {

    /* renamed from: f */
    private static final Logger f23430f = Logger.getLogger(C7135u.class.getName());

    /* renamed from: a */
    private final C8398x f23431a;

    /* renamed from: b */
    private final Executor f23432b;

    /* renamed from: c */
    private final C7233e f23433c;

    /* renamed from: d */
    private final C8587d f23434d;

    /* renamed from: e */
    private final C8702a f23435e;

    public C8234c(Executor executor, C7233e eVar, C8398x xVar, C8587d dVar, C8702a aVar) {
        this.f23432b = executor;
        this.f23433c = eVar;
        this.f23431a = xVar;
        this.f23434d = dVar;
        this.f23435e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m31028d(C7129p pVar, C7118i iVar) {
        this.f23434d.mo23952n1(pVar, iVar);
        this.f23431a.mo23577b(pVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m31029e(C7129p pVar, C6817h hVar, C7118i iVar) {
        try {
            C7244m a = this.f23433c.mo21610a(pVar.mo21355b());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{pVar.mo21355b()});
                f23430f.warning(format);
                hVar.mo20890a(new IllegalArgumentException(format));
                return;
            }
            this.f23435e.mo23960c(new C8233b(this, pVar, a.mo11433b(iVar)));
            hVar.mo20890a((Exception) null);
        } catch (Exception e) {
            Logger logger = f23430f;
            logger.warning("Error scheduling event " + e.getMessage());
            hVar.mo20890a(e);
        }
    }

    /* renamed from: a */
    public void mo23421a(C7129p pVar, C7118i iVar, C6817h hVar) {
        this.f23432b.execute(new C8232a(this, pVar, hVar, iVar));
    }
}

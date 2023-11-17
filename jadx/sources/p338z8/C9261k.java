package p338z8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p182n6.C7264i;

/* renamed from: z8.k */
final class C9261k implements Executor {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Logger f25704i = Logger.getLogger(C9261k.class.getName());

    /* renamed from: d */
    private final Executor f25705d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Deque f25706e = new ArrayDeque();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C9264c f25707f = C9264c.IDLE;

    /* renamed from: g */
    private long f25708g = 0;

    /* renamed from: h */
    private final C9263b f25709h = new C9263b(this, (C9262a) null);

    /* renamed from: z8.k$a */
    class C9262a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Runnable f25710d;

        C9262a(Runnable runnable) {
            this.f25710d = runnable;
        }

        public void run() {
            this.f25710d.run();
        }

        public String toString() {
            return this.f25710d.toString();
        }
    }

    /* renamed from: z8.k$b */
    private final class C9263b implements Runnable {

        /* renamed from: d */
        Runnable f25712d;

        private C9263b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.f25712d.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            p338z8.C9261k.m34165e().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f25712d, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r1 == false) goto L_?;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m34166a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L_0x0002:
                z8.k r2 = p338z8.C9261k.this     // Catch:{ all -> 0x0082 }
                java.util.Deque r2 = r2.f25706e     // Catch:{ all -> 0x0082 }
                monitor-enter(r2)     // Catch:{ all -> 0x0082 }
                if (r0 != 0) goto L_0x002b
                z8.k r0 = p338z8.C9261k.this     // Catch:{ all -> 0x007f }
                z8.k$c r0 = r0.f25707f     // Catch:{ all -> 0x007f }
                z8.k$c r3 = p338z8.C9261k.C9264c.RUNNING     // Catch:{ all -> 0x007f }
                if (r0 != r3) goto L_0x0020
                monitor-exit(r2)     // Catch:{ all -> 0x007f }
                if (r1 == 0) goto L_0x001f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001f:
                return
            L_0x0020:
                z8.k r0 = p338z8.C9261k.this     // Catch:{ all -> 0x007f }
                p338z8.C9261k.m34164d(r0)     // Catch:{ all -> 0x007f }
                z8.k r0 = p338z8.C9261k.this     // Catch:{ all -> 0x007f }
                p338z8.C9261k.C9264c unused = r0.f25707f = r3     // Catch:{ all -> 0x007f }
                r0 = 1
            L_0x002b:
                z8.k r3 = p338z8.C9261k.this     // Catch:{ all -> 0x007f }
                java.util.Deque r3 = r3.f25706e     // Catch:{ all -> 0x007f }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x007f }
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x007f }
                r8.f25712d = r3     // Catch:{ all -> 0x007f }
                if (r3 != 0) goto L_0x004d
                z8.k r0 = p338z8.C9261k.this     // Catch:{ all -> 0x007f }
                z8.k$c r3 = p338z8.C9261k.C9264c.IDLE     // Catch:{ all -> 0x007f }
                p338z8.C9261k.C9264c unused = r0.f25707f = r3     // Catch:{ all -> 0x007f }
                monitor-exit(r2)     // Catch:{ all -> 0x007f }
                if (r1 == 0) goto L_0x004c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x004c:
                return
            L_0x004d:
                monitor-exit(r2)     // Catch:{ all -> 0x007f }
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0082 }
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f25712d     // Catch:{ RuntimeException -> 0x005e }
                r3.run()     // Catch:{ RuntimeException -> 0x005e }
            L_0x0059:
                r8.f25712d = r2     // Catch:{ all -> 0x0082 }
                goto L_0x0002
            L_0x005c:
                r0 = move-exception
                goto L_0x007c
            L_0x005e:
                r3 = move-exception
                java.util.logging.Logger r4 = p338z8.C9261k.f25704i     // Catch:{ all -> 0x005c }
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x005c }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
                r6.<init>()     // Catch:{ all -> 0x005c }
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch:{ all -> 0x005c }
                java.lang.Runnable r7 = r8.f25712d     // Catch:{ all -> 0x005c }
                r6.append(r7)     // Catch:{ all -> 0x005c }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x005c }
                r4.log(r5, r6, r3)     // Catch:{ all -> 0x005c }
                goto L_0x0059
            L_0x007c:
                r8.f25712d = r2     // Catch:{ all -> 0x0082 }
                throw r0     // Catch:{ all -> 0x0082 }
            L_0x007f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x007f }
                throw r0     // Catch:{ all -> 0x0082 }
            L_0x0082:
                r0 = move-exception
                if (r1 == 0) goto L_0x008c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x008c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p338z8.C9261k.C9263b.m34166a():void");
        }

        public void run() {
            try {
                m34166a();
            } catch (Error e) {
                synchronized (C9261k.this.f25706e) {
                    C9264c unused = C9261k.this.f25707f = C9264c.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f25712d;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + C9261k.this.f25707f + "}";
        }

        /* synthetic */ C9263b(C9261k kVar, C9262a aVar) {
            this();
        }
    }

    /* renamed from: z8.k$c */
    enum C9264c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    C9261k(Executor executor) {
        this.f25705d = (Executor) C7264i.m27902k(executor);
    }

    /* renamed from: d */
    static /* synthetic */ long m34164d(C9261k kVar) {
        long j = kVar.f25708g;
        kVar.f25708g = 1 + j;
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r8.f25705d.execute(r8.f25709h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r8.f25707f == r9) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r0 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r6 = r8.f25706e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r8.f25708g != r3) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r8.f25707f != r9) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r8.f25707f = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        monitor-enter(r8.f25706e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r3 = r8.f25707f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r3 == p338z8.C9261k.C9264c.f25714d) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0061, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0064, code lost:
        if ((r9 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006a, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execute(java.lang.Runnable r9) {
        /*
            r8 = this;
            p182n6.C7264i.m27902k(r9)
            java.util.Deque r0 = r8.f25706e
            monitor-enter(r0)
            z8.k$c r1 = r8.f25707f     // Catch:{ all -> 0x0075 }
            z8.k$c r2 = p338z8.C9261k.C9264c.RUNNING     // Catch:{ all -> 0x0075 }
            if (r1 == r2) goto L_0x006e
            z8.k$c r2 = p338z8.C9261k.C9264c.QUEUED     // Catch:{ all -> 0x0075 }
            if (r1 != r2) goto L_0x0011
            goto L_0x006e
        L_0x0011:
            long r3 = r8.f25708g     // Catch:{ all -> 0x0075 }
            z8.k$a r1 = new z8.k$a     // Catch:{ all -> 0x0075 }
            r1.<init>(r9)     // Catch:{ all -> 0x0075 }
            java.util.Deque r9 = r8.f25706e     // Catch:{ all -> 0x0075 }
            r9.add(r1)     // Catch:{ all -> 0x0075 }
            z8.k$c r9 = p338z8.C9261k.C9264c.QUEUING     // Catch:{ all -> 0x0075 }
            r8.f25707f = r9     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            r0 = 1
            r5 = 0
            java.util.concurrent.Executor r6 = r8.f25705d     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            z8.k$b r7 = r8.f25709h     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            r6.execute(r7)     // Catch:{ RuntimeException -> 0x004a, Error -> 0x0048 }
            z8.k$c r1 = r8.f25707f
            if (r1 == r9) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = r5
        L_0x0031:
            if (r0 == 0) goto L_0x0034
            return
        L_0x0034:
            java.util.Deque r6 = r8.f25706e
            monitor-enter(r6)
            long r0 = r8.f25708g     // Catch:{ all -> 0x0045 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            z8.k$c r0 = r8.f25707f     // Catch:{ all -> 0x0045 }
            if (r0 != r9) goto L_0x0043
            r8.f25707f = r2     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r9 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0045 }
            throw r9
        L_0x0048:
            r9 = move-exception
            goto L_0x004b
        L_0x004a:
            r9 = move-exception
        L_0x004b:
            java.util.Deque r2 = r8.f25706e
            monitor-enter(r2)
            z8.k$c r3 = r8.f25707f     // Catch:{ all -> 0x006b }
            z8.k$c r4 = p338z8.C9261k.C9264c.IDLE     // Catch:{ all -> 0x006b }
            if (r3 == r4) goto L_0x0058
            z8.k$c r4 = p338z8.C9261k.C9264c.QUEUING     // Catch:{ all -> 0x006b }
            if (r3 != r4) goto L_0x0061
        L_0x0058:
            java.util.Deque r3 = r8.f25706e     // Catch:{ all -> 0x006b }
            boolean r1 = r3.removeLastOccurrence(r1)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = r5
        L_0x0062:
            boolean r1 = r9 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x006a
            if (r0 != 0) goto L_0x006a
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            return
        L_0x006a:
            throw r9     // Catch:{ all -> 0x006b }
        L_0x006b:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006b }
            throw r9
        L_0x006e:
            java.util.Deque r1 = r8.f25706e     // Catch:{ all -> 0x0075 }
            r1.add(r9)     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p338z8.C9261k.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f25705d + "}";
    }
}

package p318y0;

import android.content.Context;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y0.j */
public interface C8999j extends Closeable {

    /* renamed from: y0.j$a */
    public static abstract class C9000a {

        /* renamed from: b */
        public static final C9001a f25028b = new C9001a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final int f25029a;

        /* renamed from: y0.j$a$a */
        public static final class C9001a {
            private C9001a() {
            }

            public /* synthetic */ C9001a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C9000a(int i) {
            this.f25029a = i;
        }

        /* renamed from: a */
        private final void m33308a(String str) {
            int i;
            boolean z;
            boolean z2 = true;
            if (!C40439w.m117115s(str, ":memory:", true)) {
                int length = str.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length) {
                    if (!z3) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (C41536l.m120491k(str.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z3) {
                        if (!z) {
                            z3 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i2, length + 1).toString().length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    Log.w("SupportSQLite", "deleting the database file: " + str);
                    try {
                        C8991b.m33280c(new File(str));
                    } catch (Exception e) {
                        Log.w("SupportSQLite", "delete failed: ", e);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo23843b(C8998i iVar) {
            C41536l.m120489i(iVar, "db");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
            if (r1 != null) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
            r4 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
            if (r4.hasNext() != false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
            r1 = ((android.util.Pair) r4.next()).second;
            kotlin.jvm.internal.C41536l.m120488h(r1, "p.second");
            m33308a((java.lang.String) r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
            r4 = r4.mo23666z();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
            if (r4 != null) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
            m33308a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003a */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0038 A[ExcHandler: all (r2v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
          PHI: (r1v11 java.util.List) = (r1v4 java.util.List), (r1v5 java.util.List), (r1v5 java.util.List) binds: [B:6:0x0033, B:9:0x003a, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:6:0x0033] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24408c(p318y0.C8998i r4) {
            /*
                r3 = this;
                java.lang.String r0 = "p.second"
                java.lang.String r1 = "db"
                kotlin.jvm.internal.C41536l.m120489i(r4, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Corruption reported by sqlite on database: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ".path"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.e(r2, r1)
                boolean r1 = r4.isOpen()
                if (r1 != 0) goto L_0x0032
                java.lang.String r4 = r4.mo23666z()
                if (r4 == 0) goto L_0x0031
                r3.m33308a(r4)
            L_0x0031:
                return
            L_0x0032:
                r1 = 0
                java.util.List r1 = r4.mo23651I()     // Catch:{ SQLiteException -> 0x003a, all -> 0x0038 }
                goto L_0x003a
            L_0x0038:
                r2 = move-exception
                goto L_0x003e
            L_0x003a:
                r4.close()     // Catch:{ IOException -> 0x0065, all -> 0x0038 }
                goto L_0x0065
            L_0x003e:
                if (r1 == 0) goto L_0x005b
                java.util.Iterator r4 = r1.iterator()
            L_0x0044:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x0064
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                kotlin.jvm.internal.C41536l.m120488h(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.m33308a(r1)
                goto L_0x0044
            L_0x005b:
                java.lang.String r4 = r4.mo23666z()
                if (r4 == 0) goto L_0x0064
                r3.m33308a(r4)
            L_0x0064:
                throw r2
            L_0x0065:
                if (r1 == 0) goto L_0x0082
                java.util.Iterator r4 = r1.iterator()
            L_0x006b:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x008b
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                kotlin.jvm.internal.C41536l.m120488h(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.m33308a(r1)
                goto L_0x006b
            L_0x0082:
                java.lang.String r4 = r4.mo23666z()
                if (r4 == 0) goto L_0x008b
                r3.m33308a(r4)
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p318y0.C8999j.C9000a.mo24408c(y0.i):void");
        }

        /* renamed from: d */
        public abstract void mo23844d(C8998i iVar);

        /* renamed from: e */
        public abstract void mo23845e(C8998i iVar, int i, int i2);

        /* renamed from: f */
        public void mo23846f(C8998i iVar) {
            C41536l.m120489i(iVar, "db");
        }

        /* renamed from: g */
        public abstract void mo23847g(C8998i iVar, int i, int i2);
    }

    /* renamed from: y0.j$b */
    public static final class C9002b {

        /* renamed from: f */
        public static final C9004b f25030f = new C9004b((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final Context f25031a;

        /* renamed from: b */
        public final String f25032b;

        /* renamed from: c */
        public final C9000a f25033c;

        /* renamed from: d */
        public final boolean f25034d;

        /* renamed from: e */
        public final boolean f25035e;

        /* renamed from: y0.j$b$a */
        public static class C9003a {

            /* renamed from: a */
            private final Context f25036a;

            /* renamed from: b */
            private String f25037b;

            /* renamed from: c */
            private C9000a f25038c;

            /* renamed from: d */
            private boolean f25039d;

            /* renamed from: e */
            private boolean f25040e;

            public C9003a(Context context) {
                C41536l.m120489i(context, "context");
                this.f25036a = context;
            }

            /* renamed from: a */
            public C9003a mo24409a(boolean z) {
                this.f25040e = z;
                return this;
            }

            /* renamed from: b */
            public C9002b mo24410b() {
                boolean z;
                C9000a aVar = this.f25038c;
                if (aVar != null) {
                    boolean z2 = true;
                    if (this.f25039d) {
                        String str = this.f25037b;
                        if (str == null || str.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        return new C9002b(this.f25036a, this.f25037b, aVar, this.f25039d, this.f25040e);
                    }
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
            }

            /* renamed from: c */
            public C9003a mo24411c(C9000a aVar) {
                C41536l.m120489i(aVar, "callback");
                this.f25038c = aVar;
                return this;
            }

            /* renamed from: d */
            public C9003a mo24412d(String str) {
                this.f25037b = str;
                return this;
            }

            /* renamed from: e */
            public C9003a mo24413e(boolean z) {
                this.f25039d = z;
                return this;
            }
        }

        /* renamed from: y0.j$b$b */
        public static final class C9004b {
            private C9004b() {
            }

            public /* synthetic */ C9004b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C9003a mo24414a(Context context) {
                C41536l.m120489i(context, "context");
                return new C9003a(context);
            }
        }

        public C9002b(Context context, String str, C9000a aVar, boolean z, boolean z2) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(aVar, "callback");
            this.f25031a = context;
            this.f25032b = str;
            this.f25033c = aVar;
            this.f25034d = z;
            this.f25035e = z2;
        }

        /* renamed from: a */
        public static final C9003a m33315a(Context context) {
            return f25030f.mo24414a(context);
        }
    }

    /* renamed from: y0.j$c */
    public interface C9005c {
        /* renamed from: a */
        C8999j mo6928a(C9002b bVar);
    }

    /* renamed from: Z0 */
    C8998i mo23643Z0();

    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}

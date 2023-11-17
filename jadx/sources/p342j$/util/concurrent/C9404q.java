package p342j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.q */
final class C9404q extends C9399l {

    /* renamed from: h */
    private static final Unsafe f26027h;

    /* renamed from: i */
    private static final long f26028i;

    /* renamed from: e */
    C9405r f26029e;

    /* renamed from: f */
    volatile C9405r f26030f;

    /* renamed from: g */
    volatile Thread f26031g;
    volatile int lockState;

    static {
        Class<ConcurrentHashMap> cls = ConcurrentHashMap.class;
        try {
            Unsafe c = C9409v.m34738c();
            f26027h = c;
            f26028i = c.objectFieldOffset(C9404q.class.getDeclaredField("lockState"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r6 = p342j$.util.concurrent.ConcurrentHashMap.m34683c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r8 = p342j$.util.concurrent.ConcurrentHashMap.m34684d(r6, r3, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C9404q(p342j$.util.concurrent.C9405r r10) {
        /*
            r9 = this;
            r0 = -2
            r1 = 0
            r9.<init>(r0, r1, r1, r1)
            r9.f26030f = r10
            r0 = r1
        L_0x0008:
            if (r10 == 0) goto L_0x005c
            j$.util.concurrent.l r2 = r10.f26014d
            j$.util.concurrent.r r2 = (p342j$.util.concurrent.C9405r) r2
            r10.f26034g = r1
            r10.f26033f = r1
            if (r0 != 0) goto L_0x001b
            r10.f26032e = r1
            r0 = 0
            r10.f26036i = r0
        L_0x0019:
            r0 = r10
            goto L_0x0058
        L_0x001b:
            java.lang.Object r3 = r10.f26012b
            int r4 = r10.f26011a
            r5 = r0
            r6 = r1
        L_0x0021:
            java.lang.Object r7 = r5.f26012b
            int r8 = r5.f26011a
            if (r8 <= r4) goto L_0x0029
            r7 = -1
            goto L_0x0041
        L_0x0029:
            if (r8 >= r4) goto L_0x002d
            r7 = 1
            goto L_0x0041
        L_0x002d:
            if (r6 != 0) goto L_0x0035
            java.lang.Class r6 = p342j$.util.concurrent.ConcurrentHashMap.m34683c(r3)
            if (r6 == 0) goto L_0x003b
        L_0x0035:
            int r8 = p342j$.util.concurrent.ConcurrentHashMap.m34684d(r6, r3, r7)
            if (r8 != 0) goto L_0x0040
        L_0x003b:
            int r7 = m34726j(r3, r7)
            goto L_0x0041
        L_0x0040:
            r7 = r8
        L_0x0041:
            if (r7 > 0) goto L_0x0046
            j$.util.concurrent.r r8 = r5.f26033f
            goto L_0x0048
        L_0x0046:
            j$.util.concurrent.r r8 = r5.f26034g
        L_0x0048:
            if (r8 != 0) goto L_0x005a
            r10.f26032e = r5
            if (r7 > 0) goto L_0x0051
            r5.f26033f = r10
            goto L_0x0053
        L_0x0051:
            r5.f26034g = r10
        L_0x0053:
            j$.util.concurrent.r r10 = m34721c(r0, r10)
            goto L_0x0019
        L_0x0058:
            r10 = r2
            goto L_0x0008
        L_0x005a:
            r5 = r8
            goto L_0x0021
        L_0x005c:
            r9.f26029e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.C9404q.<init>(j$.util.concurrent.r):void");
    }

    /* renamed from: b */
    static C9405r m34720b(C9405r rVar, C9405r rVar2) {
        C9405r rVar3;
        while (rVar2 != null && rVar2 != rVar) {
            C9405r rVar4 = rVar2.f26032e;
            if (rVar4 == null) {
                rVar2.f26036i = false;
                return rVar2;
            } else if (rVar2.f26036i) {
                rVar2.f26036i = false;
                return rVar;
            } else {
                C9405r rVar5 = rVar4.f26033f;
                C9405r rVar6 = null;
                if (rVar5 == rVar2) {
                    rVar3 = rVar4.f26034g;
                    if (rVar3 != null && rVar3.f26036i) {
                        rVar3.f26036i = false;
                        rVar4.f26036i = true;
                        rVar = m34724h(rVar, rVar4);
                        rVar4 = rVar2.f26032e;
                        rVar3 = rVar4 == null ? null : rVar4.f26034g;
                    }
                    if (rVar3 != null) {
                        C9405r rVar7 = rVar3.f26033f;
                        C9405r rVar8 = rVar3.f26034g;
                        if ((rVar8 != null && rVar8.f26036i) || (rVar7 != null && rVar7.f26036i)) {
                            if (rVar8 == null || !rVar8.f26036i) {
                                if (rVar7 != null) {
                                    rVar7.f26036i = false;
                                }
                                rVar3.f26036i = true;
                                rVar = m34725i(rVar, rVar3);
                                rVar4 = rVar2.f26032e;
                                if (rVar4 != null) {
                                    rVar6 = rVar4.f26034g;
                                }
                                rVar3 = rVar6;
                            }
                            if (rVar3 != null) {
                                rVar3.f26036i = rVar4 == null ? false : rVar4.f26036i;
                                C9405r rVar9 = rVar3.f26034g;
                                if (rVar9 != null) {
                                    rVar9.f26036i = false;
                                }
                            }
                            if (rVar4 != null) {
                                rVar4.f26036i = false;
                                rVar = m34724h(rVar, rVar4);
                            }
                            rVar2 = rVar;
                            rVar = rVar2;
                        }
                        rVar3.f26036i = true;
                    }
                } else {
                    if (rVar5 != null && rVar5.f26036i) {
                        rVar5.f26036i = false;
                        rVar4.f26036i = true;
                        rVar = m34725i(rVar, rVar4);
                        rVar4 = rVar2.f26032e;
                        rVar5 = rVar4 == null ? null : rVar4.f26033f;
                    }
                    if (rVar3 != null) {
                        C9405r rVar10 = rVar3.f26033f;
                        C9405r rVar11 = rVar3.f26034g;
                        if ((rVar10 != null && rVar10.f26036i) || (rVar11 != null && rVar11.f26036i)) {
                            if (rVar10 == null || !rVar10.f26036i) {
                                if (rVar11 != null) {
                                    rVar11.f26036i = false;
                                }
                                rVar3.f26036i = true;
                                rVar = m34724h(rVar, rVar3);
                                rVar4 = rVar2.f26032e;
                                if (rVar4 != null) {
                                    rVar6 = rVar4.f26033f;
                                }
                                rVar3 = rVar6;
                            }
                            if (rVar3 != null) {
                                rVar3.f26036i = rVar4 == null ? false : rVar4.f26036i;
                                C9405r rVar12 = rVar3.f26033f;
                                if (rVar12 != null) {
                                    rVar12.f26036i = false;
                                }
                            }
                            if (rVar4 != null) {
                                rVar4.f26036i = false;
                                rVar = m34725i(rVar, rVar4);
                            }
                            rVar2 = rVar;
                            rVar = rVar2;
                        }
                        rVar3.f26036i = true;
                    }
                }
                rVar2 = rVar4;
            }
        }
        return rVar;
    }

    /* renamed from: c */
    static C9405r m34721c(C9405r rVar, C9405r rVar2) {
        C9405r rVar3;
        rVar2.f26036i = true;
        while (true) {
            C9405r rVar4 = rVar2.f26032e;
            if (rVar4 == null) {
                rVar2.f26036i = false;
                return rVar2;
            } else if (!rVar4.f26036i || (rVar3 = rVar4.f26032e) == null) {
                return rVar;
            } else {
                C9405r rVar5 = rVar3.f26033f;
                if (rVar4 == rVar5) {
                    rVar5 = rVar3.f26034g;
                    if (rVar5 == null || !rVar5.f26036i) {
                        if (rVar2 == rVar4.f26034g) {
                            rVar = m34724h(rVar, rVar4);
                            C9405r rVar6 = rVar4.f26032e;
                            rVar3 = rVar6 == null ? null : rVar6.f26032e;
                            C9405r rVar7 = rVar4;
                            rVar4 = rVar6;
                            rVar2 = rVar7;
                        }
                        if (rVar4 != null) {
                            rVar4.f26036i = false;
                            if (rVar3 != null) {
                                rVar3.f26036i = true;
                                rVar = m34725i(rVar, rVar3);
                            }
                        }
                    }
                } else if (rVar5 == null || !rVar5.f26036i) {
                    if (rVar2 == rVar4.f26033f) {
                        rVar = m34725i(rVar, rVar4);
                        C9405r rVar8 = rVar4.f26032e;
                        rVar3 = rVar8 == null ? null : rVar8.f26032e;
                        C9405r rVar9 = rVar4;
                        rVar4 = rVar8;
                        rVar2 = rVar9;
                    }
                    if (rVar4 != null) {
                        rVar4.f26036i = false;
                        if (rVar3 != null) {
                            rVar3.f26036i = true;
                            rVar = m34724h(rVar, rVar3);
                        }
                    }
                }
                rVar5.f26036i = false;
                rVar4.f26036i = false;
                rVar3.f26036i = true;
                rVar2 = rVar3;
            }
        }
        return rVar;
    }

    /* renamed from: d */
    private final void m34722d() {
        boolean z = false;
        while (true) {
            int i = this.lockState;
            if ((i & -3) == 0) {
                if (f26027h.compareAndSwapInt(this, f26028i, i, 1)) {
                    break;
                }
            } else if ((i & 2) == 0) {
                if (f26027h.compareAndSwapInt(this, f26028i, i, i | 2)) {
                    this.f26031g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.f26031g = null;
        }
    }

    /* renamed from: e */
    private final void m34723e() {
        if (!f26027h.compareAndSwapInt(this, f26028i, 0, 1)) {
            m34722d();
        }
    }

    /* renamed from: h */
    static C9405r m34724h(C9405r rVar, C9405r rVar2) {
        C9405r rVar3 = rVar2.f26034g;
        if (rVar3 != null) {
            C9405r rVar4 = rVar3.f26033f;
            rVar2.f26034g = rVar4;
            if (rVar4 != null) {
                rVar4.f26032e = rVar2;
            }
            C9405r rVar5 = rVar2.f26032e;
            rVar3.f26032e = rVar5;
            if (rVar5 == null) {
                rVar3.f26036i = false;
                rVar = rVar3;
            } else if (rVar5.f26033f == rVar2) {
                rVar5.f26033f = rVar3;
            } else {
                rVar5.f26034g = rVar3;
            }
            rVar3.f26033f = rVar2;
            rVar2.f26032e = rVar3;
        }
        return rVar;
    }

    /* renamed from: i */
    static C9405r m34725i(C9405r rVar, C9405r rVar2) {
        C9405r rVar3 = rVar2.f26033f;
        if (rVar3 != null) {
            C9405r rVar4 = rVar3.f26034g;
            rVar2.f26033f = rVar4;
            if (rVar4 != null) {
                rVar4.f26032e = rVar2;
            }
            C9405r rVar5 = rVar2.f26032e;
            rVar3.f26032e = rVar5;
            if (rVar5 == null) {
                rVar3.f26036i = false;
                rVar = rVar3;
            } else if (rVar5.f26034g == rVar2) {
                rVar5.f26034g = rVar3;
            } else {
                rVar5.f26033f = rVar3;
            }
            rVar3.f26034g = rVar2;
            rVar2.f26032e = rVar3;
        }
        return rVar;
    }

    /* renamed from: j */
    static int m34726j(Object obj, Object obj2) {
        int compareTo;
        if (obj != null && obj2 != null && (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) != 0) {
            return compareTo;
        }
        return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9399l mo25382a(Object obj, int i) {
        Thread thread;
        Thread thread2;
        Object obj2;
        C9405r rVar = null;
        if (obj != null) {
            C9399l lVar = this.f26030f;
            while (lVar != null) {
                int i2 = this.lockState;
                if ((i2 & 3) == 0) {
                    Unsafe unsafe = f26027h;
                    long j = f26028i;
                    if (unsafe.compareAndSwapInt(this, j, i2, i2 + 4)) {
                        try {
                            C9405r rVar2 = this.f26029e;
                            if (rVar2 != null) {
                                rVar = rVar2.mo25409b(i, obj, (Class) null);
                            }
                            if (C9409v.m34736a(unsafe, this, j) == 6 && (thread2 = this.f26031g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return rVar;
                        } catch (Throwable th) {
                            if (C9409v.m34736a(f26027h, this, f26028i) == 6 && (thread = this.f26031g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                } else if (lVar.f26011a == i && ((obj2 = lVar.f26012b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVar;
                } else {
                    lVar = lVar.f26014d;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a2, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a7 A[LOOP:0: B:1:0x000c->B:53:0x00a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0071 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p342j$.util.concurrent.C9405r mo25407f(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.r r2 = r1.f26029e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r8
            r3 = r9
        L_0x000c:
            if (r10 != 0) goto L_0x0022
            j$.util.concurrent.r r9 = new j$.util.concurrent.r
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f26029e = r9
            r1.f26030f = r9
            goto L_0x00a2
        L_0x0022:
            int r5 = r10.f26011a
            r11 = 1
            if (r5 <= r0) goto L_0x0029
            r5 = -1
            goto L_0x0065
        L_0x0029:
            if (r5 >= r0) goto L_0x002d
            r12 = r11
            goto L_0x0068
        L_0x002d:
            java.lang.Object r5 = r10.f26012b
            if (r5 == r4) goto L_0x00aa
            if (r5 == 0) goto L_0x003b
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L_0x003b
            goto L_0x00aa
        L_0x003b:
            if (r2 != 0) goto L_0x0043
            java.lang.Class r2 = p342j$.util.concurrent.ConcurrentHashMap.m34683c(r17)
            if (r2 == 0) goto L_0x0049
        L_0x0043:
            int r6 = p342j$.util.concurrent.ConcurrentHashMap.m34684d(r2, r4, r5)
            if (r6 != 0) goto L_0x0067
        L_0x0049:
            if (r3 != 0) goto L_0x0061
            j$.util.concurrent.r r3 = r10.f26033f
            if (r3 == 0) goto L_0x0055
            j$.util.concurrent.r r3 = r3.mo25409b(r0, r4, r2)
            if (r3 != 0) goto L_0x005f
        L_0x0055:
            j$.util.concurrent.r r3 = r10.f26034g
            if (r3 == 0) goto L_0x0060
            j$.util.concurrent.r r3 = r3.mo25409b(r0, r4, r2)
            if (r3 == 0) goto L_0x0060
        L_0x005f:
            return r3
        L_0x0060:
            r3 = r11
        L_0x0061:
            int r5 = m34726j(r4, r5)
        L_0x0065:
            r12 = r5
            goto L_0x0068
        L_0x0067:
            r12 = r6
        L_0x0068:
            if (r12 > 0) goto L_0x006d
            j$.util.concurrent.r r5 = r10.f26033f
            goto L_0x006f
        L_0x006d:
            j$.util.concurrent.r r5 = r10.f26034g
        L_0x006f:
            if (r5 != 0) goto L_0x00a7
            j$.util.concurrent.r r13 = r1.f26030f
            j$.util.concurrent.r r14 = new j$.util.concurrent.r
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f26030f = r14
            if (r13 == 0) goto L_0x0087
            r13.f26035h = r14
        L_0x0087:
            if (r12 > 0) goto L_0x008c
            r10.f26033f = r14
            goto L_0x008e
        L_0x008c:
            r10.f26034g = r14
        L_0x008e:
            boolean r0 = r10.f26036i
            if (r0 != 0) goto L_0x0095
            r14.f26036i = r11
            goto L_0x00a2
        L_0x0095:
            r15.m34723e()
            j$.util.concurrent.r r0 = r1.f26029e     // Catch:{ all -> 0x00a3 }
            j$.util.concurrent.r r0 = m34721c(r0, r14)     // Catch:{ all -> 0x00a3 }
            r1.f26029e = r0     // Catch:{ all -> 0x00a3 }
            r1.lockState = r9
        L_0x00a2:
            return r8
        L_0x00a3:
            r0 = move-exception
            r1.lockState = r9
            throw r0
        L_0x00a7:
            r10 = r5
            goto L_0x000c
        L_0x00aa:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.C9404q.mo25407f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.r");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008e A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a9 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00aa A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ba A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00bd A[Catch:{ all -> 0x00c8 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25408g(p342j$.util.concurrent.C9405r r11) {
        /*
            r10 = this;
            j$.util.concurrent.l r0 = r11.f26014d
            j$.util.concurrent.r r0 = (p342j$.util.concurrent.C9405r) r0
            j$.util.concurrent.r r1 = r11.f26035h
            if (r1 != 0) goto L_0x000b
            r10.f26030f = r0
            goto L_0x000d
        L_0x000b:
            r1.f26014d = r0
        L_0x000d:
            if (r0 == 0) goto L_0x0011
            r0.f26035h = r1
        L_0x0011:
            j$.util.concurrent.r r0 = r10.f26030f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r10.f26029e = r2
            return r1
        L_0x001a:
            j$.util.concurrent.r r0 = r10.f26029e
            if (r0 == 0) goto L_0x00cc
            j$.util.concurrent.r r3 = r0.f26034g
            if (r3 == 0) goto L_0x00cc
            j$.util.concurrent.r r3 = r0.f26033f
            if (r3 == 0) goto L_0x00cc
            j$.util.concurrent.r r3 = r3.f26033f
            if (r3 != 0) goto L_0x002c
            goto L_0x00cc
        L_0x002c:
            r10.m34723e()
            r1 = 0
            j$.util.concurrent.r r3 = r11.f26033f     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.r r4 = r11.f26034g     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x0084
            if (r4 == 0) goto L_0x0084
            r5 = r4
        L_0x0039:
            j$.util.concurrent.r r6 = r5.f26033f     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x003f
            r5 = r6
            goto L_0x0039
        L_0x003f:
            boolean r6 = r5.f26036i     // Catch:{ all -> 0x00c8 }
            boolean r7 = r11.f26036i     // Catch:{ all -> 0x00c8 }
            r5.f26036i = r7     // Catch:{ all -> 0x00c8 }
            r11.f26036i = r6     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.r r6 = r5.f26034g     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.r r7 = r11.f26032e     // Catch:{ all -> 0x00c8 }
            if (r5 != r4) goto L_0x0052
            r11.f26032e = r5     // Catch:{ all -> 0x00c8 }
            r5.f26034g = r11     // Catch:{ all -> 0x00c8 }
            goto L_0x0065
        L_0x0052:
            j$.util.concurrent.r r8 = r5.f26032e     // Catch:{ all -> 0x00c8 }
            r11.f26032e = r8     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x0061
            j$.util.concurrent.r r9 = r8.f26033f     // Catch:{ all -> 0x00c8 }
            if (r5 != r9) goto L_0x005f
            r8.f26033f = r11     // Catch:{ all -> 0x00c8 }
            goto L_0x0061
        L_0x005f:
            r8.f26034g = r11     // Catch:{ all -> 0x00c8 }
        L_0x0061:
            r5.f26034g = r4     // Catch:{ all -> 0x00c8 }
            r4.f26032e = r5     // Catch:{ all -> 0x00c8 }
        L_0x0065:
            r11.f26033f = r2     // Catch:{ all -> 0x00c8 }
            r11.f26034g = r6     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x006d
            r6.f26032e = r11     // Catch:{ all -> 0x00c8 }
        L_0x006d:
            r5.f26033f = r3     // Catch:{ all -> 0x00c8 }
            r3.f26032e = r5     // Catch:{ all -> 0x00c8 }
            r5.f26032e = r7     // Catch:{ all -> 0x00c8 }
            if (r7 != 0) goto L_0x0077
            r0 = r5
            goto L_0x0080
        L_0x0077:
            j$.util.concurrent.r r3 = r7.f26033f     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x007e
            r7.f26033f = r5     // Catch:{ all -> 0x00c8 }
            goto L_0x0080
        L_0x007e:
            r7.f26034g = r5     // Catch:{ all -> 0x00c8 }
        L_0x0080:
            if (r6 == 0) goto L_0x008b
            r3 = r6
            goto L_0x008c
        L_0x0084:
            if (r3 == 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            if (r4 == 0) goto L_0x008b
            r3 = r4
            goto L_0x008c
        L_0x008b:
            r3 = r11
        L_0x008c:
            if (r3 == r11) goto L_0x00a5
            j$.util.concurrent.r r4 = r11.f26032e     // Catch:{ all -> 0x00c8 }
            r3.f26032e = r4     // Catch:{ all -> 0x00c8 }
            if (r4 != 0) goto L_0x0096
            r0 = r3
            goto L_0x009f
        L_0x0096:
            j$.util.concurrent.r r5 = r4.f26033f     // Catch:{ all -> 0x00c8 }
            if (r11 != r5) goto L_0x009d
            r4.f26033f = r3     // Catch:{ all -> 0x00c8 }
            goto L_0x009f
        L_0x009d:
            r4.f26034g = r3     // Catch:{ all -> 0x00c8 }
        L_0x009f:
            r11.f26032e = r2     // Catch:{ all -> 0x00c8 }
            r11.f26034g = r2     // Catch:{ all -> 0x00c8 }
            r11.f26033f = r2     // Catch:{ all -> 0x00c8 }
        L_0x00a5:
            boolean r4 = r11.f26036i     // Catch:{ all -> 0x00c8 }
            if (r4 == 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            j$.util.concurrent.r r0 = m34720b(r0, r3)     // Catch:{ all -> 0x00c8 }
        L_0x00ae:
            r10.f26029e = r0     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00c5
            j$.util.concurrent.r r0 = r11.f26032e     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            j$.util.concurrent.r r3 = r0.f26033f     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00bd
            r0.f26033f = r2     // Catch:{ all -> 0x00c8 }
            goto L_0x00c3
        L_0x00bd:
            j$.util.concurrent.r r3 = r0.f26034g     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00c3
            r0.f26034g = r2     // Catch:{ all -> 0x00c8 }
        L_0x00c3:
            r11.f26032e = r2     // Catch:{ all -> 0x00c8 }
        L_0x00c5:
            r10.lockState = r1
            return r1
        L_0x00c8:
            r11 = move-exception
            r10.lockState = r1
            throw r11
        L_0x00cc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.C9404q.mo25408g(j$.util.concurrent.r):boolean");
    }
}

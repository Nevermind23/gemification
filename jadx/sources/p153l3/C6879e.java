package p153l3;

import android.graphics.Bitmap;
import com.salesforce.marketingcloud.C11398b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p153l3.C6874a;

/* renamed from: l3.e */
public class C6879e implements C6874a {

    /* renamed from: u */
    private static final String f20583u = "e";

    /* renamed from: a */
    private int[] f20584a;

    /* renamed from: b */
    private final int[] f20585b;

    /* renamed from: c */
    private final C6874a.C6875a f20586c;

    /* renamed from: d */
    private ByteBuffer f20587d;

    /* renamed from: e */
    private byte[] f20588e;

    /* renamed from: f */
    private short[] f20589f;

    /* renamed from: g */
    private byte[] f20590g;

    /* renamed from: h */
    private byte[] f20591h;

    /* renamed from: i */
    private byte[] f20592i;

    /* renamed from: j */
    private int[] f20593j;

    /* renamed from: k */
    private int f20594k;

    /* renamed from: l */
    private C6877c f20595l;

    /* renamed from: m */
    private Bitmap f20596m;

    /* renamed from: n */
    private boolean f20597n;

    /* renamed from: o */
    private int f20598o;

    /* renamed from: p */
    private int f20599p;

    /* renamed from: q */
    private int f20600q;

    /* renamed from: r */
    private int f20601r;

    /* renamed from: s */
    private Boolean f20602s;

    /* renamed from: t */
    private Bitmap.Config f20603t;

    public C6879e(C6874a.C6875a aVar, C6877c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo20972q(cVar, byteBuffer, i);
    }

    /* renamed from: i */
    private int m26702i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f20599p + i; i9++) {
            byte[] bArr = this.f20592i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i12 = this.f20584a[bArr[i9] & 255];
            if (i12 != 0) {
                i4 += (i12 >> 24) & C11051p3.f31759c;
                i5 += (i12 >> 16) & C11051p3.f31759c;
                i6 += (i12 >> 8) & C11051p3.f31759c;
                i7 += i12 & C11051p3.f31759c;
                i8++;
            }
        }
        int i13 = i + i3;
        for (int i14 = i13; i14 < this.f20599p + i13; i14++) {
            byte[] bArr2 = this.f20592i;
            if (i14 >= bArr2.length || i14 >= i2) {
                break;
            }
            int i15 = this.f20584a[bArr2[i14] & 255];
            if (i15 != 0) {
                i4 += (i15 >> 24) & C11051p3.f31759c;
                i5 += (i15 >> 16) & C11051p3.f31759c;
                i6 += (i15 >> 8) & C11051p3.f31759c;
                i7 += i15 & C11051p3.f31759c;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: j */
    private void m26703j(C6876b bVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        C6876b bVar2 = bVar;
        int[] iArr = this.f20593j;
        int i6 = bVar2.f20558d;
        int i7 = this.f20599p;
        int i8 = i6 / i7;
        int i9 = bVar2.f20556b / i7;
        int i12 = bVar2.f20557c / i7;
        int i13 = bVar2.f20555a / i7;
        if (this.f20594k == 0) {
            z = true;
        } else {
            z = false;
        }
        int i14 = this.f20601r;
        int i15 = this.f20600q;
        byte[] bArr = this.f20592i;
        int[] iArr2 = this.f20584a;
        Boolean bool = this.f20602s;
        int i16 = 8;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        while (i18 < i8) {
            Boolean bool2 = bool;
            if (bVar2.f20559e) {
                if (i17 >= i8) {
                    int i22 = i19 + 1;
                    i = i8;
                    if (i22 == 2) {
                        i17 = 4;
                    } else if (i22 == 3) {
                        i16 = 4;
                        i19 = i22;
                        i17 = 2;
                    } else if (i22 == 4) {
                        i19 = i22;
                        i17 = 1;
                        i16 = 2;
                    }
                    i19 = i22;
                } else {
                    i = i8;
                }
                i2 = i17 + i16;
            } else {
                i = i8;
                i2 = i17;
                i17 = i18;
            }
            int i23 = i17 + i9;
            if (i7 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i23 < i15) {
                int i24 = i23 * i14;
                int i25 = i24 + i13;
                int i26 = i25 + i12;
                int i27 = i24 + i14;
                if (i27 < i26) {
                    i26 = i27;
                }
                i3 = i2;
                int i28 = i18 * i7 * bVar2.f20557c;
                if (z3) {
                    int i29 = i25;
                    while (i29 < i26) {
                        int i32 = i9;
                        int i33 = iArr2[bArr[i28] & 255];
                        if (i33 != 0) {
                            iArr[i29] = i33;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i28 += i7;
                        i29++;
                        i9 = i32;
                    }
                } else {
                    i5 = i9;
                    int i34 = ((i26 - i25) * i7) + i28;
                    int i35 = i25;
                    while (true) {
                        i4 = i12;
                        if (i35 >= i26) {
                            break;
                        }
                        int i36 = m26702i(i28, i34, bVar2.f20557c);
                        if (i36 != 0) {
                            iArr[i35] = i36;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i28 += i7;
                        i35++;
                        i12 = i4;
                    }
                    bool = bool2;
                    i18++;
                    i9 = i5;
                    i8 = i;
                    i12 = i4;
                    i17 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i12;
            bool = bool2;
            i18++;
            i9 = i5;
            i8 = i;
            i12 = i4;
            i17 = i3;
        }
        Boolean bool3 = bool;
        if (this.f20602s == null) {
            if (bool3 == null) {
                z2 = false;
            } else {
                z2 = bool3.booleanValue();
            }
            this.f20602s = Boolean.valueOf(z2);
        }
    }

    /* renamed from: k */
    private void m26704k(C6876b bVar) {
        boolean z;
        boolean z2;
        C6876b bVar2 = bVar;
        int[] iArr = this.f20593j;
        int i = bVar2.f20558d;
        int i2 = bVar2.f20556b;
        int i3 = bVar2.f20557c;
        int i4 = bVar2.f20555a;
        if (this.f20594k == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = this.f20601r;
        byte[] bArr = this.f20592i;
        int[] iArr2 = this.f20584a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i12 = i7 + i5;
            if (i12 < i9) {
                i9 = i12;
            }
            int i13 = bVar2.f20557c * i6;
            int i14 = i8;
            while (i14 < i9) {
                byte b2 = bArr[i13];
                int i15 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i16 = iArr2[b3];
                    if (i16 != 0) {
                        iArr[i14] = i16;
                    } else {
                        b = b2;
                    }
                }
                i13++;
                i14++;
                C6876b bVar3 = bVar;
                i = i15;
            }
            int i17 = i;
            i6++;
            bVar2 = bVar;
        }
        Boolean bool = this.f20602s;
        if ((bool == null || !bool.booleanValue()) && (this.f20602s != null || !z || b == -1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f20602s = Boolean.valueOf(z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26705l(p153l3.C6876b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f20587d
            int r3 = r1.f20564j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            l3.c r1 = r0.f20595l
            int r2 = r1.f20571f
            int r1 = r1.f20572g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f20557c
            int r1 = r1.f20558d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f20592i
            if (r1 == 0) goto L_0x0022
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002a
        L_0x0022:
            l3.a$a r1 = r0.f20586c
            byte[] r1 = r1.mo20959b(r2)
            r0.f20592i = r1
        L_0x002a:
            byte[] r1 = r0.f20592i
            short[] r3 = r0.f20589f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0036
            short[] r3 = new short[r4]
            r0.f20589f = r3
        L_0x0036:
            short[] r3 = r0.f20589f
            byte[] r5 = r0.f20590g
            if (r5 != 0) goto L_0x0040
            byte[] r5 = new byte[r4]
            r0.f20590g = r5
        L_0x0040:
            byte[] r5 = r0.f20590g
            byte[] r6 = r0.f20591h
            if (r6 != 0) goto L_0x004c
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f20591h = r6
        L_0x004c:
            byte[] r6 = r0.f20591h
            int r7 = r28.m26708p()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = r13
        L_0x005f:
            if (r14 >= r9) goto L_0x0069
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x005f
        L_0x0069:
            byte[] r14 = r0.f20588e
            r15 = -1
            r23 = r7
            r21 = r11
            r24 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r25 = r20
            r26 = r25
            r22 = r15
        L_0x0082:
            if (r13 >= r2) goto L_0x014a
            if (r16 != 0) goto L_0x0093
            int r16 = r28.m26707o()
            if (r16 > 0) goto L_0x0091
            r3 = 3
            r0.f20598o = r3
            goto L_0x014a
        L_0x0091:
            r17 = 0
        L_0x0093:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r0 = r22
            r15 = r23
            r22 = r7
            r7 = r26
        L_0x00ad:
            if (r4 < r15) goto L_0x0134
            r23 = r11
            r11 = r19 & r24
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c1
            r24 = r12
            r15 = r22
            r8 = r23
            r11 = r8
            r0 = -1
            goto L_0x00ad
        L_0x00c1:
            if (r11 != r10) goto L_0x00d7
            r18 = r4
            r26 = r7
            r21 = r8
            r7 = r22
            r11 = r23
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r22 = r0
            r23 = r15
            r15 = -1
            goto L_0x0146
        L_0x00d7:
            r26 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00eb
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r23
            r4 = r26
            goto L_0x00ad
        L_0x00eb:
            if (r11 < r8) goto L_0x00f4
            byte r7 = (byte) r7
            r6[r25] = r7
            int r25 = r25 + 1
            r7 = r0
            goto L_0x00f5
        L_0x00f4:
            r7 = r11
        L_0x00f5:
            if (r7 < r9) goto L_0x0100
            byte r21 = r5[r7]
            r6[r25] = r21
            int r25 = r25 + 1
            short r7 = r3[r7]
            goto L_0x00f5
        L_0x0100:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0107:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r25 <= 0) goto L_0x0114
            int r25 = r25 + -1
            byte r27 = r6[r25]
            r1[r20] = r27
            goto L_0x0107
        L_0x0114:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012b
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r24
            if (r0 != 0) goto L_0x012b
            if (r8 >= r6) goto L_0x012b
            int r15 = r15 + 1
            int r24 = r24 + r8
        L_0x012b:
            r0 = r11
            r11 = r23
            r4 = r26
            r6 = r27
            goto L_0x00ad
        L_0x0134:
            r26 = r4
            r21 = r8
            r23 = r15
            r18 = r26
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r15 = -1
            r26 = r7
            r7 = r22
            r22 = r0
        L_0x0146:
            r0 = r28
            goto L_0x0082
        L_0x014a:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l3.C6879e.m26705l(l3.b):void");
    }

    /* renamed from: n */
    private Bitmap m26706n() {
        Bitmap.Config config;
        Boolean bool = this.f20602s;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f20603t;
        }
        Bitmap c = this.f20586c.mo20960c(this.f20601r, this.f20600q, config);
        c.setHasAlpha(true);
        return c;
    }

    /* renamed from: o */
    private int m26707o() {
        int p = m26708p();
        if (p <= 0) {
            return p;
        }
        ByteBuffer byteBuffer = this.f20587d;
        byteBuffer.get(this.f20588e, 0, Math.min(p, byteBuffer.remaining()));
        return p;
    }

    /* renamed from: p */
    private int m26708p() {
        return this.f20587d.get() & 255;
    }

    /* renamed from: r */
    private Bitmap m26709r(C6876b bVar, C6876b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f20593j;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f20596m;
            if (bitmap2 != null) {
                this.f20586c.mo20958a(bitmap2);
            }
            this.f20596m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f20561g == 3 && this.f20596m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.f20561g) > 0) {
            if (i2 == 2) {
                if (!bVar.f20560f) {
                    C6877c cVar = this.f20595l;
                    int i4 = cVar.f20577l;
                    if (bVar.f20565k == null || cVar.f20575j != bVar.f20562h) {
                        i3 = i4;
                    }
                }
                int i5 = bVar2.f20558d;
                int i6 = this.f20599p;
                int i7 = i5 / i6;
                int i8 = bVar2.f20556b / i6;
                int i9 = bVar2.f20557c / i6;
                int i12 = bVar2.f20555a / i6;
                int i13 = this.f20601r;
                int i14 = (i8 * i13) + i12;
                int i15 = (i7 * i13) + i14;
                while (i14 < i15) {
                    int i16 = i14 + i9;
                    for (int i17 = i14; i17 < i16; i17++) {
                        iArr[i17] = i3;
                    }
                    i14 += this.f20601r;
                }
            } else if (i2 == 3 && (bitmap = this.f20596m) != null) {
                int i18 = this.f20601r;
                bitmap.getPixels(iArr, 0, i18, 0, 0, i18, this.f20600q);
            }
        }
        m26705l(bVar);
        if (bVar.f20559e || this.f20599p != 1) {
            m26703j(bVar);
        } else {
            m26704k(bVar);
        }
        if (this.f20597n && ((i = bVar.f20561g) == 0 || i == 1)) {
            if (this.f20596m == null) {
                this.f20596m = m26706n();
            }
            Bitmap bitmap3 = this.f20596m;
            int i19 = this.f20601r;
            bitmap3.setPixels(iArr, 0, i19, 0, 0, i19, this.f20600q);
        }
        Bitmap n = m26706n();
        int i22 = this.f20601r;
        n.setPixels(iArr, 0, i22, 0, 0, i22, this.f20600q);
        return n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo20948a() {
        /*
            r8 = this;
            monitor-enter(r8)
            l3.c r0 = r8.f20595l     // Catch:{ all -> 0x00e4 }
            int r0 = r0.f20568c     // Catch:{ all -> 0x00e4 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f20594k     // Catch:{ all -> 0x00e4 }
            if (r0 >= 0) goto L_0x0039
        L_0x000d:
            java.lang.String r0 = f20583u     // Catch:{ all -> 0x00e4 }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x0037
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r3.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            l3.c r4 = r8.f20595l     // Catch:{ all -> 0x00e4 }
            int r4 = r4.f20568c     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f20594k     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00e4 }
        L_0x0037:
            r8.f20598o = r2     // Catch:{ all -> 0x00e4 }
        L_0x0039:
            int r0 = r8.f20598o     // Catch:{ all -> 0x00e4 }
            r3 = 0
            if (r0 == r2) goto L_0x00c4
            r4 = 2
            if (r0 != r4) goto L_0x0043
            goto L_0x00c4
        L_0x0043:
            r0 = 0
            r8.f20598o = r0     // Catch:{ all -> 0x00e4 }
            byte[] r5 = r8.f20588e     // Catch:{ all -> 0x00e4 }
            if (r5 != 0) goto L_0x0054
            l3.a$a r5 = r8.f20586c     // Catch:{ all -> 0x00e4 }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.mo20959b(r6)     // Catch:{ all -> 0x00e4 }
            r8.f20588e = r5     // Catch:{ all -> 0x00e4 }
        L_0x0054:
            l3.c r5 = r8.f20595l     // Catch:{ all -> 0x00e4 }
            java.util.List r5 = r5.f20570e     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f20594k     // Catch:{ all -> 0x00e4 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00e4 }
            l3.b r5 = (p153l3.C6876b) r5     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f20594k     // Catch:{ all -> 0x00e4 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0070
            l3.c r7 = r8.f20595l     // Catch:{ all -> 0x00e4 }
            java.util.List r7 = r7.f20570e     // Catch:{ all -> 0x00e4 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00e4 }
            l3.b r6 = (p153l3.C6876b) r6     // Catch:{ all -> 0x00e4 }
            goto L_0x0071
        L_0x0070:
            r6 = r3
        L_0x0071:
            int[] r7 = r5.f20565k     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            l3.c r7 = r8.f20595l     // Catch:{ all -> 0x00e4 }
            int[] r7 = r7.f20566a     // Catch:{ all -> 0x00e4 }
        L_0x007a:
            r8.f20584a = r7     // Catch:{ all -> 0x00e4 }
            if (r7 != 0) goto L_0x00a0
            java.lang.String r0 = f20583u     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f20594k     // Catch:{ all -> 0x00e4 }
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x009c:
            r8.f20598o = r2     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r3
        L_0x00a0:
            boolean r1 = r5.f20560f     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00be
            int[] r1 = r8.f20585b     // Catch:{ all -> 0x00e4 }
            int r2 = r7.length     // Catch:{ all -> 0x00e4 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00e4 }
            int[] r1 = r8.f20585b     // Catch:{ all -> 0x00e4 }
            r8.f20584a = r1     // Catch:{ all -> 0x00e4 }
            int r2 = r5.f20562h     // Catch:{ all -> 0x00e4 }
            r1[r2] = r0     // Catch:{ all -> 0x00e4 }
            int r0 = r5.f20561g     // Catch:{ all -> 0x00e4 }
            if (r0 != r4) goto L_0x00be
            int r0 = r8.f20594k     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00be
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00e4 }
            r8.f20602s = r0     // Catch:{ all -> 0x00e4 }
        L_0x00be:
            android.graphics.Bitmap r0 = r8.m26709r(r5, r6)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r0
        L_0x00c4:
            java.lang.String r0 = f20583u     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            int r2 = r8.f20598o     // Catch:{ all -> 0x00e4 }
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x00e2:
            monitor-exit(r8)
            return r3
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l3.C6879e.mo20948a():android.graphics.Bitmap");
    }

    /* renamed from: b */
    public void mo20949b() {
        this.f20594k = (this.f20594k + 1) % this.f20595l.f20568c;
    }

    /* renamed from: c */
    public int mo20950c() {
        return this.f20595l.f20568c;
    }

    public void clear() {
        this.f20595l = null;
        byte[] bArr = this.f20592i;
        if (bArr != null) {
            this.f20586c.mo20962e(bArr);
        }
        int[] iArr = this.f20593j;
        if (iArr != null) {
            this.f20586c.mo20963f(iArr);
        }
        Bitmap bitmap = this.f20596m;
        if (bitmap != null) {
            this.f20586c.mo20958a(bitmap);
        }
        this.f20596m = null;
        this.f20587d = null;
        this.f20602s = null;
        byte[] bArr2 = this.f20588e;
        if (bArr2 != null) {
            this.f20586c.mo20962e(bArr2);
        }
    }

    /* renamed from: d */
    public void mo20952d(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f20603t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: e */
    public int mo20953e() {
        int i;
        if (this.f20595l.f20568c <= 0 || (i = this.f20594k) < 0) {
            return 0;
        }
        return mo20971m(i);
    }

    /* renamed from: f */
    public void mo20954f() {
        this.f20594k = -1;
    }

    /* renamed from: g */
    public int mo20955g() {
        return this.f20594k;
    }

    public ByteBuffer getData() {
        return this.f20587d;
    }

    /* renamed from: h */
    public int mo20957h() {
        return this.f20587d.limit() + this.f20592i.length + (this.f20593j.length * 4);
    }

    /* renamed from: m */
    public int mo20971m(int i) {
        if (i >= 0) {
            C6877c cVar = this.f20595l;
            if (i < cVar.f20568c) {
                return ((C6876b) cVar.f20570e.get(i)).f20563i;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public synchronized void mo20972q(C6877c cVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f20598o = 0;
            this.f20595l = cVar;
            this.f20594k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f20587d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f20587d.order(ByteOrder.LITTLE_ENDIAN);
            this.f20597n = false;
            Iterator it = cVar.f20570e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C6876b) it.next()).f20561g == 3) {
                        this.f20597n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f20599p = highestOneBit;
            int i2 = cVar.f20571f;
            this.f20601r = i2 / highestOneBit;
            int i3 = cVar.f20572g;
            this.f20600q = i3 / highestOneBit;
            this.f20592i = this.f20586c.mo20959b(i2 * i3);
            this.f20593j = this.f20586c.mo20961d(this.f20601r * this.f20600q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public C6879e(C6874a.C6875a aVar) {
        this.f20585b = new int[C11398b.f33139r];
        this.f20603t = Bitmap.Config.ARGB_8888;
        this.f20586c = aVar;
        this.f20595l = new C6877c();
    }
}

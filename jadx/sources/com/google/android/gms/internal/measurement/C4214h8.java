package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h8 */
abstract class C4214h8 {
    /* renamed from: a */
    static int m15982a(byte[] bArr, int i, C4197g8 g8Var) {
        int j = m15991j(bArr, i, g8Var);
        int i2 = g8Var.f13252a;
        if (i2 < 0) {
            throw zzll.m17330d();
        } else if (i2 > bArr.length - j) {
            throw zzll.m17332f();
        } else if (i2 == 0) {
            g8Var.f13254c = C4418t8.f13699e;
            return j;
        } else {
            g8Var.f13254c = C4418t8.m16750w(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m15983b(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m15984c(C4132cb cbVar, byte[] bArr, int i, int i2, int i3, C4197g8 g8Var) {
        Object t = cbVar.mo12996t();
        int n = m15995n(t, cbVar, bArr, i, i2, i3, g8Var);
        cbVar.mo12988a(t);
        g8Var.f13254c = t;
        return n;
    }

    /* renamed from: d */
    static int m15985d(C4132cb cbVar, byte[] bArr, int i, int i2, C4197g8 g8Var) {
        Object t = cbVar.mo12996t();
        int o = m15996o(t, cbVar, bArr, i, i2, g8Var);
        cbVar.mo12988a(t);
        g8Var.f13254c = t;
        return o;
    }

    /* renamed from: e */
    static int m15986e(C4132cb cbVar, int i, byte[] bArr, int i2, int i3, C4453v9 v9Var, C4197g8 g8Var) {
        int d = m15985d(cbVar, bArr, i2, i3, g8Var);
        v9Var.add(g8Var.f13254c);
        while (d < i3) {
            int j = m15991j(bArr, d, g8Var);
            if (i != g8Var.f13252a) {
                break;
            }
            d = m15985d(cbVar, bArr, j, i3, g8Var);
            v9Var.add(g8Var.f13254c);
        }
        return d;
    }

    /* renamed from: f */
    static int m15987f(byte[] bArr, int i, C4453v9 v9Var, C4197g8 g8Var) {
        C4368q9 q9Var = (C4368q9) v9Var;
        int j = m15991j(bArr, i, g8Var);
        int i2 = g8Var.f13252a + j;
        while (j < i2) {
            j = m15991j(bArr, j, g8Var);
            q9Var.mo13498i(g8Var.f13252a);
        }
        if (j == i2) {
            return j;
        }
        throw zzll.m17332f();
    }

    /* renamed from: g */
    static int m15988g(byte[] bArr, int i, C4197g8 g8Var) {
        int j = m15991j(bArr, i, g8Var);
        int i2 = g8Var.f13252a;
        if (i2 < 0) {
            throw zzll.m17330d();
        } else if (i2 == 0) {
            g8Var.f13254c = "";
            return j;
        } else {
            g8Var.f13254c = new String(bArr, j, i2, C4470w9.f13782b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m15989h(byte[] bArr, int i, C4197g8 g8Var) {
        int i2;
        int i3;
        int j = m15991j(bArr, i, g8Var);
        int i4 = g8Var.f13252a;
        if (i4 < 0) {
            throw zzll.m17330d();
        } else if (i4 == 0) {
            g8Var.f13254c = "";
            return j;
        } else {
            int i5 = C4472wb.f13788b;
            int length = bArr.length;
            if ((((length - j) - i4) | j | i4) >= 0) {
                int i6 = j + i4;
                char[] cArr = new char[i4];
                int i7 = 0;
                while (i2 < i6) {
                    byte b = bArr[i2];
                    if (!C4404sb.m16640d(b)) {
                        break;
                    }
                    j = i2 + 1;
                    cArr[i3] = (char) b;
                    i7 = i3 + 1;
                }
                while (i2 < i6) {
                    int i8 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (C4404sb.m16640d(b2)) {
                        int i9 = i3 + 1;
                        cArr[i3] = (char) b2;
                        i2 = i8;
                        while (true) {
                            i3 = i9;
                            if (i2 >= i6) {
                                break;
                            }
                            byte b3 = bArr[i2];
                            if (!C4404sb.m16640d(b3)) {
                                break;
                            }
                            i2++;
                            i9 = i3 + 1;
                            cArr[i3] = (char) b3;
                        }
                    } else if (b2 < -32) {
                        if (i8 < i6) {
                            C4404sb.m16639c(b2, bArr[i8], cArr, i3);
                            i2 = i8 + 1;
                            i3++;
                        } else {
                            throw zzll.m17329c();
                        }
                    } else if (b2 < -16) {
                        if (i8 < i6 - 1) {
                            int i12 = i8 + 1;
                            C4404sb.m16638b(b2, bArr[i8], bArr[i12], cArr, i3);
                            i2 = i12 + 1;
                            i3++;
                        } else {
                            throw zzll.m17329c();
                        }
                    } else if (i8 < i6 - 2) {
                        int i13 = i8 + 1;
                        byte b4 = bArr[i8];
                        int i14 = i13 + 1;
                        C4404sb.m16637a(b2, b4, bArr[i13], bArr[i14], cArr, i3);
                        i3 += 2;
                        i2 = i14 + 1;
                    } else {
                        throw zzll.m17329c();
                    }
                }
                g8Var.f13254c = new String(cArr, 0, i3);
                return i6;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(j), Integer.valueOf(i4)}));
        }
    }

    /* renamed from: i */
    static int m15990i(int i, byte[] bArr, int i2, int i3, C4234ib ibVar, C4197g8 g8Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m15994m(bArr, i2, g8Var);
                ibVar.mo13265j(i, Long.valueOf(g8Var.f13253b));
                return m;
            } else if (i4 == 1) {
                ibVar.mo13265j(i, Long.valueOf(m15997p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m15991j(bArr, i2, g8Var);
                int i5 = g8Var.f13252a;
                if (i5 < 0) {
                    throw zzll.m17330d();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        ibVar.mo13265j(i, C4418t8.f13699e);
                    } else {
                        ibVar.mo13265j(i, C4418t8.m16750w(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzll.m17332f();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C4234ib f = C4234ib.m16104f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m15991j(bArr, i2, g8Var);
                    int i8 = g8Var.f13252a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j2;
                        break;
                    }
                    int i9 = m15990i(i7, bArr, j2, i3, f, g8Var);
                    i7 = i8;
                    i2 = i9;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzll.m17331e();
                }
                ibVar.mo13265j(i, f);
                return i2;
            } else if (i4 == 5) {
                ibVar.mo13265j(i, Integer.valueOf(m15983b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzll.m17328b();
            }
        } else {
            throw zzll.m17328b();
        }
    }

    /* renamed from: j */
    static int m15991j(byte[] bArr, int i, C4197g8 g8Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m15992k(b, bArr, i2, g8Var);
        }
        g8Var.f13252a = b;
        return i2;
    }

    /* renamed from: k */
    static int m15992k(int i, byte[] bArr, int i2, C4197g8 g8Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & C11051p3.f31760d;
        if (b >= 0) {
            g8Var.f13252a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            g8Var.f13252a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            g8Var.f13252a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i12 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            g8Var.f13252a = i9 | (b4 << 28);
            return i12;
        }
        int i13 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i14 = i12 + 1;
            if (bArr[i12] < 0) {
                i12 = i14;
            } else {
                g8Var.f13252a = i13;
                return i14;
            }
        }
    }

    /* renamed from: l */
    static int m15993l(int i, byte[] bArr, int i2, int i3, C4453v9 v9Var, C4197g8 g8Var) {
        C4368q9 q9Var = (C4368q9) v9Var;
        int j = m15991j(bArr, i2, g8Var);
        q9Var.mo13498i(g8Var.f13252a);
        while (j < i3) {
            int j2 = m15991j(bArr, j, g8Var);
            if (i != g8Var.f13252a) {
                break;
            }
            j = m15991j(bArr, j2, g8Var);
            q9Var.mo13498i(g8Var.f13252a);
        }
        return j;
    }

    /* renamed from: m */
    static int m15994m(byte[] bArr, int i, C4197g8 g8Var) {
        long j = (long) bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            g8Var.f13253b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            byte b3 = b2;
            i3 = i5;
            b = b3;
        }
        g8Var.f13253b = j2;
        return i3;
    }

    /* renamed from: n */
    static int m15995n(Object obj, C4132cb cbVar, byte[] bArr, int i, int i2, int i3, C4197g8 g8Var) {
        int F = ((C4437ua) cbVar).mo13755F(obj, bArr, i, i2, i3, g8Var);
        g8Var.f13254c = obj;
        return F;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m15996o(java.lang.Object r6, com.google.android.gms.internal.measurement.C4132cb r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.C4197g8 r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m15992k(r9, r8, r0, r11)
            int r9 = r11.f13252a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.mo12991d(r1, r2, r3, r4, r5)
            r11.f13254c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.measurement.zzll r6 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4214h8.m15996o(java.lang.Object, com.google.android.gms.internal.measurement.cb, byte[], int, int, com.google.android.gms.internal.measurement.g8):int");
    }

    /* renamed from: p */
    static long m15997p(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}

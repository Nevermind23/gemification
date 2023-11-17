package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C1378e;
import androidx.emoji2.text.C1403m;
import java.util.Arrays;

/* renamed from: androidx.emoji2.text.h */
final class C1391h {

    /* renamed from: a */
    private final C1378e.C1388i f3973a;

    /* renamed from: b */
    private final C1403m f3974b;

    /* renamed from: c */
    private C1378e.C1383d f3975c;

    /* renamed from: d */
    private final boolean f3976d;

    /* renamed from: e */
    private final int[] f3977e;

    /* renamed from: androidx.emoji2.text.h$a */
    private static final class C1392a {
        /* renamed from: a */
        static int m4787a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i >= 0) {
                        char charAt = charSequence.charAt(i);
                        if (z) {
                            if (!Character.isHighSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                        } else if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        } else {
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        static int m4788b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.h$b */
    static final class C1393b {

        /* renamed from: a */
        private int f3978a = 1;

        /* renamed from: b */
        private final C1403m.C1404a f3979b;

        /* renamed from: c */
        private C1403m.C1404a f3980c;

        /* renamed from: d */
        private C1403m.C1404a f3981d;

        /* renamed from: e */
        private int f3982e;

        /* renamed from: f */
        private int f3983f;

        /* renamed from: g */
        private final boolean f3984g;

        /* renamed from: h */
        private final int[] f3985h;

        C1393b(C1403m.C1404a aVar, boolean z, int[] iArr) {
            this.f3979b = aVar;
            this.f3980c = aVar;
            this.f3984g = z;
            this.f3985h = iArr;
        }

        /* renamed from: d */
        private static boolean m4789d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        private static boolean m4790f(int i) {
            return i == 65038;
        }

        /* renamed from: g */
        private int m4791g() {
            this.f3978a = 1;
            this.f3980c = this.f3979b;
            this.f3983f = 0;
            return 1;
        }

        /* renamed from: h */
        private boolean m4792h() {
            if (this.f3980c.mo4050b().mo4018j() || m4789d(this.f3982e)) {
                return true;
            }
            if (this.f3984g) {
                if (this.f3985h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3985h, this.f3980c.mo4050b().mo4011b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4022a(int i) {
            C1403m.C1404a a = this.f3980c.mo4049a(i);
            int i2 = 2;
            if (this.f3978a != 2) {
                if (a == null) {
                    i2 = m4791g();
                } else {
                    this.f3978a = 2;
                    this.f3980c = a;
                    this.f3983f = 1;
                }
            } else if (a != null) {
                this.f3980c = a;
                this.f3983f++;
            } else if (m4790f(i)) {
                i2 = m4791g();
            } else if (!m4789d(i)) {
                if (this.f3980c.mo4050b() != null) {
                    i2 = 3;
                    if (this.f3983f != 1) {
                        this.f3981d = this.f3980c;
                        m4791g();
                    } else if (m4792h()) {
                        this.f3981d = this.f3980c;
                        m4791g();
                    } else {
                        i2 = m4791g();
                    }
                } else {
                    i2 = m4791g();
                }
            }
            this.f3982e = i;
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1390g mo4023b() {
            return this.f3980c.mo4050b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1390g mo4024c() {
            return this.f3981d.mo4050b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo4025e() {
            if (this.f3978a != 2 || this.f3980c.mo4050b() == null || (this.f3983f <= 1 && !m4792h())) {
                return false;
            }
            return true;
        }
    }

    C1391h(C1403m mVar, C1378e.C1388i iVar, C1378e.C1383d dVar, boolean z, int[] iArr) {
        this.f3973a = iVar;
        this.f3974b = mVar;
        this.f3975c = dVar;
        this.f3976d = z;
        this.f3977e = iArr;
    }

    /* renamed from: a */
    private void m4779a(Spannable spannable, C1390g gVar, int i, int i2) {
        spannable.setSpan(this.f3973a.mo4008a(gVar), i, i2, 33);
    }

    /* renamed from: b */
    private static boolean m4780b(Editable editable, KeyEvent keyEvent, boolean z) {
        C1394i[] iVarArr;
        if (m4785g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m4784f(selectionStart, selectionEnd) && (iVarArr = (C1394i[]) editable.getSpans(selectionStart, selectionEnd, C1394i.class)) != null && iVarArr.length > 0) {
            int length = iVarArr.length;
            int i = 0;
            while (i < length) {
                C1394i iVar = iVarArr[i];
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    static boolean m4781c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m4784f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = C1392a.m4787a(editable, selectionStart, Math.max(i, 0));
                i3 = C1392a.m4788b(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            C1394i[] iVarArr = (C1394i[]) editable.getSpans(i4, i3, C1394i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (C1394i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    i4 = Math.min(spanStart, i4);
                    i3 = Math.max(spanEnd, i3);
                }
                int max = Math.max(i4, 0);
                int min = Math.min(i3, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    static boolean m4782d(Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 67) {
            z = m4780b(editable, keyEvent, false);
        } else if (i != 112) {
            z = false;
        } else {
            z = m4780b(editable, keyEvent, true);
        }
        if (!z) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: e */
    private boolean m4783e(CharSequence charSequence, int i, int i2, C1390g gVar) {
        if (gVar.mo4013d() == 0) {
            gVar.mo4019k(this.f3975c.mo3987a(charSequence, i, i2, gVar.mo4016h()));
        }
        if (gVar.mo4013d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m4784f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: g */
    private static boolean m4785g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[Catch:{ all -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062 A[Catch:{ all -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0122  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo4021h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.emoji2.text.C1405n
            if (r0 == 0) goto L_0x000a
            r1 = r11
            androidx.emoji2.text.n r1 = (androidx.emoji2.text.C1405n) r1
            r1.mo4052a()
        L_0x000a:
            java.lang.Class<androidx.emoji2.text.i> r1 = androidx.emoji2.text.C1394i.class
            if (r0 != 0) goto L_0x002c
            boolean r2 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x0013
            goto L_0x002c
        L_0x0013:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x002a
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x0129 }
            int r3 = r12 + -1
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch:{ all -> 0x0129 }
            if (r2 > r13) goto L_0x002a
            androidx.emoji2.text.r r2 = new androidx.emoji2.text.r     // Catch:{ all -> 0x0129 }
            r2.<init>((java.lang.CharSequence) r11)     // Catch:{ all -> 0x0129 }
            goto L_0x0034
        L_0x002a:
            r2 = 0
            goto L_0x0034
        L_0x002c:
            androidx.emoji2.text.r r2 = new androidx.emoji2.text.r     // Catch:{ all -> 0x0129 }
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch:{ all -> 0x0129 }
            r2.<init>((android.text.Spannable) r3)     // Catch:{ all -> 0x0129 }
        L_0x0034:
            r3 = 0
            if (r2 == 0) goto L_0x0060
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch:{ all -> 0x0129 }
            androidx.emoji2.text.i[] r4 = (androidx.emoji2.text.C1394i[]) r4     // Catch:{ all -> 0x0129 }
            if (r4 == 0) goto L_0x0060
            int r5 = r4.length     // Catch:{ all -> 0x0129 }
            if (r5 <= 0) goto L_0x0060
            int r5 = r4.length     // Catch:{ all -> 0x0129 }
            r6 = r3
        L_0x0044:
            if (r6 >= r5) goto L_0x0060
            r7 = r4[r6]     // Catch:{ all -> 0x0129 }
            int r8 = r2.getSpanStart(r7)     // Catch:{ all -> 0x0129 }
            int r9 = r2.getSpanEnd(r7)     // Catch:{ all -> 0x0129 }
            if (r8 == r13) goto L_0x0055
            r2.removeSpan(r7)     // Catch:{ all -> 0x0129 }
        L_0x0055:
            int r12 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x0129 }
            int r13 = java.lang.Math.max(r9, r13)     // Catch:{ all -> 0x0129 }
            int r6 = r6 + 1
            goto L_0x0044
        L_0x0060:
            if (r12 == r13) goto L_0x0120
            int r4 = r11.length()     // Catch:{ all -> 0x0129 }
            if (r12 < r4) goto L_0x006a
            goto L_0x0120
        L_0x006a:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r4) goto L_0x007d
            if (r2 == 0) goto L_0x007d
            int r4 = r2.length()     // Catch:{ all -> 0x0129 }
            java.lang.Object[] r1 = r2.getSpans(r3, r4, r1)     // Catch:{ all -> 0x0129 }
            androidx.emoji2.text.i[] r1 = (androidx.emoji2.text.C1394i[]) r1     // Catch:{ all -> 0x0129 }
            int r1 = r1.length     // Catch:{ all -> 0x0129 }
            int r14 = r14 - r1
        L_0x007d:
            androidx.emoji2.text.h$b r1 = new androidx.emoji2.text.h$b     // Catch:{ all -> 0x0129 }
            androidx.emoji2.text.m r4 = r10.f3974b     // Catch:{ all -> 0x0129 }
            androidx.emoji2.text.m$a r4 = r4.mo4046f()     // Catch:{ all -> 0x0129 }
            boolean r5 = r10.f3976d     // Catch:{ all -> 0x0129 }
            int[] r6 = r10.f3977e     // Catch:{ all -> 0x0129 }
            r1.<init>(r4, r5, r6)     // Catch:{ all -> 0x0129 }
            int r4 = java.lang.Character.codePointAt(r11, r12)     // Catch:{ all -> 0x0129 }
            r5 = r4
            r4 = r3
            r3 = r2
        L_0x0093:
            r2 = r12
        L_0x0094:
            if (r12 >= r13) goto L_0x00e6
            if (r4 >= r14) goto L_0x00e6
            int r6 = r1.mo4022a(r5)     // Catch:{ all -> 0x0129 }
            r7 = 1
            if (r6 == r7) goto L_0x00d4
            r7 = 2
            if (r6 == r7) goto L_0x00c8
            r7 = 3
            if (r6 == r7) goto L_0x00a6
            goto L_0x0094
        L_0x00a6:
            if (r15 != 0) goto L_0x00b2
            androidx.emoji2.text.g r6 = r1.mo4024c()     // Catch:{ all -> 0x0129 }
            boolean r6 = r10.m4783e(r11, r2, r12, r6)     // Catch:{ all -> 0x0129 }
            if (r6 != 0) goto L_0x0093
        L_0x00b2:
            if (r3 != 0) goto L_0x00be
            androidx.emoji2.text.r r3 = new androidx.emoji2.text.r     // Catch:{ all -> 0x0129 }
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x0129 }
            r6.<init>(r11)     // Catch:{ all -> 0x0129 }
            r3.<init>((android.text.Spannable) r6)     // Catch:{ all -> 0x0129 }
        L_0x00be:
            androidx.emoji2.text.g r6 = r1.mo4024c()     // Catch:{ all -> 0x0129 }
            r10.m4779a(r3, r6, r2, r12)     // Catch:{ all -> 0x0129 }
            int r4 = r4 + 1
            goto L_0x0093
        L_0x00c8:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x0129 }
            int r12 = r12 + r6
            if (r12 >= r13) goto L_0x0094
            int r5 = java.lang.Character.codePointAt(r11, r12)     // Catch:{ all -> 0x0129 }
            goto L_0x0094
        L_0x00d4:
            int r12 = java.lang.Character.codePointAt(r11, r2)     // Catch:{ all -> 0x0129 }
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0129 }
            int r2 = r2 + r12
            if (r2 >= r13) goto L_0x00e4
            int r12 = java.lang.Character.codePointAt(r11, r2)     // Catch:{ all -> 0x0129 }
            r5 = r12
        L_0x00e4:
            r12 = r2
            goto L_0x0094
        L_0x00e6:
            boolean r13 = r1.mo4025e()     // Catch:{ all -> 0x0129 }
            if (r13 == 0) goto L_0x0109
            if (r4 >= r14) goto L_0x0109
            if (r15 != 0) goto L_0x00fa
            androidx.emoji2.text.g r13 = r1.mo4023b()     // Catch:{ all -> 0x0129 }
            boolean r13 = r10.m4783e(r11, r2, r12, r13)     // Catch:{ all -> 0x0129 }
            if (r13 != 0) goto L_0x0109
        L_0x00fa:
            if (r3 != 0) goto L_0x0102
            androidx.emoji2.text.r r13 = new androidx.emoji2.text.r     // Catch:{ all -> 0x0129 }
            r13.<init>((java.lang.CharSequence) r11)     // Catch:{ all -> 0x0129 }
            r3 = r13
        L_0x0102:
            androidx.emoji2.text.g r13 = r1.mo4023b()     // Catch:{ all -> 0x0129 }
            r10.m4779a(r3, r13, r2, r12)     // Catch:{ all -> 0x0129 }
        L_0x0109:
            if (r3 == 0) goto L_0x0117
            android.text.Spannable r12 = r3.mo4080b()     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x0116
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.C1405n) r11
            r11.mo4057d()
        L_0x0116:
            return r12
        L_0x0117:
            if (r0 == 0) goto L_0x011f
            r12 = r11
            androidx.emoji2.text.n r12 = (androidx.emoji2.text.C1405n) r12
            r12.mo4057d()
        L_0x011f:
            return r11
        L_0x0120:
            if (r0 == 0) goto L_0x0128
            r12 = r11
            androidx.emoji2.text.n r12 = (androidx.emoji2.text.C1405n) r12
            r12.mo4057d()
        L_0x0128:
            return r11
        L_0x0129:
            r12 = move-exception
            if (r0 == 0) goto L_0x0131
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.C1405n) r11
            r11.mo4057d()
        L_0x0131:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1391h.mo4021h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}

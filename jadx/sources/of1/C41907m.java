package of1;

import androidx.work.C1958d;
import cf1.C40419j;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import pf1.C42194a;
import pf1.C42197d;
import uf1.C43089c;

/* renamed from: of1.m */
public final class C41907m {

    /* renamed from: j */
    public static final C41908a f98505j = new C41908a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Pattern f98506k = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Pattern f98507l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Pattern f98508m = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final Pattern f98509n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f98510a;

    /* renamed from: b */
    private final String f98511b;

    /* renamed from: c */
    private final long f98512c;

    /* renamed from: d */
    private final String f98513d;

    /* renamed from: e */
    private final String f98514e;

    /* renamed from: f */
    private final boolean f98515f;

    /* renamed from: g */
    private final boolean f98516g;

    /* renamed from: h */
    private final boolean f98517h;

    /* renamed from: i */
    private final boolean f98518i;

    /* renamed from: of1.m$a */
    public static final class C41908a {
        private C41908a() {
        }

        public /* synthetic */ C41908a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x003f, code lost:
            if (r1 != ':') goto L_0x0042;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final int m121523a(java.lang.String r6, int r7, int r8, boolean r9) {
            /*
                r5 = this;
            L_0x0000:
                if (r7 >= r8) goto L_0x0049
                int r0 = r7 + 1
                char r1 = r6.charAt(r7)
                r2 = 32
                r3 = 1
                if (r1 >= r2) goto L_0x0011
                r2 = 9
                if (r1 != r2) goto L_0x0041
            L_0x0011:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L_0x0041
                r2 = 57
                r4 = 0
                if (r1 > r2) goto L_0x0020
                r2 = 48
                if (r2 > r1) goto L_0x0020
                r2 = r3
                goto L_0x0021
            L_0x0020:
                r2 = r4
            L_0x0021:
                if (r2 != 0) goto L_0x0041
                r2 = 122(0x7a, float:1.71E-43)
                if (r1 > r2) goto L_0x002d
                r2 = 97
                if (r2 > r1) goto L_0x002d
                r2 = r3
                goto L_0x002e
            L_0x002d:
                r2 = r4
            L_0x002e:
                if (r2 != 0) goto L_0x0041
                r2 = 90
                if (r1 > r2) goto L_0x003a
                r2 = 65
                if (r2 > r1) goto L_0x003a
                r2 = r3
                goto L_0x003b
            L_0x003a:
                r2 = r4
            L_0x003b:
                if (r2 != 0) goto L_0x0041
                r2 = 58
                if (r1 != r2) goto L_0x0042
            L_0x0041:
                r4 = r3
            L_0x0042:
                r1 = r9 ^ 1
                if (r4 != r1) goto L_0x0047
                return r7
            L_0x0047:
                r7 = r0
                goto L_0x0000
            L_0x0049:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: of1.C41907m.C41908a.m121523a(java.lang.String, int, int, boolean):int");
        }

        /* renamed from: b */
        private final boolean m121524b(String str, String str2) {
            if (C41536l.m120484d(str, str2)) {
                return true;
            }
            if (!C40439w.m117114r(str, str2, false, 2, (Object) null) || str.charAt((str.length() - str2.length()) - 1) != '.' || C42197d.m122543i(str)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private final String m121525f(String str) {
            if (!C40439w.m117114r(str, ".", false, 2, (Object) null)) {
                String e = C42194a.m122505e(C40440x.m117172n0(str, "."));
                if (e != null) {
                    return e;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: g */
        private final long m121526g(String str, int i, int i2) {
            String str2 = str;
            int i3 = i2;
            int a = m121523a(str2, i, i3, false);
            Matcher matcher = C41907m.f98509n.matcher(str2);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            while (a < i3) {
                int a2 = m121523a(str2, a + 1, i3, true);
                matcher.region(a, a2);
                if (i5 == -1 && matcher.usePattern(C41907m.f98509n).matches()) {
                    String group = matcher.group(1);
                    C41536l.m120488h(group, "matcher.group(1)");
                    i5 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C41536l.m120488h(group2, "matcher.group(2)");
                    i8 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C41536l.m120488h(group3, "matcher.group(3)");
                    i9 = Integer.parseInt(group3);
                } else if (i6 == -1 && matcher.usePattern(C41907m.f98508m).matches()) {
                    String group4 = matcher.group(1);
                    C41536l.m120488h(group4, "matcher.group(1)");
                    i6 = Integer.parseInt(group4);
                } else if (i7 == -1 && matcher.usePattern(C41907m.f98507l).matches()) {
                    String group5 = matcher.group(1);
                    C41536l.m120488h(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C41536l.m120488h(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = C41907m.f98507l.pattern();
                    C41536l.m120488h(pattern, "MONTH_PATTERN.pattern()");
                    i7 = C40440x.m117156X(pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i4 == -1 && matcher.usePattern(C41907m.f98506k).matches()) {
                    String group6 = matcher.group(1);
                    C41536l.m120488h(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
                a = m121523a(str2, a2 + 1, i3, false);
            }
            if (70 <= i4 && i4 < 100) {
                i4 += 1900;
            }
            if (i4 >= 0 && i4 < 70) {
                i4 += 2000;
            }
            if (i4 >= 1601) {
                if (i7 != -1) {
                    if (1 <= i6 && i6 < 32) {
                        if (i5 >= 0 && i5 < 24) {
                            if (i8 >= 0 && i8 < 60) {
                                if (i9 >= 0 && i9 < 60) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C42197d.f99269f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i4);
                                    gregorianCalendar.set(2, i7 - 1);
                                    gregorianCalendar.set(5, i6);
                                    gregorianCalendar.set(11, i5);
                                    gregorianCalendar.set(12, i8);
                                    gregorianCalendar.set(13, i9);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: h */
        private final long m121527h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (!new C40419j("-?\\d+").mo94489f(str)) {
                    throw e;
                } else if (C40439w.m117109H(str, "-", false, 2, (Object) null)) {
                    return Long.MIN_VALUE;
                } else {
                    return Long.MAX_VALUE;
                }
            }
        }

        /* renamed from: c */
        public final C41907m mo96866c(C41931v vVar, String str) {
            C41536l.m120489i(vVar, C11769i.C11770a.f34149l);
            C41536l.m120489i(str, "setCookie");
            return mo96867d(System.currentTimeMillis(), vVar, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
            if (r1 > 253402300799999L) goto L_0x010a;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0117  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0137 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0138  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final of1.C41907m mo96867d(long r26, of1.C41931v r28, java.lang.String r29) {
            /*
                r25 = this;
                r0 = r25
                r7 = r29
                java.lang.String r1 = "url"
                r8 = r28
                kotlin.jvm.internal.C41536l.m120489i(r8, r1)
                java.lang.String r1 = "setCookie"
                kotlin.jvm.internal.C41536l.m120489i(r7, r1)
                r2 = 59
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r29
                int r9 = pf1.C42197d.m122552r(r1, r2, r3, r4, r5, r6)
                r2 = 61
                r5 = 2
                r4 = r9
                int r1 = pf1.C42197d.m122552r(r1, r2, r3, r4, r5, r6)
                r2 = 0
                if (r1 != r9) goto L_0x0028
                return r2
            L_0x0028:
                r3 = 0
                r4 = 1
                java.lang.String r11 = pf1.C42197d.m122532Z(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x0036
                r5 = r4
                goto L_0x0037
            L_0x0036:
                r5 = r3
            L_0x0037:
                if (r5 != 0) goto L_0x016e
                int r5 = pf1.C42197d.m122559y(r11)
                r6 = -1
                if (r5 == r6) goto L_0x0042
                goto L_0x016e
            L_0x0042:
                int r1 = r1 + r4
                java.lang.String r12 = pf1.C42197d.m122531Y(r7, r1, r9)
                int r1 = pf1.C42197d.m122559y(r12)
                if (r1 == r6) goto L_0x004e
                return r2
            L_0x004e:
                int r9 = r9 + r4
                int r1 = r29.length()
                r5 = -1
                r10 = r2
                r22 = r10
                r17 = r3
                r18 = r17
                r19 = r18
                r20 = r4
                r15 = r5
                r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0066:
                if (r9 >= r1) goto L_0x00d6
                r2 = 59
                int r2 = pf1.C42197d.m122550p(r7, r2, r9, r1)
                r13 = 61
                int r13 = pf1.C42197d.m122550p(r7, r13, r9, r2)
                java.lang.String r9 = pf1.C42197d.m122531Y(r7, r9, r13)
                if (r13 >= r2) goto L_0x0081
                int r13 = r13 + 1
                java.lang.String r13 = pf1.C42197d.m122531Y(r7, r13, r2)
                goto L_0x0083
            L_0x0081:
                java.lang.String r13 = ""
            L_0x0083:
                java.lang.String r14 = "expires"
                boolean r14 = cf1.C40439w.m117115s(r9, r14, r4)
                if (r14 == 0) goto L_0x0094
                int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00d2 }
                long r23 = r0.m121526g(r13, r3, r9)     // Catch:{ IllegalArgumentException -> 0x00d2 }
                goto L_0x00a0
            L_0x0094:
                java.lang.String r14 = "max-age"
                boolean r14 = cf1.C40439w.m117115s(r9, r14, r4)
                if (r14 == 0) goto L_0x00a3
                long r15 = r0.m121527h(r13)     // Catch:{  }
            L_0x00a0:
                r19 = r4
                goto L_0x00d2
            L_0x00a3:
                java.lang.String r14 = "domain"
                boolean r14 = cf1.C40439w.m117115s(r9, r14, r4)
                if (r14 == 0) goto L_0x00b2
                java.lang.String r10 = r0.m121525f(r13)     // Catch:{ IllegalArgumentException -> 0x00d2 }
                r20 = r3
                goto L_0x00d2
            L_0x00b2:
                java.lang.String r14 = "path"
                boolean r14 = cf1.C40439w.m117115s(r9, r14, r4)
                if (r14 == 0) goto L_0x00bd
                r22 = r13
                goto L_0x00d2
            L_0x00bd:
                java.lang.String r13 = "secure"
                boolean r13 = cf1.C40439w.m117115s(r9, r13, r4)
                if (r13 == 0) goto L_0x00c8
                r17 = r4
                goto L_0x00d2
            L_0x00c8:
                java.lang.String r13 = "httponly"
                boolean r9 = cf1.C40439w.m117115s(r9, r13, r4)
                if (r9 == 0) goto L_0x00d2
                r18 = r4
            L_0x00d2:
                int r9 = r2 + 1
                r2 = 0
                goto L_0x0066
            L_0x00d6:
                r1 = -9223372036854775808
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00de
            L_0x00dc:
                r13 = r1
                goto L_0x010e
            L_0x00de:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x010c
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x00f0
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto L_0x00f5
            L_0x00f0:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00f5:
                long r1 = r26 + r15
                int r4 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
                if (r4 < 0) goto L_0x0105
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x00dc
                goto L_0x010a
            L_0x0105:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x010a:
                r13 = r4
                goto L_0x010e
            L_0x010c:
                r13 = r23
            L_0x010e:
                java.lang.String r1 = r28.mo96954i()
                if (r10 != 0) goto L_0x0117
                r15 = r1
                r2 = 0
                goto L_0x0121
            L_0x0117:
                boolean r2 = r0.m121524b(r1, r10)
                if (r2 != 0) goto L_0x011f
                r2 = 0
                return r2
            L_0x011f:
                r2 = 0
                r15 = r10
            L_0x0121:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L_0x0138
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f98692e
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.mo97168c()
                java.lang.String r1 = r1.mo97167c(r15)
                if (r1 != 0) goto L_0x0138
                return r2
            L_0x0138:
                java.lang.String r1 = "/"
                r4 = r22
                if (r4 == 0) goto L_0x0149
                r5 = 2
                boolean r2 = cf1.C40439w.m117109H(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x0146
                goto L_0x0149
            L_0x0146:
                r16 = r4
                goto L_0x0165
            L_0x0149:
                java.lang.String r2 = r28.mo96948d()
                r6 = 47
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r2
                int r4 = cf1.C40440x.m117160b0(r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x0163
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            L_0x0163:
                r16 = r1
            L_0x0165:
                of1.m r1 = new of1.m
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            L_0x016e:
                r1 = r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: of1.C41907m.C41908a.mo96867d(long, of1.v, java.lang.String):of1.m");
        }

        /* renamed from: e */
        public final List mo96868e(C41931v vVar, C41928u uVar) {
            C41536l.m120489i(vVar, C11769i.C11770a.f34149l);
            C41536l.m120489i(uVar, "headers");
            List o = uVar.mo96933o("Set-Cookie");
            int size = o.size();
            ArrayList arrayList = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                C41907m c = mo96866c(vVar, (String) o.get(i));
                if (c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c);
                }
                i = i2;
            }
            if (arrayList == null) {
                return C41341q.m119907j();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            C41536l.m120488h(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }
    }

    public /* synthetic */ C41907m(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    /* renamed from: e */
    public final String mo96853e() {
        return this.f98513d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C41907m) {
            C41907m mVar = (C41907m) obj;
            if (C41536l.m120484d(mVar.f98510a, this.f98510a) && C41536l.m120484d(mVar.f98511b, this.f98511b) && mVar.f98512c == this.f98512c && C41536l.m120484d(mVar.f98513d, this.f98513d) && C41536l.m120484d(mVar.f98514e, this.f98514e) && mVar.f98515f == this.f98515f && mVar.f98516g == this.f98516g && mVar.f98517h == this.f98517h && mVar.f98518i == this.f98518i) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final long mo96855f() {
        return this.f98512c;
    }

    /* renamed from: g */
    public final boolean mo96856g() {
        return this.f98518i;
    }

    /* renamed from: h */
    public final boolean mo96857h() {
        return this.f98516g;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f98510a.hashCode()) * 31) + this.f98511b.hashCode()) * 31) + C7397t.m28148a(this.f98512c)) * 31) + this.f98513d.hashCode()) * 31) + this.f98514e.hashCode()) * 31) + C1958d.m7693a(this.f98515f)) * 31) + C1958d.m7693a(this.f98516g)) * 31) + C1958d.m7693a(this.f98517h)) * 31) + C1958d.m7693a(this.f98518i);
    }

    /* renamed from: i */
    public final String mo96859i() {
        return this.f98510a;
    }

    /* renamed from: j */
    public final String mo96860j() {
        return this.f98514e;
    }

    /* renamed from: k */
    public final boolean mo96861k() {
        return this.f98517h;
    }

    /* renamed from: l */
    public final boolean mo96862l() {
        return this.f98515f;
    }

    /* renamed from: m */
    public final String mo96863m(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo96859i());
        sb.append('=');
        sb.append(mo96864n());
        if (mo96861k()) {
            if (mo96855f() == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C43089c.m123629b(new Date(mo96855f())));
            }
        }
        if (!mo96856g()) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(mo96853e());
        }
        sb.append("; path=");
        sb.append(mo96860j());
        if (mo96862l()) {
            sb.append("; secure");
        }
        if (mo96857h()) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "toString()");
        return sb2;
    }

    /* renamed from: n */
    public final String mo96864n() {
        return this.f98511b;
    }

    public String toString() {
        return mo96863m(false);
    }

    private C41907m(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f98510a = str;
        this.f98511b = str2;
        this.f98512c = j;
        this.f98513d = str3;
        this.f98514e = str4;
        this.f98515f = z;
        this.f98516g = z2;
        this.f98517h = z3;
        this.f98518i = z4;
    }
}

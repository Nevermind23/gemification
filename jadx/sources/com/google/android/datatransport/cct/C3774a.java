package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p142k5.C6811b;
import p168m5.C7116g;

/* renamed from: com.google.android.datatransport.cct.a */
public final class C3774a implements C7116g {

    /* renamed from: c */
    static final String f11824c;

    /* renamed from: d */
    static final String f11825d;

    /* renamed from: e */
    private static final String f11826e;

    /* renamed from: f */
    private static final Set f11827f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C6811b[]{C6811b.m26540b("proto"), C6811b.m26540b("json")})));

    /* renamed from: g */
    public static final C3774a f11828g;

    /* renamed from: h */
    public static final C3774a f11829h;

    /* renamed from: a */
    private final String f11830a;

    /* renamed from: b */
    private final String f11831b;

    static {
        String a = C3780e.m13980a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f11824c = a;
        String a2 = C3780e.m13980a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f11825d = a2;
        String a3 = C3780e.m13980a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f11826e = a3;
        f11828g = new C3774a(a, (String) null);
        f11829h = new C3774a(a2, a3);
    }

    public C3774a(String str, String str2) {
        this.f11830a = str;
        this.f11831b = str2;
    }

    /* renamed from: c */
    public static C3774a m13959c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C3774a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set mo11424a() {
        return f11827f;
    }

    /* renamed from: b */
    public byte[] mo11425b() {
        String str = this.f11831b;
        if (str == null && this.f11830a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f11830a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    public String mo11426d() {
        return this.f11831b;
    }

    /* renamed from: e */
    public String mo11427e() {
        return this.f11830a;
    }

    public byte[] getExtras() {
        return mo11425b();
    }

    public String getName() {
        return "cct";
    }
}

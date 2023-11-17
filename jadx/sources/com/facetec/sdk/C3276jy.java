package com.facetec.sdk;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facetec.sdk.jy */
public final class C3276jy {

    /* renamed from: a */
    private static final Pattern f10748a = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: e */
    private static final Pattern f10749e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b */
    private final String f10750b;

    /* renamed from: c */
    private final String f10751c;

    /* renamed from: d */
    private final String f10752d;

    /* renamed from: j */
    private final String f10753j;

    private C3276jy(String str, String str2, String str3, String str4) {
        this.f10752d = str;
        this.f10751c = str2;
        this.f10750b = str3;
        this.f10753j = str4;
    }

    /* renamed from: b */
    public static C3276jy m13147b(String str) {
        Matcher matcher = f10749e.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = f10748a.matcher(str);
            int end = matcher.end();
            String str2 = null;
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            StringBuilder sb = new StringBuilder("Multiple charsets defined: \"");
                            sb.append(str2);
                            sb.append("\" and: \"");
                            sb.append(group3);
                            sb.append("\" for: \"");
                            sb.append(str);
                            sb.append('\"');
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    sb2.append(str.substring(end));
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            return new C3276jy(str, lowerCase, lowerCase2, str2);
        }
        StringBuilder sb3 = new StringBuilder("No subtype found for: \"");
        sb3.append(str);
        sb3.append('\"');
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: c */
    public static C3276jy m13148c(String str) {
        try {
            return m13147b(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Charset mo9561a(Charset charset) {
        try {
            String str = this.f10753j;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* renamed from: d */
    public final Charset mo9562d() {
        return mo9561a((Charset) null);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3276jy) && ((C3276jy) obj).f10752d.equals(this.f10752d);
    }

    public final int hashCode() {
        return this.f10752d.hashCode();
    }

    public final String toString() {
        return this.f10752d;
    }
}

package com.salesforce.marketingcloud.analytics;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.util.C11821j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.analytics.b */
public final class C11341b {

    /* renamed from: A */
    public static final int f32962A = 888;

    /* renamed from: B */
    public static final int f32963B = 8888;

    /* renamed from: C */
    public static final List<Integer> f32964C = Collections.unmodifiableList(Arrays.asList(new Integer[]{3, 14}));

    /* renamed from: D */
    public static final int f32965D = 0;

    /* renamed from: E */
    public static final int f32966E = 1;

    /* renamed from: k */
    public static final int f32967k = 2;

    /* renamed from: l */
    public static final int f32968l = 3;

    /* renamed from: m */
    public static final int f32969m = 4;

    /* renamed from: n */
    public static final int f32970n = 5;

    /* renamed from: o */
    public static final int f32971o = 5;

    /* renamed from: p */
    public static final int f32972p = 6;

    /* renamed from: q */
    public static final int f32973q = 7;

    /* renamed from: r */
    public static final int f32974r = 10;

    /* renamed from: s */
    public static final int f32975s = 11;

    /* renamed from: t */
    public static final int f32976t = 12;

    /* renamed from: u */
    public static final int f32977u = 13;

    /* renamed from: v */
    public static final int f32978v = 14;

    /* renamed from: w */
    public static final int f32979w = 15;

    /* renamed from: x */
    public static final int f32980x = 16;

    /* renamed from: y */
    public static final int f32981y = 17;

    /* renamed from: z */
    public static final int f32982z = 88888;

    /* renamed from: a */
    private final Date f32983a;

    /* renamed from: b */
    private final int f32984b;

    /* renamed from: c */
    private final int f32985c;

    /* renamed from: d */
    private final List<String> f32986d;

    /* renamed from: e */
    private String f32987e;

    /* renamed from: f */
    private int f32988f;

    /* renamed from: g */
    private int f32989g;

    /* renamed from: h */
    private boolean f32990h;

    /* renamed from: i */
    private String f32991i;

    /* renamed from: j */
    private String f32992j;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.salesforce.marketingcloud.analytics.b$a */
    public @interface C11342a {
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.salesforce.marketingcloud.analytics.b$b */
    public @interface C11343b {
    }

    private C11341b(Date date, int i, int i2, List<String> list, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f32986d = arrayList;
        this.f32983a = (Date) C11821j.m43272a(date, "The Date is null.");
        boolean z2 = false;
        C11821j.m43274a(i == 0 || i == 1, "The Product Type must be one of AnalyticProductType");
        this.f32984b = i;
        C11821j.m43274a(i2 > 0 ? true : z2, "AnalyticType must be a valid int > 0.");
        this.f32985c = i2;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        this.f32992j = str;
        this.f32990h = z;
    }

    /* renamed from: a */
    public int mo29761a() {
        return this.f32985c;
    }

    /* renamed from: b */
    public Date mo29765b() {
        return this.f32983a;
    }

    /* renamed from: c */
    public int mo29768c() {
        return this.f32988f;
    }

    /* renamed from: d */
    public String mo29769d() {
        return this.f32991i;
    }

    /* renamed from: e */
    public String mo29770e() {
        return this.f32987e;
    }

    /* renamed from: f */
    public int mo29771f() {
        return this.f32989g;
    }

    /* renamed from: g */
    public boolean mo29772g() {
        return this.f32990h;
    }

    /* renamed from: h */
    public List<String> mo29773h() {
        List<String> list;
        synchronized (this.f32986d) {
            list = this.f32986d;
        }
        return list;
    }

    /* renamed from: i */
    public int mo29774i() {
        return this.f32984b;
    }

    /* renamed from: j */
    public String mo29775j() {
        return this.f32992j;
    }

    /* renamed from: a */
    public static C11341b m41460a(Date date, int i, int i2) {
        return m41461a(date, i, i2, Collections.emptyList(), (String) null, false);
    }

    /* renamed from: b */
    public void mo29766b(int i) {
        this.f32989g = i;
    }

    /* renamed from: a */
    public static C11341b m41461a(Date date, int i, int i2, List<String> list, String str, boolean z) {
        return new C11341b(date, i, i2, list, str, z);
    }

    /* renamed from: b */
    public void mo29767b(String str) {
        this.f32987e = str;
    }

    /* renamed from: a */
    public static C11341b m41462a(Date date, int i, int i2, List<String> list, boolean z) {
        return m41461a(date, i, i2, list, (String) null, z);
    }

    /* renamed from: a */
    public void mo29762a(int i) {
        this.f32988f = i;
    }

    /* renamed from: a */
    public void mo29763a(String str) {
        this.f32991i = str;
    }

    /* renamed from: a */
    public void mo29764a(boolean z) {
        this.f32990h = z;
    }
}

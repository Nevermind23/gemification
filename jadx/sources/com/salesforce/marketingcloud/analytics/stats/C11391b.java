package com.salesforce.marketingcloud.analytics.stats;

import com.salesforce.marketingcloud.C11461g;
import java.util.Date;
import org.json.JSONException;

/* renamed from: com.salesforce.marketingcloud.analytics.stats.b */
public class C11391b {

    /* renamed from: f */
    public static final int f33100f = 100;

    /* renamed from: g */
    public static final int f33101g = 101;

    /* renamed from: h */
    public static final int f33102h = 102;

    /* renamed from: i */
    public static final int f33103i = 103;

    /* renamed from: j */
    public static final int f33104j = 104;

    /* renamed from: k */
    public static final int f33105k = 105;

    /* renamed from: l */
    public static final int f33106l = 106;

    /* renamed from: m */
    public static final int f33107m = 107;

    /* renamed from: a */
    C11396d f33108a;

    /* renamed from: b */
    private Integer f33109b;

    /* renamed from: c */
    private int f33110c;

    /* renamed from: d */
    private Date f33111d;

    /* renamed from: e */
    private boolean f33112e;

    private C11391b(Integer num, int i, Date date, C11396d dVar, boolean z) {
        this.f33109b = num;
        this.f33110c = i;
        this.f33111d = date;
        this.f33108a = dVar;
        this.f33112e = z;
    }

    /* renamed from: a */
    public static C11391b m41654a(int i, int i2, Date date, C11396d dVar, boolean z) {
        return new C11391b(Integer.valueOf(i), i2, date, dVar, z);
    }

    /* renamed from: b */
    public Integer mo29835b() {
        return this.f33109b;
    }

    /* renamed from: c */
    public C11396d mo29836c() {
        return this.f33108a;
    }

    /* renamed from: d */
    public int mo29837d() {
        return this.f33110c;
    }

    /* renamed from: e */
    public boolean mo29838e() {
        return this.f33112e;
    }

    /* renamed from: a */
    public static C11391b m41655a(int i, Date date, C11396d dVar, boolean z) {
        return new C11391b((Integer) null, i, date, dVar, z);
    }

    /* renamed from: a */
    public Date mo29832a() {
        return this.f33111d;
    }

    /* renamed from: a */
    public void mo29833a(Date date) {
        int time = (int) (((double) (date.getTime() - this.f33111d.getTime())) / 1000.0d);
        if (time <= 0) {
            time = 1;
        }
        try {
            this.f33108a.mo29843b(time);
            this.f33112e = true;
        } catch (JSONException e) {
            C11461g.m41885b(C11392c.f33113k, e, "Unable to finalize event [%d]", Integer.valueOf(this.f33110c));
        }
    }

    /* renamed from: a */
    public void mo29834a(boolean z) {
        this.f33112e = z;
    }
}

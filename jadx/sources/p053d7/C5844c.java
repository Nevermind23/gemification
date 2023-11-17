package p053d7;

import com.google.android.gms.common.Feature;

/* renamed from: d7.c */
public abstract class C5844c {

    /* renamed from: a */
    public static final Feature f18365a;

    /* renamed from: b */
    public static final Feature f18366b;

    /* renamed from: c */
    public static final Feature f18367c;

    /* renamed from: d */
    public static final Feature f18368d;

    /* renamed from: e */
    public static final Feature[] f18369e;

    static {
        Feature feature = new Feature("sms_code_autofill", 2);
        f18365a = feature;
        Feature feature2 = new Feature("sms_code_browser", 2);
        f18366b = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1);
        f18367c = feature3;
        Feature feature4 = new Feature("user_consent", 3);
        f18368d = feature4;
        f18369e = new Feature[]{feature, feature2, feature3, feature4};
    }
}

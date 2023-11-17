package com.salesforce.marketingcloud;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

/* renamed from: com.salesforce.marketingcloud.g */
public final class C11461g {

    /* renamed from: a */
    public static final C11461g f33306a = new C11461g();

    /* renamed from: b */
    private static final int f33307b = 23;

    /* renamed from: c */
    private static String f33308c;

    /* renamed from: d */
    private static String f33309d;

    /* renamed from: e */
    private static String f33310e;

    /* renamed from: f */
    private static int f33311f = 6;

    /* renamed from: g */
    private static MCLogListener f33312g;

    /* renamed from: com.salesforce.marketingcloud.g$a */
    static final class C11462a extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33313a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33314b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11462a(String str, Object[] objArr) {
            super(0);
            this.f33313a = str;
            this.f33314b = objArr;
        }

        /* renamed from: a */
        public final String invoke() {
            C11461g gVar = C11461g.f33306a;
            String str = this.f33313a;
            Object[] objArr = this.f33314b;
            return gVar.m41876a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$b */
    static final class C11463b extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33315a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33316b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11463b(String str, Object[] objArr) {
            super(0);
            this.f33315a = str;
            this.f33316b = objArr;
        }

        /* renamed from: a */
        public final String invoke() {
            C11461g gVar = C11461g.f33306a;
            String str = this.f33315a;
            Object[] objArr = this.f33316b;
            return gVar.m41876a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$c */
    static final class C11464c extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33317a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33318b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11464c(String str, Object[] objArr) {
            super(0);
            this.f33317a = str;
            this.f33318b = objArr;
        }

        /* renamed from: a */
        public final String invoke() {
            C11461g gVar = C11461g.f33306a;
            String str = this.f33317a;
            Object[] objArr = this.f33318b;
            return gVar.m41876a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$d */
    static final class C11465d extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33319a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33320b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11465d(String str, Object[] objArr) {
            super(0);
            this.f33319a = str;
            this.f33320b = objArr;
        }

        /* renamed from: a */
        public final String invoke() {
            C11461g gVar = C11461g.f33306a;
            String str = this.f33319a;
            Object[] objArr = this.f33320b;
            return gVar.m41876a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$e */
    static final class C11466e extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ C43064a f33321a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11466e(C43064a aVar) {
            super(0);
            this.f33321a = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return ((String) this.f33321a.invoke()) + " - Sdk Version: " + MarketingCloudSdk.getSdkVersionName();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$f */
    static final class C11467f extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33322a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33323b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11467f(String str, Object[] objArr) {
            super(0);
            this.f33322a = str;
            this.f33323b = objArr;
        }

        /* renamed from: a */
        public final String invoke() {
            C11461g gVar = C11461g.f33306a;
            String str = this.f33322a;
            Object[] objArr = this.f33323b;
            return gVar.m41876a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$g */
    static final class C11468g extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33324a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33325b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11468g(String str, Object[] objArr) {
            super(0);
            this.f33324a = str;
            this.f33325b = objArr;
        }

        /* renamed from: a */
        public final String invoke() {
            C11461g gVar = C11461g.f33306a;
            String str = this.f33324a;
            Object[] objArr = this.f33325b;
            return gVar.m41876a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$h */
    static final class C11469h extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33326a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33327b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11469h(String str, Object[] objArr) {
            super(0);
            this.f33326a = str;
            this.f33327b = objArr;
        }

        /* renamed from: a */
        public final String invoke() {
            C11461g gVar = C11461g.f33306a;
            String str = this.f33326a;
            Object[] objArr = this.f33327b;
            return gVar.m41876a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$i */
    static final class C11470i extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33328a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33329b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11470i(String str, Object[] objArr) {
            super(0);
            this.f33328a = str;
            this.f33329b = objArr;
        }

        /* renamed from: a */
        public final String invoke() {
            C11461g gVar = C11461g.f33306a;
            String str = this.f33328a;
            Object[] objArr = this.f33329b;
            return gVar.m41876a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$j */
    static final class C11471j extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33330a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33331b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11471j(String str, Object[] objArr) {
            super(0);
            this.f33330a = str;
            this.f33331b = objArr;
        }

        /* renamed from: a */
        public final String invoke() {
            C11461g gVar = C11461g.f33306a;
            String str = this.f33330a;
            Object[] objArr = this.f33331b;
            return gVar.m41876a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.g$k */
    static final class C11472k extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33332a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33333b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11472k(String str, Object[] objArr) {
            super(0);
            this.f33332a = str;
            this.f33333b = objArr;
        }

        /* renamed from: a */
        public final String invoke() {
            C11461g gVar = C11461g.f33306a;
            String str = this.f33332a;
            Object[] objArr = this.f33333b;
            return gVar.m41876a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    private C11461g() {
    }

    /* renamed from: c */
    private final String m41886c(String str) {
        if (!C40440x.m117139M(str, "~!", false, 2, (Object) null)) {
            str = C41536l.m120497q("~!", str);
        }
        return str.length() <= 23 ? str : str.subSequence(0, 23).toString();
    }

    /* renamed from: d */
    public static /* synthetic */ void m41890d(C11461g gVar, String str, Throwable th, C43064a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        gVar.mo29964d(str, th, aVar);
    }

    /* renamed from: e */
    public static /* synthetic */ void m41893e(C11461g gVar, String str, Throwable th, C43064a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        gVar.mo29965e(str, th, aVar);
    }

    /* renamed from: a */
    public final MCLogListener mo29957a() {
        return f33312g;
    }

    /* renamed from: b */
    public final int mo29961b() {
        return f33311f;
    }

    /* renamed from: b */
    private final String m41882b(String str) {
        if (TextUtils.getTrimmedLength(str) == 0) {
            return "Log message was empty";
        }
        String str2 = f33308c;
        String B = str2 == null ? null : C40439w.m117103B(str, str2, "████████-████-████-████-████████████", false, 4, (Object) null);
        if (B != null) {
            str = B;
        }
        String str3 = f33309d;
        String B2 = str3 == null ? null : C40439w.m117103B(str, str3, "███████████████████████", false, 4, (Object) null);
        if (B2 != null) {
            str = B2;
        }
        String str4 = f33310e;
        String B3 = str4 == null ? null : C40439w.m117103B(str, str4, "████████", false, 4, (Object) null);
        return B3 == null ? str : B3;
    }

    /* renamed from: c */
    public static /* synthetic */ void m41887c(C11461g gVar, String str, Throwable th, C43064a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        gVar.mo29963c(str, th, aVar);
    }

    /* renamed from: d */
    public static final void m41891d(String str, String str2, Object... objArr) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(str2, "msg");
        C41536l.m120489i(objArr, "args");
        m41890d(f33306a, str, (Throwable) null, new C11469h(str2, objArr), 2, (Object) null);
    }

    /* renamed from: e */
    public static final void m41894e(String str, String str2, Object... objArr) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(str2, "msg");
        C41536l.m120489i(objArr, "args");
        m41893e(f33306a, str, (Throwable) null, new C11471j(str2, objArr), 2, (Object) null);
    }

    /* renamed from: a */
    public static final String m41875a(String str) {
        C41536l.m120489i(str, "tag");
        return f33306a.m41886c(str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m41883b(C11461g gVar, String str, Throwable th, C43064a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        gVar.mo29962b(str, th, aVar);
    }

    /* renamed from: c */
    public static final void m41888c(String str, String str2, Object... objArr) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(str2, "msg");
        C41536l.m120489i(objArr, "args");
        m41887c(f33306a, str, (Throwable) null, new C11467f(str2, objArr), 2, (Object) null);
    }

    /* renamed from: d */
    public static final void m41892d(String str, Throwable th, String str2, Object... objArr) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(th, "throwable");
        C41536l.m120489i(str2, "msg");
        C41536l.m120489i(objArr, "args");
        f33306a.mo29964d(str, th, (C43064a) new C11470i(str2, objArr));
    }

    /* renamed from: e */
    public static final void m41895e(String str, Throwable th, String str2, Object... objArr) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(th, "throwable");
        C41536l.m120489i(str2, "msg");
        C41536l.m120489i(objArr, "args");
        f33306a.mo29965e(str, th, (C43064a) new C11472k(str2, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m41876a(String str, Object... objArr) {
        C41524c0 c0Var = C41524c0.f97701a;
        Locale locale = Locale.ENGLISH;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C41536l.m120488h(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    /* renamed from: b */
    public static final void m41884b(String str, String str2, Object... objArr) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(str2, "msg");
        C41536l.m120489i(objArr, "args");
        m41883b(f33306a, str, (Throwable) null, new C11464c(str2, objArr), 2, (Object) null);
    }

    /* renamed from: c */
    public static final void m41889c(String str, Throwable th, String str2, Object... objArr) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(th, "throwable");
        C41536l.m120489i(str2, "msg");
        C41536l.m120489i(objArr, "args");
        f33306a.mo29963c(str, th, (C43064a) new C11468g(str2, objArr));
    }

    /* renamed from: d */
    public final void mo29964d(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        m41877a(2, str, th, aVar);
    }

    /* renamed from: e */
    public final void mo29965e(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        m41877a(5, str, th, aVar);
    }

    /* renamed from: b */
    public static final void m41885b(String str, Throwable th, String str2, Object... objArr) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(th, "throwable");
        C41536l.m120489i(str2, "msg");
        C41536l.m120489i(objArr, "args");
        f33306a.mo29962b(str, th, (C43064a) new C11465d(str2, objArr));
    }

    /* renamed from: a */
    public final void mo29958a(int i) {
        f33311f = i;
    }

    /* renamed from: c */
    public final void mo29963c(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        m41877a(4, str, th, aVar);
    }

    /* renamed from: a */
    private final void m41877a(int i, String str, Throwable th, C43064a aVar) {
        MCLogListener mCLogListener = f33312g;
        if (mCLogListener != null && i >= f33311f) {
            try {
                mCLogListener.out(i, m41886c(str), m41882b((String) aVar.invoke()), th);
            } catch (Exception e) {
                Log.e("~!Logger", C41536l.m120497q("Exception was thrown by ", mCLogListener.getClass().getName()), e);
            }
        }
    }

    /* renamed from: b */
    public final void mo29962b(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        m41877a(6, str, th, (C43064a) new C11466e(aVar));
    }

    /* renamed from: a */
    public final void mo29959a(MCLogListener mCLogListener) {
        f33312g = mCLogListener;
    }

    /* renamed from: a */
    public static /* synthetic */ void m41878a(C11461g gVar, String str, Throwable th, C43064a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        gVar.mo29960a(str, th, aVar);
    }

    /* renamed from: a */
    public static final void m41879a(String str, String str2, String str3) {
        f33308c = str;
        f33309d = str2;
        f33310e = str3;
    }

    /* renamed from: a */
    public static final void m41880a(String str, String str2, Object... objArr) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(str2, "msg");
        C41536l.m120489i(objArr, "args");
        m41878a(f33306a, str, (Throwable) null, new C11462a(str2, objArr), 2, (Object) null);
    }

    /* renamed from: a */
    public static final void m41881a(String str, Throwable th, String str2, Object... objArr) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(th, "throwable");
        C41536l.m120489i(str2, "msg");
        C41536l.m120489i(objArr, "args");
        f33306a.mo29960a(str, th, (C43064a) new C11463b(str2, objArr));
    }

    /* renamed from: a */
    public final void mo29960a(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        m41877a(3, str, th, aVar);
    }
}

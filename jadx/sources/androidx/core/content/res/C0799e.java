package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.provider.C0946e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p266u.C8436d;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: androidx.core.content.res.e */
public abstract class C0799e {

    /* renamed from: androidx.core.content.res.e$a */
    static class C0800a {
        /* renamed from: a */
        static int m3007a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: androidx.core.content.res.e$b */
    public interface C0801b {
    }

    /* renamed from: androidx.core.content.res.e$c */
    public static final class C0802c implements C0801b {

        /* renamed from: a */
        private final C0803d[] f3424a;

        public C0802c(C0803d[] dVarArr) {
            this.f3424a = dVarArr;
        }

        /* renamed from: a */
        public C0803d[] mo3269a() {
            return this.f3424a;
        }
    }

    /* renamed from: androidx.core.content.res.e$d */
    public static final class C0803d {

        /* renamed from: a */
        private final String f3425a;

        /* renamed from: b */
        private final int f3426b;

        /* renamed from: c */
        private final boolean f3427c;

        /* renamed from: d */
        private final String f3428d;

        /* renamed from: e */
        private final int f3429e;

        /* renamed from: f */
        private final int f3430f;

        public C0803d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f3425a = str;
            this.f3426b = i;
            this.f3427c = z;
            this.f3428d = str2;
            this.f3429e = i2;
            this.f3430f = i3;
        }

        /* renamed from: a */
        public String mo3270a() {
            return this.f3425a;
        }

        /* renamed from: b */
        public int mo3271b() {
            return this.f3430f;
        }

        /* renamed from: c */
        public int mo3272c() {
            return this.f3429e;
        }

        /* renamed from: d */
        public String mo3273d() {
            return this.f3428d;
        }

        /* renamed from: e */
        public int mo3274e() {
            return this.f3426b;
        }

        /* renamed from: f */
        public boolean mo3275f() {
            return this.f3427c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e */
    public static final class C0804e implements C0801b {

        /* renamed from: a */
        private final C0946e f3431a;

        /* renamed from: b */
        private final int f3432b;

        /* renamed from: c */
        private final int f3433c;

        /* renamed from: d */
        private final String f3434d;

        public C0804e(C0946e eVar, int i, int i2, String str) {
            this.f3431a = eVar;
            this.f3433c = i;
            this.f3432b = i2;
            this.f3434d = str;
        }

        /* renamed from: a */
        public int mo3276a() {
            return this.f3433c;
        }

        /* renamed from: b */
        public C0946e mo3277b() {
            return this.f3431a;
        }

        /* renamed from: c */
        public String mo3278c() {
            return this.f3434d;
        }

        /* renamed from: d */
        public int mo3279d() {
            return this.f3432b;
        }
    }

    /* renamed from: a */
    private static int m2999a(TypedArray typedArray, int i) {
        return C0800a.m3007a(typedArray, i);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public static androidx.core.content.res.C0799e.C0801b m3000b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.res.e$b r3 = m3002d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0799e.m3000b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.res.e$b");
    }

    /* renamed from: c */
    public static List m3001c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m2999a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m3006h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m3006h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static C0801b m3002d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m3003e(xmlPullParser, resources);
        }
        m3005g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static C0801b m3003e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C8436d.f23970h);
        String string = obtainAttributes.getString(C8436d.f23971i);
        String string2 = obtainAttributes.getString(C8436d.f23975m);
        String string3 = obtainAttributes.getString(C8436d.f23976n);
        int resourceId = obtainAttributes.getResourceId(C8436d.f23972j, 0);
        int integer = obtainAttributes.getInteger(C8436d.f23973k, 1);
        int integer2 = obtainAttributes.getInteger(C8436d.f23974l, 500);
        String string4 = obtainAttributes.getString(C8436d.f23977o);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m3004f(xmlPullParser, resources));
                    } else {
                        m3005g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0802c((C0803d[]) arrayList.toArray(new C0803d[0]));
        }
        while (xmlPullParser.next() != 3) {
            m3005g(xmlPullParser);
        }
        return new C0804e(new C0946e(string, string2, string3, m3001c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    private static C0803d m3004f(XmlPullParser xmlPullParser, Resources resources) {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C8436d.f23978p);
        int i = C8436d.f23987y;
        if (!obtainAttributes.hasValue(i)) {
            i = C8436d.f23980r;
        }
        int i2 = obtainAttributes.getInt(i, TextTypeView.SEPARATOR_FULL);
        int i3 = C8436d.f23985w;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C8436d.f23981s;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = C8436d.f23988z;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C8436d.f23982t;
        }
        int i5 = C8436d.f23986x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C8436d.f23983u;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C8436d.f23984v;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C8436d.f23979q;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m3005g(xmlPullParser);
        }
        return new C0803d(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m3005g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List m3006h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}

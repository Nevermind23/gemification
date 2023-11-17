package p202p0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParserException;
import p202p0.C7578n;
import p202p0.C7602w;
import p215q0.C7816a;

/* renamed from: p0.v */
public final class C7600v {

    /* renamed from: c */
    public static final C7601a f22164c = new C7601a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private static final ThreadLocal f22165d = new ThreadLocal();

    /* renamed from: a */
    private final Context f22166a;

    /* renamed from: b */
    private final C7536d0 f22167b;

    /* renamed from: p0.v$a */
    public static final class C7601a {
        private C7601a() {
        }

        public /* synthetic */ C7601a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7606z mo22244a(TypedValue typedValue, C7606z zVar, C7606z zVar2, String str, String str2) {
            C41536l.m120489i(typedValue, C11755a.C11756a.f34100b);
            C41536l.m120489i(zVar2, "expectedNavType");
            C41536l.m120489i(str2, "foundType");
            if (zVar != null && zVar != zVar2) {
                throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
            } else if (zVar == null) {
                return zVar2;
            } else {
                return zVar;
            }
        }
    }

    public C7600v(Context context, C7536d0 d0Var) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(d0Var, "navigatorProvider");
        this.f22166a = context;
        this.f22167b = d0Var;
    }

    /* renamed from: a */
    private final C7589q m28896a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        C7536d0 d0Var = this.f22167b;
        String name = xmlResourceParser.getName();
        C41536l.m120488h(name, "parser.name");
        C7589q a = d0Var.mo22061d(name).mo22020a();
        a.mo22025D(this.f22166a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                return a;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (C41536l.m120484d("argument", name2)) {
                    m28900f(resources, a, attributeSet, i);
                } else if (C41536l.m120484d("deepLink", name2)) {
                    m28901g(resources, a, attributeSet);
                } else if (C41536l.m120484d(UrlHandler.ACTION, name2)) {
                    m28897c(resources, a, attributeSet, xmlResourceParser, i);
                } else if (C41536l.m120484d("include", name2) && (a instanceof C7594s)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C7545h0.f22007i);
                    C41536l.m120488h(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((C7594s) a).mo22225J(mo22243b(obtainAttributes.getResourceId(C7545h0.f22008j, 0)));
                    C41238w wVar = C41238w.f97225a;
                    obtainAttributes.recycle();
                } else if (a instanceof C7594s) {
                    ((C7594s) a).mo22225J(m28896a(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return a;
    }

    /* renamed from: c */
    private final void m28897c(Resources resources, C7589q qVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) {
        int depth;
        Context context = this.f22166a;
        int[] iArr = C7816a.f22715a;
        C41536l.m120488h(iArr, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C7816a.f22716b, 0);
        C7538e eVar = new C7538e(obtainStyledAttributes.getResourceId(C7816a.f22717c, 0), (C7602w) null, (Bundle) null, 6, (DefaultConstructorMarker) null);
        C7602w.C7603a aVar = new C7602w.C7603a();
        aVar.mo22259d(obtainStyledAttributes.getBoolean(C7816a.f22720f, false));
        aVar.mo22264j(obtainStyledAttributes.getBoolean(C7816a.f22726l, false));
        aVar.mo22262g(obtainStyledAttributes.getResourceId(C7816a.f22723i, -1), obtainStyledAttributes.getBoolean(C7816a.f22724j, false), obtainStyledAttributes.getBoolean(C7816a.f22725k, false));
        aVar.mo22257b(obtainStyledAttributes.getResourceId(C7816a.f22718d, -1));
        aVar.mo22258c(obtainStyledAttributes.getResourceId(C7816a.f22719e, -1));
        aVar.mo22260e(obtainStyledAttributes.getResourceId(C7816a.f22721g, -1));
        aVar.mo22261f(obtainStyledAttributes.getResourceId(C7816a.f22722h, -1));
        eVar.mo22069e(aVar.mo22256a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1 && ((depth = xmlResourceParser.getDepth()) >= depth2 || next != 3)) {
                if (next == 2 && depth <= depth2 && C41536l.m120484d("argument", xmlResourceParser.getName())) {
                    m28899e(resources, bundle, attributeSet, i);
                }
            }
        }
        if (!bundle.isEmpty()) {
            eVar.mo22068d(bundle);
        }
        qVar.mo22202E(resourceId, eVar);
        obtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p202p0.C7546i m28898d(android.content.res.TypedArray r11, android.content.res.Resources r12, int r13) {
        /*
            r10 = this;
            p0.i$a r0 = new p0.i$a
            r0.<init>()
            int r1 = p215q0.C7816a.f22731q
            r2 = 0
            boolean r1 = r11.getBoolean(r1, r2)
            r0.mo22093c(r1)
            java.lang.ThreadLocal r1 = f22165d
            java.lang.Object r3 = r1.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0021
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r1.set(r3)
        L_0x0021:
            int r1 = p215q0.C7816a.f22730p
            java.lang.String r8 = r11.getString(r1)
            r1 = 0
            if (r8 == 0) goto L_0x0036
            p0.z$l r4 = p202p0.C7606z.f22195c
            java.lang.String r13 = r12.getResourcePackageName(r13)
            p0.z r13 = r4.mo22310a(r8, r13)
            r6 = r13
            goto L_0x0037
        L_0x0036:
            r6 = r1
        L_0x0037:
            int r13 = p215q0.C7816a.f22729o
            boolean r4 = r11.getValue(r13, r3)
            if (r4 == 0) goto L_0x0179
            p0.z r1 = p202p0.C7606z.f22197e
            java.lang.String r4 = "' for "
            java.lang.String r5 = "unsupported value '"
            r7 = 16
            if (r6 != r1) goto L_0x0083
            int r11 = r3.resourceId
            if (r11 == 0) goto L_0x004f
            r2 = r11
            goto L_0x0057
        L_0x004f:
            int r11 = r3.type
            if (r11 != r7) goto L_0x005d
            int r11 = r3.data
            if (r11 != 0) goto L_0x005d
        L_0x0057:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x0179
        L_0x005d:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.CharSequence r13 = r3.string
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = r6.mo22271b()
            r12.append(r13)
            java.lang.String r13 = ". Must be a reference to a resource."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0083:
            int r9 = r3.resourceId
            if (r9 == 0) goto L_0x00c3
            if (r6 != 0) goto L_0x0091
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r6 = r1
            r1 = r11
            goto L_0x0179
        L_0x0091:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.CharSequence r13 = r3.string
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = r6.mo22271b()
            r12.append(r13)
            java.lang.String r13 = ". You must use a \""
            r12.append(r13)
            java.lang.String r13 = r1.mo22271b()
            r12.append(r13)
            java.lang.String r13 = "\" type to reference other resources."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c3:
            p0.z r1 = p202p0.C7606z.f22205m
            if (r6 != r1) goto L_0x00cd
            java.lang.String r1 = r11.getString(r13)
            goto L_0x0179
        L_0x00cd:
            int r11 = r3.type
            r13 = 3
            if (r11 == r13) goto L_0x0166
            r13 = 4
            if (r11 == r13) goto L_0x0152
            r13 = 5
            if (r11 == r13) goto L_0x0139
            r12 = 18
            if (r11 == r12) goto L_0x0124
            if (r11 < r7) goto L_0x010b
            r12 = 31
            if (r11 > r12) goto L_0x010b
            p0.z r7 = p202p0.C7606z.f22201i
            if (r6 != r7) goto L_0x00f8
            p0.v$a r4 = f22164c
            java.lang.String r9 = "float"
            r5 = r3
            p0.z r6 = r4.mo22244a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            float r11 = (float) r11
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            goto L_0x0179
        L_0x00f8:
            p0.v$a r4 = f22164c
            p0.z r7 = p202p0.C7606z.f22196d
            java.lang.String r9 = "integer"
            r5 = r3
            p0.z r6 = r4.mo22244a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x0179
        L_0x010b:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "unsupported argument type "
            r12.append(r13)
            int r13 = r3.type
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0124:
            p0.v$a r4 = f22164c
            p0.z r7 = p202p0.C7606z.f22203k
            java.lang.String r9 = "boolean"
            r5 = r3
            p0.z r6 = r4.mo22244a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            if (r11 == 0) goto L_0x0134
            r2 = 1
        L_0x0134:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x0179
        L_0x0139:
            p0.v$a r4 = f22164c
            p0.z r7 = p202p0.C7606z.f22196d
            java.lang.String r9 = "dimension"
            r5 = r3
            p0.z r6 = r4.mo22244a(r5, r6, r7, r8, r9)
            android.util.DisplayMetrics r11 = r12.getDisplayMetrics()
            float r11 = r3.getDimension(r11)
            int r11 = (int) r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x0179
        L_0x0152:
            p0.v$a r4 = f22164c
            p0.z r7 = p202p0.C7606z.f22201i
            java.lang.String r9 = "float"
            r5 = r3
            p0.z r6 = r4.mo22244a(r5, r6, r7, r8, r9)
            float r11 = r3.getFloat()
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            goto L_0x0179
        L_0x0166:
            java.lang.CharSequence r11 = r3.string
            java.lang.String r11 = r11.toString()
            if (r6 != 0) goto L_0x0175
            p0.z$l r12 = p202p0.C7606z.f22195c
            p0.z r12 = r12.mo22311b(r11)
            r6 = r12
        L_0x0175:
            java.lang.Object r1 = r6.mo22274e(r11)
        L_0x0179:
            if (r1 == 0) goto L_0x017e
            r0.mo22092b(r1)
        L_0x017e:
            if (r6 == 0) goto L_0x0183
            r0.mo22094d(r6)
        L_0x0183:
            p0.i r11 = r0.mo22091a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p202p0.C7600v.m28898d(android.content.res.TypedArray, android.content.res.Resources, int):p0.i");
    }

    /* renamed from: e */
    private final void m28899e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C7816a.f22727m);
        C41536l.m120488h(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(C7816a.f22728n);
        if (string != null) {
            C41536l.m120488h(string, "array.getString(R.stylea…uments must have a name\")");
            C7546i d = m28898d(obtainAttributes, resources, i);
            if (d.mo22084b()) {
                d.mo22086d(string, bundle);
            }
            C41238w wVar = C41238w.f97225a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* renamed from: f */
    private final void m28900f(Resources resources, C7589q qVar, AttributeSet attributeSet, int i) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C7816a.f22727m);
        C41536l.m120488h(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(C7816a.f22728n);
        if (string != null) {
            C41536l.m120488h(string, "array.getString(R.stylea…uments must have a name\")");
            qVar.mo22206b(string, m28898d(obtainAttributes, resources, i));
            C41238w wVar = C41238w.f97225a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* renamed from: g */
    private final void m28901g(Resources resources, C7589q qVar, AttributeSet attributeSet) {
        boolean z;
        boolean z2;
        boolean z3;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C7816a.f22732r);
        C41536l.m120488h(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(C7816a.f22735u);
        String string2 = obtainAttributes.getString(C7816a.f22733s);
        String string3 = obtainAttributes.getString(C7816a.f22734t);
        boolean z4 = false;
        if (string == null || string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (string2 == null || string2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (string3 == null || string3.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                }
            }
        }
        C7578n.C7579a aVar = new C7578n.C7579a();
        if (string != null) {
            String packageName = this.f22166a.getPackageName();
            C41536l.m120488h(packageName, "context.packageName");
            aVar.mo22176d(C40439w.m117103B(string, "${applicationId}", packageName, false, 4, (Object) null));
        }
        if (string2 == null || string2.length() == 0) {
            z4 = true;
        }
        if (!z4) {
            String packageName2 = this.f22166a.getPackageName();
            C41536l.m120488h(packageName2, "context.packageName");
            aVar.mo22174b(C40439w.m117103B(string2, "${applicationId}", packageName2, false, 4, (Object) null));
        }
        if (string3 != null) {
            String packageName3 = this.f22166a.getPackageName();
            C41536l.m120488h(packageName3, "context.packageName");
            aVar.mo22175c(C40439w.m117103B(string3, "${applicationId}", packageName3, false, 4, (Object) null));
        }
        qVar.mo22208i(aVar.mo22173a());
        C41238w wVar = C41238w.f97225a;
        obtainAttributes.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b A[Catch:{ Exception -> 0x0065, all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[Catch:{ Exception -> 0x0065, all -> 0x0063 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p202p0.C7594s mo22243b(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f22166a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            java.lang.String r2 = "res.getXml(graphResId)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x0013:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0065 }
            r4 = 2
            if (r3 == r4) goto L_0x001d
            r5 = 1
            if (r3 != r5) goto L_0x0013
        L_0x001d:
            if (r3 != r4) goto L_0x005b
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "res"
            kotlin.jvm.internal.C41536l.m120488h(r0, r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "attrs"
            kotlin.jvm.internal.C41536l.m120488h(r2, r4)     // Catch:{ Exception -> 0x0065 }
            p0.q r2 = r6.m28896a(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0065 }
            boolean r4 = r2 instanceof p202p0.C7594s     // Catch:{ Exception -> 0x0065 }
            if (r4 == 0) goto L_0x003b
            p0.s r2 = (p202p0.C7594s) r2     // Catch:{ Exception -> 0x0065 }
            r1.close()
            return r2
        L_0x003b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065 }
            r2.<init>()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "Root element <"
            r2.append(r4)     // Catch:{ Exception -> 0x0065 }
            r2.append(r3)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r2.append(r3)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0065 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0065 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0065 }
            throw r3     // Catch:{ Exception -> 0x0065 }
        L_0x005b:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0065 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0065 }
            throw r2     // Catch:{ Exception -> 0x0065 }
        L_0x0063:
            r7 = move-exception
            goto L_0x008d
        L_0x0065:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r4.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0063 }
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0063 }
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0063 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0063 }
            throw r3     // Catch:{ all -> 0x0063 }
        L_0x008d:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p202p0.C7600v.mo22243b(int):p0.s");
    }
}
